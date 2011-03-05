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

import org.eclipse.emf.cdo.server.db.mapping.IClassMapping;
import org.eclipse.emf.cdo.threedee.common.Element;

/**
 * @author Eike Stepper
 */
public class ClassMappingDescriptor extends CDOServerDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return IClassMapping.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    IClassMapping classMapping = (IClassMapping)object;
    element.setKeyAttribute(classMapping.getEClass().getName());
    element.addReference(false, classMapping.getEClass());
    element.addReference(false, classMapping.getDBTables());
    element.addReference(true, classMapping.getValueMappings());
    element.addReference(true, classMapping.getListMappings());
  }
}
