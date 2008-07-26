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

import org.eclipse.net4j.internal.pop.Pop;
import org.eclipse.net4j.internal.pop.code.Branch;
import org.eclipse.net4j.internal.pop.code.DefaultCodeStrategy;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ICodeStrategy;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public final class PopUtil
{
  private PopUtil()
  {
  }

  public static IBranch createRootBranch(String name)
  {
    return new Branch(name, null);
  }

  public static IPop createPop(String name, IBranch branch, ITicket ticket)
  {
    return createPop(name, branch, ticket, new DefaultCodeStrategy());
  }

  public static IPop createPop(String name, IBranch branch, ITicket ticket, ICodeStrategy strategy)
  {
    return new Pop(name, strategy, branch, ticket);
  }
}
