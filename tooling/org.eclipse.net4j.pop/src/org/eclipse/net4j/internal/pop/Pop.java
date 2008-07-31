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

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;

import org.eclipse.core.runtime.PlatformObject;

/**
 * @author Eike Stepper
 */
public class Pop extends PlatformObject implements IPop
{
  private String id;

  public Pop(String id)
  {
    this.id = id;
  }

  public String getID()
  {
    return id;
  }

  public int compareTo(IPop o)
  {
    return StringUtil.compare(id, o.getID());
  }

  @Override
  public boolean equals(Object obj)
  {
    if (obj == this)
    {
      return true;
    }

    if (obj instanceof IPop)
    {
      IPop that = (IPop)obj;
      return ObjectUtil.equals(id, that.getID());
    }

    return false;
  }

  @Override
  public int hashCode()
  {
    return ObjectUtil.hashCode(id);
  }

  @Override
  public String toString()
  {
    return id;
  }
}
