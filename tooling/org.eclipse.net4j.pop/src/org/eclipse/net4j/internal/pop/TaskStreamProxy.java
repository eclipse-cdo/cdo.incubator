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

import org.eclipse.net4j.internal.pop.util.ElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class TaskStreamProxy extends ElementProxy<ITaskStream> implements ITaskStream
{
  private TaskStreamProxy(IPop pop, String ticketID)
  {
    super(pop, ticketID);
    ((Pop)getPop()).putStream(this);
  }

  private TaskStreamProxy(ITaskStream taskStream)
  {
    super(taskStream.getPop(), taskStream.getTicket().getID(), taskStream);
  }

  public static TaskStreamProxy proxy(ITaskStream taskStream)
  {
    if (taskStream instanceof TaskStreamProxy)
    {
      return ((TaskStreamProxy)taskStream).copy();
    }

    return new TaskStreamProxy(taskStream);
  }

  public TaskStreamProxy copy()
  {
    return new TaskStreamProxy(getPop(), getTicketID());
  }

  public IBranch getBranch()
  {
    return getElement().getBranch();
  }

  public ITicket getTicket()
  {
    return getElement().getTicket();
  }

  public IBaseline getBaseline()
  {
    return getElement().getBaseline();
  }

  public IIntegrationStream getParent()
  {
    return getElement().getParent();
  }

  public IMerge addMerge(Date date, IDelivery delivery)
  {
    return getElement().addMerge(date, delivery);
  }

  public IMerge getMerge(int index)
  {
    return getElement().getMerge(index);
  }

  public int getMergeCount()
  {
    return getElement().getMergeCount();
  }

  public IMerge[] getMerges()
  {
    return getElement().getMerges();
  }

  public IDelivery addDelivery(Date deliveryDate)
  {
    return getElement().addDelivery(deliveryDate);
  }

  public IDelivery[] getDeliveries()
  {
    return getElement().getDeliveries();
  }

  public IDelivery getDeliveryByNumber(int number)
  {
    return getElement().getDeliveryByNumber(number);
  }

  public IDelivery getDelivery(int index)
  {
    return getElement().getDelivery(index);
  }

  public int getDeliveryCount()
  {
    return getElement().getDeliveryCount();
  }

  public IBaseline addBaseline(IBaseline baseline)
  {
    return getElement().addBaseline(baseline);
  }

  public IBaseline addBaseline(String tagName)
  {
    return getElement().addBaseline(tagName);
  }

  public IBaseline getBaseline(int index)
  {
    return getElement().getBaseline(index);
  }

  public int getBaselineCount()
  {
    return getElement().getBaselineCount();
  }

  public IBaseline getBaselineByTagName(String tagName)
  {
    return getElement().getBaselineByTagName(tagName);
  }

  public IBaseline[] getBaselines()
  {
    return getElement().getBaselines();
  }

  @Override
  protected ITaskStream resolve()
  {
    return ((IElementResolver)getPop()).resolve(this);
  }
}
