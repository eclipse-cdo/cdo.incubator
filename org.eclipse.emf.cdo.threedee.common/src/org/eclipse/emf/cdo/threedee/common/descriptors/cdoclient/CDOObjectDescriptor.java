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
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevision;
import org.eclipse.emf.cdo.threedee.common.Element;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.spi.cdo.InternalCDOObject;

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
    InternalCDOObject cdoObject = (InternalCDOObject)object;
    CDOState state = cdoObject.cdoState();

    element.setIDAttribute(cdoObject.cdoID());
    element.setAttribute("state", state);

    InternalCDORevision revision = cdoObject.cdoRevision();
    if (revision != null)
    {
      element.setAttribute("revision", revision.getBranch().getName() + "-v" + revision.getVersion());
    }

    element.addReference(state == CDOState.NEW, revision);

    InternalEObject instance = cdoObject.cdoInternalInstance();
    if (instance != cdoObject)
    {
      element.addReference(true, instance);
    }
  }
}
