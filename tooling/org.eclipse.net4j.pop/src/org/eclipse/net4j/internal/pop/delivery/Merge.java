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
package org.eclipse.net4j.internal.pop.delivery;

import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.delivery.IMerge;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Merge extends Element implements IMerge
{
  private Container container;

  private Date mergeDate;

  private IDelivery delivery;

  public Merge(Container container, Date mergeDate, IDelivery delivery)
  {
    this.container = container;
    this.mergeDate = mergeDate;
    this.delivery = delivery;
  }

  public Container getContainer()
  {
    return container;
  }

  public Date getMergeDate()
  {
    return mergeDate;
  }

  public IDelivery getDelivery()
  {
    return delivery;
  }
}
