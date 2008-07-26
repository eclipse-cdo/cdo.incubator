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

import org.eclipse.net4j.internal.pop.release.Version;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IDevelopmentStream;
import org.eclipse.net4j.pop.IMaintenanceStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class DevelopmentStream extends IntegrationStream implements IDevelopmentStream
{
  protected ElementContainer<IMaintenanceStream> maintenanceStreamContainer = new ElementContainer<IMaintenanceStream>(
      this);

  public DevelopmentStream(IBaseline baseline, IBranch branch, ITicket ticket)
  {
    super(baseline, branch, ticket);
  }

  public IMaintenanceStream addMaintenanceStream(IRelease baseline, ITicket ticket)
  {
    checkBaseline(baseline);
    IBranch branch = getPop().getCodeStrategy().createMaintenanceBranch(baseline, ticket);
    IMaintenanceStream maintenanceStream = new MaintenanceStream(baseline, branch, ticket);
    maintenanceStreamContainer.addElement(maintenanceStream);
    return maintenanceStream;
  }

  public IMaintenanceStream getMaintenanceStream(int index)
  {
    return maintenanceStreamContainer.getElement(index);
  }

  public int getMaintenanceStreamCount()
  {
    return maintenanceStreamContainer.getElementCount();
  }

  public IMaintenanceStream[] getMaintenanceStreams()
  {
    return maintenanceStreamContainer.getElements(IMaintenanceStream.class);
  }

  public IRelease addRelease(Date date)
  {
    return addRelease(date, true, 1);
  }

  public IRelease addRelease(Date date, boolean compatible, int increment)
  {
    List<IRelease> elements = releaseContainer.getElements();
    synchronized (elements)
    {
      IVersion lastVersion = new Version();
      if (!elements.isEmpty())
      {
        IRelease lastRelease = elements.get(elements.size() - 1);
        lastVersion = lastRelease.getVersion();
      }

      IVersion version = null;
      if (compatible)
      {
        version = lastVersion.nextMinor(increment);
      }
      else
      {
        version = lastVersion.nextMajor(increment);
      }

      return addRelease(date, version);
    }
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("DevelopmentStream[parent={0}, branch={1}, ticket={2}]", getParent(), getBranch(),
        getTicket());
  }

  private void checkBaseline(IRelease baseline)
  {
    checkArgument(baseline, "baseline");
    checkArgument(baseline.getStream() == this, "baseline");
  }
}
