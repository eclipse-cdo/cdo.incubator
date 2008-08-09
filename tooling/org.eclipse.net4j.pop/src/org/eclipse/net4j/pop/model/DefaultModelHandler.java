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
public abstract class DefaultModelHandler<T extends EObject> implements IModelHandler<T>
{
  public DefaultModelHandler()
  {
  }

  @SuppressWarnings("unchecked")
  public T locateModel(Resource resource)
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
}
