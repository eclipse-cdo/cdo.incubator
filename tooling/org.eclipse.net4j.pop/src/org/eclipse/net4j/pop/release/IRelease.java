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

import org.eclipse.net4j.pop.IPopElement;
import org.eclipse.net4j.pop.stream.IBaseline;

/**
 * @author Eike Stepper
 */
public interface IRelease extends ITarget, IBaseline, IMilestone.Container
{
  public Container getContainer();

  public IVersion getVersion();

  public IMilestone addMilestone(String name);

  /**
   * @author Eike Stepper
   */
  public interface Container extends IPopElement
  {
    public int getReleaseCount();

    public IRelease getRelease(int index);

    public IRelease[] getReleases();
  }
}
