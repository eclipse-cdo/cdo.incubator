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
package org.eclipse.net4j.pop.model;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.util.EMFUtil;
import org.eclipse.net4j.util.lifecycle.QueueWorker;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Eike Stepper
 */
public class ModelManager extends QueueWorker<List<ModelResource>> implements IModelManager
{
  public static final IWorkspace WS = ResourcesPlugin.getWorkspace();

  public static final IWorkspaceRoot ROOT = ResourcesPlugin.getWorkspace().getRoot();

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ModelManager.class);

  private ResourceSet resourceSet;

  private Map<URI, ModelResource> modelResources = new HashMap<URI, ModelResource>();

  private WorkspaceMonitor workspaceMonitor = new WorkspaceMonitor();

  public ModelManager(ResourceSet resourceSet)
  {
    this.resourceSet = resourceSet;
  }

  public ModelManager()
  {
    this(createResourceSet());
  }

  public ResourceSet getResourceSet()
  {
    return resourceSet;
  }

  public Resource getResource(URI uri)
  {
    try
    {
      return resourceSet.getResource(uri, true);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
      return null;
    }
  }

  public <T extends EObject> IModelRegistration<T> registerModel(URI uri, IModelHandler<T> handler)
  {
    ModelResource modelResource;
    synchronized (modelResources)
    {
      modelResource = modelResources.get(uri);
      if (modelResource == null)
      {
        modelResource = new ModelResource(this, uri);
        modelResources.put(uri, modelResource);
      }
    }

    return modelResource.addRregistration(handler);
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    WS.addResourceChangeListener(workspaceMonitor, IResourceChangeEvent.POST_CHANGE);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    WS.removeResourceChangeListener(workspaceMonitor);
    super.doDeactivate();
  }

  @Override
  protected String getThreadName()
  {
    return "model-manager";
  }

  @Override
  protected void work(WorkContext context, List<ModelResource> affected)
  {
    refresh(affected);
    cleanup();
  }

  protected void refresh(List<ModelResource> affected)
  {
    for (ModelResource modelResource : affected)
    {
      modelResource.refresh();
    }
  }

  protected void cleanup()
  {
  }

  public static ResourceSet createResourceSet()
  {
    ResourceSet resourceSet = new ResourceSetImpl();
    EMFUtil.prepareSupportForUUIDs(resourceSet);
    return resourceSet;
  }

  public static IFile getFile(URI uri)
  {
    if (uri.isPlatformResource())
    {
      IPath path = new Path(uri.toPlatformString(false));
      return getFile(path);
    }

    return null;
  }

  public static IFile getFile(IPath path)
  {
    IResource resource = ROOT.findMember(path);
    if (resource instanceof IFile)
    {
      return (IFile)resource;
    }

    return null;
  }

  /**
   * @author Eike Stepper
   */
  private final class WorkspaceMonitor implements IResourceChangeListener
  {
    public WorkspaceMonitor()
    {
    }

    public void resourceChanged(IResourceChangeEvent event)
    {
      IResourceDelta delta = event.getDelta();
      if (delta != null)
      {
        List<ModelResource> affected = getAffectedModelResources(delta);
        if (!affected.isEmpty())
        {
          if (TRACER.isEnabled())
          {
            TRACER.format("Affected: {0}", affected);
          }

          addWork(affected);
        }
      }
    }

    private List<ModelResource> getAffectedModelResources(IResourceDelta delta)
    {
      List<ModelResource> result = new ArrayList<ModelResource>();
      synchronized (modelResources)
      {
        for (Entry<URI, ModelResource> entry : modelResources.entrySet())
        {
          URI uri = entry.getKey();
          if (uri.isPlatformResource())
          {
            IPath path = new Path(uri.toPlatformString(false));
            IResourceDelta member = delta.findMember(path);
            if (member != null && member.getResource() instanceof IFile)
            {
              result.add(entry.getValue());
            }
          }
        }
      }

      return result;
    }
  }
}
