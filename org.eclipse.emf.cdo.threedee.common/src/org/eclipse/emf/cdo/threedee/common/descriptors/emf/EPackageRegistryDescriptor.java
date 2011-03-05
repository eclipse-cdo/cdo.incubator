/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.common.descriptors.emf;

import org.eclipse.emf.cdo.threedee.common.Element;

import org.eclipse.emf.ecore.EPackage;

import java.util.Collection;

/**
 * @author Eike Stepper
 */
public class EPackageRegistryDescriptor extends EMFDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return EPackage.Registry.class;
  }

  @Override
  public boolean matches(Object object)
  {
    return object == EPackage.Registry.INSTANCE;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    EPackage.Registry packageRegistry = (EPackage.Registry)object;
    Collection<Object> values = packageRegistry.values();
    for (Object value : values)
    {
      if (value instanceof EPackage)
      {
        element.addReference(true, value);
      }
    }
  }
}
