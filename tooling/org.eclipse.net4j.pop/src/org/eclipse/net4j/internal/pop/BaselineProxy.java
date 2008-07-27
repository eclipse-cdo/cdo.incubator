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

import org.eclipse.net4j.internal.pop.util.ElementProxy;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.code.ITag;

import org.eclipse.mylyn.tasks.core.ITask;

/**
 * @author Eike Stepper
 */
public class BaselineProxy extends ElementProxy<IBaseline> implements IBaseline
{
  private String tagName;

  private BaselineProxy(InternalPopManager manager, ITask task, String tagName)
  {
    super(manager, task);
    this.tagName = tagName;
  }

  private BaselineProxy(IBaseline baseline)
  {
    super((InternalPopManager)baseline.getStream().getPop().getManager(), baseline.getStream().getTask(), baseline);
    tagName = baseline.getTag().getName();
  }

  public static BaselineProxy proxy(IBaseline baseline)
  {
    if (baseline instanceof BaselineProxy)
    {
      return ((BaselineProxy)baseline).copy();
    }

    return new BaselineProxy(baseline);
  }

  public BaselineProxy copy()
  {
    return new BaselineProxy(getManager(), getTask(), tagName);
  }

  public String getTagName()
  {
    return tagName;
  }

  public IStream getStream()
  {
    return getElement().getStream();
  }

  public ITag getTag()
  {
    return getElement().getTag();
  }

  @Override
  protected IBaseline resolve()
  {
    return getManager().resolve(this);
  }
}
