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

import org.eclipse.net4j.internal.pop.release.Release;
import org.eclipse.net4j.internal.pop.release.ReleaseProxy;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public abstract class IntegrationStream extends Stream implements IIntegrationStream
{
  protected ElementContainer<ITaskStream> taskStreamContainer = new ElementContainer<ITaskStream>(this);

  protected ElementContainer<IRelease> releaseContainer = new ElementContainer<IRelease>(this);

  protected IntegrationStream(IBaseline baseline, IBranch branch, ITicket ticket)
  {
    super(baseline, branch, ticket);
  }

  @Override
  public IIntegrationStream getParent()
  {
    return (IIntegrationStream)super.getParent();
  }

  public ITaskStream addTaskStream(IBaseline baseline, ITicket ticket)
  {
    checkArgument(baseline, "baseline");
    checkArgument(ticket, "ticket");
    if (baseline instanceof IRelease)
    {
      IRelease release = (IRelease)baseline;
      baseline = new ReleaseProxy(release);
    }
    else
    {
      baseline = new BaselineProxy(baseline);
    }

    IBranch branch = getPop().getCodeStrategy().createTaskBranch(baseline, ticket);
    ITaskStream taskStream = new TaskStream(baseline, branch, ticket);
    taskStream = new TaskStreamProxy(taskStream);
    taskStreamContainer.addElement(taskStream);
    return taskStream;
  }

  public ITaskStream getTaskStream(int index)
  {
    checkArgument(index >= 0, "index");
    return taskStreamContainer.getElement(index);
  }

  public int getTaskStreamCount()
  {
    return taskStreamContainer.getElementCount();
  }

  public ITaskStream[] getTaskStreams()
  {
    return taskStreamContainer.getElements(ITaskStream.class);
  }

  public IRelease getRelease(int index)
  {
    checkArgument(index >= 0, "index");
    return releaseContainer.getElement(index);
  }

  public int getReleaseCount()
  {
    return releaseContainer.getElementCount();
  }

  public IRelease getReleaseByVersion(IVersion version)
  {
    checkArgument(version, "version");
    for (IRelease release : getReleases())
    {
      if (release.getVersion().equals(version))
      {
        return release;
      }
    }

    return null;
  }

  @Override
  public String toString()
  {
    return null;
  }

  public IRelease[] getReleases()
  {
    return releaseContainer.getElements(IRelease.class);
  }

  protected IRelease addRelease(IVersion version)
  {
    ITag tag = getPop().getCodeStrategy().createReleaseTag(this, version);
    IRelease release = new Release(this, version, tag);
    release = new ReleaseProxy(release);
    releaseContainer.addElement(release);
    return release;
  }
}
