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

import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.INotifier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.core.runtime.IAdaptable;

/**
 * @author Eike Stepper
 */
public interface IModelResource extends INotifier, IAdaptable
{
  public IModelManager getModelManager();

  public URI getURI();

  public IModelResource[] getReferences();

  public IModelResource[] getReferrers();

  public Resource getResource();

  /**
   * @author Eike Stepper
   */
  public interface LoadedEvent extends IEvent
  {
  }

  /**
   * @author Eike Stepper
   */
  public interface UnloadedEvent extends IEvent
  {
  }

  /**
   * @author Eike Stepper
   */
  public interface RefreshedEvent extends IEvent
  {
  }
}
