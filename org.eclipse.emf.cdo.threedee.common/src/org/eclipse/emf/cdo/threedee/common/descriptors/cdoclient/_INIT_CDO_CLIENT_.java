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

/**
 * @author Eike Stepper
 */
public class _INIT_CDO_CLIENT_
{
  public static void init(Registry registry)
  {
    registry.register(new CDOClientDescriptor());
    registry.register(new CDOObjectDescriptor());
    registry.register(new CDOSavepointDescriptor());
    registry.register(new CDOSessionDescriptor());
    registry.register(new CDOTransactionDescriptor());
    registry.register(new CDOViewDescriptor());
  }
}
