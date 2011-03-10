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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server;

import org.eclipse.emf.cdo.threedee.common.Element;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class SessionDescriptor extends CDOServerDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return org.eclipse.emf.cdo.internal.server.Session.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    org.eclipse.emf.cdo.internal.server.Session session = (org.eclipse.emf.cdo.internal.server.Session)object;
    element.setIDAttribute(session.getSessionID());
    element.setAttribute("user", session.getUserID());
    element.addReferences(true, session.getViews());
  }
}
