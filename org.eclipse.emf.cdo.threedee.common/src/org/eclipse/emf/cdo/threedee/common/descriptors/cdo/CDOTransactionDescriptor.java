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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdo;

import org.eclipse.emf.cdo.threedee.common.Element;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class CDOTransactionDescriptor extends CDOViewDescriptor
{
  @Override
  public Class<?> getType()
  {
    return org.eclipse.emf.internal.cdo.transaction.CDOTransactionImpl.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    super.initElement(object, element);

    // org.eclipse.emf.internal.cdo.transaction.CDOTransactionImpl transaction =
    // (org.eclipse.emf.internal.cdo.transaction.CDOTransactionImpl)object;
    // element.setAttribute("dirty", transaction.isDirty());
    // element.setAttribute("conflict", transaction.hasConflict());
    // element.addReference(true, transaction.getLastSavepoint());
    // element.addReference(false, transaction.getViewSet());
  }
}
