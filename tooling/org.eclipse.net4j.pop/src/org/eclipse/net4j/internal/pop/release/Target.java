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

import org.eclipse.net4j.internal.pop.PopElement;
import org.eclipse.net4j.internal.pop.delivery.MergeContainer;
import org.eclipse.net4j.pop.IPopElement;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.delivery.IMerge;
import org.eclipse.net4j.pop.release.ITarget;

/**
 * @author Eike Stepper
 */
public abstract class Target extends PopElement implements ITarget
{
  private IMerge.Container mergeContainer = new MergeContainer(this);

  private ITag tag;

  protected Target(IPopElement parentElement, ITag tag)
  {
    super(parentElement);
    this.tag = tag;
  }

  public ITag getTag()
  {
    return tag;
  }

  public IMerge getMerge(int index)
  {
    return mergeContainer.getMerge(index);
  }

  public int getMergeCount()
  {
    return mergeContainer.getMergeCount();
  }

  public IMerge[] getMerges()
  {
    return mergeContainer.getMerges();
  }

  @Override
  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    Object result = super.getAdapter(adapter);
    if (result != null)
    {
      return result;
    }

    return mergeContainer.getAdapter(adapter);
  }
}
