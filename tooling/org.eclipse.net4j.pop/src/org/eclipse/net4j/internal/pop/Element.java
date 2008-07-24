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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class Element extends Notifier implements IElement
{
  private List<IAdaptable> adaptables;

  protected Element()
  {
  }

  protected void checkArgument(Object arg, String argName, Class<?> argClass)
  {
    if (!argClass.isInstance(arg))
    {
      throw new IllegalArgumentException(argName);
    }
  }

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

  protected void collectAdaptables(List<IAdaptable> adaptables)
  {
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapterType)
  {
    ensureAdaptables();
    for (IAdaptable adaptable : adaptables)
    {
      Object adapter = adaptable.getAdapter(adapterType);
      if (adapter != null)
      {
        return adapter;
      }
    }

    return Platform.getAdapterManager().getAdapter(this, adapterType);
  }

  private synchronized void ensureAdaptables()
  {
    if (adaptables == null)
    {
      adaptables = new ArrayList<IAdaptable>();
      collectAdaptables(adaptables);
    }
  }
}
