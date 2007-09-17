/***************************************************************************
 * Copyright (c) 2004 - 2007 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.ecf.provider.internal.net4j;

import org.eclipse.net4j.IChannel;
import org.eclipse.net4j.IConnector;
import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.provider.comm.ConnectionCreateException;
import org.eclipse.ecf.provider.internal.net4j.protocol.ConnectRequest;
import org.eclipse.ecf.provider.net4j.container.Net4jClientSOContainer;
import org.eclipse.ecf.provider.net4j.identity.Net4jID;
import org.eclipse.internal.net4j.ConnectorFactory;

import java.io.IOException;

/**
 * @author Eike Stepper
 */
public class Net4jConnection extends AbstractConnection
{
  private IChannel channel;

  public Net4jConnection(Net4jClientSOContainer soContainer, Net4jID targetID, Object data)
      throws ConnectionCreateException
  {
    super(soContainer, targetID, data);
  }

  @Override
  public Net4jClientSOContainer getSOContainer()
  {
    return (Net4jClientSOContainer)super.getSOContainer();
  }

  public IChannel getChannel()
  {
    return channel;
  }

  @Override
  public Net4jID getTargetID()
  {
    return (Net4jID)super.getTargetID();
  }

  public void sendAsynch(ID receiver, byte[] data) throws IOException
  {
    // TODO Implement method Net4jConnection.sendAsynch()
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public Object sendSynch(ID receiver, byte[] data) throws IOException
  {
    // TODO Implement method Net4jConnection.sendSynch()
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  protected Object doConnect(int timeout)
  {
    Net4jID id = getTargetID();
    IConnector connector = getConnector(id.getConnectorType(), id.getConnectorDescription());
    channel = connector.openChannel("ecf", this);
    new ConnectRequest(channel, "");
    return null;
  }

  @Override
  protected void doDisconnect()
  {
    channel.close();
  }

  protected IConnector getConnector(String type, String description)
  {
    IManagedContainer container = getSOContainer().getNet4jContainer();
    return (IConnector)container.getElement(ConnectorFactory.PRODUCT_GROUP, type, description);
  }
}
