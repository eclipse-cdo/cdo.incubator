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

/**
 * @author Eike Stepper
 */
public class ModelRegistration<T extends EObject> implements IModelRegistration<T>
{
  private ModelResource modelResource;

  private IModelHandler<T> modelHandler;

  private boolean cancelled;

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

  public boolean isModelAvailable()
  {
    if (cancelled)
    {
      return false;
    }

    // TODO: implement ModelRegistration.isModelAvailable()
    throw new UnsupportedOperationException();
  }

  public synchronized T getModel()
  {
    if (cancelled)
    {
      return null;
    }

    // TODO: implement ModelRegistration.getModel()
    throw new UnsupportedOperationException();
  }

  public synchronized void cancel()
  {
    if (!cancelled)
    {
      modelResource.removeRegistration(this);
      cancelled = true;
    }
  }

  public boolean isCancelled()
  {
    return cancelled;
  }

  public void modelChanged(IModelHandler.Kind kind)
  {
    try
    {
      modelHandler.modelChanged(this, kind);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }
  }
}
