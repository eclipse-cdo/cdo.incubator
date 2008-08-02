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
package org.eclipse.net4j.internal.pop.natures;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class Nature implements IProjectNature
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, Nature.class);

  private static final IWorkspaceRoot ROOT = ResourcesPlugin.getWorkspace().getRoot();

  private IProject project;

  private String natureID;

  protected Nature(String natureID)
  {
    this.natureID = natureID;
  }

  public IProject getProject()
  {
    return project;
  }

  public void setProject(IProject project)
  {
    this.project = project;
  }

  public final void configure() throws CoreException
  {
    if (TRACER.isEnabled())
    {
      TRACER.trace("Configuring nature: " + natureID);
    }

    try
    {
      configure(project);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
      if (ex instanceof CoreException)
      {
        throw (CoreException)ex;
      }

      throw new CoreException(new Status(IStatus.ERROR, OM.BUNDLE_ID, ex.getMessage(), ex));
    }
  }

  public final void deconfigure() throws CoreException
  {
    if (TRACER.isEnabled())
    {
      TRACER.trace("Deconfiguring nature: " + natureID);
    }

    try
    {
      deconfigure(project);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
      if (ex instanceof CoreException)
      {
        throw (CoreException)ex;
      }

      throw new CoreException(new Status(IStatus.ERROR, OM.BUNDLE_ID, ex.getMessage(), ex));
    }
  }

  protected void configure(IProject project) throws Exception
  {
  }

  protected void deconfigure(IProject project) throws Exception
  {
  }

  protected static IProject[] getProjects(String natureID)
  {
    try
    {
      List<IProject> result = new ArrayList<IProject>();
      for (IProject project : ROOT.getProjects())
      {
        if (project.hasNature(natureID))
        {
          result.add(project);
        }
      }

      return result.toArray(new IProject[result.size()]);
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }
}
