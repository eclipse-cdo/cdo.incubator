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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mylyn.tasks.core.AbstractRepositoryConnector;
import org.eclipse.mylyn.tasks.core.IRepositoryManager;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.RepositoryResponse;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.ITaskDataManager;
import org.eclipse.mylyn.tasks.core.data.ITaskDataWorkingCopy;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipse.mylyn.tasks.core.data.TaskDataModel;
import org.eclipse.mylyn.tasks.ui.TasksUi;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import java.util.List;

/**
 * @author Eike Stepper
 */
public class TestAction implements IObjectActionDelegate
{
  private static final IRepositoryManager repositoryManager = TasksUi.getRepositoryManager();

  private static final ITaskDataManager taskDataManager = TasksUi.getTaskDataManager();

  private Shell shell;

  private ISelection selection;

  public TestAction()
  {
  }

  public void setActivePart(IAction action, IWorkbenchPart targetPart)
  {
    shell = targetPart.getSite().getShell();
  }

  public void selectionChanged(IAction action, ISelection selection)
  {
    this.selection = selection;
  }

  public void run(IAction action)
  {
    try
    {
      ITask task = (ITask)((IStructuredSelection)selection).getFirstElement();

      ITaskDataWorkingCopy taskDataState = taskDataManager.getWorkingCopy(task);
      String connectorKind = taskDataState.getConnectorKind();
      String repositoryUrl = taskDataState.getRepositoryUrl();
      TaskRepository repository = repositoryManager.getRepository(connectorKind, repositoryUrl);

      TaskDataModel model = new TaskDataModel(repository, task, taskDataState);
      TaskData taskData = model.getTaskData();

      addComment(taskData);
      taskData = postTaskData(repository, task, taskData);
      EditorUtil.synchronizeTask(repository, task);
      dumpComments(taskData);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      MessageDialog.openInformation(shell, "Mylyn Plug-in", "TEST failed.");
    }
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

  @SuppressWarnings("restriction")
  private TaskData postTaskData(TaskRepository repository, ITask task, TaskData taskData) throws CoreException
  {
    AbstractRepositoryConnector connector = repositoryManager.getRepositoryConnector(repository.getConnectorKind());
    RepositoryResponse response = connector.getTaskDataHandler().postTaskData(repository, taskData, null,
        new NullProgressMonitor());

    String taskId = response.getTaskId();
    TaskData updatedTaskData = connector.getTaskData(repository, taskId, new NullProgressMonitor());
    if (taskData.isNew())
    {
      task = new org.eclipse.mylyn.internal.tasks.core.TaskTask(connector.getConnectorKind(), repository
          .getRepositoryUrl(), updatedTaskData.getTaskId());
    }

    ((org.eclipse.mylyn.internal.tasks.core.data.TaskDataManager)taskDataManager).putSubmittedTaskData(task,
        updatedTaskData);
    return updatedTaskData;
  }

  protected String getDescription(TaskData taskData)
  {
    TaskAttribute root = taskData.getRoot();
    TaskAttribute attribute = root.getMappedAttribute(TaskAttribute.DESCRIPTION);
    if (attribute == null)
    {
      attribute = root.getMappedAttribute(TaskAttribute.COMMENT_NEW);
    }
    return attribute != null ? taskData.getAttributeMapper().getValueLabel(attribute) : "";
  }
}
