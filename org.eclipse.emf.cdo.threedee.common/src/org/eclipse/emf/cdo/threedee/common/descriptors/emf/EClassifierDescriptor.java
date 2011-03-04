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

import org.eclipse.emf.ecore.EClassifier;

/**
 * @author Eike Stepper
 */
public class EClassifierDescriptor extends ENamedElementDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return EClassifier.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    super.initElement(object, element);

    EClassifier eClassifier = (EClassifier)object;
    element.setAttribute("instanceClassName", eClassifier.getInstanceClassName());
  }
}
