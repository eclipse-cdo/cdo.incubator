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

import org.eclipse.emf.cdo.spi.common.branch.InternalCDOBranchManager;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.util.collection.Pair;

/**
 * @author Eike Stepper
 */
public class BranchManagerDescriptor extends CDODescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return InternalCDOBranchManager.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    InternalCDOBranchManager branchManager = (InternalCDOBranchManager)object;
    element.addReference(true, branchManager.getMainBranch());
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
