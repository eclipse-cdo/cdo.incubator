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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdoclient;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.threedee.common.Element;

/**
 * @author Eike Stepper
 */
public class CDOObjectDescriptor extends CDOClientDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return CDOObject.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    CDOObject cdoObject = (CDOObject)object;
    CDOState state = cdoObject.cdoState();

    element.setIDAttribute(cdoObject.cdoID());
    element.setAttribute("state", state);
    element.addReference(state == CDOState.NEW, cdoObject.cdoRevision());
  }
}
