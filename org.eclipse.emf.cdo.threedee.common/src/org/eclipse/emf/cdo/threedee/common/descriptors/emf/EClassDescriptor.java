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

import org.eclipse.emf.ecore.EClass;

/**
 * @author Eike Stepper
 */
public class EClassDescriptor extends EClassifierDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return EClass.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    super.initElement(object, element);

    EClass eClass = (EClass)object;
    element.addReferences(true, eClass.getEStructuralFeatures());
    element.addReferences(true, eClass.getEOperations());
    element.addReferences(false, eClass.getESuperTypes());
  }
}
