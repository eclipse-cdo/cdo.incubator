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
package org.eclipse.net4j.pop.internal.ui.actions;

import org.eclipse.net4j.pop.project.CheckoutDiscriminator;
import org.eclipse.net4j.util.ui.actions.LongRunningAction;

import org.eclipse.ui.IWorkbenchPage;

/**
 * @author Eike Stepper
 */
public class CheckoutAction extends LongRunningAction
{
  private static final String TITLE = "New Checkout";

  private static final String TOOLTIP = "Create a new checkout";

  private static final String DISABLED_TOOLTIP = "A checkout does already exist";

  private CheckoutDiscriminator discriminator;

  public CheckoutAction(IWorkbenchPage page, CheckoutDiscriminator discriminator)
  {
    super(page, TITLE);
    doSetDiscriminator(discriminator);
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
    if (this.discriminator != discriminator)
    {
      doSetDiscriminator(discriminator);
    }
  }

  private void doSetDiscriminator(CheckoutDiscriminator discriminator)
  {
    this.discriminator = discriminator;
    if (discriminator == null)
    {
      setEnabled(false);
      setToolTipText(TOOLTIP);
    }
    else
    {
      if (discriminator.hasCheckout())
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
