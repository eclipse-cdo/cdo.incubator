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
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.pop.ticket.ITicketManager;
import org.eclipse.net4j.pop.ticket.ITicketUser;

import org.eclipse.mylyn.tasks.core.IRepositoryManager;
import org.eclipse.mylyn.tasks.core.data.ITaskDataManager;

/**
 * @author Eike Stepper
 */
public class TicketManager extends Element implements ITicketManager
{
  private IRepositoryManager repositoryManager;

  private ITaskDataManager taskDataManager;

  public TicketManager(IRepositoryManager repositoryManager, ITaskDataManager taskDataManager)
  {
    checkArgument(repositoryManager, "repositoryManager");
    checkArgument(taskDataManager, "taskDataManager");
    this.repositoryManager = repositoryManager;
    this.taskDataManager = taskDataManager;
  }

  public IRepositoryManager getRepositoryManager()
  {
    return repositoryManager;
  }

  public ITaskDataManager getTaskDataManager()
  {
    return taskDataManager;
  }

  public ITicketUser createTicketUser(String name, String email, String ticketAccount)
  {
    return new TicketUser(name, email, ticketAccount);
  }

  public ITicketUser createTicketUser(String name, String email)
  {
    return new TicketUser(name, email, email);
  }

  public ITicket createTicket(String ticketID)
  {
    return new Ticket(ticketID);
  }

  @Override
  public String toString()
  {
    return "TicketManager";
  }
}
