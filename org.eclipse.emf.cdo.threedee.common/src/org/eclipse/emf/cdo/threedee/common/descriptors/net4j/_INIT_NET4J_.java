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
package org.eclipse.emf.cdo.threedee.common.descriptors.net4j;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.db._INIT_NET4J_DB_;

/**
 * @author Eike Stepper
 */
public class _INIT_NET4J_
{
  public static void init(Registry registry)
  {
    _INIT_NET4J_DB_.init(registry);

    registry.register(new AcceptorDescriptor());
    registry.register(new ChannelDescriptor());
    registry.register(new ChannelMultiplexerDescriptor());
    registry.register(new ConnectorDescriptor());
    registry.register(new ProtocolDescriptor());
    registry.register(new TCPAcceptorDescriptor());
    registry.register(new TCPConnectorDescriptor());
    registry.register(new TCPSelectorDescriptor());
  }
}
