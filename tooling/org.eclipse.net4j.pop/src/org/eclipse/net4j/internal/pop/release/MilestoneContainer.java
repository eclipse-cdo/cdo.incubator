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
package org.eclipse.net4j.internal.pop.release;

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.release.IMilestone;

/**
 * @author Eike Stepper
 */
public class MilestoneContainer extends ElementContainer<IMilestone> implements IMilestone.Container
{
  public MilestoneContainer(Element delegator)
  {
    super(delegator);
  }

  public IMilestone getMilestone(int index)
  {
    return getElement(index);
  }

  public int getMilestoneCount()
  {
    return getElementCount();
  }

  public IMilestone[] getMilestones()
  {
    return getElements(IMilestone.class);
  }
}
