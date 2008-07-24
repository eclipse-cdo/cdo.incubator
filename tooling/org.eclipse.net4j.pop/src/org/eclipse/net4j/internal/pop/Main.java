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
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.PopUtil;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.stream.ITaskStream;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Main
{
  public static void main(String[] args)
  {
    IPop pop = PopUtil.createPop(null, null, "CDO");
    ITaskStream taskStream = pop.addTaskStream(null, null);

    IDelivery delivery = taskStream.addDelivery(new Date());
    System.out.println(delivery);

    IMerge merge = pop.addMerge(new Date(), delivery);
    System.out.println(merge);

    System.out.println(pop.addRelease());
    System.out.println(pop.addRelease());
    System.out.println(pop.addRelease());
    System.out.println(pop.addRelease());
  }
}
