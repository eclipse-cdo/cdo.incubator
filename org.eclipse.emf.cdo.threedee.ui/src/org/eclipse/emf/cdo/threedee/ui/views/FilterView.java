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

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Martin Fluegge
 */
public class FilterView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ui.views.FilterView";

  private CheckboxTreeViewer viewer;

  @Override
  public void createPartControl(Composite parent)
  {
    viewer = new CheckboxTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new ViewLabelProvider());
    viewer.setSorter(new NameSorter());
    viewer.setInput(getViewSite());

    viewer.addCheckStateListener(new ICheckStateListener()
    {
      private Set<String> elementsToBeHidden = new HashSet<String>();

      public void checkStateChanged(CheckStateChangedEvent event)
      {
        ElementDescriptor descriptor = (ElementDescriptor)event.getElement();
        String name = descriptor.getName();

        if (event.getChecked())
        {
          elementsToBeHidden.add(name);
          // . . . check all its children
          // viewer.setSubtreeChecked(event.getElement(), true);
          System.out.println("add " + name);
        }
        else
        {
          elementsToBeHidden.remove(name);
          System.out.println("remove " + name);
        }
        ThreeDeeWorldView threeDeeWorldView = (ThreeDeeWorldView)getSite().getPage().findView(ThreeDeeWorldView.ID);
        ThreeDeeWorldViewer threeDeeWorldViewViewer = threeDeeWorldView.getViewer();
        threeDeeWorldViewViewer.filter(new ArrayList<String>(elementsToBeHidden));
      }
    });

    PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.eclipse.emf.cdo.threedee.ui.viewer");
  }

  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }

  private class ViewContentProvider implements ITreeContentProvider
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

    public Object[] getChildren(Object parentElement)
    {
      return ElementDescriptor.Registry.INSTANCE.values().toArray();
    }

    public Object getParent(Object element)
    {
      return null;
    }

    public boolean hasChildren(Object element)
    {
      return false;
    }
  }

  /**
   * @author Martin Fluegge
   */
  private class ViewLabelProvider extends LabelProvider
  {
    @Override
    public String getText(Object element)
    {
      if (element instanceof ElementDescriptor)
      {
        return ((ElementDescriptor)element).getName();
      }
      return element.toString();
    }
  }

  /**
   * @author Martin Fluegge
   */
  private class NameSorter extends ViewerSorter
  {
  }
}
