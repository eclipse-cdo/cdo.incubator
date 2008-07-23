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

import org.eclipse.net4j.internal.pop.delivery.DeliveryContainer;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class TaskStream extends Stream implements ITaskStream
{
  private ITaskStream.Container container;

  private IDelivery.Container deliveryContainer = new DeliveryContainer();

  public TaskStream(IPop pop, IBranch branch, ITicket ticket, ITaskStream.Container container)
  {
    super(pop, branch, ticket);
    this.container = container;
  }

  public ITaskStream.Container getTaskStreamContainer()
  {
    return container;
  }

  public IDelivery addDelivery(Date date)
  {
    return deliveryContainer.addDelivery(date);
  }

  public IDelivery[] getDeliveries()
  {
    return deliveryContainer.getDeliveries();
  }

  public IDelivery getDelivery(int index)
  {
    return deliveryContainer.getDelivery(index);
  }

  public int getDeliveryCount()
  {
    return deliveryContainer.getDeliveryCount();
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object getAdapter(Class adapter)
  {
    Object result = super.getAdapter(adapter);
    if (result != null)
    {
      return result;
    }

    return deliveryContainer.getAdapter(adapter);
  }
}
