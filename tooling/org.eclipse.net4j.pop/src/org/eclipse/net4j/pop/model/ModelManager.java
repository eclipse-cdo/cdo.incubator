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
import org.eclipse.core.runtime.Path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Eike Stepper
 */
public class ModelManager extends QueueWorker<List<ModelResource>> implements IModelManager, IResourceChangeListener
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ModelManager.class);

  private static final IWorkspace WS = ResourcesPlugin.getWorkspace();

  private static final IWorkspaceRoot ROOT = ResourcesPlugin.getWorkspace().getRoot();

  private ResourceSet resourceSet;

  private Map<URI, ModelResource> modelResources = new HashMap<URI, ModelResource>();

  private Map<URI, List<ModelRegistration<? extends EObject>>> registrations = new HashMap<URI, List<ModelRegistration<? extends EObject>>>();

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

      modelResource.incRegistrations();
    }

    ModelRegistration<T> registration = new ModelRegistration<T>(this, modelResource, handler);
    synchronized (registrations)
    {
      List<ModelRegistration<? extends EObject>> list = registrations.get(uri);
      if (list == null)
      {
        list = new ArrayList<ModelRegistration<? extends EObject>>();
        registrations.put(uri, list);
      }

      list.add(registration);
    }

    return registration;
  }

  public void deregisterModel(ModelRegistration<? extends EObject> registration)
  {
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    WS.addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    WS.removeResourceChangeListener(this);
    super.doDeactivate();
  }

  public void resourceChanged(IResourceChangeEvent event)
  {
    IResourceDelta delta = event.getDelta();
    if (delta != null)
    {
      final List<ModelResource> affected = getAffectedModelResources(delta);
      if (!affected.isEmpty())
      {
        addWork(affected);
      }
    }
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
  }

  protected void refresh(List<ModelResource> affected)
  {
    // resourceSet.getResources().clear();

    for (URI uri : getRegisteredURIs())
    {
      IFile file = getFile(uri);
      if (file != null)
      {
        Resource resource = getResource(uri);
        if (resource != null)
        {
          handleExistingResouce(resource, affected);
        }
      }

      handleNonExistingResouce(uri);
    }
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

  private void handleExistingResouce(Resource primaryResource, List<ModelResource> affected)
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

  private URI[] getRegisteredURIs()
  {
    synchronized (registrations)
    {
      return registrations.keySet().toArray(new URI[registrations.size()]);
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

  private IFile getFile(URI uri)
  {
    if (uri.isPlatformResource())
    {
      IPath path = new Path(uri.toPlatformString(false));
      return getFile(path);
    }

    return null;
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
    return getResource(URI.createPlatformResourceURI(path.toString(), false));
  }

  private Resource getResource(URI uri)
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

  public static ResourceSet createResourceSet()
  {
    ResourceSet resourceSet = new ResourceSetImpl();
    EMFUtil.prepareSupportForUUIDs(resourceSet);
    return resourceSet;
  }
}
