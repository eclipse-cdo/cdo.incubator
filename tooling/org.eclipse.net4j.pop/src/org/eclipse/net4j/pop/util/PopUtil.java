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
package org.eclipse.net4j.pop.util;

import org.eclipse.net4j.internal.pop.code.MainBranch;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.ticket.ITicketManager;

/**
 * @author Eike Stepper
 */
public final class PopUtil
{
  private static ITicketManager ticketManager;

  private PopUtil()
  {
  }

  public static ITicketManager getTicketManager()
  {
    return ticketManager;
  }

  public static IBranch createMainBranch(String name)
  {
    return new MainBranch(name);
  }

  // public static IPop createPop(String name, IBranch branch,  ITask task)
  // {
  // return createPop(name, branch, ticket, new DefaultCodeStrategy());
  // }
  //
  // public static IPop createPop(String name, IBranch branch,  ITask task, ICodeStrategy strategy)
  // {
  // return new Pop(name, strategy, branch, ticket);
  // }

  /**
   * @author Eike Stepper
   */
  public static final class Internal
  {
    private Internal()
    {
    }

    public static void setTicketManager(ITicketManager ticketManager)
    {
      PopUtil.ticketManager = ticketManager;
    }
  }
}
