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
import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.stream.IStream;
import org.eclipse.net4j.pop.ticket.ITicket;

import org.eclipse.core.runtime.IAdaptable;

import java.util.Date;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class Stream extends Element implements IStream
{
  private IBranch branch;

  private ITicket ticket;

  private MergeContainer mergeContainer = new MergeContainer(this);

  protected Stream(IBranch branch, ITicket ticket)
  {
    this.branch = branch;
    this.ticket = ticket;
  }

  public IBranch getBranch()
  {
    return branch;
  }

  public ITicket getTicket()
  {
    return ticket;
  }

  public IMerge merge(Date date, IDelivery delivery)
  {
    IMerge merge = new Merge(this, date, delivery);
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

  @Override
  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
    super.collectAdaptables(adaptables);
    adaptables.add(mergeContainer);
  }

  protected MergeContainer getMergeContainer()
  {
    return mergeContainer;
  }
}
