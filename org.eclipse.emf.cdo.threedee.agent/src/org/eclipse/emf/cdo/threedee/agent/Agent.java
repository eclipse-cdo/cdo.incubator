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

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.concurrent.QueueWorker;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
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

  private String server;

  private AgentProtocol protocol;

  private int id;

  private Map<Object, Element> elements = new IdentityHashMap<Object, Element>();

  private int lastElementID;

  private Agent()
  {
    setActivationTimeout(60 * 1000);
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

    IManagedContainer container = IPluginContainer.INSTANCE;
    ITCPConnector connector = TCPUtil.getConnector(container, server);
    protocol = new AgentProtocol(this, connector);
    id = protocol.openSession();

    addElement(container, true);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    protocol.close();
    super.doDeactivate();
  }

  @Override
  protected void work(WorkContext context, ElementEvent event)
  {
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

  private void called(Object sourceObject, Object targetObject, String what, When when)
  {
    Element targetElement = getElement(targetObject, false);
    if (targetElement == null)
    {
      return;
    }

    ElementDescriptor descriptor = targetElement.getDescriptor();

    Element sourceElement = getElement(sourceObject, false);
    if (sourceElement != null /* && sourceElement != targetElement */)
    {
      ElementEvent.Call event = descriptor.createCallEvent(sourceElement, targetElement, what, when);
      if (event != null)
      {
        if (TRACER.isEnabled())
        {
          TRACER.trace(event.toString());
        }

        addWork(event);
      }
    }

    if (when == When.AFTER)
    {
      Pair<Change, Element> pair = descriptor.createChangeEvent(targetElement, targetObject);
      if (pair != null)
      {
        ElementEvent.Change event = pair.getElement1();
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
}
