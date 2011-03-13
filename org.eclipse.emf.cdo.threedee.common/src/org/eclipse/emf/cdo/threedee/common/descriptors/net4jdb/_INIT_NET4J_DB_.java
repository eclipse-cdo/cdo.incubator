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

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_NET4J_DB_
{
  public static void init(Registry registry)
  {
    Color color = Color.cyan;
    registry.register(new Net4jDBDescriptor(), color, 1f);
    registry.register(new DBAdapterDescriptor(), color, 1f);
    registry.register(new DBSchemaDescriptor(), color, 1f);

    registry.register(new DBTableDescriptor(), color, 0.8f);

    registry.register(new DBFieldDescriptor(), color, 0.6f);
    registry.register(new DBIndexDescriptor(), color, 0.6f);
  }
}
