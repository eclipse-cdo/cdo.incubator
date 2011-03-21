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

import org.eclipse.emf.cdo.common.util.CDOCommonUtil;
import org.eclipse.emf.cdo.threedee.common.Element;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class CDOViewDescriptor extends CDOClientDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return org.eclipse.emf.internal.cdo.view.CDOViewImpl.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    org.eclipse.emf.internal.cdo.view.CDOViewImpl view = (org.eclipse.emf.internal.cdo.view.CDOViewImpl)object;
    element.setAttribute("targetBranch", view.getBranch());
    element.setAttribute("targetTime", CDOCommonUtil.formatTimeStamp(view.getTimeStamp()));
    element.addReferences(true, view.getObjects().values());
    element.addReference(false, view.getViewSet());
  }

  @Override
  public String getLabel(Element element)
  {
    return super.getLabel(element).substring(3);
  }
}
