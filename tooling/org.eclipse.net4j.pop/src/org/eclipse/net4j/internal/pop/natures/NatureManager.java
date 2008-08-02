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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

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

  public IProject[] getElements()
  {
    checkActive();
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

  public void resourceChanged(IResourceChangeEvent event)
  {
    IResourceDelta delta = event.getDelta();
    if (delta != null)
    {
      synchronized (projects)
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
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    for (IProject project : Nature.getProjects(natureID))
    {
      projects.add(project);
      traceAdded(project);
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

  protected void traceRemoved(IProject project)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Removed project {0} from nature manager: {2}", project.getName(), natureID);
    }
  }

  protected void traceAdded(IProject project)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Added project {0} to nature manager: {2}", project.getName(), natureID);
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
        if (project.exists() && project.hasNature(natureID))
        {
          if (projects.remove(project))
          {
            event.addDelta(project, IContainerDelta.Kind.REMOVED);
            traceRemoved(project);
          }
        }
        else
        {
          if (projects.add(project))
          {
            event.addDelta(project, IContainerDelta.Kind.ADDED);
            traceAdded(project);
          }
        }
      }

      return false;
    }
  }
}
