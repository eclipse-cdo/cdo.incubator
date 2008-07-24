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

import org.eclipse.net4j.internal.pop.delivery.MergeContainer;
import org.eclipse.net4j.internal.pop.release.ReleaseContainer;
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
public class IntegrationStream extends Stream implements IIntegrationStream
{
  private TaskStreamContainer taskStreamContainer = new TaskStreamContainer(this);

  private MergeContainer mergeContainer = new MergeContainer(this);

  private ReleaseContainer releaseContainer = new ReleaseContainer(this);

  public IntegrationStream(IBranch branch, ITicket ticket)
  {
    super(branch, ticket);
  }

  public ITaskStream addTaskStream(IBranch branch, ITicket ticket)
  {
    ITaskStream taskStream = new TaskStream(this, branch, ticket);
    taskStreamContainer.addTaskStream(branch, ticket);
    return taskStream;
  }

  public ITaskStream getTaskStream(int index)
  {
    return null;
  }

  public int getTaskStreamCount()
  {
    return 0;
  }

  public ITaskStream[] getTaskStreams()
  {
    return null;
  }

  public IMerge addMerge(Date mergeDate, IDelivery delivery)
  {
    return null;
  }

  public IMerge getMerge(int index)
  {
    return null;
  }

  public int getMergeCount()
  {
    return 0;
  }

  public IMerge[] getMerges()
  {
    return null;
  }

  public IRelease addRelease()
  {
    return null;
  }

  public IRelease getRelease(int index)
  {
    return null;
  }

  public int getReleaseCount()
  {
    return 0;
  }

  public IRelease[] getReleases()
  {
    return null;
  }

  @Override
  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
    super.collectAdaptables(adaptables);
    adaptables.add(taskStreamContainer);
    adaptables.add(mergeContainer);
    adaptables.add(releaseContainer);
  }
}
