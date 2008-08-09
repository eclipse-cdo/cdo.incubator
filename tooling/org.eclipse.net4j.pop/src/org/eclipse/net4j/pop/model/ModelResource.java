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

import org.eclipse.net4j.util.event.Notifier;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class ModelResource extends Notifier implements IModelResource
{
  private ModelManager modelManager;

  private URI uri;

  private Resource resource;

  private ModelResource[] references;

  private List<ModelRegistration<? extends EObject>> registrations = new ArrayList<ModelRegistration<? extends EObject>>();

  public ModelResource(ModelManager modelManager, URI uri)
  {
    this.modelManager = modelManager;
    this.uri = uri;
  }

  public ModelManager getModelManager()
  {
    return modelManager;
  }

  public URI getURI()
  {
    return uri;
  }

  public Resource getResource()
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

  public ModelResource[] getReferers()
  {
    return modelManager.getReferers(this);
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

    return registration;
  }

  public void removeRegistration(ModelRegistration<? extends EObject> registration)
  {
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

  public void dispose()
  {
    ungetResource();
    registrations = null;
  }

  public synchronized void refresh()
  {
    ungetResource();
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
        InternalEObject object = (InternalEObject)it.next();
        URI targetURI = getResourceURI(object);
        if (targetURI != null)
        {
          ModelResource target = modelManager.getOrCreateModelResource(targetURI);
          if (target != this)
          {
            targets.add(target);
          }
        }
      }
    }

    return targets.toArray(new ModelResource[targets.size()]);
  }

  private URI getResourceURI(InternalEObject object)
  {
    URI targetURI = object.eProxyURI();
    if (targetURI != null)
    {
      return targetURI.trimFragment();
    }

    Resource targetResource = object.eResource();
    if (targetResource != null)
    {
      return targetResource.getURI();
    }

    return null;
  }

  private void ungetResource()
  {
    references = null;
    if (resource != null)
    {
      modelManager.ungetResource(resource);
      resource = null;
    }
  }
}
