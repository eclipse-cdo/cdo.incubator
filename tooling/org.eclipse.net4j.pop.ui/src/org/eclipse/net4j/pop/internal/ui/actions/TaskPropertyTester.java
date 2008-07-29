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
import org.eclipse.net4j.util.WrappedException;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.mylyn.tasks.core.IRepositoryManager;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.ITaskDataManager;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipse.mylyn.tasks.ui.TasksUi;

/**
 * @author Eike Stepper
 */
public class TaskPropertyTester extends PropertyTester
{
  public static final IRepositoryManager REPOSITORY_MANAGER = TasksUi.getRepositoryManager();

  public static final ITaskDataManager TASK_DATA_MANAGER = TasksUi.getTaskDataManager();

  private static final int HAS_DEVELOPMENT_STREAM = 0x01;

  private static final int HAS_MAINTENANCE_STREAM = 0x02;

  private static final int HAS_TASK_STREAM = 0x04;

  private static final int HAS_ANY_STREAM = HAS_DEVELOPMENT_STREAM | HAS_MAINTENANCE_STREAM | HAS_TASK_STREAM;

  private ITask lastTask;

  private long lastTime;

  private int lastResult;

  public TaskPropertyTester()
  {
  }

  public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
  {
    if (expectedValue == null)
    {
      expectedValue = Boolean.TRUE;
    }

    if (receiver instanceof ITask && expectedValue instanceof Boolean)
    {
      ITask task = (ITask)receiver;
      long time = System.currentTimeMillis();
      int result;

      if (task == lastTask && time < lastTime + 1000L)
      {
        result = lastResult;
      }
      else
      {
        result = getResult(task);
        lastTask = task;
        lastTime = time;
        lastResult = result;
      }

      return testProperty(property, (Boolean)expectedValue, result);
    }

    return false;
  }

  private static boolean testProperty(String property, boolean expectedValue, int actualValue)
  {
    int masked = 0;
    if ("hasDevelopmentStream".equals(property))
    {
      masked = actualValue & HAS_DEVELOPMENT_STREAM;
    }
    else if ("hasMaintenanceStream".equals(property))
    {
      masked = actualValue & HAS_DEVELOPMENT_STREAM;
    }
    else if ("hasTaskStream".equals(property))
    {
      masked = actualValue & HAS_DEVELOPMENT_STREAM;
    }
    else if ("hasAnyStream".equals(property))
    {
      masked = actualValue & HAS_ANY_STREAM;
    }

    return masked != 0 == expectedValue;
  }

  @SuppressWarnings("restriction")
  private static int getResult(ITask task)
  {
    try
    {
      if (task instanceof org.eclipse.mylyn.internal.tasks.core.AbstractTask)
      {
        parseString(((org.eclipse.mylyn.internal.tasks.core.AbstractTask)task).getNotes());
      }

      TaskRepository repository = REPOSITORY_MANAGER.getRepository(task.getConnectorKind(), task.getRepositoryUrl());
      TaskData taskData = TASK_DATA_MANAGER.getTaskData(repository, task.getTaskId());
      if (taskData != null)
      {
        TaskAttributeMapper attributeMapper = taskData.getAttributeMapper();
        parseString(taskData.getRoot().getMappedAttribute(TaskAttribute.SUMMARY).getValue());
        parseString(taskData.getRoot().getMappedAttribute(TaskAttribute.DESCRIPTION).getValue());
        for (TaskAttribute commentAttribute : attributeMapper.getAttributesByType(taskData, TaskAttribute.TYPE_COMMENT))
        {
          parseString(commentAttribute.getMappedAttribute(TaskAttribute.COMMENT_TEXT).getValue());
        }
      }

      return 0;
    }
    catch (ResultException ex)
    {
      return ex.getResult();
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  private static void parseString(String string) throws ResultException
  {
    if (string.contains(StreamManagerImpl.PREFIX_OPERATION + StreamManagerImpl.PREFIX_CREATED_POP))
    {
      throw new ResultException(HAS_DEVELOPMENT_STREAM);
    }

    if (string.contains(StreamManagerImpl.PREFIX_OPERATION + StreamManagerImpl.PREFIX_CREATED_MAINTENANCE_STREAM))
    {
      throw new ResultException(HAS_MAINTENANCE_STREAM);
    }

    if (string.contains(StreamManagerImpl.PREFIX_OPERATION + StreamManagerImpl.PREFIX_CREATED_TASK_STREAM))
    {
      throw new ResultException(HAS_TASK_STREAM);
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class ResultException extends Exception
  {
    private static final long serialVersionUID = 1L;

    private int result;

    public ResultException(int result)
    {
      this.result = result;
    }

    public int getResult()
    {
      return result;
    }
  }
}
