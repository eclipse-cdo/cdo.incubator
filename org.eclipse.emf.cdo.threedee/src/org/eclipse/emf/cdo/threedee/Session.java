package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.bundle.OM;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Create;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Transmit;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;

import org.eclipse.net4j.util.container.Container;
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

  public Session(FrontendProtocol protocol, String name, int id)
  {
    this.id = id;
    this.name = name;
    this.protocol = protocol;
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
    synchronized (cache)
    {
      return elements.length == 0;
    }
  }

  public Element[] getElements()
  {
    synchronized (cache)
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
    synchronized (cache)
    {
      return cache.get(id);
    }
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Agent ");
    builder.append(id);

    if (name != null)
    {
      builder.append(" (");
      builder.append(name);
      builder.append(")");
    }

    return builder.toString();
  }

  public void handleEvent(int agentSequenceNumber, ElementEvent event)
  {
    synchronized (outOfSequence)
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
    if (element.getDescriptor().getClass() == TCPConnectorDescriptor.class)
    {
      String local = element.getAttributes().get("local");
      Frontend.INSTANCE.putConnector(local, element);
    }

    addElement(element, event.isRoot());
  }

  private void handleTransmitEvent(Transmit event)
  {
    Element transmitter = event.getTransmitter();

    String remote = transmitter.getAttributes().get("remote");
    Element receiver = Frontend.INSTANCE.getConnector(remote);

    transmitter.fireTransmissionEvent(receiver);
  }

  private void handleChangeEvent(Change event)
  {
    int id = event.getID();
    Element element = getElement(id);
    element.apply(event);
  }

  private void addElement(Element element, boolean root)
  {
    synchronized (cache)
    {
      cache.put(element.getID(), element);
      if (root)
      {
        elements = new Element[] { element };
      }
    }

    if (root)
    {
      fireElementAddedEvent(element);
    }
  }
}
