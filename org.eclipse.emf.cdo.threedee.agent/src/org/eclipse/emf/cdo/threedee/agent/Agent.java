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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.concurrent.QueueWorker;
import org.eclipse.net4j.util.container.IPluginContainer;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Eike Stepper
 */
public class Agent extends QueueWorker<ElementEvent> implements ElementProvider
{
  public static final Agent INSTANCE = new Agent();

  private String server;

  private AgentProtocol protocol;

  private int id;

  private Map<Object, Element> elements = new WeakHashMap<Object, Element>();

  private int lastEelementID;

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

  public Element getElement(Object object)
  {
    Element element;
    synchronized (elements)
    {
      element = elements.get(object);
      if (element == null)
      {
        ElementDescriptor descriptor = ElementDescriptor.get(object.getClass().getName());
        if (descriptor == null)
        {
          return null;
        }

        element = new Element(++lastEelementID, descriptor);
        elements.put(object, element);
        descriptor.initElement(object, element, this);

        addWork(new ElementEvent.Creation(element));
      }
    }

    return element;
  }

  public Element getElement(int id)
  {
    // TODO: implement Agent.getElement(id)
    throw new UnsupportedOperationException();
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
  protected void work(WorkContext context, ElementEvent event)
  {
    protocol.sendEvent(event);
  }

  public void beforeCall(Object source, Object target)
  {
    call(source, target, When.BEFORE);
  }

  public void afterCall(Object source, Object target)
  {
    call(source, target, When.AFTER);
  }

  private void call(Object sourceObject, Object targetObject, When when)
  {
    Element sourceElement = getElement(sourceObject);
    if (sourceElement == null)
    {
      return;
    }

    Element targetElement = getElement(targetObject);
    if (targetElement == null)
    {
      return;
    }

    addWork(new ElementEvent.Call(sourceElement, targetElement, when));
  }
}
