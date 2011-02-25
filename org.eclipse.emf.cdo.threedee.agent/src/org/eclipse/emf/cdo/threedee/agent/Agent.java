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
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.concurrent.QueueWorker;
import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.event.EventUtil;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Agent extends QueueWorker<ElementEvent> implements ElementProvider
{
  public static final Agent INSTANCE = new Agent();

  private String server;

  private AgentProtocol protocol;

  private int id;

  private Map<Object, Element> elements = new IdentityHashMap<Object, Element>();

  private int lastElementID;

  private ContainerEventAdapter<Object> elementListener = new ContainerEventAdapter<Object>()
  {
    @Override
    protected void onAdded(IContainer<Object> container, Object object)
    {
      Element containerElement = getElement(object);
      if (containerElement != null)
      {
        Element objectElement = addElement(object);
        if (objectElement != null)
        {
          containerElement.getReferences().put(objectElement.getID(), true);
        }
      }

      EventUtil.addListener(object, elementListener);
    }

    @Override
    protected void onRemoved(IContainer<Object> container, Object object)
    {
      EventUtil.removeListener(object, elementListener);
      removeElement(object);
    }
  };

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

  public Element getElement(int id)
  {
    // TODO: implement Agent.getElement(id)
    throw new UnsupportedOperationException();
  }

  public Element getElement(Object object)
  {
    synchronized (elements)
    {
      return elements.get(object);
    }
  }

  private Element addElement(Object object)
  {
    ElementDescriptor descriptor = ElementDescriptor.Registry.INSTANCE.match(object);
    if (descriptor == null)
    {
      return null;
    }

    Element element = new Element(++lastElementID, descriptor, this);
    descriptor.initElement(object, element);

    synchronized (elements)
    {
      elements.put(object, element);
    }

    addWork(new ElementEvent.Creation(element));
    return element;
  }

  private void removeElement(Object object)
  {
    Element element;
    synchronized (elements)
    {
      element = elements.remove(object);
    }

    if (element != null)
    {
      addWork(new ElementEvent.Removal(element.getID()));
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

    addElement(container);
    // container.addListener(elementListener);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    // IPluginContainer.INSTANCE.removeListener(elementListener);
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
    called(source, target, When.BEFORE);
  }

  public void afterCall(Object source, Object target)
  {
    called(source, target, When.AFTER);
  }

  private void called(Object sourceObject, Object targetObject, When when)
  {
    System.err.println(when.toString() + ": " + (sourceObject == null ? "" : sourceObject.getClass().getName())
        + " --> " + targetObject.getClass().getName());

    Element targetElement = getElement(targetObject);
    if (targetElement == null)
    {
      return;
    }

    Element sourceElement = getElement(sourceObject);
    if (sourceElement != null && sourceElement != targetElement)
    {
      ElementEvent.Call event = targetElement.getDescriptor().createCallEvent(sourceElement, targetElement, when);
      if (event != null)
      {
        addWork(event);
      }
    }

    if (when == When.AFTER)
    {
      Pair<Change, Element> pair = targetElement.getDescriptor().createChangeEvent(targetElement, targetObject);
      if (pair != null)
      {
        ElementEvent.Change event = pair.getElement1();
        Element newElement = pair.getElement2();

        synchronized (elements)
        {
          elements.put(targetObject, newElement);
        }

        addWork(event);
      }
    }
  }
}
