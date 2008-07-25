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

import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IMilestone;
import org.eclipse.net4j.pop.release.IRelease;

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public class Milestone extends Target implements IMilestone
{
  private IRelease release;

  private String name;

  protected Milestone(IRelease release, String name, ITag tag)
  {
    super(tag);
    this.release = release;
    this.name = name;
  }

  public IIntegrationStream getStream()
  {
    return release.getStream();
  }

  public IRelease getRelease()
  {
    return release;
  }

  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Milestone[name={0}, tag={1}]", name, getTag());
  }
}
