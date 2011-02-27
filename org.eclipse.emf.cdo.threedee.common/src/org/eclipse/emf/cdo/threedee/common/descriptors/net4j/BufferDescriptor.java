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
package org.eclipse.emf.cdo.threedee.common.descriptors.net4j;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.buffer.IBuffer;
import org.eclipse.net4j.util.collection.Pair;

/**
 * @author Eike Stepper
 */
public class BufferDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return IBuffer.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    IBuffer buffer = (IBuffer)object;
    element.setIDAttribute(System.identityHashCode(buffer));
    element.setAttribute("capacity", buffer.getCapacity());
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
