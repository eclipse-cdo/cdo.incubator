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
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.pop.ticket.ITicketUser;
import org.eclipse.net4j.pop.util.PopUtil;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Main
{
  public static final long ONE_DAY = 24 * 60 * 60 * 1000;

  public static void main(String[] args)
  {
    ITicketUser ticketUser = PopUtil.createTicketUser("Eike Stepper", "stepper@esc-net.de");
    IBranch mainBranch = PopUtil.createMainBranch("HEAD", date());

    ITicket popTicket = PopUtil.createTicket("pop-123456");
    IPop pop = PopUtil.createPop("CDO", mainBranch, popTicket);
    System.out.println(pop.addCommitter(ticketUser, "estepper", date(), null));

    ITicket taskTicket = PopUtil.createTicket("task-123456");
    ITaskStream taskStream = pop.addTaskStream(date(), taskTicket);
    IDelivery delivery1 = taskStream.addDelivery(date());
    System.out.println(delivery1);

    IDelivery delivery2 = taskStream.addDelivery(date());
    System.out.println(delivery2);

    IDelivery delivery3 = taskStream.addDelivery(date());
    System.out.println(delivery3);

    System.out.println(pop.merge(date(), delivery1));
    System.out.println(pop.merge(date(), delivery2));
    System.out.println(pop.merge(date(), delivery3));

    System.out.println(pop.addRelease(date()));
    System.out.println(pop.addRelease(date()));
    IRelease release = pop.addRelease(date(), false, 2);
    System.out.println(release);
    System.out.println(pop.addRelease(date()));

    ITicket maintenanceTicket = PopUtil.createTicket("maintenance-123456");
    IMaintenanceStream maintenanceStream = pop.addMaintenanceStream(release, maintenanceTicket);
    System.out.println(maintenanceStream.addRelease(date()));
    System.out.println(maintenanceStream.addRelease(date()));
    System.out.println(maintenanceStream.addRelease(date()));
    System.out.println(maintenanceStream.addRelease(date()));
  }

  private static Date date()
  {
    try
    {
      return date;
    }
    finally
    {
      date = new Date(date.getTime() + ONE_DAY);
    }
  }

  private static Date date = new Date();
}
