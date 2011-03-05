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

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

/**
 * @author Eike Stepper
 */
public class _INIT_NET4J_DB_
{
  public static void init(Registry registry)
  {
    registry.register(new Net4jDBDescriptor());
    registry.register(new DBAdapterDescriptor());
    registry.register(new DBFieldDescriptor());
    registry.register(new DBIndexDescriptor());
    registry.register(new DBSchemaDescriptor());
    registry.register(new DBTableDescriptor());
  }
}
