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
import org.eclipse.net4j.pop.IDevelopmentStream;
import org.eclipse.net4j.pop.IMaintenanceStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class MaintenanceStream extends IntegrationStream implements IMaintenanceStream
{
  public MaintenanceStream(IRelease baseline, IBranch branch, ITicket ticket)
  {
    super(baseline, branch, ticket);
    ((Pop)getPop()).putStream(this);
  }

  @Override
  public IDevelopmentStream getParent()
  {
    return (IDevelopmentStream)super.getParent();
  }

  @Override
  public IRelease getBaseline()
  {
    return (IRelease)super.getBaseline();
  }

  public IRelease addRelease()
  {
    List<IRelease> elements = releaseContainer.getElements();
    synchronized (elements)
    {
      IVersion lastVersion = new Version();
      if (elements.isEmpty())
      {
        lastVersion = getBaseline().getVersion();
      }
      else
      {
        IRelease lastRelease = elements.get(elements.size() - 1);
        lastVersion = lastRelease.getVersion();
      }

      IVersion version = lastVersion.nextMicro();
      return addRelease(version);
    }
  }

  @Override
  public String toString()
  {
    return MessageFormat
        .format("MaintenanceStream[branch={0}, ticket={1}]", getBranch().getName(), getTicket().getID());
  }
}
