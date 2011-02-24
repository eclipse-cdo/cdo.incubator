package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.common.Observer;
import org.eclipse.emf.cdo.threedee.common.ObserverEvent;
import org.eclipse.emf.cdo.threedee.common.ObserverEvent.Call;
import org.eclipse.emf.cdo.threedee.common.ObserverEvent.Creation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Session
{
  private FrontendProtocol protocol;

  private int id;

  private Map<Integer, Observer> observers = new HashMap<Integer, Observer>();

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

  public void handleEvent(ObserverEvent event)
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
