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
package org.eclipse.net4j.pop.internal.ui.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.mylyn.internal.tasks.ui.views.TaskRepositoriesSorter;
import org.eclipse.mylyn.internal.tasks.ui.views.TaskRepositoryLabelProvider;
import org.eclipse.mylyn.tasks.ui.TasksUi;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Eike Stepper
 */
public class PopImportWizard extends Wizard implements IImportWizard
{
  private SelectRepositoryPage page;

  private ISelection selection;

  public PopImportWizard()
  {
    super();
    setNeedsProgressMonitor(true);
  }

  public void init(IWorkbench workbench, IStructuredSelection selection)
  {
    this.selection = selection;
  }

  @Override
  public void addPages()
  {
    page = new SelectRepositoryPage();
    addPage(page);
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
          doFinish(monitor);
        }
        catch (CoreException e)
        {
          throw new InvocationTargetException(e);
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
    catch (InvocationTargetException e)
    {
      Throwable realException = e.getTargetException();
      MessageDialog.openError(getShell(), "Error", realException.getMessage());
      return false;
    }
    return true;
  }

  private void doFinish(IProgressMonitor monitor) throws CoreException
  {
    monitor.beginTask("Creating ", 2);
    monitor.worked(1);
    monitor.worked(1);
  }

  /**
   * @author Eike Stepper
   */
  private static class SelectRepositoryPage extends WizardPage
  {
    private TableViewer viewer;

    public SelectRepositoryPage()
    {
      super("wizardPage");
      setTitle("Multi-page Editor File");
      setDescription("This wizard creates a new file with *.mpe extension that can be opened by a multi-page editor.");
    }

    public void createControl(Composite parent)
    {
      Composite container = new Composite(parent, SWT.NULL);
      GridLayout layout = new GridLayout();
      container.setLayout(layout);
      layout.numColumns = 3;
      layout.verticalSpacing = 9;

      Label label = new Label(container, SWT.NULL);
      label.setText("&Task Repository:");

      viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
      GridData gd = new GridData(GridData.FILL_BOTH);
      viewer.getControl().setLayoutData(gd);
      viewer.setContentProvider(new RepositoryContentProvider());
      viewer.setLabelProvider(new DecoratingLabelProvider(new TaskRepositoryLabelProvider(), PlatformUI.getWorkbench()
          .getDecoratorManager().getLabelDecorator()));
      viewer.setSorter(new TaskRepositoriesSorter());
      viewer.setInput(this);
      viewer.addDoubleClickListener(new IDoubleClickListener()
      {
        public void doubleClick(DoubleClickEvent event)
        {
        }
      });

      dialogChanged();
      setControl(container);
    }

    private void dialogChanged()
    {
    }

    private void updateStatus(String message)
    {
      setErrorMessage(message);
      setPageComplete(message == null);
    }

    /**
     * @author Eike Stepper
     */
    private static class RepositoryContentProvider implements IStructuredContentProvider
    {
      public void inputChanged(Viewer v, Object oldInput, Object newInput)
      {
      }

      public void dispose()
      {
      }

      public Object[] getElements(Object parent)
      {
        return TasksUi.getRepositoryManager().getAllRepositories().toArray();
      }
    }
  }
}
