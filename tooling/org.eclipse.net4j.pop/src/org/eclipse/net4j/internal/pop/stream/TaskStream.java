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

import org.eclipse.net4j.internal.pop.delivery.Delivery;
import org.eclipse.net4j.internal.pop.delivery.DeliveryContainer;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import org.eclipse.core.runtime.IAdaptable;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class TaskStream extends Stream implements ITaskStream
{
  private Container container;

  private DeliveryContainer deliveryContainer = new DeliveryContainer(this);

  public TaskStream(Container container, IBranch branch, ITicket ticket)
  {
    super(branch, ticket);
    this.container = container;
  }

  public Container getContainer()
  {
    return container;
  }

  public IDelivery addDelivery(Date deliveryDate)
  {
    List<IDelivery> elements = deliveryContainer.getElements();
    synchronized (elements)
    {
      IDelivery delivery = new Delivery(this, elements.size(), deliveryDate);
      deliveryContainer.addElement(delivery);
      return delivery;
    }
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

  @Override
  public String toString()
  {
    return MessageFormat.format("TaskStream[branch={0}, ticket={1}]", getBranch(), getTicket());
  }

  @Override
  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
    super.collectAdaptables(adaptables);
    adaptables.add(deliveryContainer);
  }
}
