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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdo;

import org.eclipse.emf.cdo.common.model.CDOPackageInfo;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.util.collection.Pair;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * @author Eike Stepper
 */
public class PackageInfoDescriptor extends CDODescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return CDOPackageInfo.class;
  }

  @Override
  @SuppressWarnings("restriction")
  public void initElement(Object object, Element element)
  {
    org.eclipse.emf.cdo.internal.common.model.CDOPackageInfoImpl packageInfo = (org.eclipse.emf.cdo.internal.common.model.CDOPackageInfoImpl)object;
    element.setIDAttribute(packageInfo.getPackageURI());

    EPackage ePackage = packageInfo.doGetEPackage(false);
    if (ePackage != null)
    {
      if (ePackage.getClass() == EPackageImpl.class)
      {
        element.addReference(true, ePackage);
      }
      else
      {
        element.addReference(false, ePackage);
      }
    }
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return doCreateChangeEvent(oldElement, newObject);
  }
}
