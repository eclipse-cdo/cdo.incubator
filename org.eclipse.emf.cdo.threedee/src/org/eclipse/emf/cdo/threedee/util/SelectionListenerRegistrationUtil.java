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
package org.eclipse.emf.cdo.threedee.util;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;

/**
 * @author Martin Fluegge
 */
public class SelectionListenerRegistrationUtil
{
  public static void addSelectionChangedListener(ISelectionChangedListener listener, String viewId, IWorkbenchPage page)
  {
    IViewPart view = page.findView(viewId);
    if (view != null && view instanceof ISelectionProviderProvider)
    {
      ((ISelectionProviderProvider)view).getSelectionProvider().addSelectionChangedListener(listener);
    }
    else
    {
      page.addPartListener(new AddSelectionChangeListenerPartListener(listener, viewId, page));
    }
  }

  /**
   * @author Martin Fluegge
   */
  private static class AddSelectionChangeListenerPartListener implements IPartListener2
  {
    private final ISelectionChangedListener listener;

    private final String viewId;

    private final IWorkbenchPage page;

    public AddSelectionChangeListenerPartListener(ISelectionChangedListener listener, String viewId, IWorkbenchPage page)
    {
      this.listener = listener;
      this.viewId = viewId;
      this.page = page;
    }

    public void partActivated(IWorkbenchPartReference partRef)
    {
      page.addPartListener(new AddSelectionChangeListenerPartListener(listener, viewId, page));
      page.removePartListener(this);
    }

    public void partBroughtToTop(IWorkbenchPartReference partRef)
    {
    }

    public void partClosed(IWorkbenchPartReference partRef)
    {
    }

    public void partDeactivated(IWorkbenchPartReference partRef)
    {
    }

    public void partOpened(IWorkbenchPartReference partRef)
    {
    }

    public void partHidden(IWorkbenchPartReference partRef)
    {
    }

    public void partVisible(IWorkbenchPartReference partRef)
    {
    }

    public void partInputChanged(IWorkbenchPartReference partRef)
    {
    }

  }

  /**
   * @author Martin Fluegge
   */
  public interface ISelectionProviderProvider
  {
    ISelectionProvider getSelectionProvider();
  }
}
