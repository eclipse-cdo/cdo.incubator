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

import org.eclipse.net4j.pop.internal.ui.mylyn.EditorUtil;

import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;

import java.util.List;

/**
 * @author Eike Stepper
 */
public class TestAction extends TaskDataAction
{
  public TestAction()
  {
  }

  @Override
  protected void run(TaskRepository repository, ITask task, TaskData taskData) throws Exception
  {
    addComment(taskData);
    taskData = postTaskData(repository, task, taskData);
    EditorUtil.synchronizeTask(repository, task);
    dumpComments(taskData);
  }

  private void dumpComments(TaskData taskData)
  {
    TaskAttributeMapper attributeMapper = taskData.getAttributeMapper();
    List<TaskAttribute> comments = attributeMapper.getAttributesByType(taskData, TaskAttribute.TYPE_COMMENT);
    for (TaskAttribute commentAttribute : comments)
    {
      System.out.println(commentAttribute.getId());
      // TaskAttribute textAttribute = commentAttribute.getMappedAttribute(TaskAttribute.COMMENT_TEXT);
      // System.out.println(textAttribute.getValue());
    }
  }

  private void addComment(TaskData taskData)
  {
    TaskAttribute root = taskData.getRoot();
    TaskAttribute commentAttribute = root.createMappedAttribute(TaskAttribute.COMMENT_NEW);
    commentAttribute.setValue("HURRAH!!!");
  }
}
