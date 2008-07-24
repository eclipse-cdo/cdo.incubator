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
package org.eclipse.net4j.pop.delivery;

import org.eclipse.net4j.pop.IElement;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface IMerge extends IElement
{
  public Date getMergeDate();

  public IDelivery getDelivery();

  public Container getContainer();

  /**
   * @author Eike Stepper
   */
  public interface Container extends IElement
  {
    public int getMergeCount();

    public IMerge getMerge(int index);

    public IMerge[] getMerges();
  }

  /**
   * @author Eike Stepper
   */
  public interface Producer extends Container
  {
    public IMerge addMerge(Date mergeDate, IDelivery delivery);
  }
}