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

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class StreamsView extends MasterDetailsView
{
  private static final String[] DETAIL_TITLES = { "Targets", "Deliveries", "Merges", "Checkouts" };

  public StreamsView()
  {
    super(DETAIL_TITLES);
  }

  @Override
  protected StructuredViewer createMaster(Composite parent)
  {
    PopItemProvider itemProvider = new PopItemProvider();
    TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(itemProvider);
    viewer.setLabelProvider(itemProvider);
    return viewer;
  }

  @Override
  protected StructuredViewer createDetail(Composite parent, int index)
  {
    StructuredViewer result = null;
    switch (index)
    {
    case 0:
    case 1:
    case 2:
    case 3:
      result = createViewer(parent);
      break;
    }
    return result;
  }

  private StructuredViewer createViewer(Composite parent)
  {
    PopItemProvider itemProvider = new PopItemProvider();
    TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(itemProvider);
    viewer.setLabelProvider(itemProvider);
    return viewer;
  }
}
