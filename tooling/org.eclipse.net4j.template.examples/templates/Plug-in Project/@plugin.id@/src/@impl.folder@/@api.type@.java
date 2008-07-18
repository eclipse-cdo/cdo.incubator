/***************************************************************************
 * Copyright (c) 2004 - 2008 @author.name@, @author.country@.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    @author.name@ - initial API and implementation
 **************************************************************************/
package @impl.package@;

import @api.package@.I@api.type@;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.core.runtime.PlatformObject;

/**
 * \@author @author.name@
 */
public class @api.type@ extends PlatformObject implements I@api.type@
{
  private String id;
  
  public @api.type@(String id)
  {
    this.id = id;
  }

  public String getID()
  {
    return id;
  }
  
  public int compareTo(I@api.type@ o)
  {
    return StringUtil.compare(id, o.getID());
  }

  \@Override
  public boolean equals(Object obj)
  {
    if (obj == this)
    {
      return true;
    }

    if (obj instanceof I@api.type@)
    {
      I@api.type@ that = (I@api.type@)obj;
      return ObjectUtil.equals(id, that.getID());
    }

    return false;
  }

  \@Override
  public int hashCode()
  {
    return ObjectUtil.hashCode(id);
  }

  \@Override
  public String toString()
  {
    return id;
  }
}
