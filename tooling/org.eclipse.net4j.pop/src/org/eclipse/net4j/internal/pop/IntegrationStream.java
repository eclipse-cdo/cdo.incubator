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

import java.util.Date;

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
    IBranch branch = getPop().getCodeStrategy().createTaskBranch(baseline, ticket);
    ITaskStream taskStream = new TaskStream(baseline, branch, ticket);

    ITaskStream proxy = new TaskStreamProxy(taskStream);
    taskStreamContainer.addElement(proxy);
    return taskStream;
  }

  public ITaskStream addTaskStream(Date baselineDate, ITicket ticket)
  {
    IBaseline baseline = getPop().getCodeStrategy().createTaskBaseline(this, baselineDate, ticket);
    return addTaskStream(baseline, ticket);
  }

  public ITaskStream getTaskStream(int index)
  {
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
    return releaseContainer.getElement(index);
  }

  public int getReleaseCount()
  {
    return releaseContainer.getElementCount();
  }

  public IRelease[] getReleases()
  {
    return releaseContainer.getElements(IRelease.class);
  }

  protected IRelease addRelease(Date date, IVersion version)
  {
    ITag tag = getPop().getCodeStrategy().createReleaseTag(this, date, version);
    IRelease release = new Release(this, version, tag);
    IRelease proxy = new ReleaseProxy(release);
    releaseContainer.addElement(proxy);
    return release;
  }
}
