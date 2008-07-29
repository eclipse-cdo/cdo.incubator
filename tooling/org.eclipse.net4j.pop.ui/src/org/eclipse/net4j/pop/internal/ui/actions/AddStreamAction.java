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
package org.eclipse.net4j.pop.internal.ui.actions;

import org.eclipse.net4j.pop.impl.StreamManagerImpl;

import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskData;

/**
 * @author Eike Stepper
 */
public abstract class AddStreamAction extends TaskDataAction
{
  protected AddStreamAction()
  {
  }

  @Override
  protected void run(TaskRepository repository, ITask task, TaskData taskData) throws Exception
  {
    String operation = "Created " + getClass().getSimpleName().toString() + " stream";

    TaskAttribute root = taskData.getRoot();
    TaskAttribute commentAttribute = root.createMappedAttribute(TaskAttribute.COMMENT_NEW);
    commentAttribute.setValue(StreamManagerImpl.PREFIX_OPERATION + operation);

    postTaskData(repository, task, taskData);
  }

  /**
   * @author Eike Stepper
   */
  public class Development extends AddStreamAction
  {
  }

  /**
   * @author Eike Stepper
   */
  public class Maintenance extends AddStreamAction
  {
  }

  /**
   * @author Eike Stepper
   */
  public class Task extends AddStreamAction
  {
  }
}
