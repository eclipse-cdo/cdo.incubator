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

import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.pop.delivery.IDelivery;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Delivery extends Element implements IDelivery
{
  private Container container;

  private Date deliveryDate;

  private int deliveryNumber;

  public Delivery(Container container, Date deliveryDate, int deliveryNumber)
  {
    this.container = container;
    this.deliveryDate = deliveryDate;
    this.deliveryNumber = deliveryNumber;
  }

  public Container getDeliveryContainer()
  {
    return container;
  }

  public Date getDeliveryDate()
  {
    return deliveryDate;
  }

  public int getDeliveryNumber()
  {
    return deliveryNumber;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Delivery[deliveryNumber={0}, deliveryDate={1,date} {1,time}]", deliveryNumber,
        deliveryDate);
  }
}
