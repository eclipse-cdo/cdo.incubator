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
import org.eclipse.net4j.pop.IModuleManager;
import org.eclipse.net4j.pop.task.ITask;
import org.eclipse.net4j.pop.task.ITaskAttributeValue;
import org.eclipse.net4j.pop.task.ITaskComment;
import org.eclipse.net4j.pop.task.ITaskRepository;
import org.eclipse.net4j.pop.task.ITaskRepositoryManager;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.container.Container;

import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class ModuleManager extends Container<IModule> implements IModuleManager
{
  public static final ModuleManager INSTANCE = new ModuleManager();

  private static final String POP_MODULE_PREFIX = "***pop-module ";

  private static final String POP_MODULE_SUFFIX = " ***";

  private Map<String, Module> modules = new HashMap<String, Module>();

  private ModuleManager()
  {
  }

  public Module createModule(String id, ITaskRepository taskRepository, ITaskAttributeValue[] taskAttributeValues)
  {
    ITask task = taskRepository.createTask();
    task.setTitle("POP Module " + id);
    task.setAttributeValues(taskAttributeValues);
    return doCreateModule(id, task);
  }

  public Module createModule(String id, ITask task)
  {
    task.sync();
    String existingID = getModuleID(task);
    if (existingID != null)
    {
      throw new IllegalStateException("Task does already contain a module: " + existingID);
    }

    return doCreateModule(id, task);
  }

  public IModule openModule(ITask task)
  {
    task.sync();
    String id = getModuleID(task);
    if (id == null)
    {
      throw new IllegalStateException("Task has no module: " + task);
    }

    Module module = new Module(id, task);
    addModule(module);
    return module;
  }

  public Module[] getModules()
  {
    checkActive();
    synchronized (modules)
    {
      List<Module> list = new ArrayList<Module>(modules.values());
      Collections.sort(list);
      return list.toArray(new Module[list.size()]);
    }
  }

  public Module[] getElements()
  {
    return getModules();
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    initModules();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    modules.clear();
    super.doDeactivate();
  }

  private void initModules()
  {
  }

  private void addModule(Module module)
  {
    String id = module.getID();
    synchronized (modules)
    {
      if (modules.containsKey(id))
      {
        throw new IllegalStateException("Duplicate module ID: " + id);
      }

      modules.put(id, module);
      fireElementAddedEvent(module);
    }
  }

  private Module doCreateModule(String id, ITask task)
  {
    if (isModuleExisting(id))
    {
      throw new IllegalStateException("Module exists: id");
    }

    task.addComment(POP_MODULE_PREFIX + id + POP_MODULE_SUFFIX);
    task.save();

    Module module = new Module(id, task);
    addModule(module);
    return module;
  }

  private boolean isModuleExisting(String id)
  {
    for (ITaskRepository repository : ITaskRepositoryManager.INSTANCE.getRepositories())
    {
      for (ITask task : repository.queryComments(POP_MODULE_PREFIX))
      {
        String existingID = getModuleID(task);
        if (ObjectUtil.equals(id, existingID))
        {
          return true;
        }
      }
    }

    return false;
  }

  private String getModuleID(ITask task)
  {
    for (ITaskComment comment : task.getComments())
    {
      String message = comment.getMessage();
      if (message.startsWith(POP_MODULE_PREFIX) && message.endsWith(POP_MODULE_SUFFIX))
      {
        String id = message.substring(POP_MODULE_PREFIX.length());
        id = id.substring(0, id.length() - POP_MODULE_SUFFIX.length());
        return id;
      }
    }

    return null;
  }
}
