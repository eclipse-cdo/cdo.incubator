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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdo.db;

import org.eclipse.emf.cdo.server.db.mapping.ITypeMapping;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

/**
 * @author Eike Stepper
 */
public class TypeMappingDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return ITypeMapping.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    ITypeMapping typeMapping = (ITypeMapping)object;
    element.setKeyAttribute(typeMapping.getFeature().getName());
    element.setAttribute("dbType", typeMapping.getDBType());
    element.addReference(false, typeMapping.getFeature());
    element.addReference(false, typeMapping.getField());
  }
}
