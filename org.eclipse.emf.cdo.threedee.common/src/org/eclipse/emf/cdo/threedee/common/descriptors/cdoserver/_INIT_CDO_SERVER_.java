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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdoserver;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_CDO_SERVER_
{
  public static void init(Registry registry)
  {
    Color color = Color.blue;
    registry.register(new CDOServerDescriptor(), color, 0.7f);
    registry.register(new ClassMappingDescriptor(), color, 0.7f);
    registry.register(new DBStoreDescriptor(), color, 0.7f);
    registry.register(new IDHandlerDescriptor(), color, 0.7f);
    registry.register(new MappingStrategyDescriptor(), color, 0.7f);
    registry.register(new MetaDataManagerDescriptor(), color, 0.7f);
    registry.register(new TypeMappingDescriptor(), color, 0.7f);
    registry.register(new RepositoryDescriptor(), color, 0.7f);
    registry.register(new SessionDescriptor(), color, 0.7f);
    registry.register(new SessionManagerDescriptor(), color, 0.7f);
    registry.register(new StoreDescriptor(), color, 0.7f);
    registry.register(new TransactionDescriptor(), color, 0.7f);
    registry.register(new ViewDescriptor(), color, 0.7f);
  }
}
