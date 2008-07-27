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

import org.eclipse.net4j.internal.pop.InternalPopManager;
import org.eclipse.net4j.internal.pop.util.ElementProxy;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.delivery.IDelivery;

import org.eclipse.mylyn.tasks.core.ITask;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class DeliveryProxy extends ElementProxy<IDelivery> implements IDelivery
{
  private int number;

  private DeliveryProxy(InternalPopManager manager, ITask task, int number)
  {
    super(manager, task);
    this.number = number;
  }

  private DeliveryProxy(IDelivery delivery)
  {
    super((InternalPopManager)delivery.getStream().getPop().getManager(), delivery.getStream().getTask(), delivery);
    number = delivery.getNumber();
  }

  public static DeliveryProxy proxy(IDelivery delivery)
  {
    if (delivery instanceof DeliveryProxy)
    {
      return ((DeliveryProxy)delivery).copy();
    }

    return new DeliveryProxy(delivery);
  }

  public DeliveryProxy copy()
  {
    return new DeliveryProxy(getManager(), getTask(), number);
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
    return getManager().resolve(this);
  }
}
