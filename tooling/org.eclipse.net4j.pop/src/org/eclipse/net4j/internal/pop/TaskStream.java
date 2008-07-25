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

import org.eclipse.net4j.internal.pop.delivery.Delivery;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.IStreamBaseline;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class TaskStream extends Stream implements ITaskStream
{
  private ElementContainer<IDelivery> deliveryContainer = new ElementContainer<IDelivery>(this);

  public TaskStream(IStreamBaseline baseline, IBranch branch, ITicket ticket)
  {
    super(baseline, branch, ticket);
  }

  @Override
  public ITaskStream getStream()
  {
    return this;
  }

  @Override
  public IIntegrationStream getParentStream()
  {
    return getParentElement();
  }

  @Override
  public IIntegrationStream getParentElement()
  {
    return (IIntegrationStream)getBaseline().getStream();
  }

  public IDelivery addDelivery(Date deliveryDate)
  {
    List<IDelivery> elements = deliveryContainer.getElements();
    synchronized (elements)
    {
      IDelivery delivery = new Delivery(this, elements.size() + 1, deliveryDate);
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
}
