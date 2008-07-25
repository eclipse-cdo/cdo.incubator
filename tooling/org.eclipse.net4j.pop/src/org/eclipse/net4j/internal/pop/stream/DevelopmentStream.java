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

import org.eclipse.net4j.internal.pop.release.Release;
import org.eclipse.net4j.internal.pop.release.ReleaseContainer;
import org.eclipse.net4j.internal.pop.release.Version;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.stream.IStreamBaseline;
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

  public DevelopmentStream(IStreamBaseline baseline, IBranch branch, ITicket ticket)
  {
    super(baseline, branch, ticket);
  }

  @Override
  public IDevelopmentStream getStream()
  {
    return (IDevelopmentStream)super.getStream();
  }

  public IMaintenanceStream addMaintenanceStream(IRelease baseline, ITicket ticket)
  {
    checkBaseline(baseline);
    IBranch branch = getPop().getStrategy().createMaintenanceBranch(baseline, ticket);
    IMaintenanceStream maintenanceStream = new MaintenanceStream(baseline, branch, ticket);
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

  public IRelease addRelease()
  {
    return addRelease(true, 1);
  }

  public IRelease addRelease(boolean compatible, int increment)
  {
    ReleaseContainer releaseContainer = getReleaseContainer();
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

      IRelease release = new Release(this, version);
      releaseContainer.addElement(release);
      return release;
    }
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

  protected MaintenanceStreamContainer getMaintenanceStreamContainer()
  {
    return maintenanceStreamContainer;
  }

  private void checkBaseline(IRelease baseline)
  {
    checkArgument(baseline, "baseline");
    checkArgument(baseline.getStream() == this, "baseline");
  }
}
