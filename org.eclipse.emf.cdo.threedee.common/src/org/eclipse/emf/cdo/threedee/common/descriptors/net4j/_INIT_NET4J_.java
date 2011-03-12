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

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_NET4J_
{
  public static void init(Registry registry)
  {
    Color color = Color.green;
    registry.register(new Net4jDescriptor(), color, 0.7f);
    registry.register(new AcceptorDescriptor(), color, 0.7f);
    registry.register(new BufferDescriptor(), color, 0.7f);
    registry.register(new ChannelDescriptor(), color, 0.7f);
    registry.register(new ChannelMultiplexerDescriptor(), color, 0.7f);
    registry.register(new ConnectorDescriptor(), color, 0.7f);
    registry.register(new ProtocolDescriptor(), color, 0.7f);
    registry.register(new SocketChannelDescriptor(), color, 0.7f);
    registry.register(new TCPAcceptorDescriptor(), color, 0.7f);
    registry.register(new TCPConnectorDescriptor(), color, 0.7f);
    registry.register(new TCPSelectorDescriptor(), color, 0.7f);
  }
}
