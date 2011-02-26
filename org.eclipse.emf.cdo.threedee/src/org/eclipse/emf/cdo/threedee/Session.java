package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Creation;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

import org.eclipse.net4j.util.container.Container;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Session extends Container<Element> implements ElementProvider
{
  private FrontendProtocol protocol;

  private int id;

  private int sequenceNumber;

  private Map<Integer, ElementEvent> outOfSequence = new HashMap<Integer, ElementEvent>();

  private Map<Integer, Element> cache = new HashMap<Integer, Element>();

  private Element[] elements = {};

  public Session(int id, FrontendProtocol protocol)
  {
    this.id = id;
    this.protocol = protocol;
  }

  public int getID()
  {
    return id;
  }

  public FrontendProtocol getProtocol()
  {
    return protocol;
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
    return "Agent " + id;
  }

  public void handleEvent(int agentSequenceNumber, ElementEvent event)
  {
    synchronized (outOfSequence)
    {
      outOfSequence.put(agentSequenceNumber, event);

      ElementEvent elementEvent;
      while ((elementEvent = outOfSequence.remove(sequenceNumber + 1)) != null)
      {
        System.err.println("HANDLE EVENT " + ++sequenceNumber + ": " + event);
        handleEvent(elementEvent);
      }
    }
  }

  private void handleEvent(ElementEvent event)
  {
    switch (event.getType())
    {
    case Creation.TYPE:
      handleCreationEvent((Creation)event);
      break;

    case Call.TYPE:
      break;

    case Change.TYPE:
      handleChangeEvent((Change)event);
      break;

    default:
      throw new RuntimeException();
    }
  }

  private void handleCreationEvent(Creation event)
  {
    Element element = event.getElement();
    addElement(element, event.isRoot());
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
