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

import org.eclipse.net4j.db.ddl.IDBIndex;

/**
 * @author Eike Stepper
 */
public class DBIndexDescriptor extends Net4jDBDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return IDBIndex.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    IDBIndex index = (IDBIndex)object;
    element.setNameAttribute(index.getName());
    element.setAttribute("type", index.getType());
    element.addReferences(false, index.getFields());
  }
}
