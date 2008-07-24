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

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public class Milestone extends Target implements IMilestone
{
  private Container container;

  private String name;

  protected Milestone(Container container, String name)
  {
    this.container = container;
    this.name = name;
  }

  public IMilestone.Container getMilestoneContainer()
  {
    return container;
  }

  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Milestone[name={0}]", name);
  }
}
