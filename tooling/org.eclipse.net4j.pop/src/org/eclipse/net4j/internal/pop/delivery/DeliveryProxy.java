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
package org.eclipse.net4j.internal.pop.delivery;

import org.eclipse.net4j.internal.pop.util.ElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.delivery.IDelivery;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class DeliveryProxy extends ElementProxy<IDelivery> implements IDelivery
{
  private int number;

  private DeliveryProxy(IPop pop, String ticketID, int number)
  {
    super(pop, ticketID);
    this.number = number;
  }

  public DeliveryProxy(IDelivery delivery)
  {
    super(delivery.getStream().getPop(), delivery.getStream().getTicket().getID(), delivery);
    number = delivery.getNumber();
  }

  public IElementProxy<? extends IDelivery> copy()
  {
    return new DeliveryProxy(getPop(), getTicketID(), number);
  }

  public int getNumber()
  {
    return number;
  }

  public Date getDate()
  {
    return getElement().getDate();
  }

  public ITaskStream getStream()
  {
    return getElement().getStream();
  }

  @Override
  protected IDelivery resolve()
  {
    return ((IElementResolver)getPop()).resolve(this);
  }
}
