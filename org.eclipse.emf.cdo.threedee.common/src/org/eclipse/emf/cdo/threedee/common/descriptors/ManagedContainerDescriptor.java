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
package org.eclipse.emf.cdo.threedee.common.descriptors;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.spi.net4j.Protocol;

/**
 * @author Eike Stepper
 */
public class ManagedContainerDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return IManagedContainer.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    IManagedContainer container = (IManagedContainer)object;
    element.addReference(true, EPackage.Registry.INSTANCE);
    for (Object child : container.getElements())
    {
      if (child instanceof Protocol)
      {
        // Do nothing
      }
      else
      {
        element.addReference(true, child);
      }
    }
  }
}
