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

import org.eclipse.net4j.pop.IPopElement;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.util.IElement;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface IDelivery extends IPopElement
{
  public ITaskStream getTaskStream();

  public Date getDate();

  public int getNumber();

  /**
   * @author Eike Stepper
   */
  public interface Container extends IElement
  {
    public int getDeliveryCount();

    public IDelivery getDelivery(int index);

    public IDelivery[] getDeliveries();
  }
}
