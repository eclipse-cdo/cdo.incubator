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

import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IMilestone;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public class Release extends Target implements IRelease
{
  protected ElementContainer<IMilestone> milestoneContainer = new ElementContainer<IMilestone>(this);

  private IIntegrationStream integrationStream;

  private IVersion version;

  public Release(IIntegrationStream integrationStream, IVersion version, ITag tag)
  {
    super(tag);
    this.integrationStream = integrationStream;
    this.version = version;
  }

  public IIntegrationStream getStream()
  {
    return integrationStream;
  }

  public IVersion getVersion()
  {
    return version;
  }

  public IMilestone addMilestone(String name)
  {
    ITag tag = getStream().getPop().getCodeStrategy().createMilestoneTag(this, name);
    IMilestone milestone = new Milestone(this, name, tag);
    milestoneContainer.addElement(milestone);
    return milestone;
  }

  public IMilestone getMilestone(int index)
  {
    return milestoneContainer.getElement(index);
  }

  public int getMilestoneCount()
  {
    return milestoneContainer.getElementCount();
  }

  public IMilestone[] getMilestones()
  {
    return milestoneContainer.getElements(IMilestone.class);
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Release[version={0}, tag={1}]", version, getTag());
  }
}
