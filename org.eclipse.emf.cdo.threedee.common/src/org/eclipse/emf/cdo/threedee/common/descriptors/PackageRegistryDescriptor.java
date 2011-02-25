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

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

/**
 * @author Eike Stepper
 */
public class PackageRegistryDescriptor extends ElementDescriptor
{
  @Override
  public boolean matches(Object object)
  {
    return object instanceof CDOPackageRegistry;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    CDOPackageRegistry packageRegistry = (CDOPackageRegistry)object;
    element.addReferences(true, packageRegistry.getPackageUnits());
  }
}
