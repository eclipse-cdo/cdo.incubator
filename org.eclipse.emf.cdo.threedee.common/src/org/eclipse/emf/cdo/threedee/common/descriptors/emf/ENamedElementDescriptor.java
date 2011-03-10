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

import org.eclipse.emf.ecore.ENamedElement;

/**
 * @author Eike Stepper
 */
public class ENamedElementDescriptor extends EModelElementDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return ENamedElement.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    super.doInitElement(object, element);

    ENamedElement eNamedElement = (ENamedElement)object;
    element.setNameAttribute(eNamedElement.getName());
  }
}
