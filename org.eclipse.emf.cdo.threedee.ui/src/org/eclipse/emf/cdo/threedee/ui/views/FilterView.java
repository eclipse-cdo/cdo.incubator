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
package org.eclipse.emf.cdo.threedee.ui.views;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldView;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldViewer;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class FilterView extends ViewPart
{

  public static final String ID = "org.eclipse.emf.cdo.threedee.ui.views.FilterView";

  private TableViewer viewer;

  private Action filterAction;

  class ViewContentProvider implements IStructuredContentProvider
  {
    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
    }

    public void dispose()
    {
    }

    public Object[] getElements(Object parent)
    {
      return ElementDescriptor.Registry.INSTANCE.values().toArray();
    }
  }

  class ViewLabelProvider extends LabelProvider implements ITableLabelProvider
  {
    public String getColumnText(Object obj, int index)
    {
      if (obj instanceof ElementDescriptor)
      {
        return ((ElementDescriptor)obj).getName();
      }
      return getText(obj);
    }

    public Image getColumnImage(Object obj, int index)
    {
      return getImage(obj);
    }

    @Override
    public Image getImage(Object obj)
    {
      return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
    }
  }

  class NameSorter extends ViewerSorter
  {
  }

  public FilterView()
  {
  }

  @Override
  public void createPartControl(Composite parent)
  {
    viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new ViewLabelProvider());
    viewer.setSorter(new NameSorter());
    viewer.setInput(getViewSite());
    viewer.addSelectionChangedListener(new ISelectionChangedListener()
    {
      private List<String> elementsToBeHidden = new ArrayList<String>();

      public void selectionChanged(SelectionChangedEvent event)
      {
        ThreeDeeWorldView threeDeeWorldView = (ThreeDeeWorldView)getSite().getPage().findView(ThreeDeeWorldView.ID);
        ThreeDeeWorldViewer threeDeeWorldViewViewer = threeDeeWorldView.getViewer();

        StructuredSelection selection = (StructuredSelection)event.getSelection();

        ElementDescriptor descriptor = (ElementDescriptor)selection.getFirstElement();

        String name = descriptor.getName();
        if (!elementsToBeHidden.contains(name))
        {
          elementsToBeHidden.add(name);
          System.out.println("added");
        }
        else
        {
          elementsToBeHidden.remove(name);
          System.out.println("removed");
        }

        setSelections();
        viewer.refresh();

        threeDeeWorldViewViewer.filter(elementsToBeHidden);
      }

      private void setSelections()
      {
        Table table = viewer.getTable();
        table.deselectAll();
        int index = 0;
        for (TableItem item : table.getItems())
        {
          if (elementsToBeHidden.contains(((ElementDescriptor)item.getData()).getName()))
          {
            table.select(index);
          }

          index++;
        }
      }
    });

    PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.eclipse.emf.cdo.threedee.ui.viewer");
    makeActions();
    hookContextMenu();
    contributeToActionBars();
  }

  private void hookContextMenu()
  {
    MenuManager menuMgr = new MenuManager("#PopupMenu");
    menuMgr.setRemoveAllWhenShown(true);
    menuMgr.addMenuListener(new IMenuListener()
    {
      public void menuAboutToShow(IMenuManager manager)
      {
        FilterView.this.fillContextMenu(manager);
      }
    });
    Menu menu = menuMgr.createContextMenu(viewer.getControl());
    viewer.getControl().setMenu(menu);
    getSite().registerContextMenu(menuMgr, viewer);
  }

  private void contributeToActionBars()
  {
    IActionBars bars = getViewSite().getActionBars();
    fillLocalPullDown(bars.getMenuManager());
    fillLocalToolBar(bars.getToolBarManager());
  }

  private void fillLocalPullDown(IMenuManager manager)
  {
    manager.add(filterAction);
    manager.add(new Separator());
  }

  private void fillContextMenu(IMenuManager manager)
  {
    manager.add(filterAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(filterAction);
  }

  private void makeActions()
  {
    filterAction = new Action()
    {
      @Override
      public void run()
      {
        showMessage("Action 1 executed");
      }
    };
    filterAction.setText("Action 1");
    filterAction.setToolTipText("Action 1 tooltip");
    filterAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
        .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
  }

  private void showMessage(String message)
  {
    MessageDialog.openInformation(viewer.getControl().getShell(), "Filter View", message);
  }

  /**
   * Passing the focus request to the viewer's control.
   */
  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }
}
