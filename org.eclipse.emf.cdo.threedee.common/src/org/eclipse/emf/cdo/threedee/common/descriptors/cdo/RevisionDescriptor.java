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

import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.util.CDOCommonUtil;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevision;
import org.eclipse.emf.cdo.threedee.common.Element;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author Eike Stepper
 */
public class RevisionDescriptor extends CDODescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return CDORevision.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    InternalCDORevision revision = (InternalCDORevision)object;
    element.setAttribute("_label", revision);
    element.setAttribute("_id", revision.getID());
    element.setAttribute("_class", revision.getEClass().getName());
    element.setAttribute("_branch", revision.getBranch());
    element.setAttribute("_version", revision.getVersion());
    element.setAttribute("_timeStamp", CDOCommonUtil.formatTimeStamp(revision.getTimeStamp()));
    element.setAttribute("_revised", CDOCommonUtil.formatTimeStamp(revision.getRevised()));
    for (EStructuralFeature feature : revision.getClassInfo().getAllPersistentFeatures())
    {
      Object value = revision.getValue(feature);
      element.setAttribute(feature.getName(), value);
    }
  }
}
