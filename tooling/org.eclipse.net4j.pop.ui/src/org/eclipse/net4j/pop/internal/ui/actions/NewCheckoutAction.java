package org.eclipse.net4j.pop.internal.ui.actions;

import org.eclipse.net4j.util.ui.actions.LongRunningAction;

import org.eclipse.ui.IWorkbenchPage;

public class NewCheckoutAction extends LongRunningAction
{
  public NewCheckoutAction(IWorkbenchPage page)
  {
    super(page, "New Checkout", "Create a new checkout");
  }

  @Override
  protected void doRun() throws Exception
  {
  }
}
