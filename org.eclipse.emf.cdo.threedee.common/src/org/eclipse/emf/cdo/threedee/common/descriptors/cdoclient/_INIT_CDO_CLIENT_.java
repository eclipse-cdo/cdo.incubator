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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdoclient;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_CDO_CLIENT_
{
  public static void init(Registry registry)
  {
    Color color = Color.red;
    registry.register(new CDOClientDescriptor(), color, 1f);

    registry.register(new CDOSessionDescriptor(), color, 0.9f);

    registry.register(new CDOViewDescriptor(), color, 0.8f);
    registry.register(new CDOTransactionDescriptor(), color, 0.8f);
    registry.register(new CDOSavepointDescriptor(), color, 0.8f);
    registry.register(new CDOObjectDescriptor(), color, 0.7f);
  }
}
