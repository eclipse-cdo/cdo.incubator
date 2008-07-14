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
package org.eclipse.net4j.template.internal.ui.actions;

import org.eclipse.net4j.template.internal.ui.bundle.OM;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TemplateNatureAction implements IObjectActionDelegate
{
  private ISelection selection;

  public TemplateNatureAction()
  {
  }

  public void run(IAction action)
  {
    if (selection instanceof IStructuredSelection)
    {
      IStructuredSelection ssel = (IStructuredSelection)selection;
      Object object = ssel.getFirstElement();
      if (object instanceof IProject)
      {
        try
        {
          IProject project = (IProject)object;
          IProjectDescription description = project.getDescription();
          List<String> natureIds = new ArrayList<String>(Arrays.asList(description.getNatureIds()));
          modifyNatureIds(natureIds);
          description.setNatureIds(natureIds.toArray(new String[natureIds.size()]));
          project.setDescription(description, new NullProgressMonitor());
        }
        catch (CoreException ex)
        {
          OM.LOG.error(ex);
        }
      }
    }
  }

  protected abstract void modifyNatureIds(List<String> natureIds);

  public void selectionChanged(IAction action, ISelection selection)
  {
    this.selection = selection;
  }

  public void setActivePart(IAction action, IWorkbenchPart targetPart)
  {
  }
}
