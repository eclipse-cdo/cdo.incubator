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
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.ITarget;

/**
 * @author Eike Stepper
 */
public abstract class Target extends Element implements ITarget
{
  private ITag tag;

  protected Target(ITag tag)
  {
    this.tag = tag;
  }

  public ITag getTag()
  {
    return tag;
  }
}
