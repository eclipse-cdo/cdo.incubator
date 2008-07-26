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
import org.eclipse.net4j.internal.pop.util.IElementProxy;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IDevelopmentStream;
import org.eclipse.net4j.pop.IMaintenanceStream;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class MaintenanceStreamProxy extends ElementProxy<IMaintenanceStream> implements IMaintenanceStream
{
  private MaintenanceStreamProxy(IPop pop, String ticketID)
  {
    super(pop, ticketID);
  }

  public MaintenanceStreamProxy(IMaintenanceStream maintenanceStream)
  {
    this(maintenanceStream.getPop(), maintenanceStream.getTicket().getID());
  }

  public IElementProxy<? extends IMaintenanceStream> copy()
  {
    return new MaintenanceStreamProxy(getPop(), getTicketID());
  }

  @Override
  public IPop getPop()
  {
    return resolve().getPop();
  }

  public IBranch getBranch()
  {
    return resolve().getBranch();
  }

  public ITicket getTicket()
  {
    return resolve().getTicket();
  }

  public IRelease getBaseline()
  {
    return resolve().getBaseline();
  }

  public IDevelopmentStream getParent()
  {
    return resolve().getParent();
  }

  public IMerge merge(Date date, IDelivery delivery)
  {
    return resolve().merge(date, delivery);
  }

  public IMerge getMerge(int index)
  {
    return resolve().getMerge(index);
  }

  public int getMergeCount()
  {
    return resolve().getMergeCount();
  }

  public IMerge[] getMerges()
  {
    return resolve().getMerges();
  }

  public IRelease addRelease(Date date)
  {
    return resolve().addRelease(date);
  }

  public IRelease getRelease(int index)
  {
    return resolve().getRelease(index);
  }

  public int getReleaseCount()
  {
    return resolve().getReleaseCount();
  }

  public IRelease[] getReleases()
  {
    return resolve().getReleases();
  }

  public ITaskStream addTaskStream(Date baselineDate, ITicket ticket)
  {
    return resolve().addTaskStream(baselineDate, ticket);
  }

  public ITaskStream addTaskStream(IBaseline baseline, ITicket ticket)
  {
    return resolve().addTaskStream(baseline, ticket);
  }

  public ITaskStream getTaskStream(int index)
  {
    return resolve().getTaskStream(index);
  }

  public int getTaskStreamCount()
  {
    return resolve().getTaskStreamCount();
  }

  public ITaskStream[] getTaskStreams()
  {
    return resolve().getTaskStreams();
  }

  @Override
  protected IMaintenanceStream resolve()
  {
    return ((Pop)getPop()).resolve(this);
  }
}
