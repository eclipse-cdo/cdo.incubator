package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Creation;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Session implements ElementProvider
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

  public Element getElement(int id)
  {
    return elements.get(id);
  }

  public void handleEvent(ElementEvent event)
  {
    int type = event.getType();
    switch (type)
    {
    case Creation.TYPE:

      break;

    case Call.TYPE:
      break;

    default:
      throw new RuntimeException();
    }
  }

  @Override
  public String toString()
  {
    return "Agent " + id;
  }
}
