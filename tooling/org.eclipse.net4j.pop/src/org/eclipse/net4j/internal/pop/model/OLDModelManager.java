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
package org.eclipse.net4j.internal.pop.model;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.util.EMFUtil;
import org.eclipse.net4j.pop.model.IModelEvent;
import org.eclipse.net4j.pop.model.IModelManager;
import org.eclipse.net4j.util.lifecycle.Lifecycle;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class OLDModelManager<MODEL extends EObject> extends Lifecycle implements IModelManager<MODEL>,
    IResourceChangeListener
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, OLDModelManager.class);

  private static final IWorkspace WS = ResourcesPlugin.getWorkspace();

  private static final IWorkspaceRoot ROOT = ResourcesPlugin.getWorkspace().getRoot();

  private IPath primaryPath;

  private Set<IPath> secondaryPaths = new HashSet<IPath>();

  private ResourceSet resourceSet;

  private boolean available;

  public OLDModelManager(IPath primaryPath, ResourceSet resourceSet)
  {
    this.primaryPath = primaryPath;
    this.resourceSet = resourceSet;
  }

  public OLDModelManager(IPath modelEntry)
  {
    this(modelEntry, createResourceSet());
  }

  public IPath getPrimaryPath()
  {
    return primaryPath;
  }

  public ResourceSet getResourceSet()
  {
    return resourceSet;
  }

  public Resource getModelResource()
  {
    if (resourceSet == null)
    {
      return null;
    }

    EList<Resource> resources = resourceSet.getResources();
    if (resources.isEmpty())
    {
      return null;
    }

    return resources.get(0);
  }

  @SuppressWarnings("unchecked")
  public MODEL getModel()
  {
    Resource resource = getModelResource();
    if (resource == null)
    {
      return null;
    }

    EList<EObject> contents = resource.getContents();
    if (contents.isEmpty())
    {
      return null;
    }

    return (MODEL)contents.get(0);
  }

  public void resourceChanged(IResourceChangeEvent event)
  {
    IResourceDelta delta = event.getDelta();
    final List<IPath> affectedPaths = getAffectedPaths(delta);
    if (affectedPaths != null && !affectedPaths.isEmpty())
    {
      new Job("Refresh model")
      {
        @Override
        protected IStatus run(IProgressMonitor monitor)
        {
          refresh(affectedPaths);
          return Status.OK_STATUS;
        }
      }.schedule();
    }
  }

  protected void fireModelEvent(IModelEvent.Kind kind)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Event {0} for primary path {1}", kind, primaryPath);
    }

    fireEvent(new ModelEvent(this, kind));
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    refresh(null);
    WS.addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    WS.removeResourceChangeListener(this);
    super.doDeactivate();
  }

  private Resource refresh(List<IPath> affectedPaths)
  {
    resourceSet.getResources().clear();
    IFile file = getFile(primaryPath);
    if (file != null)
    {
      Resource resource = getResource(primaryPath);
      if (resource != null)
      {
        handleExistingResouce(resource, affectedPaths);
        return resource;
      }
    }

    handleNonExistingResouce();
    return null;
  }

  private void handleNonExistingResouce()
  {
    if (available)
    {
      secondaryPaths.clear();
      available = false;
      fireModelEvent(ModelEvent.Kind.MODEL_UNAVAILABLE);
    }
  }

  private void handleExistingResouce(Resource primaryResource, List<IPath> affectedPaths)
  {
    secondaryPaths.clear();
    EcoreUtil.resolveAll(resourceSet);
    for (Resource resource : resourceSet.getResources())
    {
      if (!resource.equals(primaryResource))
      {
        IPath path = new Path(resource.getURI().path());
        secondaryPaths.add(path);
      }
    }

    if (available)
    {
      fireModelEvent(ModelEvent.Kind.MODEL_REFRESHED);
    }
    else
    {
      available = true;
      fireModelEvent(ModelEvent.Kind.MODEL_AVAILABLE);
    }
  }

  private IFile getFile(IPath path)
  {
    IResource resource = ROOT.findMember(path);
    if (resource instanceof IFile)
    {
      return (IFile)resource;
    }

    return null;
  }

  private Resource getResource(IPath path)
  {
    try
    {
      URI uri = URI.createPlatformResourceURI(path.toString(), false);
      return resourceSet.getResource(uri, true);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
      return null;
    }
  }

  private List<IPath> getAffectedPaths(IResourceDelta delta)
  {
    if (delta == null)
    {
      return null;
    }

    List<IPath> result = new ArrayList<IPath>();
    getAffectedPath(delta, primaryPath, result);
    for (IPath path : secondaryPaths)
    {
      getAffectedPath(delta, path, result);
    }

    return result;
  }

  private void getAffectedPath(IResourceDelta delta, IPath path, List<IPath> result)
  {
    IResourceDelta member = delta.findMember(path);
    if (member != null && member.getResource() instanceof IFile)
    {
      result.add(path);
    }
  }

  public static ResourceSet createResourceSet()
  {
    ResourceSet resourceSet = new ResourceSetImpl();
    EMFUtil.prepareSupportForUUIDs(resourceSet);
    return resourceSet;
  }
}
