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

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.util.ObjectUtil;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class PopContentProvider extends AdapterFactoryContentProvider
{
  protected Object input;

  public PopContentProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  @Override
  public void inputChanged(final Viewer viewer, Object oldInput, Object newInput)
  {
    if (oldInput != newInput && oldInput != null)
    {
      disconnectInput();
    }

    boolean newViewer = viewer != this.viewer;
    super.inputChanged(viewer, oldInput, newInput);
    if (newViewer)
    {
      viewerRefresh = new PopViewerRefresh(viewer);
    }

    input = newInput;
    if (input != null)
    {
      connectInput();
    }
  }

  protected void connectInput()
  {
  }

  protected void disconnectInput()
  {
  }

  /**
   * @author Eike Stepper
   */
  private final class PopViewerRefresh extends ViewerRefresh
  {
    public PopViewerRefresh(Viewer viewer)
    {
      super(viewer);
    }

    @Override
    protected void refresh(IViewerNotification notification)
    {
      try
      {
        Object[] expandedElements = null;
        IStructuredSelection selection = null;
        if (viewer instanceof TreeViewer)
        {
          TreeViewer treeViewer = (TreeViewer)viewer;
          expandedElements = treeViewer.getExpandedElements();
          selection = (IStructuredSelection)treeViewer.getSelection();
        }

        super.refresh(notification);
        if (viewer instanceof TreeViewer)
        {
          TreeViewer treeViewer = (TreeViewer)viewer;
          for (Object expandedElement : expandedElements)
          {
            if (expandedElement instanceof EObject)
            {
              EObject object = getEObject((EObject)expandedElement);
              if (object != null)
              {
                treeViewer.setExpandedState(object, true);
              }
            }
          }

          List<Object> list = new ArrayList<Object>();
          for (Iterator<?> it = selection.iterator(); it.hasNext();)
          {
            Object selectedOjbect = it.next();
            if (selectedOjbect instanceof EObject)
            {
              EObject object = getEObject((EObject)selectedOjbect);
              if (object != null)
              {
                list.add(object);
              }
            }
          }

          viewer.setSelection(new StructuredSelection(list));
        }
      }
      catch (RuntimeException ex)
      {
        OM.LOG.error(ex);
        throw ex;
      }
    }

    private EObject getEObject(EObject object)
    {
      URI uri = getEObjectURI(object);
      Object element = input;
      return getEObject(uri, element);
    }

    private EObject getEObject(URI uri, Object element)
    {
      if (element instanceof EObject)
      {
        EObject elementObject = (EObject)element;
        URI elementURI = getEObjectURI(elementObject);
        if (ObjectUtil.equals(elementURI, uri))
        {
          return elementObject;
        }
      }

      for (Object childObject : getChildren(element))
      {
        EObject result = getEObject(uri, childObject);
        if (result != null)
        {
          return result;
        }
      }

      return null;
    }

    private URI getEObjectURI(EObject object)
    {
      if (object == null)
      {
        return null;
      }

      Resource resource = object.eResource();
      if (resource == null)
      {
        return null;
      }

      URI uri = resource.getURI();
      if (uri == null)
      {
        return null;
      }

      String id = EcoreUtil.getID(object);
      if (id == null)
      {
        return null;
      }

      return uri.appendFragment(id);
    }
  }
}
