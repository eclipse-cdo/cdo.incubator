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

import org.eclipse.emf.cdo.server.db.mapping.IClassMapping;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.emf.ecore.EClass;

import java.util.Map;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class MappingStrategyDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return org.eclipse.emf.cdo.server.internal.db.mapping.AbstractMappingStrategy.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    org.eclipse.emf.cdo.server.internal.db.mapping.AbstractMappingStrategy mappingStrategy //
    = (org.eclipse.emf.cdo.server.internal.db.mapping.AbstractMappingStrategy)object;
    element.setAttributes(mappingStrategy.getProperties());

    Map<EClass, IClassMapping> classMappings = mappingStrategy.getClassMappings(false);
    element.addReference(true, classMappings.values());
  }
}
