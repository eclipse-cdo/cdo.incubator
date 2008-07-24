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
package org.eclipse.net4j.internal.pop.ticket;

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.ticket.ITicketUser;

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public class TicketUser extends Element implements ITicketUser
{
  private String name;

  private String email;

  private String ticketAccount;

  public TicketUser(String name, String email, String ticketAccount)
  {
    this.email = email;
    this.name = name;
    this.ticketAccount = ticketAccount;
  }

  public String getName()
  {
    return name;
  }

  public String getEmail()
  {
    return email;
  }

  public String getTicketAccount()
  {
    return ticketAccount;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("TicketUser[name={0}, email={1}, ticketAccount={2}]", name, email, ticketAccount);
  }
}
