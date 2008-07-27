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
import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IDevelopmentStream;
import org.eclipse.net4j.pop.IMaintenanceStream;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
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
    super(maintenanceStream.getPop(), maintenanceStream.getTicket().getID(), maintenanceStream);
  }

  public IElementProxy<? extends IMaintenanceStream> copy()
  {
    return new MaintenanceStreamProxy(getPop(), getTicketID());
  }

  public IBranch getBranch()
  {
    return getElement().getBranch();
  }

  public ITicket getTicket()
  {
    return getElement().getTicket();
  }

  public IRelease getBaseline()
  {
    return getElement().getBaseline();
  }

  public IDevelopmentStream getParent()
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

  public IRelease addRelease()
  {
    return getElement().addRelease();
  }

  public IRelease getRelease(int index)
  {
    return getElement().getRelease(index);
  }

  public int getReleaseCount()
  {
    return getElement().getReleaseCount();
  }

  public IRelease getReleaseByVersion(IVersion version)
  {
    return getElement().getReleaseByVersion(version);
  }

  public IRelease[] getReleases()
  {
    return getElement().getReleases();
  }

  public ITaskStream addTaskStream(IBaseline baseline, ITicket ticket)
  {
    return getElement().addTaskStream(baseline, ticket);
  }

  public ITaskStream getTaskStream(int index)
  {
    return getElement().getTaskStream(index);
  }

  public int getTaskStreamCount()
  {
    return getElement().getTaskStreamCount();
  }

  public ITaskStream[] getTaskStreams()
  {
    return getElement().getTaskStreams();
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
  protected IMaintenanceStream resolve()
  {
    return ((IElementResolver)getPop()).resolve(this);
  }
}
