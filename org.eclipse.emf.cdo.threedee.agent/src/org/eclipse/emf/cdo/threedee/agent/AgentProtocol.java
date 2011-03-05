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

import org.eclipse.emf.cdo.threedee.agent.bundle.OM;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ThreeDeeProtocol;

import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.signal.RequestWithConfirmation;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Eike Stepper
 */
public class AgentProtocol extends SignalProtocol<Agent> implements ThreeDeeProtocol
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG_EVENT_SEND, AgentProtocol.class);

  private AtomicInteger sequenceNumber = new AtomicInteger();

  public AgentProtocol(Agent agent, IConnector connector)
  {
    super(PROTOCOL_NAME);
    setInfraStructure(agent);
    open(connector);
  }

  public int openSession(final String name)
  {
    try
    {
      return new RequestWithConfirmation<Integer>(this, SIGNAL_OPEN_SESSION, "SIGNAL_OPEN_SESSION")
      {
        @Override
        protected void requesting(ExtendedDataOutputStream out) throws Exception
        {
          out.writeString(name);
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

  public void sendEvent(final ElementEvent event)
  {
    try
    {
      new Request(this, SIGNAL_SEND_EVENT, "SIGNAL_SEND_EVENT")
      {
        @Override
        protected void requesting(ExtendedDataOutputStream out) throws Exception
        {
          int agentSequenceNumber = sequenceNumber.incrementAndGet();
          if (TRACER.isEnabled())
          {
            TRACER.trace("Send event " + agentSequenceNumber + ": " + event);
          }

          out.writeInt(agentSequenceNumber);
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
