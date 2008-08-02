/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.pop.internal.ui.views;

import org.eclipse.net4j.internal.pop.Pop;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.provider.ProjectItemProviderAdapterFactory;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.ui.actions.LongRunningAction;
import org.eclipse.net4j.util.ui.views.ContainerItemProvider;
import org.eclipse.net4j.util.ui.views.ContainerView;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.swt.graphics.Image;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class PopItemProvider extends ContainerItemProvider<IContainer<Object>>
{
  private ComposedAdapterFactory adapterFactory;

  private AdapterFactoryContentProvider contentProvider;

  private AdapterFactoryLabelProvider labelProvider;

  private List<Pop> pops = new ArrayList<Pop>();

  public PopItemProvider()
  {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ProjectItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    contentProvider = new AdapterFactoryContentProvider(adapterFactory);
    labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
  }

  @Override
  public boolean hasChildren(Object element)
  {
    return getChildren(element).length != 0;
  }

  @Override
  public Object[] getChildren(Object element)
  {
    if (element == getInput())
    {
      for (Pop pop : pops)
      {
        pop.getModelManager().removeListener(this);
      }

      pops.clear();
      Object[] children = super.getChildren(element);
      for (Object child : children)
      {
        if (child instanceof Pop)
        {
          Pop pop = (Pop)child;
          pop.getModelManager().addListener(this);
          pops.add(pop);
        }
      }

      return children;
    }

    if (element instanceof IPop)
    {
      PopProject popProject = ((IPop)element).getPopProject();
      if (popProject != null)
      {
        return new Object[] { popProject };
      }

      return new Object[0];
    }

    return contentProvider.getChildren(element);
  }

  @Override
  public Object getParent(Object element)
  {
    if (element == getInput())
    {
      return null;
    }

    if (element instanceof IPop)
    {
      return getInput();
    }

    return contentProvider.getParent(element);
  }

  @Override
  public String getText(Object element)
  {
    if (element == getInput() || element instanceof IPop)
    {
      return super.getText(element);
    }

    return labelProvider.getText(element);
  }

  @Override
  public Image getImage(Object element)
  {
    if (element == getInput() || element instanceof IPop)
    {
      return super.getImage(element);
    }

    return labelProvider.getImage(element);
  }

  @Override
  protected void handleInactiveElement(Iterator<Node> it, Node child)
  {
  }

  /**
   * @author Eike Stepper
   */
  public static class RemoveAction extends LongRunningAction
  {
    private Object object;

    public RemoveAction(Object object)
    {
      super("Remove", "Remove", ContainerView.getDeleteImageDescriptor());
      this.object = object;
    }

    @Override
    protected void doRun() throws Exception
    {
      LifecycleUtil.deactivateNoisy(object);
    }
  }
}
