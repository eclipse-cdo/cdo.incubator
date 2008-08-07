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
package org.eclipse.net4j.api.pop;

import org.eclipse.net4j.pop.product.PopProduct;
import org.eclipse.net4j.pop.project.Checkout;

import org.eclipse.core.runtime.IAdaptable;

/**
 * @author Eike Stepper
 */
public interface IPopCheckout extends Checkout, Comparable<IPopCheckout>, IAdaptable
{
  public IPop getPop();

  public boolean isActive();

  public PopProduct getProductModel();
}
