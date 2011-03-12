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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.transaction.CDOSavepoint;

/**
 * @author Eike Stepper
 */
public class CDOSavepointDescriptor extends CDOClientDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return CDOSavepoint.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    CDOSavepoint savepoint = (CDOSavepoint)object;
    CDOSavepoint previousSavepoint = savepoint.getPreviousSavepoint();
    if (previousSavepoint != null)
    {
      element.addReference(true, previousSavepoint);
    }
  }

  @Override
  public String getLabel(Element element)
  {
    return super.getLabel(element).substring(3);
  }
}
