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

import org.eclipse.net4j.db.ddl.IDBField;

/**
 * @author Eike Stepper
 */
public class DBFieldDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return IDBField.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    IDBField field = (IDBField)object;
    element.setNameAttribute(field.getName());
    element.setAttribute("type", field.getType());
    element.setAttribute("scale", field.getScale());
    element.setAttribute("precision", field.getPrecision());
  }
}
