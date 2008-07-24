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

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.delivery.IDelivery;

/**
 * @author Eike Stepper
 */
public class DeliveryContainer extends ElementContainer<IDelivery> implements IDelivery.Container
{
  public DeliveryContainer(Element delegator)
  {
    super(delegator);
  }

  public IDelivery[] getDeliveries()
  {
    return getElements(IDelivery.class);
  }

  public IDelivery getDelivery(int index)
  {
    return getElement(index);
  }

  public int getDeliveryCount()
  {
    return getElementCount();
  }
}
