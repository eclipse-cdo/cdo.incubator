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

import org.eclipse.emf.cdo.common.util.CDOCommonUtil;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.util.collection.Pair;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class ViewDescriptor extends CDOServerDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return org.eclipse.emf.cdo.internal.server.View.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    org.eclipse.emf.cdo.internal.server.View view = (org.eclipse.emf.cdo.internal.server.View)object;
    element.setIDAttribute(view.getViewID());
    element.addReference(false, view.getBranch());
    element.setAttribute("timeStamp", CDOCommonUtil.formatTimeStamp(view.getTimeStamp()));
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
