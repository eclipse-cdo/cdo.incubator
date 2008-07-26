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
package org.eclipse.net4j.internal.pop.release;

import org.eclipse.net4j.internal.pop.util.ElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IMilestone;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;

/**
 * @author Eike Stepper
 */
public class ReleaseProxy extends ElementProxy<IRelease> implements IRelease
{
  private IVersion version;

  private ReleaseProxy(IPop pop, String ticketID, IVersion version)
  {
    super(pop, ticketID);
    this.version = version;
  }

  public ReleaseProxy(IRelease release)
  {
    super(release.getStream().getPop(), release.getStream().getTicket().getID(), release);
    version = release.getVersion();
  }

  public IElementProxy<? extends IRelease> copy()
  {
    return new ReleaseProxy(getPop(), getTicketID(), version);
  }

  public IVersion getVersion()
  {
    return version;
  }

  public IIntegrationStream getStream()
  {
    return getElement().getStream();
  }

  public ITag getTag()
  {
    return getElement().getTag();
  }

  public IMilestone addMilestone(String name)
  {
    return getElement().addMilestone(name);
  }

  public IMilestone getMilestone(int index)
  {
    return getElement().getMilestone(index);
  }

  public int getMilestoneCount()
  {
    return getElement().getMilestoneCount();
  }

  public IMilestone[] getMilestones()
  {
    return getElement().getMilestones();
  }

  @Override
  protected IRelease resolve()
  {
    return ((IElementResolver)getPop()).resolve(this);
  }
}
