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

import org.eclipse.net4j.pop.release.IMilestone;

/**
 * @author Eike Stepper
 */
public class Milestone extends Target implements IMilestone
{
  private IMilestone.Container milestoneContainer;

  private String milestoneName;

  protected Milestone(IMilestone.Container milestoneContainer, String milestoneName)
  {
    this.milestoneContainer = milestoneContainer;
    this.milestoneName = milestoneName;
  }

  public IMilestone.Container getMilestoneContainer()
  {
    return milestoneContainer;
  }

  public String getMilestoneName()
  {
    return milestoneName;
  }
}
