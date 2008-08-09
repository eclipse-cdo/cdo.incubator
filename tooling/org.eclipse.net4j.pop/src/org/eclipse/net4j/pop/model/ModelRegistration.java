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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Eike Stepper
 */
public class ModelRegistration<T extends EObject> implements IModelRegistration<T>
{
  private ModelResource modelResource;

  private IModelHandler<T> modelHandler;

  private boolean cancelled;

  private T model;

  public ModelRegistration(ModelResource modelResource, IModelHandler<T> modelHandler)
  {
    this.modelResource = modelResource;
    this.modelHandler = modelHandler;
  }

  public IModelHandler<T> getModelHandler()
  {
    return modelHandler;
  }

  public IModelResource getModelResource()
  {
    return modelResource;
  }

  public boolean isAvailable()
  {
    if (cancelled)
    {
      return false;
    }

    return model != null;
  }

  public synchronized T getModel()
  {
    if (cancelled)
    {
      return null;
    }

    return model;
  }

  public synchronized void cancel()
  {
    if (!cancelled)
    {
      modelResource.removeRegistration(this);
      cancelled = true;
      model = null;
    }
  }

  public boolean isCancelled()
  {
    return cancelled;
  }

  public void refresh(Resource resource)
  {
    try
    {
      T model = locateModel(resource);
      IModelHandler.Kind kind = getChangeKind(model);
      if (kind != null)
      {
        this.model = model;
        modelHandler.modelChanged(model, kind);
      }
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }
  }

  private IModelHandler.Kind getChangeKind(T model)
  {
    if (this.model == model)
    {
      return null;
    }

    if (this.model == null /* && model != null */)
    {
      return IModelHandler.Kind.AVAILABLE;
    }

    if (/* this.model != null && */model == null)
    {
      return IModelHandler.Kind.UNAVAILABLE;
    }

    return IModelHandler.Kind.REFRESHED;
  }

  private T locateModel(Resource resource)
  {
    if (resource == null)
    {
      return null;
    }

    return modelHandler.locateModel(resource);
  }
}
