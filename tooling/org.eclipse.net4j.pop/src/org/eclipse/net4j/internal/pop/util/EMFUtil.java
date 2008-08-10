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
package org.eclipse.net4j.internal.pop.util;

import org.eclipse.net4j.pop.util.PopResourceFactoryImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.util.Map;

/**
 * @author Eike Stepper
 */
public final class EMFUtil
{
  private EMFUtil()
  {
  }

  public static void prepareResourceSet(ResourceSet resourceSet)
  {
    Map<String, Object> map = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    map.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new PopResourceFactoryImpl());
  }

  public static EObject getObjectById(ResourceSet resourceSet, String id)
  {
    if (resourceSet == null)
    {
      return null;
    }

    for (Resource resource : resourceSet.getResources())
    {
      EObject element = resource.getEObject(id);
      if (element != null)
      {
        return element;
      }
    }

    return null;
  }

  public static URI getResourceURI(EObject object)
  {
    URI targetURI = ((InternalEObject)object).eProxyURI();
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
}
