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
package org.eclipse.emf.cdo.threedee.common.descriptors.net4jdb;

import org.eclipse.emf.cdo.threedee.common.Element;

import org.eclipse.net4j.db.ddl.IDBSchema;

/**
 * @author Eike Stepper
 */
public class DBSchemaDescriptor extends Net4jDBDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return IDBSchema.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    IDBSchema schema = (IDBSchema)object;
    element.setNameAttribute(schema.getName());
    element.addReferences(true, schema.getTables());
  }
}
