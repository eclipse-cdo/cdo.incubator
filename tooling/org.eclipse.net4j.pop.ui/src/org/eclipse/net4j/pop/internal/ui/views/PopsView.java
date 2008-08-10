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

import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.provider.PopItemProviderAdapterFactory;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.ui.views.MasterDetailsView;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Eike Stepper
 */
public class PopsView extends MasterDetailsView
{
  private static final String DETAILS = "Details";

  private static final String[] POP_DETAILS = { DETAILS };

  private ComposedAdapterFactory adapterFactory;

  public PopsView()
  {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new PopItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
  }

  @Override
  protected StructuredViewer createMaster(Composite parent)
  {
    TreeViewer viewer = createViewer(parent);
    viewer.setInput(PopManager.INSTANCE);
    return viewer;
  }

  @Override
  protected StructuredViewer createDetail(Composite parent, String title)
  {
    if (ObjectUtil.equals(title, DETAILS))
    {
      return createViewer(parent);
    }

    throw new IllegalArgumentException("title: " + title);
  }

  @Override
  protected String[] getDetailTitles(Object masterElement)
  {
    if (masterElement instanceof Pop)
    {
      return POP_DETAILS;
    }

    return new String[0];
  }

  private TreeViewer createViewer(Composite parent)
  {
    TreeViewer viewer = new TreeViewer(parent, (SWT.H_SCROLL | SWT.V_SCROLL));
    viewer.setContentProvider(new PopContentProvider(adapterFactory));
    viewer.setLabelProvider(new PopLabelProvider(adapterFactory));
    return viewer;
  }
}
