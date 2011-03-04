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
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class CDOSessionDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return org.eclipse.emf.internal.cdo.session.CDOSessionImpl.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    org.eclipse.emf.internal.cdo.session.CDOSessionImpl session = (org.eclipse.emf.internal.cdo.session.CDOSessionImpl)object;
    element.setIDAttribute(session.getSessionID());
    element.setAttribute("user", session.getUserID());
    element.addReference(true, session.getRepositoryInfo());
    element.addReference(true, session.getPackageRegistry());
    element.addReference(true, session.getBranchManager());
    element.addReference(true, session.getRevisionManager());
    element.addReferences(true, session.getViews());
  }

  @Override
  public String getLabel(Element element)
  {
    return super.getLabel(element).substring(3);
  }
}
