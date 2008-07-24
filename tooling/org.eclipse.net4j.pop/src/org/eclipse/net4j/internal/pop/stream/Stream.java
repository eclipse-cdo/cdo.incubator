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
package org.eclipse.net4j.internal.pop.stream;

import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.stream.IStream;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public abstract class Stream extends Element implements IStream
{
  private IPop pop;

  private IBranch branch;

  private ITicket ticket;

  protected Stream(IPop pop, IBranch branch, ITicket ticket)
  {
    this.pop = pop;
    this.branch = branch;
    this.ticket = ticket;
  }

  public IPop getPop()
  {
    return pop;
  }

  public IBranch getBranch()
  {
    return branch;
  }

  public ITicket getTicket()
  {
    return ticket;
  }
}
