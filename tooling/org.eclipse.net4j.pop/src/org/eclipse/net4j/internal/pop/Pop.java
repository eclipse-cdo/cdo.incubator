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
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;

/**
 * @author Eike Stepper
 */
public class Pop extends Lifecycle implements IPop
{
  private IProject project;

  private String name;

  public Pop(IProject project)
  {
    this.project = project;
    refresh();
    name = project.getName();
  }

  public IProject getProject()
  {
    return project;
  }

  public String getName()
  {
    return name;
  }

  public int compareTo(IPop o)
  {
    return StringUtil.compare(name, o.getName());
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
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
      return ObjectUtil.equals(name, that.getName());
    }

    return false;
  }

  @Override
  public int hashCode()
  {
    return ObjectUtil.hashCode(name);
  }

  @Override
  public String toString()
  {
    return name;
  }

  private void refresh()
  {

  }
}
