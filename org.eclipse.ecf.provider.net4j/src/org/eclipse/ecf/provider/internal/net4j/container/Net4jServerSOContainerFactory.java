package org.eclipse.ecf.provider.internal.net4j.container;

import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.provider.internal.net4j.protocol.ECFProtocolConstants;
import org.eclipse.ecf.provider.net4j.container.Net4jServerSOContainer;

/**
 * @author Eike Stepper
 */
public final class Net4jServerSOContainerFactory extends ServerSOContainerFactory
{
  public static final String TYPE = ECFProtocolConstants.PROTOCOL_NAME;

  public Net4jServerSOContainerFactory()
  {
    super(TYPE);
  }

  public Net4jServerSOContainer create(String description)
  {
    return new Net4jServerSOContainer(null, null);
  }

  public static Net4jServerSOContainer get(IManagedContainer container, String description)
  {
    return (Net4jServerSOContainer)container.getElement(PRODUCT_GROUP, TYPE, description);
  }
}