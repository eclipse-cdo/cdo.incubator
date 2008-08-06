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
import org.eclipse.net4j.util.ui.UIUtil;
import org.eclipse.net4j.util.ui.actions.LongRunningActionDelegate;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author Eike Stepper
 */
public class NewAction extends LongRunningActionDelegate implements IObjectActionDelegate
{
  private IWorkbenchPart part;

  public NewAction()
  {
  }

  public void setActivePart(IAction action, IWorkbenchPart part)
  {
    this.part = part;
  }

  public IWorkbenchPart getPart()
  {
    return part;
  }

  @Override
  protected void doRun() throws Exception
  {
    Object element = UIUtil.getElement(getSelection());
    if (element instanceof CheckoutDiscriminator)
    {
      CheckoutDiscriminator discriminator = (CheckoutDiscriminator)element;
      discriminator.checkout();
    }

  }
}
