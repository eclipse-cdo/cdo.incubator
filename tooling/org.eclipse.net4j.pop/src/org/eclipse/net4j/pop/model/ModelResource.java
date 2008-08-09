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

import org.eclipse.net4j.pop.model.IModelHandler.Kind;
import org.eclipse.net4j.util.event.Notifier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class ModelResource extends Notifier implements IModelResource
{
  private static final long UNKNOWN = Long.MIN_VALUE;

  private ModelManager modelManager;

  private URI uri;

  private transient boolean exists = true;

  private transient long lastModified = UNKNOWN;

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

  public boolean exists()
  {
    return exists;
  }

  public long getLastModified()
  {
    return lastModified;
  }

  public Resource getResource()
  {
    return modelManager.getResourceSet().getResource(uri, true);
  }

  public IModelResource[] getReferences()
  {
    return null;
  }

  public IModelResource[] getReferers()
  {
    return null;
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

  public void refresh()
  {
    IFile file = ModelManager.getFile(uri);
    if (file != null)
    {
      Resource resource = modelManager.getResource(uri);
      if (resource != null)
      {
        handleExisting();
        return;
      }
    }

    handleMissing();
  }

  private void handleExisting()
  {
    if (exists)
    {
      notifyHandlers(IModelHandler.Kind.REFRESHED);
    }
    else
    {
      exists = true;
      notifyHandlers(IModelHandler.Kind.AVAILABLE);
    }
  }

  private void handleMissing()
  {
    if (exists)
    {
      exists = false;
      notifyHandlers(IModelHandler.Kind.UNAVAILABLE);
    }
  }

  private void notifyHandlers(Kind kind)
  {
    for (ModelRegistration<?> registration : getRegistrations())
    {
      registration.modelChanged(kind);
    }
  }
}
