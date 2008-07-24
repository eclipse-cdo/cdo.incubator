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
import org.eclipse.net4j.pop.delivery.IMerge;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Merge extends Element implements IMerge
{
  private Container container;

  private IDelivery delivery;

  private Date date;

  public Merge(Container container, IDelivery delivery, Date date)
  {
    this.container = container;
    this.date = date;
    this.delivery = delivery;
  }

  public Container getContainer()
  {
    return container;
  }

  public IDelivery getDelivery()
  {
    return delivery;
  }

  public Date getDate()
  {
    return date;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Delivery[delivery={0}, date={1,date} {1,time}]", delivery, date);
  }
}
