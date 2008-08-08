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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Eike Stepper
 */
public class DefaultModelHandler<T extends EObject> implements IModelHandler<T>
{
  public DefaultModelHandler()
  {
  }

  public T locateModel(IModelRegistration<T> registration)
  {
    IModelResource modelResource = registration.getModelResource();
    if (modelResource != null)
    {
      Resource resource = modelResource.getResource();
      if (resource != null)
      {
        return locateModel(resource);
      }
    }

    return null;
  }

  @SuppressWarnings("unchecked")
  protected T locateModel(Resource resource)
  {
    for (EObject object : resource.getContents())
    {
      try
      {
        return (T)object;
      }
      catch (Throwable ignore)
      {
      }
    }

    return null;
  }

  public void modelAvailable(IModelRegistration<T> registration)
  {
    handleModel(registration.getModel());
  }

  public void modelRefreshed(IModelRegistration<T> registration)
  {
    handleModel(registration.getModel());
  }

  public void modelUnvailable(IModelRegistration<T> registration)
  {
    handleModel(null);
  }

  protected void handleModel(T model)
  {
  }
}
