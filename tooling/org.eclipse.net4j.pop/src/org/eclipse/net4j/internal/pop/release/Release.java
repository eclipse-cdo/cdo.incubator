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
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;

import org.eclipse.core.runtime.IAdaptable;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class Release extends Target implements IRelease
{
  private Container container;

  private IVersion version;

  private boolean compatible;

  private MilestoneContainer milestoneContainer = new MilestoneContainer(this);

  public Release(Container container, IVersion version, boolean compatible)
  {
    this.container = container;
    this.version = version;
    this.compatible = compatible;
  }

  public Container getContainer()
  {
    return container;
  }

  public IVersion getVersion()
  {
    return version;
  }

  public boolean isCompatible()
  {
    return compatible;
  }

  public IMilestone addMilestone(String name)
  {
    return milestoneContainer.addMilestone(name);
  }

  public IMilestone getMilestone(int index)
  {
    return milestoneContainer.getMilestone(index);
  }

  public int getMilestoneCount()
  {
    return milestoneContainer.getMilestoneCount();
  }

  public IMilestone[] getMilestones()
  {
    return milestoneContainer.getMilestones();
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Release[version={0}]", version);
  }

  @Override
  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
    super.collectAdaptables(adaptables);
    adaptables.add(milestoneContainer);
  }
}
