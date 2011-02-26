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

import org.eclipse.emf.cdo.spi.server.InternalSession;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

/**
 * @author Eike Stepper
 */
public class SessionDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return InternalSession.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    InternalSession session = (InternalSession)object;
    element.setIDAttribute(session.getSessionID());
    element.setAttribute("user", session.getUserID());
    element.addReferences(true, session.getViews());
  }
}
