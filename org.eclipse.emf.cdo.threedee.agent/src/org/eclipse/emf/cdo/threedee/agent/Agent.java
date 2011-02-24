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

import org.eclipse.emf.cdo.threedee.common.Observer;
import org.eclipse.emf.cdo.threedee.common.ObserverEvent;
import org.eclipse.emf.cdo.threedee.common.ObserverEvent.Call.When;

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.concurrent.QueueWorker;
import org.eclipse.net4j.util.container.IPluginContainer;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Eike Stepper
 */
public class Agent extends QueueWorker<ObserverEvent>
{
  public static final Agent INSTANCE = new Agent();

  private String server;

  private AgentProtocol protocol;

  private int id;

  private Map<Object, Observer> observers = new WeakHashMap<Object, Observer>();

  private Agent()
  {
  }

  public String getServer()
  {
    return server;
  }

  public void setServer(String server)
  {
    this.server = server;
  }

  public AgentProtocol getProtocol()
  {
    return protocol;
  }

  public int getID()
  {
    return id;
  }

  public Observer getObserver(Object observable)
  {
    Observer observer;
    synchronized (observers)
    {
      observer = observers.get(observable);
      if (observer == null)
      {
        observer = createObserver(observable);
        observers.put(observable, observer);
        addWork(new ObserverEvent.Creation(observer));
      }
    }

    return observer;
  }

  private Observer createObserver(Object observable)
  {
    return new Observer(observable);
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    ITCPConnector connector = TCPUtil.getConnector(IPluginContainer.INSTANCE, server);
    protocol = new AgentProtocol(this, connector);
    id = protocol.openSession();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    protocol.close();
    super.doDeactivate();
  }

  @Override
  protected void work(WorkContext context, ObserverEvent event)
  {
    protocol.sendEvent(event);
  }

  public void beforeCall(Object sourceObservable, Object targetObservable)
  {
    call(sourceObservable, targetObservable, When.BEFORE);
  }

  public void afterCall(Object sourceObservable, Object targetObservable)
  {
    call(sourceObservable, targetObservable, When.AFTER);
  }

  private void call(Object sourceObservable, Object targetObservable, When when)
  {
    Observer sourceObserver = getObserver(sourceObservable);
    if (sourceObserver == null)
    {
      return;
    }

    Observer targetObserver = getObserver(targetObservable);
    if (targetObserver == null)
    {
      return;
    }

    addWork(new ObserverEvent.Call(sourceObserver, targetObserver, when));
  }
}
