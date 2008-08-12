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

import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.provider.PopItemProviderAdapterFactory;
import org.eclipse.net4j.util.ui.actions.SafeAction;
import org.eclipse.net4j.util.ui.views.MultiViewersView;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author Eike Stepper
 */
public class PopsView extends MultiViewersView
{
  private ComposedAdapterFactory adapterFactory;

  public PopsView()
  {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new PopItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
  }

  @Override
  protected Control createUI(Composite parent)
  {
    TreeViewer viewer = new TreeViewer(parent, (SWT.H_SCROLL | SWT.V_SCROLL));
    viewer.setContentProvider(new PopContentProvider(adapterFactory));
    viewer.setLabelProvider(new PopLabelProvider(adapterFactory));
    viewer.setInput(PopManager.INSTANCE);

    setCurrentViewer(viewer);
    return viewer.getTree();
  }

  @Override
  protected void fillContextMenu(IMenuManager manager, StructuredViewer viewer, IStructuredSelection selection)
  {
    manager.add(new SafeAction("Test")
    {
      @Override
      protected void safeRun() throws Exception
      {
      }
    });
  }
}
