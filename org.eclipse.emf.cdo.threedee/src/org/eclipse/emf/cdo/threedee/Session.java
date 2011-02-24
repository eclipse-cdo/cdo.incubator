package org.eclipse.emf.cdo.threedee;

/**
 * @author Eike Stepper
 */
public class Session
{
  private ServerProtocol protocol;

  private int id;

  public Session(int id, ServerProtocol protocol)
  {
    this.id = id;
    this.protocol = protocol;
  }

  public int getID()
  {
    return id;
  }

  public ServerProtocol getProtocol()
  {
    return protocol;
  }

  @Override
  public String toString()
  {
    return "Agent " + id;
  }
}