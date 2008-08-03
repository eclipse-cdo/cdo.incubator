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

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.ui.widgets.SashComposite;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class MasterDetailsView extends MultiViewersView
{
  private StructuredViewer master;

  private CTabFolder detailsFolder;

  private Object currentMasterElement = new Object();

  private String[] detailTitles;

  private CTabItem[] detailItems;

  private StructuredViewer[] details;

  public MasterDetailsView()
  {
  }

  public StructuredViewer getMaster()
  {
    return master;
  }

  @Override
  protected Control createUI(Composite parent)
  {
    SashComposite sash = new SashComposite(parent, SWT.NONE, 10, 50, false)
    {

      @Override
      protected Control createControl1(Composite parent)
      {
        master = createMaster(parent);
        return master.getControl();
      }

      @Override
      protected Control createControl2(Composite parent)
      {
        // Styles: CLOSE, TOP, BOTTOM, FLAT, BORDER, SINGLE, MULTI
        detailsFolder = new CTabFolder(parent, SWT.BOTTOM | SWT.FLAT);
        adjustDetails(null);
        return detailsFolder;
      }
    };

    setCurrentViewer(master);
    master.addSelectionChangedListener(new ISelectionChangedListener()
    {
      public void selectionChanged(SelectionChangedEvent event)
      {
        masterSelectionChanged(event);
      }
    });

    return sash;
  }

  protected void masterSelectionChanged(SelectionChangedEvent event)
  {
    IStructuredSelection selection = (IStructuredSelection)master.getSelection();
    Object masterElement = selection.getFirstElement();
    adjustDetails(masterElement);
  }

  protected void adjustDetails(Object masterElement)
  {
    if (ObjectUtil.equals(masterElement, currentMasterElement))
    {
      return;
    }

    for (Control child : detailsFolder.getChildren())
    {
      child.dispose();
    }

    detailTitles = getDetailTitles(masterElement);
    detailItems = new CTabItem[detailTitles.length];
    details = new StructuredViewer[detailTitles.length];

    for (int i = 0; i < detailTitles.length; i++)
    {
      StructuredViewer detail = createDetail(detailsFolder, detailTitles[i]);
      details[i] = detail;

      detailItems[i] = new CTabItem(detailsFolder, SWT.NONE);
      detailItems[i].setText(detailTitles[i]);
      detailItems[i].setControl(detail.getControl());
    }

    detailsFolder.layout();
  }

  protected abstract StructuredViewer createMaster(Composite parent);

  protected abstract String[] getDetailTitles(Object masterElement);

  protected abstract StructuredViewer createDetail(Composite parent, String title);
}
