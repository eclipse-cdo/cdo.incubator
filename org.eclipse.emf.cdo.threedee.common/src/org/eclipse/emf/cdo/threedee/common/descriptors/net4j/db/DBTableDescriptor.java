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
package org.eclipse.emf.cdo.threedee.common.descriptors.net4j.db;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.net4j.db.ddl.IDBTable;

/**
 * @author Eike Stepper
 */
public class DBTableDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return IDBTable.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    IDBTable table = (IDBTable)object;
    element.setNameAttribute(table.getName());
    element.addReference(true, table.getFields());
    element.addReference(true, table.getIndices());
  }
}
