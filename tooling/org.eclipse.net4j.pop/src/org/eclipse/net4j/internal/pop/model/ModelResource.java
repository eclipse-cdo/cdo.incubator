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
import org.eclipse.net4j.pop.model.IModelHandler;
import org.eclipse.net4j.pop.model.IModelResource;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.event.Notifier;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.core.runtime.Platform;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class ModelResource extends Notifier implements IModelResource
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ModelResource.class);

  private ModelManager modelManager;

  private URI uri;

  private Resource resource;

  private ModelResource[] references;

  private List<ModelRegistration<? extends EObject>> registrations = new ArrayList<ModelRegistration<? extends EObject>>();

  public ModelResource(ModelManager modelManager, URI uri)
  {
    this.modelManager = modelManager;
    this.uri = uri;
    refresh();
  }

  public ModelManager getModelManager()
  {
    return modelManager;
  }

  public URI getURI()
  {
    return uri;
  }

  public synchronized Resource getResource()
  {
    return resource;
  }

  public synchronized ModelResource[] getReferences()
  {
    if (references == null)
    {
      references = xref();
    }

    return references;
  }

  public synchronized ModelResource[] getReferrers()
  {
    return modelManager.getReferrers(this);
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  public <T extends EObject> ModelRegistration<T> addRregistration(IModelHandler<T> handler)
  {
    ModelRegistration<T> registration = new ModelRegistration<T>(this, handler);
    synchronized (registrations)
    {
      registrations.add(registration);
    }

    if (TRACER.isEnabled())
    {
      TRACER.format("Added: {0}", registration);
    }

    registration.refresh(resource);
    return registration;
  }

  public void removeRegistration(ModelRegistration<? extends EObject> registration)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Removing: {0}", registration);
    }

    synchronized (registrations)
    {
      registrations.remove(registration);
    }
  }

  public ModelRegistration<?>[] getRegistrations()
  {
    synchronized (registrations)
    {
      return registrations.toArray(new ModelRegistration<?>[registrations.size()]);
    }
  }

  public boolean hasRegistrations()
  {
    synchronized (registrations)
    {
      return !registrations.isEmpty();
    }
  }

  @Override
  public boolean equals(Object obj)
  {
    if (obj == this)
    {
      return true;
    }

    if (obj instanceof ModelResource)
    {
      ModelResource that = (ModelResource)obj;
      return ObjectUtil.equals(uri, that.uri);
    }

    return false;
  }

  @Override
  public int hashCode()
  {
    return ObjectUtil.hashCode(uri);
  }

  @Override
  public String toString()
  {
    String exists = resource == null ? "missing" : "existing";
    return MessageFormat.format("ModelResource[{0}, {1}]", uri, exists);
  }

  public void dispose()
  {
    disposeResource();
    registrations = null;
  }

  public synchronized void refresh()
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Refreshing: {0}", this);
    }

    disposeResource();
    resource = modelManager.getResource(uri);
    for (ModelRegistration<?> registration : getRegistrations())
    {
      registration.refresh(resource);
    }
  }

  private ModelResource[] xref()
  {
    Set<ModelResource> targets = new HashSet<ModelResource>();
    if (resource != null)
    {
      for (TreeIterator<EObject> it = resource.getAllContents(); it.hasNext();)
      {
        EObject object = it.next();
        xref(object, targets);
        for (EObject ref : object.eCrossReferences())
        {
          xref(ref, targets);
        }
      }
    }

    return targets.toArray(new ModelResource[targets.size()]);
  }

  private void xref(EObject object, Set<ModelResource> targets)
  {
    URI targetURI = EMFUtil.getResourceURI(object);
    if (targetURI != null)
    {
      ModelResource target = modelManager.getOrCreateModelResource(targetURI);
      if (target != this)
      {
        targets.add(target);
      }
    }
  }

  private void disposeResource()
  {
    references = null;
    if (resource != null)
    {
      modelManager.ungetResource(resource);
      resource = null;
    }
  }
}
