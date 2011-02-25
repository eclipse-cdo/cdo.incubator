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

  private Map<Integer, Element> elements = new HashMap<Integer, Element>();

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
    synchronized (elements)
    {
      return elements.isEmpty();
    }
  }

  public Element[] getElements()
  {
    synchronized (elements)
    {
      return elements.values().toArray(new Element[elements.size()]);
    }
  }

  public Element getElement(Object object)
  {
    throw new UnsupportedOperationException();
  }

  public Element getElement(int id)
  {
    synchronized (elements)
    {
      return elements.get(id);
    }
  }

  public void handleEvent(ElementEvent event)
  {
    System.err.println("EVENT: " + event);

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
    addElement(element);
  }

  private void handleChangeEvent(Change event)
  {
    int id = event.getID();
    Element element = getElement(id);
    element.apply(event);
  }

  @Override
  public String toString()
  {
    return "Agent " + id;
  }

  private void addElement(Element element)
  {
    synchronized (elements)
    {
      elements.put(element.getID(), element);
    }

    fireElementAddedEvent(element);
  }
}
