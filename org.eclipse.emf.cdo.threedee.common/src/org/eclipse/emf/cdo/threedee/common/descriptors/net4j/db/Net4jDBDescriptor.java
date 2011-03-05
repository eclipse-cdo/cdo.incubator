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
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.Net4jDescriptor;

/**
 * @author Eike Stepper
 */
public class Net4jDBDescriptor extends Net4jDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return FOLDER_TYPE;
  }

  @Override
  public void initElement(Object object, Element element)
  {
  }

  @Override
  public String getLabel()
  {
    return getClass() != Net4jDBDescriptor.class ? getBaseLabel() : "DB";
  }
}