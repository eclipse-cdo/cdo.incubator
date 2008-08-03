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

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IPopManager;
import org.eclipse.net4j.pop.base.provider.BaseItemProviderAdapterFactory;
import org.eclipse.net4j.pop.project.Stream;
import org.eclipse.net4j.pop.project.provider.ProjectItemProviderAdapterFactory;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Eike Stepper
 */
public class StreamsView extends MasterDetailsView
{
  private static final String[] ALL_TITLES = { "Targets", "Deliveries", "Merges", "Checkouts" };

  private static final String[] STREAM_DETAIL_TITLES = { "Targets", "Deliveries", "Merges" };

  private static final String[] POP_DETAIL_TITLES = { "Merges", "Checkouts" };

  private ComposedAdapterFactory adapterFactory;

  public StreamsView()
  {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new BaseItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ProjectItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
  }

  @Override
  protected StructuredViewer createMaster(Composite parent)
  {
    TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new PopContentProvider(adapterFactory));
    viewer.setLabelProvider(new PopLabelProvider(adapterFactory));
    viewer.setInput(IPopManager.INSTANCE);
    return viewer;
  }

  @Override
  protected StructuredViewer createDetail(Composite parent, String title)
  {
    StructuredViewer result = createViewer(parent);
    return result;
  }

  @Override
  protected String[] getDetailTitles(Object masterElement)
  {
    if (masterElement instanceof IPop)
    {
      return POP_DETAIL_TITLES;
    }

    if (masterElement instanceof Stream)
    {
      return STREAM_DETAIL_TITLES;
    }

    return ALL_TITLES;
  }

  private StructuredViewer createViewer(Composite parent)
  {
    TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new PopContentProvider(adapterFactory));
    viewer.setLabelProvider(new PopLabelProvider(adapterFactory));
    viewer.setInput(IPopManager.INSTANCE);
    return viewer;
  }
}
