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
public interface IModelHandler<T extends EObject>
{
  public T locateModel(Resource resource);

  public void modelChanged(T model, Kind kind);

  /**
   * @author Eike Stepper
   */
  public enum Kind
  {
    AVAILABLE, REFRESHED, UNAVAILABLE
  }
}
