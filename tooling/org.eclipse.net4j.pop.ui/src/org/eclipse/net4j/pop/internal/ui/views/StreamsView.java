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

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class StreamsView extends MasterDetailsView
{
  private static final String[] STREAM_DETAIL_TITLES = { "Targets", "Deliveries", "Merges" };

  private static final String[] POP_DETAIL_TITLES = { "Merges", "Checkouts" };

  public StreamsView()
  {
  }

  @Override
  protected StructuredViewer createMaster(Composite parent)
  {
    PopItemProvider itemProvider = new PopItemProvider();
    TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(itemProvider);
    viewer.setLabelProvider(itemProvider);
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

    return STREAM_DETAIL_TITLES;
  }

  private StructuredViewer createViewer(Composite parent)
  {
    PopItemProvider itemProvider = new PopItemProvider();
    TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(itemProvider);
    viewer.setLabelProvider(itemProvider);
    viewer.setInput(IPopManager.INSTANCE);
    return viewer;
  }
}
