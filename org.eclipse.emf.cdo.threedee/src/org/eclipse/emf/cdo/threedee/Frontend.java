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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ThreeDeeProtocol;

import org.eclipse.net4j.tcp.ITCPAcceptor;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Eike Stepper
 */
public class Frontend extends Container<Session>
{
  public static final Frontend INSTANCE = new Frontend();

  // private static final Element FAKE_RECEIVER = new Element(-1, null, null);

  private ITCPAcceptor acceptor;

  private Map<Integer, Session> sessions = new HashMap<Integer, Session>();

  private Map<String, Element> connectors = new HashMap<String, Element>();

  // private Map<Element, Element> deferredTransmissions = new HashMap<Element, Element>();

  private int lastSessionID;

  private Frontend()
  {
  }

  @Override
  public synchronized boolean isEmpty()
  {
    return sessions.isEmpty();
  }

  public synchronized Session[] getElements()
  {
    return sessions.values().toArray(new Session[sessions.size()]);
  }

  public synchronized void putConnector(String local, Element connector)
  {
    connectors.put(local, connector);
  }

  public synchronized Element getConnector(String local)
  {
    return connectors.get(local);
  }

  // public synchronized void putDeferredTransmission(Element transmitter, Element receiver)
  // {
  // // if (!deferredTransmissions.containsKey(transmitter))
  // {
  // deferredTransmissions.put(transmitter, receiver);
  // }
  // }
  //
  // public synchronized Element getDeferredTransmission(Element transmitter)
  // {
  // Element old = deferredTransmissions.put(transmitter, FAKE_RECEIVER);
  // if (old != FAKE_RECEIVER)
  // {
  // return old;
  // }
  //
  // return null;
  // }

  public Session openSession(final FrontendProtocol protocol, String name)
  {
    Session session;
    synchronized (INSTANCE)
    {
      int id = ++lastSessionID;
      session = new Session(protocol, name, id);
      session.activate();

      protocol.addListener(new LifecycleEventAdapter()
      {
        @Override
        protected void onDeactivated(ILifecycle lifecycle)
        {
          Session session = protocol.getInfraStructure();
          synchronized (INSTANCE)
          {
            int id = session.getID();
            for (Iterator<Entry<String, Element>> it = connectors.entrySet().iterator(); it.hasNext();)
            {
              Entry<String, Element> entry = it.next();
              Element connector = entry.getValue();
              if (connector.getProvider().getID() == id)
              {
                it.remove();
              }
            }

            sessions.remove(id);
            session.deactivate();
          }

          fireElementRemovedEvent(session);
        }
      });

      sessions.put(id, session);
    }

    fireElementAddedEvent(session);
    return session;
  }

  @Override
  public String toString()
  {
    return "Frontend";
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();

    new Thread("AcceptorStarter")
    {
      @Override
      public void run()
      {
        ConcurrencyUtil.sleep(3000);
        acceptor = TCPUtil.getAcceptor(IPluginContainer.INSTANCE, "0.0.0.0:" + ThreeDeeProtocol.PROTOCOL_PORT);
      }
    }.start();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    if (acceptor != null)
    {
      acceptor.close();
      acceptor = null;
    }

    super.doDeactivate();
  }
}
