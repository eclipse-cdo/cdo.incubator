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

import org.eclipse.emf.ecore.EObject;

/**
 * @author Eike Stepper
 */
public class EObjectDescriptor extends EMFDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return EObject.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    EObject eObject = (EObject)object;
    element.setAttribute("class", eObject.eClass().getName());
  }
}
