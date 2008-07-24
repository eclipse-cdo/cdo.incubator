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
import org.eclipse.net4j.pop.IPopElement;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.stream.ITaskStream;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Delivery extends PopElement implements IDelivery
{
  private ITaskStream taskStream;

  private int number;

  private Date date;

  public Delivery(ITaskStream taskStream, int number, Date date)
  {
    this.taskStream = taskStream;
    this.date = date;
    this.number = number;
  }

  public ITaskStream getTaskStream()
  {
    return taskStream;
  }

  public IPopElement getParentElement()
  {
    return taskStream;
  }

  public int getNumber()
  {
    return number;
  }

  public Date getDate()
  {
    return date;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Delivery[number={0}, date={1,date} {1,time}]", number, date);
  }
}
