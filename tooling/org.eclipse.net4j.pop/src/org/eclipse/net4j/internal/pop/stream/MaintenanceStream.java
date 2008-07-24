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
import org.eclipse.net4j.pop.stream.IMaintenanceStream;
import org.eclipse.net4j.pop.stream.IStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class MaintenanceStream extends IntegrationStream implements IMaintenanceStream
{
  private Container container;

  public MaintenanceStream(Container container, IBranch branch, ITicket ticket)
  {
    super(((IStream)container).getPop(), branch, ticket);
    this.container = container;
  }

  public Container getContainer()
  {
    return container;
  }

  public IRelease addRelease()
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

      IVersion version = lastVersion.nextMicro();
      IRelease release = new Release(this, version);
      releaseContainer.addElement(release);
      return release;
    }
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("MaintenanceStream[branch={0}, ticket={1}]", getBranch(), getTicket());
  }
}
