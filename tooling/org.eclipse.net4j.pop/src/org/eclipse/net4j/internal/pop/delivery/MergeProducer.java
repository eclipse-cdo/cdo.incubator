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
public class MergeProducer extends MergeContainer implements IMerge.Producer
{
  public MergeProducer(Element notifier)
  {
    super(notifier);
  }

  public IMerge addMerge(IDelivery delivery, Date date)
  {
    IMerge merge = new Merge();
    addElement(merge);
    return merge;
  }
}
