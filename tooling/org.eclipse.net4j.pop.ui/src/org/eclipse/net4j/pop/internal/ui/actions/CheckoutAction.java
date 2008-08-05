package org.eclipse.net4j.pop.internal.ui.actions;

import org.eclipse.net4j.pop.project.CheckoutDiscriminator;
import org.eclipse.net4j.util.ui.actions.LongRunningAction;

import org.eclipse.ui.IWorkbenchPage;

public class CheckoutAction extends LongRunningAction
{
  private static final String TITLE = "New Checkout";

  private static final String TOOLTIP = "Create a new checkout";

  private static final String DISABLED_TOOLTIP = "A checkout does already exist";

  private CheckoutDiscriminator discriminator;

  public CheckoutAction(IWorkbenchPage page, CheckoutDiscriminator discriminator)
  {
    super(page, TITLE);
    setDiscriminator(discriminator);
  }

  public CheckoutAction(IWorkbenchPage page)
  {
    this(page, null);
  }

  public CheckoutDiscriminator getDiscriminator()
  {
    return discriminator;
  }

  public void setDiscriminator(CheckoutDiscriminator discriminator)
  {
    this.discriminator = discriminator;
    if (discriminator == null)
    {
      setEnabled(false);
      setToolTipText(TOOLTIP);
    }
    else
    {
      if (discriminator.getCheckout() != null)
      {
        setEnabled(false);
        setToolTipText(DISABLED_TOOLTIP);
      }
      else
      {
        setEnabled(true);
        setToolTipText(TOOLTIP);
      }
    }
  }

  @Override
  protected void doRun() throws Exception
  {
    discriminator.checkout();
  }
}
