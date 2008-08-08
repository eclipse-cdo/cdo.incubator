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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.core.runtime.Platform;

/**
 * @author Eike Stepper
 */
public class ModelResource extends Notifier implements IModelResource
{
  private IModelManager modelManager;

  private URI uri;

  private boolean exists;

  private int registrations;

  public ModelResource(IModelManager modelManager, URI uri)
  {
    this.modelManager = modelManager;
    this.uri = uri;
  }

  public IModelManager getModelManager()
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

  public synchronized boolean hasRegistrations()
  {
    return registrations > 0;
  }

  public synchronized void incRegistrations()
  {
    ++registrations;
  }

  public synchronized void decRegistrations()
  {
    --registrations;
  }
}
