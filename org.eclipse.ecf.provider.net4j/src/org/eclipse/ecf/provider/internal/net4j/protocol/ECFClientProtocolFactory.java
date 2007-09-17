package org.eclipse.ecf.provider.internal.net4j.protocol;

import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.internal.net4j.ClientProtocolFactory;

/**
 * @author Eike Stepper
 */
public final class ECFClientProtocolFactory extends ClientProtocolFactory
{
  public static final String TYPE = ECFProtocolConstants.PROTOCOL_NAME;

  public ECFClientProtocolFactory()
  {
    super(TYPE);
  }

  public ECFClientProtocol create(String description)
  {
    return new ECFClientProtocol();
  }

  public static ECFClientProtocol get(IManagedContainer container, String description)
  {
    return (ECFClientProtocol)container.getElement(PRODUCT_GROUP, TYPE, description);
  }
}