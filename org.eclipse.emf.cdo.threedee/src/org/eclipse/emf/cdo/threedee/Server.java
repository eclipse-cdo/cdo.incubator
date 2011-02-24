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

import org.eclipse.emf.cdo.threedee.Server.Session;

import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Server extends Container<Session>
{
  public static final Server INSTANCE = new Server();

  private Map<Integer, Session> sessions = new HashMap<Integer, Session>();

  private int lastSessionID;

  private Server()
  {
  }

  public Session[] getElements()
  {
    synchronized (sessions)
    {
      return sessions.values().toArray(new Session[sessions.size()]);
    }
  }

  public Session openSession(ServerProtocol protocol)
  {
    int id = ++lastSessionID;
    final Session session = new Session(id, protocol);

    protocol.addListener(new LifecycleEventAdapter()
    {
      @Override
      protected void onDeactivated(ILifecycle lifecycle)
      {
        synchronized (sessions)
        {
          sessions.remove(session);
        }

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

  /**
   * @author Eike Stepper
   */
  public static class Session
  {
    private ServerProtocol protocol;

    private int id;

    public Session(int id, ServerProtocol protocol)
    {
      this.id = id;
      this.protocol = protocol;
    }

    public int getID()
    {
      return id;
    }

    public ServerProtocol getProtocol()
    {
      return protocol;
    }
  }
}
