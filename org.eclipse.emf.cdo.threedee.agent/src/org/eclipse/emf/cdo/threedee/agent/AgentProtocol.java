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

import org.eclipse.emf.cdo.threedee.common.ObserverEvent;
import org.eclipse.emf.cdo.threedee.common.ThreeDeeProtocol;

import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.signal.RequestWithConfirmation;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

/**
 * @author Eike Stepper
 */
public class AgentProtocol extends SignalProtocol<Agent> implements ThreeDeeProtocol
{
  public AgentProtocol(Agent agent, IConnector connector)
  {
    super(PROTOCOL_NAME);
    setInfraStructure(agent);
    open(connector);
  }

  public int openSession()
  {
    try
    {
      return new RequestWithConfirmation<Integer>(this, SIGNAL_OPEN_SESSION)
      {
        @Override
        protected void requesting(ExtendedDataOutputStream out) throws Exception
        {
        }

        @Override
        protected Integer confirming(ExtendedDataInputStream in) throws Exception
        {
          return in.readInt();
        }
      }.send(DEFAULT_TIMEOUT);
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  public void sendEvent(final ObserverEvent event)
  {
    try
    {
      new Request(this, SIGNAL_SEND_EVENT)
      {
        @Override
        protected void requesting(ExtendedDataOutputStream out) throws Exception
        {
          out.writeByte(event.getType());
          event.write(out);
        }
      }.sendAsync();
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  @Override
  protected SignalReactor createSignalReactor(short signalID)
  {
    switch (signalID)
    {
    default:
      return super.createSignalReactor(signalID);
    }
  }
}
