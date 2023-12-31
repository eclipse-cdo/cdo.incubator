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

import org.eclipse.emf.cdo.threedee.bundle.OM;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Create;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Transmit;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;

import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Session extends Container<Element> implements ElementProvider
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG_EVENT_HANDLE, Session.class);

  private FrontendProtocol protocol;

  private int id;

  private String name;

  private int sequenceNumber;

  private Map<Integer, ElementEvent> outOfSequence = new HashMap<Integer, ElementEvent>();

  private Map<Integer, Element> cache = new HashMap<Integer, Element>();

  private Element[] elements = {};

  private Element rootElement;

  public Session(FrontendProtocol protocol, String name, int id)
  {
    this.id = id;
    this.name = name;
    this.protocol = protocol;

    protocol.addListener(new LifecycleEventAdapter()
    {
      @Override
      protected void onDeactivated(ILifecycle lifecycle)
      {
        if (rootElement != null)
        {
          fireElementRemovedEvent(rootElement);
        }
      }
    });
  }

  public FrontendProtocol getProtocol()
  {
    return protocol;
  }

  public String getName()
  {
    return name;
  }

  public int getID()
  {
    return id;
  }

  @Override
  public boolean isEmpty()
  {
    synchronized (Frontend.INSTANCE)
    {
      return elements.length == 0;
    }
  }

  public Element[] getAllElements()
  {
    synchronized (Frontend.INSTANCE)
    {
      return cache.values().toArray(new Element[cache.size()]);
    }
  }

  public Element getRootElement()
  {
    synchronized (Frontend.INSTANCE)
    {
      return rootElement;
    }
  }

  public Element[] getElements()
  {
    synchronized (Frontend.INSTANCE)
    {
      return elements;
    }
  }

  public Element getElement(Object object, boolean addOnDemand)
  {
    throw new UnsupportedOperationException();
  }

  public Element getElement(int id)
  {
    synchronized (Frontend.INSTANCE)
    {
      return cache.get(id);
    }
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Agent ");

    if (name != null)
    {
      builder.append(name);
    }
    else
    {
      builder.append("#");
      builder.append(id);
    }

    return builder.toString();
  }

  public void handleEvent(int agentSequenceNumber, ElementEvent event)
  {
    synchronized (Frontend.INSTANCE)
    {
      outOfSequence.put(agentSequenceNumber, event);

      ElementEvent elementEvent;
      while ((elementEvent = outOfSequence.remove(sequenceNumber + 1)) != null)
      {
        ++sequenceNumber;
        if (TRACER.isEnabled())
        {
          TRACER.trace("Handle event " + sequenceNumber + ": " + event);
        }

        handleEvent(elementEvent);
      }
    }
  }

  private void handleEvent(ElementEvent event)
  {
    switch (event.getType())
    {
    case Create.TYPE:
      handleCreationEvent((Create)event);
      break;

    case Call.TYPE:
      handleCallEvent((Call)event);
      break;

    case Transmit.TYPE:
      handleTransmitEvent((Transmit)event);
      break;

    case Change.TYPE:
      handleChangeEvent((Change)event);
      break;

    default:
      throw new RuntimeException();
    }
  }

  private void handleCreationEvent(Create event)
  {
    Element element = event.getElement();
    addElement(element, event.isRoot());

    if (element.getDescriptor().getClass() == TCPConnectorDescriptor.class)
    {
      String local = element.getAttributes().get("local");
      Frontend.INSTANCE.putConnector(local, element);
    }
  }

  private void handleCallEvent(Call event)
  {
    Element source = event.getSource();
    Element target = event.getTarget();
    String what = event.getWhat();
    When when = event.getWhen();

    if (target != null)
    {
      target.fireCallEvent(source, what, when);
    }
  }

  private void handleTransmitEvent(Transmit event)
  {
    Element transmitter = event.getTransmitter();

    String remote = transmitter.getAttributes().get("remote");
    if (remote != null)
    {
      Element receiver = Frontend.INSTANCE.getConnector(remote);
      transmitter.fireTransmissionEvent(receiver);
    }
  }

  private void handleChangeEvent(Change event)
  {
    int id = event.getID();
    Element element = getElement(id);
    element.apply(event);
  }

  private void addElement(Element element, boolean root)
  {
    synchronized (Frontend.INSTANCE)
    {
      cache.put(element.getID(), element);
      if (root)
      {
        elements = new Element[] { element };
        rootElement = element;
      }
    }

    if (root)
    {
      fireElementAddedEvent(element);
    }
  }
}
