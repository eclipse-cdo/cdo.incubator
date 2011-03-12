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

import org.eclipse.net4j.db.IDBAdapter;

/**
 * @author Eike Stepper
 */
public class DBAdapterDescriptor extends Net4jDBDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return IDBAdapter.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    IDBAdapter adapter = (IDBAdapter)object;
    element.setNameAttribute(adapter.getName());
    element.setAttribute("version", adapter.getVersion());
    element.setAttribute("maxTableNameLength", adapter.getMaxTableNameLength());
    element.setAttribute("maxFieldNameLength", adapter.getMaxFieldNameLength());
  }
}
