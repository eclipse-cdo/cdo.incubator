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
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.pop.util.IElement;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface IStream extends IElement
{
  public IPop getPop();

  public IStream getParentStream();

  public IStreamBaseline getBaseline();

  public IBranch getBranch();

  public ITicket getTicket();

  public IMerge merge(Date date, IDelivery delivery);

  public int getMergeCount();

  public IMerge getMerge(int index);

  public IMerge[] getMerges();

}
