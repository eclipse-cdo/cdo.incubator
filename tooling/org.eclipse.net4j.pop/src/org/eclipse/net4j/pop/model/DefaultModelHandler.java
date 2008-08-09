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
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Eike Stepper
 */
public abstract class DefaultModelHandler<T extends EObject> implements IModelHandler<T>
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, DefaultModelHandler.class);

  public DefaultModelHandler()
  {
  }

  @SuppressWarnings("unchecked")
  public final T locateModel(Resource resource)
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

  public final void modelChanged(IModelRegistration<T> registration, IModelHandler.Kind kind)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("{0}: {1}", kind, registration.getModelResource());
    }

    switch (kind)
    {
    case AVAILABLE:
      modelAvailable(registration);
      break;

    case REFRESHED:
      modelRefreshed(registration);
      break;

    case UNAVAILABLE:
      modelUnavailable(registration);
      break;
    }
  }

  protected abstract void modelAvailable(IModelRegistration<T> registration);

  protected abstract void modelRefreshed(IModelRegistration<T> registration);

  protected abstract void modelUnavailable(IModelRegistration<T> registration);

  /**
   * @author Eike Stepper
   */
  public static class Adapter<T extends EObject> extends DefaultModelHandler<T>
  {
    public Adapter()
    {
    }

    @Override
    protected void modelAvailable(IModelRegistration<T> registration)
    {
    }

    @Override
    protected void modelRefreshed(IModelRegistration<T> registration)
    {
    }

    @Override
    protected void modelUnavailable(IModelRegistration<T> registration)
    {
    }
  }
}
