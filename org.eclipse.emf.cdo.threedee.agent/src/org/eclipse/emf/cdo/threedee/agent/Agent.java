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
package org.eclipse.emf.cdo.threedee.agent;

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;

/**
 * @author Eike Stepper
 */
public class Agent
{
  private AgentProtocol protocol;

  private int id;

  public Agent(String server)
  {
    ITCPConnector connector = TCPUtil.getConnector(IPluginContainer.INSTANCE, server);
    protocol = new AgentProtocol(this, connector);
    id = protocol.openSession();
  }

  public AgentProtocol getProtocol()
  {
    return protocol;
  }

  public int getID()
  {
    return id;
  }

  public void close()
  {
    protocol.close();
  }
}
