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

import org.eclipse.net4j.internal.pop.release.ReleaseContainer;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.stream.IStreamBaseline;
import org.eclipse.net4j.pop.stream.IIntegrationStream;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import org.eclipse.core.runtime.IAdaptable;

import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class IntegrationStream extends Stream implements IIntegrationStream
{
  private TaskStreamContainer taskStreamContainer = new TaskStreamContainer(this);

  private ReleaseContainer releaseContainer = new ReleaseContainer(this);

  protected IntegrationStream(IStreamBaseline baseline, IBranch branch, ITicket ticket)
  {
    super(baseline, branch, ticket);
  }

  @Override
  public IIntegrationStream getParentElement()
  {
    return (IIntegrationStream)super.getParentElement();
  }

  @Override
  public IIntegrationStream getParentStream()
  {
    return (IIntegrationStream)super.getParentStream();
  }

  @Override
  public IIntegrationStream getStream()
  {
    return this;
  }

  public ITaskStream addTaskStream(IBranch branch, ITicket ticket)
  {
    ITaskStream taskStream = new TaskStream(this, branch, ticket);
    taskStreamContainer.addElement(taskStream);
    return taskStream;
  }

  public ITaskStream getTaskStream(int index)
  {
    return taskStreamContainer.getTaskStream(index);
  }

  public int getTaskStreamCount()
  {
    return taskStreamContainer.getTaskStreamCount();
  }

  public ITaskStream[] getTaskStreams()
  {
    return taskStreamContainer.getTaskStreams();
  }

  public IRelease getRelease(int index)
  {
    return releaseContainer.getRelease(index);
  }

  public int getReleaseCount()
  {
    return releaseContainer.getReleaseCount();
  }

  public IRelease[] getReleases()
  {
    return releaseContainer.getReleases();
  }

  @Override
  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
    super.collectAdaptables(adaptables);
    adaptables.add(taskStreamContainer);
    adaptables.add(releaseContainer);
  }

  protected TaskStreamContainer getTaskStreamContainer()
  {
    return taskStreamContainer;
  }

  protected ReleaseContainer getReleaseContainer()
  {
    return releaseContainer;
  }
}
