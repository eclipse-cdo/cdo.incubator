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
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.IPop.Strategy;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IVersion;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class PopStrategy extends Element implements Strategy
{
  public PopStrategy()
  {
  }

  public IBranch createMaintenanceBranch(ITag baseline)
  {
    return null;
  }

  public ITag createReleaseTag(IBranch branch, IVersion version)
  {
    return null;
  }

  public IBranch createTaskBranch(ITag baseline)
  {
    return null;
  }

  public Date getTagDate(ITag tag)
  {
    return null;
  }

  @Override
  public String toString()
  {
    return null;
  }

}
