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

import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

import java.util.Map;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class RepositoryDescriptor extends ElementDescriptor
{
  @Override
  public void initElement(Object object, Element element, ElementProvider provider)
  {
    IRepository repository = (IRepository)object;

    Map<String, String> attributes = element.getAttributes();
    attributes.put("name", repository.getName());

    Set<Element> references = element.getReferences();
    for (Object target : repository.getElements())
    {
      Element targetElement = provider.getElement(target);
      if (targetElement != null)
      {
        references.add(targetElement);
      }
    }
  }
}
