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

import org.eclipse.emf.ecore.EReference;

/**
 * @author Eike Stepper
 */
public class EReferenceDescriptor extends EStructuralFeatureDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return EReference.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    super.doInitElement(object, element);

    EReference eReference = (EReference)object;
    element.setAttribute("containment", eReference.isContainment());
    element.setAttribute("container", eReference.isContainer());
    element.addReference(false, eReference.getEOpposite());
  }
}
