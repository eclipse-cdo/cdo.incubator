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

import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.stream.IMaintenanceStream;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.util.PopUtil;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Main
{
  public static void main(String[] args)
  {
    IPop pop = PopUtil.createPop("CDO", null, null);
    ITaskStream taskStream = pop.addTaskStream(null, null);

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
    System.out.println(pop.addRelease(false, 2));
    System.out.println(pop.addRelease());

    IMaintenanceStream maintenanceStream = pop.addMaintenanceStream(null, null);
    System.out.println(maintenanceStream.addRelease());
    System.out.println(maintenanceStream.addRelease());
    System.out.println(maintenanceStream.addRelease());
    System.out.println(maintenanceStream.addRelease());
  }
}
