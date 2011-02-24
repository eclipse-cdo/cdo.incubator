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
package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.common.ThreeDeeProtocol;

import org.eclipse.net4j.signal.IndicationWithResponse;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import org.eclipse.spi.net4j.ServerProtocolFactory;

/**
 * @author Eike Stepper
 */
public class ServerProtocol extends SignalProtocol<Session> implements ThreeDeeProtocol
{
  public ServerProtocol()
  {
    super(PROTOCOL_NAME);
  }

  @Override
  protected SignalReactor createSignalReactor(short signalID)
  {
    switch (signalID)
    {
    case SIGNAL_OPEN_SESSION:
      return new IndicationWithResponse(this, SIGNAL_OPEN_SESSION)
      {
        private int id;

        @Override
        protected void indicating(ExtendedDataInputStream in) throws Exception
        {
          Session session = Server.INSTANCE.openSession(ServerProtocol.this);
          setInfraStructure(session);
          id = session.getID();
        }

        @Override
        protected void responding(ExtendedDataOutputStream out) throws Exception
        {
          out.writeInt(id);
        }
      };

    default:
      return super.createSignalReactor(signalID);
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Factory extends ServerProtocolFactory
  {
    public Factory()
    {
      super(PROTOCOL_NAME);
    }

    public ServerProtocol create(String description)
    {
      return new ServerProtocol();
    }
  }
}
