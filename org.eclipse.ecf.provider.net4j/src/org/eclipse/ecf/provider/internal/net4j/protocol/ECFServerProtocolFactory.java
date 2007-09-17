package org.eclipse.ecf.provider.internal.net4j.protocol;

import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.internal.net4j.ServerProtocolFactory;

/**
 * @author Eike Stepper
 */
public final class ECFServerProtocolFactory extends ServerProtocolFactory
{
  public static final String TYPE = ECFProtocolConstants.PROTOCOL_NAME;

  public ECFServerProtocolFactory()
  {
    super(TYPE);
  }

  public ECFServerProtocol create(String description)
  {
    return new ECFServerProtocol();
  }

  public static ECFServerProtocol get(IManagedContainer container, String description)
  {
    return (ECFServerProtocol)container.getElement(PRODUCT_GROUP, TYPE, description);
  }
}