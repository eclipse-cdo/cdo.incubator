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
package org.eclipse.net4j.template.internal.ui.wizards;

import org.eclipse.net4j.template.ITemplate;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Eike Stepper
 */
public class NewProjectFromTemplateWizard extends Wizard implements INewWizard
{
  private TemplateSelectionPage templateSelectionPage;

  private PropertyEntryPage propertyEntryPage;

  private ITemplate template;

  private boolean lastPage;

  public NewProjectFromTemplateWizard()
  {
    setNeedsProgressMonitor(true);
  }

  public TemplateSelectionPage getTemplateSelectionPage()
  {
    return templateSelectionPage;
  }

  public PropertyEntryPage getPropertyEntryPage()
  {
    return propertyEntryPage;
  }

  public ITemplate getTemplate()
  {
    return template;
  }

  public void setTemplate(ITemplate template)
  {
    this.template = template;
  }

  public void setLastPage(boolean lastPage)
  {
    this.lastPage = lastPage;
  }

  @Override
  public void addPages()
  {
    addPage(templateSelectionPage = new TemplateSelectionPage());
    addPage(propertyEntryPage = new PropertyEntryPage());
  }

  public void init(IWorkbench workbench, IStructuredSelection selection)
  {
  }

  @Override
  public boolean canFinish()
  {
    return lastPage && super.canFinish();
  }

  @Override
  public boolean performFinish()
  {
    IRunnableWithProgress op = new IRunnableWithProgress()
    {
      public void run(IProgressMonitor monitor) throws InvocationTargetException
      {
        try
        {
          getTemplate().generate(monitor);
        }
        catch (CoreException ex)
        {
          throw new InvocationTargetException(ex);
        }
        finally
        {
          monitor.done();
        }
      }
    };

    try
    {
      getContainer().run(true, false, op);
    }
    catch (InterruptedException e)
    {
      return false;
    }
    catch (InvocationTargetException ex)
    {
      Throwable realException = ex.getTargetException();
      MessageDialog.openError(getShell(), "Error", realException.getMessage());
      return false;
    }

    return true;
  }
}
