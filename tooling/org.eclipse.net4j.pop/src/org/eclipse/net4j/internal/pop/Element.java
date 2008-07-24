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

import org.eclipse.net4j.pop.IElement;
import org.eclipse.net4j.util.event.Notifier;

import org.eclipse.core.runtime.Platform;

/**
 * @author Eike Stepper
 */
public abstract class Element extends Notifier implements IElement
{
  protected Element()
  {
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  // TODO Enforce Object protocol
  // @Override
  // public abstract boolean equals(Object obj);
  //
  // @Override
  // public abstract int hashCode();
  //
  // @Override
  // public abstract String toString();

  protected void checkArgument(Object arg, String argName)
  {
    if (arg == null)
    {
      throw new IllegalArgumentException(argName);
    }
  }

  protected void checkArgument(boolean expr, String argName)
  {
    if (!expr)
    {
      throw new IllegalArgumentException(argName);
    }
  }
}
