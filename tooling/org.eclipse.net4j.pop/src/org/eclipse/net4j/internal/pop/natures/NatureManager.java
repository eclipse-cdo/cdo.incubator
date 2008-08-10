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
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.container.ContainerEvent;
import org.eclipse.net4j.util.container.IContainerDelta;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class NatureManager extends Container<IProject> implements IResourceChangeListener, IAdaptable
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, Nature.class);

  private static final IWorkspace WS = ResourcesPlugin.getWorkspace();

  private String natureID;

  private transient Set<IProject> projects = new HashSet<IProject>();

  public NatureManager(String natureID)
  {
    this.natureID = natureID;
  }

  public String getNatureID()
  {
    return natureID;
  }

  public IProject[] getProjects()
  {
    return getElements();
  }

  public IProject[] getElements()
  {
    synchronized (projects)
    {
      List<IProject> list = new ArrayList<IProject>(projects);
      Collections.sort(list, new Comparator<IProject>()
      {
        public int compare(IProject o1, IProject o2)
        {
          return o1.getName().compareTo(o2.getName());
        }
      });

      return list.toArray(new IProject[list.size()]);
    }
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("NatureManager[{0}]", natureID);
  }

  public void resourceChanged(IResourceChangeEvent event)
  {
    IResourceDelta delta = event.getDelta();
    if (delta != null)
    {
      try
      {
        DeltaHandler handler = new DeltaHandler();
        delta.accept(handler);
        handler.fireContainerEvent();
      }
      catch (CoreException ex)
      {
        OM.LOG.error(ex);
      }
    }
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    for (IProject project : Nature.getProjects(natureID))
    {
      projects.add(project);
      projectAdded(project);
    }

    WS.addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    WS.removeResourceChangeListener(this);
    IProject[] elements = getElements();
    projects.clear();
    fireElementsRemovedEvent(elements);
    super.doDeactivate();
  }

  protected void projectAdded(IProject project)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Added project to nature manager: {0} --> {1}", natureID, project.getName());
    }
  }

  protected void projectRemoved(IProject project)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Removed project from nature manager: {0} --> {1}", natureID, project.getName());
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class DeltaHandler implements IResourceDeltaVisitor
  {
    private ContainerEvent<IProject> event = new ContainerEvent<IProject>(NatureManager.this);

    public DeltaHandler()
    {
    }

    public void fireContainerEvent()
    {
      fireEvent(event);
    }

    public boolean visit(IResourceDelta delta) throws CoreException
    {
      IResource resource = delta.getResource();
      if (resource instanceof IProject)
      {
        IProject project = (IProject)resource;
        if (project.exists() && Nature.hasNature(project, natureID))
        {
          boolean added = false;
          synchronized (projects)
          {
            added = projects.add(project);
            if (added)
            {
              event.addDelta(project, IContainerDelta.Kind.ADDED);
            }
          }

          if (added)
          {
            projectAdded(project);
          }
        }
        else
        {
          boolean removed = false;
          synchronized (projects)
          {
            removed = projects.remove(project);
            if (removed)
            {
              event.addDelta(project, IContainerDelta.Kind.REMOVED);
            }
          }

          if (removed)
          {
            projectRemoved(project);
          }
        }
      }

      return resource instanceof IWorkspaceRoot;
    }
  }
}
