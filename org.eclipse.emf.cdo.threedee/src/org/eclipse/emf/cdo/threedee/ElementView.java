/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.bundle.OM;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.ValueNotifier;
import org.eclipse.net4j.util.ui.UIUtil;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class ElementView extends AbstractView<Element>
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ElementView";

  public static final ValueNotifier<ElementView> INSTANCE = new ValueNotifier<ElementView>(ID);

  public ElementView()
  {
  }

  @Override
  public List<Element> getContents()
  {
    synchronized (Frontend.INSTANCE)
    {
      List<Element> result = new ArrayList<Element>();
      for (Session session : Frontend.INSTANCE.getElements())
      {
        for (Element element : session.getAllElements())
        {
          result.add(element);
        }
      }

      return result;
    }
  }

  @Override
  public Object getInput()
  {
    return Frontend.INSTANCE;
  }

  @Override
  public Object[] getChildren(Object object)
  {
    if (object instanceof IContainer<?>)
    {
      IContainer<?> container = (IContainer<?>)object;
      return container.getElements();
    }

    return new Object[0];
  }

  @Override
  public Object getParent(Object object)
  {
    if (object instanceof Element)
    {
      Element element = (Element)object;
      Element container = element.getContainer();
      if (container == null)
      {
        return element.getProvider();
      }

      return container;
    }

    if (object instanceof Session)
    {
      return Frontend.INSTANCE;
    }

    return null;
  }

  @Override
  protected void setInstance(AbstractView<Element> view)
  {
    INSTANCE.setValue((ElementView)view);
  }

  @Override
  protected IBaseLabelProvider createLabelProvider(Display display)
  {
    return new LabelProvider(display);
  }

  @Override
  protected void handlePageSelectionObject(Object pageSelectionObject, Collection<Element> contents, Set<Object> result)
  {
    if (pageSelectionObject instanceof ElementDescriptor)
    {
      ElementDescriptor descriptor = (ElementDescriptor)pageSelectionObject;
      for (Element element : contents)
      {
        if (element.getDescriptor() == descriptor)
        {
          result.add(element);
        }
      }
    }
    else if (pageSelectionObject instanceof Element)
    {
      Element element = (Element)pageSelectionObject;
      result.add(element);
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class LabelProvider extends org.eclipse.jface.viewers.LabelProvider
  {
    private Image agentIcon;

    public LabelProvider(Display display)
    {
      ImageDescriptor descriptor = OM.Activator.INSTANCE.loadImageDescriptor("icons/agent.gif");
      agentIcon = descriptor.createImage(UIUtil.getDisplay());
    }

    @Override
    public Image getImage(Object object)
    {
      if (object instanceof Element)
      {
        Element element = (Element)object;
        Color color = element.getDescriptor().getColor().getValue();
        return ColorIcons.get(color);
      }

      if (object instanceof Session)
      {
        return agentIcon;
      }

      return super.getImage(object);
    }

    @Override
    public void dispose()
    {
      agentIcon.dispose();
      super.dispose();
    }
  }
}
