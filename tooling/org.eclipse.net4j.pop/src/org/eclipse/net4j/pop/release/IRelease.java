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
package org.eclipse.net4j.pop.release;

import org.eclipse.net4j.pop.IBaseline;

import java.util.Date;

/**
 * @author Eike Stepper
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IRelease extends ITarget, IBaseline
{
  public IVersion getVersion();

  public IMilestone addMilestone(Date date, String name);

  public int getMilestoneCount();

  public IMilestone getMilestone(int index);

  public IMilestone[] getMilestones();
}
