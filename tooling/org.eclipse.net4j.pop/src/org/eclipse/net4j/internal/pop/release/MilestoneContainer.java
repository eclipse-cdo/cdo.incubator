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

import org.eclipse.net4j.internal.pop.DelegatedContainer;
import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.pop.release.IMilestone;

/**
 * @author Eike Stepper
 */
public class MilestoneContainer extends DelegatedContainer<IMilestone> implements IMilestone.Container
{
  public MilestoneContainer(Element notifier)
  {
    super(notifier);
  }

  public IMilestone addMilestone(String name)
  {
    IMilestone milestone = new Milestone(this, name);
    addElement(milestone);
    return milestone;
  }

  public IMilestone getMilestone(int index)
  {
    return null;
  }

  public int getMilestoneCount()
  {
    return 0;
  }

  public IMilestone[] getMilestones()
  {
    return null;
  }
}
