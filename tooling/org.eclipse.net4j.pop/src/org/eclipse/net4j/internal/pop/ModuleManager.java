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
import org.eclipse.net4j.pop.task.ITaskRepository;
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

  private Map<String, Module> modules = new HashMap<String, Module>();

  private ModuleManager()
  {
  }

  public IModule createModule(String id, String name, ITaskRepository taskRepository,
      ITaskAttributeValue[] taskAttributeValues)
  {
    ITask task = taskRepository.createTask();
    task.setAttributeValues(taskAttributeValues);
    return createModule(id, name, task);
  }

  public IModule createModule(String id, String name, ITask task)
  {
    task.addComment("*** pop-module ***\nid = " + id + "\nname = " + name);
    task.save();
    Module module = new Module(id, name, task);
    addModule(module);
    return module;
  }

  public IModule openModule(ITask task)
  {
    // TODO Implement ModuleManager.openModule(task)
    throw new UnsupportedOperationException("Not yet implemented");
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
}
