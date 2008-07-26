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
package org.eclipse.net4j.internal.pop.code;

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.ICommitter;
import org.eclipse.net4j.pop.ticket.ITicketUser;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Committer extends Element implements ICommitter
{
  private IPop pop;

  private ITicketUser ticketUser;

  private String account;

  private Date entryDate;

  private Date exitDate;

  public Committer(IPop pop, ITicketUser ticketUser, String account, Date entryDate, Date exitDate)
  {
    checkArgument(pop, "pop");
    checkArgument(ticketUser, "ticketUser");
    checkArgument(account, "account");
    checkArgument(entryDate, "entryDate");
    this.pop = pop;
    this.ticketUser = ticketUser;
    this.account = account;
    this.entryDate = entryDate;
    this.exitDate = exitDate;
  }

  public IPop getPop()
  {
    return pop;
  }

  public ITicketUser getTicketUser()
  {
    return ticketUser;
  }

  public String getAccount()
  {
    return account;
  }

  public Date getEntryDate()
  {
    return entryDate;
  }

  public Date getExitDate()
  {
    return exitDate;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Committer[pop={0}, name={1}, account={2}]", pop.getName(), ticketUser.getName(),
        account);
  }
}
