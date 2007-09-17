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

import org.eclipse.net4j.util.ObjectUtil;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.util.ECFException;
import org.eclipse.ecf.provider.comm.ConnectionCreateException;
import org.eclipse.ecf.provider.comm.IConnectionListener;
import org.eclipse.ecf.provider.comm.ISynchAsynchConnection;
import org.eclipse.ecf.provider.generic.ClientSOContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public abstract class AbstractConnection implements ISynchAsynchConnection
{
  private ClientSOContainer soContainer;

  private ID targetID;

  private Object connectData;

  private Map<?, ?> properties;

  private List<IConnectionListener> listeners = new ArrayList<IConnectionListener>(0);

  private boolean connected;

  private boolean started;

  public AbstractConnection(ClientSOContainer soContainer, ID targetID, Object connectData)
      throws ConnectionCreateException
  {
    if (soContainer == null)
    {
      throw new ConnectionCreateException("soContainer can't be null");
    }

    if (targetID == null)
    {
      throw new ConnectionCreateException("targetID can't be null");
    }

    this.soContainer = soContainer;
    this.targetID = targetID;
    this.connectData = connectData;
  }

  public ClientSOContainer getSOContainer()
  {
    return soContainer;
  }

  public ID getLocalID()
  {
    return soContainer.getID();
  }

  public ID getTargetID()
  {
    return targetID;
  }

  public Object getConnectData()
  {
    return connectData;
  }

  public synchronized Map<?, ?> getProperties()
  {
    if (properties == null)
    {
      properties = new HashMap<Object, Object>();
    }

    return properties;
  }

  public void addListener(IConnectionListener listener)
  {
    synchronized (listeners)
    {
      if (!listeners.contains(listener))
      {
        listeners.add(listener);
      }
    }
  }

  public void removeListener(IConnectionListener listener)
  {
    synchronized (listeners)
    {
      listeners.remove(listener);
    }
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return null;
  }

  public boolean isConnected()
  {
    return connected;
  }

  public synchronized Object connect(ID targetID, Object connectData, int timeout) throws ECFException
  {
    if (!ObjectUtil.equals(targetID, this.targetID))
    {
      throw new IllegalStateException("targetID mismatch");
    }

    if (!ObjectUtil.equals(connectData, this.connectData))
    {
      throw new IllegalStateException("connectData mismatch");
    }

    if (!connected)
    {
      Object result = doConnect(timeout);
      connected = true;
      start();
      return result;
    }

    return null;
  }

  public synchronized void disconnect()
  {
    if (connected)
    {
      stop();
      doDisconnect();
      connected = false;
    }
  }

  public boolean isStarted()
  {
    return started;
  }

  public synchronized void start()
  {
    if (!started)
    {
      if (!connected)
      {
        throw new IllegalStateException("not connected");
      }

      doStart();
      started = true;
    }
  }

  public synchronized void stop()
  {
    if (started)
    {
      doStop();
      started = false;
    }
  }

  protected abstract Object doConnect(int timeout);

  protected abstract void doDisconnect();

  protected void doStart()
  {
  }

  protected void doStop()
  {
  }
}
