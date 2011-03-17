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
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.common.ThreeDeeProtocol;

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;
import org.eclipse.net4j.util.concurrent.QueueWorker;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.net4j.util.lifecycle.LifecycleState;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Agent extends QueueWorker<ElementEvent> implements ElementProvider
{
  public static final Agent INSTANCE = new Agent();

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG_EVENT, Agent.class);

  private String name;

  private String server;

  private boolean connected;

  private AgentProtocol protocol;

  private int id;

  private int lastElementID;

  private Map<Object, Element> elements = new IdentityHashMap<Object, Element>();

  private Agent()
  {
    setActivationTimeout(60 * 1000);
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
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

  public Element getElement(int id)
  {
    return null;
  }

  public Element getElement(Object object, boolean addOnDemand)
  {
    synchronized (elements)
    {
      Element element = elements.get(object);
      if (element == null && addOnDemand)
      {
        element = addElement(object, false);
      }

      return element;
    }
  }

  private Element addElement(Object object, boolean root)
  {
    ElementDescriptor descriptor = ElementDescriptor.Registry.INSTANCE.match(object);
    if (descriptor == null)
    {
      return null;
    }

    if (!descriptor.isActive(object))
    {
      return null;
    }

    Element element = new Element(++lastElementID, descriptor, this);
    descriptor.initElement(object, element);

    synchronized (elements)
    {
      elements.put(object, element);
    }

    addWork(new ElementEvent.Create(element, root));
    return element;
  }

  @SuppressWarnings("unused")
  private void removeElement(Object object)
  {
    Element element;
    synchronized (elements)
    {
      element = elements.remove(object);
    }

    if (element != null)
    {
      addWork(new ElementEvent.Remove(element.getID()));
    }
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    connect();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    protocol.close();
    super.doDeactivate();
  }

  protected void connect()
  {
    Thread thread = new ConnectThread();
    thread.start();
  }

  protected void reconnect()
  {
    connected = false;
    lastElementID = 0;
    elements.clear();
    protocol = null;

    if (TRACER.isEnabled())
    {
      TRACER.trace("Disconnected from frontend"); //$NON-NLS-1$
    }

    connect();
  }

  @Override
  protected void work(WorkContext context, ElementEvent event)
  {
    while (!connected)
    {
      ConcurrencyUtil.sleep(100L);
    }

    protocol.sendEvent(event);
  }

  public void beforeCall(Object source, Object target, String what)
  {
    called(source, target, what, When.BEFORE);
  }

  public void afterCall(Object source, Object target, String what)
  {
    called(source, target, what, When.AFTER);
  }

  @SuppressWarnings("restriction")
  private void called(Object sourceObject, Object targetObject, String what, When when)
  {
    if (ElementDescriptor.INITIALIZING_ELEMENT.get())
    {
      return;
    }

    try
    {
      Element targetElement = getElement(targetObject, false);
      if (targetElement == null)
      {
        return;
      }

      ElementDescriptor descriptor = targetElement.getDescriptor();

      Element sourceElement = getElement(sourceObject, false);
      if (sourceElement != null && sourceElement != targetElement)
      {
        ElementEvent event = descriptor.createCallEvent(sourceElement, targetElement, what, when);
        if (event != null)
        {
          if (TRACER.isEnabled())
          {
            TRACER.trace(event.toString());
          }

          addWork(event);
        }
      }

      if (when == When.BEFORE)
      {
        if (targetObject instanceof org.eclipse.net4j.internal.tcp.TCPConnector && "handleWrite".equals(what))
        {
          ElementEvent event = descriptor.createTransmitEvent(targetElement);
          if (event != null)
          {
            if (TRACER.isEnabled())
            {
              TRACER.trace(event.toString());
            }

            addWork(event);
          }
        }
      }
      else
      {
        Pair<Change, Element> pair = descriptor.createChangeEvent(targetElement, targetObject);
        if (pair != null)
        {
          ElementEvent event = pair.getElement1();
          Element newElement = pair.getElement2();

          if (TRACER.isEnabled())
          {
            TRACER.trace(event.toString());
          }

          synchronized (elements)
          {
            elements.put(targetObject, newElement);
          }

          addWork(event);
        }
      }
    }
    catch (Exception ex)
    {
      if (TRACER.isEnabled())
      {
        String message = ex.getMessage();
        if (!"null".equals(message))
        {
          TRACER.trace(message);
        }
      }
    }
  }

  public static void start(String name)
  {
    String property = OMPlatform.INSTANCE.getProperty("org.eclipse.emf.cdo.threedee.agent.name");
    if (property != null)
    {
      name = property;
    }

    INSTANCE.setName(name);
    INSTANCE.setServer("localhost:" + ThreeDeeProtocol.PROTOCOL_PORT);
    INSTANCE.activate();
  }

  /**
   * @author Eike Stepper
   */
  private final class ConnectThread extends Thread
  {
    @Override
    public void run()
    {
      IManagedContainer container = IPluginContainer.INSTANCE;
      while (isActive() || getLifecycleState() == LifecycleState.ACTIVATING)
      {
        ITCPConnector connector = null;

        try
        {
          connector = TCPUtil.getConnector(container, server);
          connector.waitForConnection(500L);

          protocol = new AgentProtocol(Agent.this, connector);
          protocol.addListener(new LifecycleEventAdapter()
          {
            @Override
            protected void onDeactivated(ILifecycle lifecycle)
            {
              reconnect();
            }
          });

          id = protocol.openSession(name);
          if (TRACER.isEnabled())
          {
            TRACER.format("Connected to frontend as agent {0}", id); //$NON-NLS-1$
          }

          addElement(container, true);
          connected = true;
          break;
        }
        catch (Exception ex)
        {
          if (connector != null)
          {
            try
            {
              String[] key = container.getElementKey(connector);
              if (key != null)
              {
                container.removeElement(key[0], key[1], key[2]);
              }
            }
            catch (Exception ignore)
            {
              System.out.println(ignore.getMessage());
            }
          }
        }
      }
    }
  }
}
