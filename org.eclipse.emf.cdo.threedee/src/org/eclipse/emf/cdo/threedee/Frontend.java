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

  private ITCPAcceptor acceptor;

  private Map<Integer, Session> sessions = new HashMap<Integer, Session>();

  private Map<String, Element> connectors = new HashMap<String, Element>();

  private int lastSessionID;

  private Frontend()
  {
  }

  @Override
  public boolean isEmpty()
  {
    synchronized (sessions)
    {
      return sessions.isEmpty();
    }
  }

  public Session[] getElements()
  {
    synchronized (sessions)
    {
      return sessions.values().toArray(new Session[sessions.size()]);
    }
  }

  public void putConnector(String local, Element connector)
  {
    synchronized (connectors)
    {
      connectors.put(local, connector);
    }
  }

  public Element getConnector(String local)
  {
    synchronized (connectors)
    {
      return connectors.get(local);
    }
  }

  public synchronized Session openSession(FrontendProtocol protocol, String name)
  {
    int id = ++lastSessionID;
    final Session session = new Session(protocol, name, id);
    session.activate();

    protocol.addListener(new LifecycleEventAdapter()
    {
      @Override
      protected void onDeactivated(ILifecycle lifecycle)
      {
        int id = session.getID();
        synchronized (connectors)
        {
          for (Iterator<Entry<String, Element>> it = connectors.entrySet().iterator(); it.hasNext();)
          {
            Entry<String, Element> entry = it.next();
            Element connector = entry.getValue();
            if (connector.getProvider().getID() == id)
            {
              it.remove();
            }
          }
        }

        synchronized (sessions)
        {
          sessions.remove(id);
        }

        session.deactivate();
        fireElementRemovedEvent(session);
      }
    });

    synchronized (sessions)
    {
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
    acceptor = TCPUtil.getAcceptor(IPluginContainer.INSTANCE, "0.0.0.0:" + ThreeDeeProtocol.PROTOCOL_PORT);
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
