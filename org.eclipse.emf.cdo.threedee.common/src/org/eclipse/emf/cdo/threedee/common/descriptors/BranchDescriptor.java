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
package org.eclipse.emf.cdo.threedee.common.descriptors;

import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

/**
 * @author Eike Stepper
 */
public class BranchDescriptor extends ElementDescriptor
{
  @Override
  public boolean matches(Object object)
  {
    return object instanceof CDOBranch;
  }

  @Override
  public void initElement(Object object, Element element, final ElementProvider provider)
  {
    CDOBranch branch = (CDOBranch)object;
    element.setNameAttribute(branch.getPathName());
    element.addReference(branch.getBase().getBranch(), provider);
    element.addReference(branch.getBranches(), provider);
  }
}
