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
package org.eclipse.net4j.internal.template.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class TemplateNature implements IProjectNature
{
  public static final String NATURE_ID = "org.eclipse.net4j.template.TemplateNature";

  private IProject project;

  public TemplateNature()
  {
  }

  public IProject getProject()
  {
    return project;
  }

  public void setProject(IProject project)
  {
    this.project = project;
  }

  public void configure() throws CoreException
  {
  }

  public void deconfigure() throws CoreException
  {
  }

  public static IProject[] getProjects() throws CoreException
  {
    List<IProject> result = new ArrayList<IProject>();
    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    IProject[] projects = root.getProjects();
    for (IProject project : projects)
    {
      if (project.hasNature(NATURE_ID))
      {
        result.add(project);
      }
    }

    return result.toArray(new IProject[result.size()]);
  }
}
