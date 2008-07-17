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

import org.eclipse.net4j.pop.IModule;
import org.eclipse.net4j.pop.task.ITask;

import org.eclipse.core.runtime.PlatformObject;

/**
 * @author Eike Stepper
 */
public class Module extends PlatformObject implements IModule
{
  private String id;

  private String name;

  private ITask task;

  public Module()
  {
  }

  public String getID()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public ITask getTask()
  {
    return task;
  }
}
