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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdoserver;

import org.eclipse.emf.cdo.common.util.CDOCommonUtil;
import org.eclipse.emf.cdo.spi.server.InternalRepository;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;

import org.eclipse.net4j.util.collection.Pair;

/**
 * @author Eike Stepper
 */
public class RepositoryDescriptor extends CDOServerDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return InternalRepository.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    InternalRepository repository = (InternalRepository)object;
    element.setIDAttribute(repository.getUUID());
    element.setNameAttribute(repository.getName());
    element.setAttribute("creationTime", CDOCommonUtil.formatTimeStamp(repository.getCreationTime()));
    element.setAttribute("objectIDTypes", repository.getObjectIDTypes());
    element.setAttribute("rootResourceID", repository.getRootResourceID());
    element.setAttribute("type", repository.getType());
    element.setAttribute("storeType", repository.getStoreType());
    element.setAttribute("state", repository.getState());
    element.setAttribute("supportingAudits", repository.isSupportingAudits());
    element.setAttribute("supportingBranches", repository.isSupportingBranches());
    element.setAttribute("supportingEcore", repository.isSupportingEcore());
    element.setAttribute("referentialIntegrity", repository.isEnsuringReferentialIntegrity());
    element.addReferences(true, repository.getElements());
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
