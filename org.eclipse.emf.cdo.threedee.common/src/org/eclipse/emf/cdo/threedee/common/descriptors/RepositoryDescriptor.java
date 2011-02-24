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

import org.eclipse.net4j.util.factory.ProductCreationException;

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
    Object[] elements = repository.getElements();
    for (Object target : elements)
    {
      Element targetElement = provider.getElement(target);
      if (targetElement != null)
      {
        references.add(targetElement);
      }
    }
  }

  @Override
  public String getLabel(Element element)
  {
    return "Repository " + element.getAttributes().get("name");
  }

  /**
   * @author Eike Stepper
   */
  public static class Factory extends DescriptorFactory
  {
    public Factory()
    {
      super("org.eclipse.emf.cdo.internal.server.Repository$Default");
    }

    public Object create(String description) throws ProductCreationException
    {
      return new RepositoryDescriptor();
    }
  }
}
