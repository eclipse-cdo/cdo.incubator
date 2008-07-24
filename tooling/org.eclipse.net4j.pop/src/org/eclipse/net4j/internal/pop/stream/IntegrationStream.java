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

import org.eclipse.net4j.internal.pop.delivery.Merge;
import org.eclipse.net4j.internal.pop.delivery.MergeContainer;
import org.eclipse.net4j.internal.pop.release.ReleaseContainer;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.stream.IIntegrationStream;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import org.eclipse.core.runtime.IAdaptable;

import java.util.Date;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class IntegrationStream extends Stream implements IIntegrationStream
{
  private TaskStreamContainer taskStreamContainer = new TaskStreamContainer(this);

  private MergeContainer mergeContainer = new MergeContainer(this);

  private ReleaseContainer releaseContainer = new ReleaseContainer(this);

  protected IntegrationStream(IPop pop, IBranch branch, ITicket ticket)
  {
    super(pop, branch, ticket);
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

  public IMerge addMerge(Date mergeDate, IDelivery delivery)
  {
    IMerge merge = new Merge(this, delivery, mergeDate);
    mergeContainer.addElement(merge);
    return merge;
  }

  public IMerge getMerge(int index)
  {
    return mergeContainer.getMerge(index);
  }

  public int getMergeCount()
  {
    return mergeContainer.getMergeCount();
  }

  public IMerge[] getMerges()
  {
    return mergeContainer.getMerges();
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
    adaptables.add(mergeContainer);
    adaptables.add(releaseContainer);
  }

  protected TaskStreamContainer getTaskStreamContainer()
  {
    return taskStreamContainer;
  }

  protected MergeContainer getMergeContainer()
  {
    return mergeContainer;
  }

  protected ReleaseContainer getReleaseContainer()
  {
    return releaseContainer;
  }
}
