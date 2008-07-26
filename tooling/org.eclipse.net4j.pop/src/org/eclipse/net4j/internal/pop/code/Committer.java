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

import org.eclipse.net4j.internal.pop.ticket.TicketUser;
import org.eclipse.net4j.pop.code.ICommitter;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Committer extends TicketUser implements ICommitter
{
  private Container container;

  private String codeAccount;

  private Date entryDate;

  private Date exitDate;

  public Committer(Container container, String name, String email, String ticketAccount, String codeAccount,
      Date entryDate, Date exitDate)
  {
    // TODO Decouple ticket user
    // TODO Check args
    super(name, email, ticketAccount);
    this.container = container;
    this.codeAccount = codeAccount;
    this.entryDate = entryDate;
    this.exitDate = exitDate;
  }

  public Container getContainer()
  {
    return container;
  }

  public String getCodeAccount()
  {
    return codeAccount;
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
    return MessageFormat.format("Committer[name={0}, email={1}, ticketAccount={2}, codeAccount={3}]", getName(),
        getEmail(), getTicketAccount(), codeAccount);
  }
}
