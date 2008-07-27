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
    System.out.println(ticketUser);

    IBranch mainBranch = PopUtil.createMainBranch("HEAD");
    System.out.println(mainBranch);

    ITicket popTicket = PopUtil.createTicket("100000");
    IPop pop = PopUtil.createPop("CDO", mainBranch, popTicket);
    System.out.println(pop);
    System.out.println(pop.addCommitter(ticketUser, "estepper", new Date(), null));

    ITicket taskTicket = PopUtil.createTicket("200000");
    ITaskStream taskStream = pop.addTaskStream(pop.getBaseline("TAG"), taskTicket);
    System.out.println(taskStream);

    IDelivery delivery1 = taskStream.addDelivery(new Date());
    System.out.println(delivery1);

    IDelivery delivery2 = taskStream.addDelivery(new Date());
    System.out.println(delivery2);

    IDelivery delivery3 = taskStream.addDelivery(new Date());
    System.out.println(delivery3);

    System.out.println(pop.addMerge(new Date(), delivery1));
    System.out.println(pop.addMerge(new Date(), delivery2));
    System.out.println(pop.addMerge(new Date(), delivery3));

    System.out.println(pop.addRelease());
    System.out.println(pop.addRelease());
    IRelease release = pop.addRelease(false, 2);
    System.out.println(release);
    System.out.println(pop.addRelease());

    System.out.println(release.addMilestone("M1"));
    System.out.println(release.addMilestone("M2"));
    System.out.println(release.addMilestone("M3"));
    System.out.println(release.addMilestone("RC1"));
    System.out.println(release.addMilestone("RC2"));

    ITicket maintenanceTicket = PopUtil.createTicket("300000");
    IMaintenanceStream maintenanceStream = pop.addMaintenanceStream(release, maintenanceTicket);
    System.out.println(maintenanceStream);

    System.out.println(maintenanceStream.addRelease());
    System.out.println(maintenanceStream.addRelease());
    System.out.println(maintenanceStream.addRelease());
    System.out.println(maintenanceStream.addRelease());
  }
}
