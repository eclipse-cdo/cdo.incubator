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

import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ThreeDeeProtocol;

import org.eclipse.net4j.signal.Indication;
import org.eclipse.net4j.signal.IndicationWithResponse;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import org.eclipse.spi.net4j.ServerProtocolFactory;

/**
 * @author Eike Stepper
 */
public class FrontendProtocol extends SignalProtocol<Session> implements ThreeDeeProtocol
{
  public FrontendProtocol()
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
          Session session = Frontend.INSTANCE.openSession(FrontendProtocol.this);
          setInfraStructure(session);
          id = session.getID();
        }

        @Override
        protected void responding(ExtendedDataOutputStream out) throws Exception
        {
          out.writeInt(id);
        }
      };

    case SIGNAL_SEND_EVENT:
      return new Indication(this, SIGNAL_SEND_EVENT)
      {
        @Override
        protected void indicating(ExtendedDataInputStream in) throws Exception
        {
          Session session = getInfraStructure();
          int agentSequenceNumber = in.readInt();
          byte type = in.readByte();
          ElementEvent event = ElementEvent.read(in, session, type);
          session.handleEvent(agentSequenceNumber, event);
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

    public FrontendProtocol create(String description)
    {
      return new FrontendProtocol();
    }
  }
}
