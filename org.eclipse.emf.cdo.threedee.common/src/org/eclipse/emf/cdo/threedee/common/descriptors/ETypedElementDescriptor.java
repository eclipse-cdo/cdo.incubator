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

import org.eclipse.emf.ecore.ETypedElement;

/**
 * @author Eike Stepper
 */
public class ETypedElementDescriptor extends ENamedElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return ETypedElement.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    super.initElement(object, element);

    ETypedElement eTypedElement = (ETypedElement)object;
    element.setAttribute("lowerBound", eTypedElement.getLowerBound());
    element.setAttribute("upperBound", eTypedElement.getUpperBound());
    element.setAttribute("ordered", eTypedElement.isOrdered());
    element.setAttribute("unique", eTypedElement.isUnique());
    element.addReference(false, eTypedElement.getEType());
  }
}
