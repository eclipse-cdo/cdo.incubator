package org.eclipse.net4j.provisioner.internal.ui;

import org.eclipse.net4j.provisioner.IEnvelope;
import org.eclipse.net4j.provisioner.IEnvelopeManager;
import org.eclipse.net4j.provisioner.internal.ui.bundle.OM;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate. The action proxy will be created by the workbench and shown
 * in the UI. When the user tries to use the action, this delegate will be created and execution will be delegated to
 * it.
 * 
 * @see IWorkbenchWindowActionDelegate
 */
public class SampleAction implements IWorkbenchWindowActionDelegate
{
  @SuppressWarnings("unused")
  private IWorkbenchWindow window;

  /**
   * The constructor.
   */
  public SampleAction()
  {
  }

  /**
   * The action has been activated. The argument of the method represents the 'real' action sitting in the workbench UI.
   * 
   * @see IWorkbenchWindowActionDelegate#run
   */
  public void run(IAction action)
  {
    final IEnvelope[] envelopes = IEnvelopeManager.INSTANCE.getElements();
    new Job("Provisioning envelopes")
    {
      @Override
      protected IStatus run(IProgressMonitor monitor)
      {
        OM.LOG.info(getName());
        for (IEnvelope envelope : envelopes)
        {
          try
          {
            envelope.provision();
          }
          catch (Exception ex)
          {
            OM.LOG.error(ex);
          }
        }

        return Status.OK_STATUS;
      }
    }.schedule();
  }

  /**
   * Selection in the workbench has been changed. We can change the state of the 'real' action here if we want, but this
   * can only happen after the delegate has been created.
   * 
   * @see IWorkbenchWindowActionDelegate#selectionChanged
   */
  public void selectionChanged(IAction action, ISelection selection)
  {
  }

  /**
   * We can use this method to dispose of any system resources we previously allocated.
   * 
   * @see IWorkbenchWindowActionDelegate#dispose
   */
  public void dispose()
  {
  }

  /**
   * We will cache window object in order to be able to provide parent shell for the message dialog.
   * 
   * @see IWorkbenchWindowActionDelegate#init
   */
  public void init(IWorkbenchWindow window)
  {
    this.window = window;
  }
}
