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

import org.eclipse.net4j.internal.pop.delivery.MergeProducer;
import org.eclipse.net4j.internal.pop.release.ReleaseContainer;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
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

  private MergeProducer mergeProducer = new MergeProducer(this);

  private ReleaseContainer releaseContainer = new ReleaseContainer(this);

  protected IntegrationStream(IBranch branch, ITicket ticket)
  {
    super(branch, ticket);
  }

  public ITaskStream addTaskStream(IBranch branch, ITicket ticket)
  {
    return taskStreamContainer.addTaskStream(branch, ticket);
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
    return mergeProducer.addMerge(mergeDate, delivery);
  }

  public IMerge getMerge(int index)
  {
    return mergeProducer.getMerge(index);
  }

  public int getMergeCount()
  {
    return mergeProducer.getMergeCount();
  }

  public IMerge[] getMerges()
  {
    return mergeProducer.getMerges();
  }

  public IRelease addRelease(IVersion version, boolean compatible)
  {
    return releaseContainer.addRelease(version, compatible);
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
    adaptables.add(mergeProducer);
    adaptables.add(releaseContainer);
  }
}
