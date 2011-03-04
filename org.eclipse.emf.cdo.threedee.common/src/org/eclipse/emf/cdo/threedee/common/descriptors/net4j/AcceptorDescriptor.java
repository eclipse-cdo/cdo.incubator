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

import org.eclipse.spi.net4j.Acceptor;

/**
 * @author Eike Stepper
 */
public class AcceptorDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return Acceptor.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    Acceptor acceptor = (Acceptor)object;
    element.addReferences(true, acceptor.getAcceptedConnectors());
  }
}
