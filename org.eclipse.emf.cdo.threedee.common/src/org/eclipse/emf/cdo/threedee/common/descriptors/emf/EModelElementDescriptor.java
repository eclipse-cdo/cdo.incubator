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
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.util.collection.Pair;

import org.eclipse.emf.ecore.EModelElement;

/**
 * @author Eike Stepper
 */
public class EModelElementDescriptor extends EMFDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return EModelElement.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    EModelElement eModelElement = (EModelElement)object;
    element.addReferences(true, eModelElement.getEAnnotations());
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
