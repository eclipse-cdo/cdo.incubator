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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import java.util.Map;

/**
 * @author Eike Stepper
 */
public class MapEntryDescriptor extends ElementDescriptor
{
  public static final String VALUE_ATTRIBUTE = "value";

  @Override
  public Class<?> getElementType()
  {
    return Map.Entry.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    Map.Entry<?, ?> mapEntry = (Map.Entry<?, ?>)object;
    element.setKeyAttribute(mapEntry.getKey());
    element.setAttribute(VALUE_ATTRIBUTE, mapEntry.getValue());
  }

  @Override
  public String getLabel(Element element)
  {
    Map<String, String> attributes = element.getAttributes();
    return attributes.get(Element.KEY_ATTRIBUTE) + " = " + attributes.get(VALUE_ATTRIBUTE);
  }
}
