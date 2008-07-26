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

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Merge extends Element implements IMerge
{
  private IStream stream;

  private Date date;

  private IDelivery delivery;

  public Merge(IStream stream, Date date, IDelivery delivery)
  {
    checkArgument(stream, "stream");
    checkArgument(date, "date");
    checkArgument(delivery, "delivery");
    this.stream = stream;
    this.date = date;
    this.delivery = delivery;
  }

  public IStream getStream()
  {
    return stream;
  }

  public Date getDate()
  {
    return date;
  }

  public IDelivery getDelivery()
  {
    return delivery;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Merge[branch={0}, date={1,date} {1,time}, delivery={2}, number={3}]", stream
        .getBranch().getName(), date, delivery.getStream().getBranch().getName(), delivery.getNumber());
  }
}
