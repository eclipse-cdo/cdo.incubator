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
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.task.ITask;
import org.eclipse.net4j.pop.task.ITaskAttributeValue;
import org.eclipse.net4j.pop.task.ITaskRepository;
import org.eclipse.net4j.util.container.IContainer;

import org.eclipse.core.runtime.IAdaptable;

/**
 * @author Eike Stepper
 */
public interface IModuleManager extends IContainer<IModule>, IAdaptable
{
  public static final IModuleManager INSTANCE = org.eclipse.net4j.internal.pop.ModuleManager.INSTANCE;

  public IModule createModule(String id, ITaskRepository taskRepository, ITaskAttributeValue[] taskAttributeValues);

  public IModule createModule(String id, ITask task);

  public IModule openModule(ITask task);

  public IModule getModule(String id);

  public IModule[] getModules();
}
