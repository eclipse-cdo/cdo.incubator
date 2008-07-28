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

import java.util.List;

public class TaskPropertyTester extends PropertyTester
{
  public static final IRepositoryManager REPOSITORY_MANAGER = TasksUi.getRepositoryManager();

  public static final ITaskDataManager TASK_DATA_MANAGER = TasksUi.getTaskDataManager();

  public TaskPropertyTester()
  {
  }

  public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
  {
    if (receiver instanceof ITask && expectedValue instanceof Boolean)
    {
      ITask task = (ITask)receiver;
      boolean value = (Boolean)expectedValue;
      if ("hasPop".equals(property))
      {
        return parseOperations(task, StreamManagerImpl.PREFIX_CREATED_POP) == value;
      }
      else if ("hasMaintenance".equals(property))
      {
        return parseOperations(task, StreamManagerImpl.PREFIX_CREATED_MAINTENANCE_STREAM) == value;
      }
      else if ("hasTaskStream".equals(property))
      {
        return parseOperations(task, StreamManagerImpl.PREFIX_CREATED_TASK_STREAM) == value;
      }
    }

    return false;
  }

  private boolean parseOperations(ITask task, String prefix)
  {
    try
    {
      TaskRepository repository = REPOSITORY_MANAGER.getRepository(task.getConnectorKind(), task.getRepositoryUrl());
      TaskData taskData = TASK_DATA_MANAGER.getTaskData(repository, task.getTaskId());

      TaskAttributeMapper attributeMapper = taskData.getAttributeMapper();
      List<TaskAttribute> comments = attributeMapper.getAttributesByType(taskData, TaskAttribute.TYPE_COMMENT);
      for (TaskAttribute commentAttribute : comments)
      {
        TaskAttribute textAttribute = commentAttribute.getMappedAttribute(TaskAttribute.COMMENT_TEXT);
        String text = textAttribute.getValue();
        if (text.startsWith(StreamManagerImpl.PREFIX_OPERATION + " " + prefix))
        {
          return true;
        }
      }
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }

    return false;
  }
}
