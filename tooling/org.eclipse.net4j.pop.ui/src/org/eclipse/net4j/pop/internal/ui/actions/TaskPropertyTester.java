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
      boolean value = (Boolean)expectedValue;
      if ("hasPop".equals(property))
      {
        return hasPop(task) == value;
      }
      else if ("hasMaintenanceStream".equals(property))
      {
        return hasMainenanceStream(task, value);
      }
      else if ("hasTaskStream".equals(property))
      {
        return hasTaskStream(task) == value;
      }
      else if ("hasNothing".equals(property))
      {
        return hasNothing(task) == value;
      }
    }

    return false;
  }

  public static boolean hasPop(ITask task)
  {
    return parseOperations(task, StreamManagerImpl.PREFIX_CREATED_POP);
  }

  public static boolean hasMainenanceStream(ITask task, boolean value)
  {
    return parseOperations(task, StreamManagerImpl.PREFIX_CREATED_MAINTENANCE_STREAM) == value;
  }

  public static boolean hasTaskStream(ITask task)
  {
    return parseOperations(task, StreamManagerImpl.PREFIX_CREATED_TASK_STREAM);
  }

  public static boolean hasNothing(ITask task)
  {
    return parseOperations(task, null);
  }

  @SuppressWarnings("restriction")
  private static boolean parseOperations(ITask task, String prefix)
  {
    String marker = prefix == null ? null : StreamManagerImpl.PREFIX_OPERATION + prefix;

    try
    {
      if (task instanceof org.eclipse.mylyn.internal.tasks.core.AbstractTask)
      {
        testMarker(((org.eclipse.mylyn.internal.tasks.core.AbstractTask)task).getNotes(), marker);
      }

      TaskRepository repository = REPOSITORY_MANAGER.getRepository(task.getConnectorKind(), task.getRepositoryUrl());
      TaskData taskData = TASK_DATA_MANAGER.getTaskData(repository, task.getTaskId());
      if (taskData != null)
      {
        TaskAttributeMapper attributeMapper = taskData.getAttributeMapper();
        testMarker(taskData.getRoot().getMappedAttribute(TaskAttribute.SUMMARY).getValue(), marker);
        testMarker(taskData.getRoot().getMappedAttribute(TaskAttribute.DESCRIPTION).getValue(), marker);
        for (TaskAttribute commentAttribute : attributeMapper.getAttributesByType(taskData, TaskAttribute.TYPE_COMMENT))
        {
          testMarker(commentAttribute.getMappedAttribute(TaskAttribute.COMMENT_TEXT).getValue(), marker);
        }
      }
    }
    catch (ResultException ex)
    {
      return ex.getResult();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      throw WrappedException.wrap(ex);
    }

    return marker == null;
  }

  private static void testMarker(String string, String marker) throws ResultException
  {
    if (marker == null)
    {
      if (string.contains(StreamManagerImpl.PREFIX_OPERATION + StreamManagerImpl.PREFIX_CREATED_POP))
      {
        throw new ResultException(false);
      }

      if (string.contains(StreamManagerImpl.PREFIX_OPERATION + StreamManagerImpl.PREFIX_CREATED_MAINTENANCE_STREAM))
      {
        throw new ResultException(false);
      }

      if (string.contains(StreamManagerImpl.PREFIX_OPERATION + StreamManagerImpl.PREFIX_CREATED_TASK_STREAM))
      {
        throw new ResultException(false);
      }
    }
    else
    {
      if (string.contains(marker))
      {
        throw new ResultException(true);
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class ResultException extends Exception
  {
    private static final long serialVersionUID = 1L;

    private boolean result;

    public ResultException(boolean result)
    {
      this.result = result;
    }

    public boolean getResult()
    {
      return result;
    }
  }
}
