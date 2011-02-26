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

import org.eclipse.emf.cdo.common.model.CDOPackageUnit;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.util.collection.Pair;

/**
 * @author Eike Stepper
 */
public class PackageUnitDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return CDOPackageUnit.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    CDOPackageUnit packageUnit = (CDOPackageUnit)object;
    element.setIDAttribute(packageUnit.getID());
    element.setAttribute("type", packageUnit.getOriginalType());
    element.addReferences(true, packageUnit.getPackageInfos());
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
