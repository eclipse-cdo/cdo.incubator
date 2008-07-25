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

import org.eclipse.net4j.internal.pop.PopElement;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.stream.IStream;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Merge extends PopElement implements IMerge
{
  private IDelivery delivery;

  private Date date;

  public Merge(IStream stream, Date date, IDelivery delivery)
  {
    super(stream);
    this.date = date;
    this.delivery = delivery;
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
  public IStream getParentElement()
  {
    return (IStream)super.getParentElement();
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Merge[delivery={0}, date={1,date} {1,time}]", delivery, date);
  }
}
