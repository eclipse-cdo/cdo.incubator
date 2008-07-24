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
package org.eclipse.net4j.internal.pop.stream;

import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.stream.IDevelopmentStream;
import org.eclipse.net4j.pop.stream.IMaintenanceStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import org.eclipse.core.runtime.IAdaptable;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class DevelopmentStream extends IntegrationStream implements IDevelopmentStream
{
  private MaintenanceStreamContainer maintenanceStreamContainer = new MaintenanceStreamContainer(this);

  public DevelopmentStream(IBranch branch, ITicket ticket)
  {
    super(branch, ticket);
  }

  public IMaintenanceStream addMaintenanceStream(IBranch branch, ITicket ticket)
  {
    IMaintenanceStream maintenanceStream = new MaintenanceStream(this, branch, ticket);
    maintenanceStreamContainer.addElement(maintenanceStream);
    return maintenanceStream;
  }

  public IMaintenanceStream getMaintenanceStream(int index)
  {
    return maintenanceStreamContainer.getMaintenanceStream(index);
  }

  public int getMaintenanceStreamCount()
  {
    return maintenanceStreamContainer.getMaintenanceStreamCount();
  }

  public IMaintenanceStream[] getMaintenanceStreams()
  {
    return maintenanceStreamContainer.getMaintenanceStreams();
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("DevelopmentStream[branch={0}, ticket={1}]", getBranch(), getTicket());
  }

  @Override
  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
    super.collectAdaptables(adaptables);
    adaptables.add(maintenanceStreamContainer);
  }
}
