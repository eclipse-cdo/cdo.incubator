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

import org.eclipse.net4j.internal.pop.delivery.Merge;
import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.IStreamBaseline;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.util.ImplementationError;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public abstract class Stream extends Element implements IStream
{
  protected ElementContainer<IMerge> mergeContainer = new ElementContainer<IMerge>(this);

  private IStreamBaseline baseline;

  private IBranch branch;

  private ITicket ticket;

  protected Stream(IStreamBaseline baseline, IBranch branch, ITicket ticket)
  {
    this.baseline = baseline;
    this.branch = branch;
    this.ticket = ticket;
  }

  public IStreamBaseline getBaseline()
  {
    return baseline;
  }

  public IBranch getBranch()
  {
    return branch;
  }

  public ITicket getTicket()
  {
    return ticket;
  }

  public IStream getParentElement()
  {
    return baseline.getStream();
  }

  public IStream getParentStream()
  {
    return getParentElement();
  }

  /**
   * Must be overridden by {@link IPop} implementations (i.e. {@link Pop}).
   */
  public IPop getPop()
  {
    if (this instanceof IPop)
    {
      throw new ImplementationError();
    }

    return getParentStream().getPop();
  }

  public IStream getStream()
  {
    return null;
  }

  public IMerge merge(Date date, IDelivery delivery)
  {
    IMerge merge = new Merge(this, date, delivery);
    mergeContainer.addElement(merge);
    return merge;
  }

  public IMerge getMerge(int index)
  {
    return mergeContainer.getElement(index);
  }

  public int getMergeCount()
  {
    return mergeContainer.getElementCount();
  }

  public IMerge[] getMerges()
  {
    return mergeContainer.getElements(IMerge.class);
  }
}