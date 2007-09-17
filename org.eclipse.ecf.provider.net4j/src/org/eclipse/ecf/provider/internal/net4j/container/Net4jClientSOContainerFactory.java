package org.eclipse.ecf.provider.internal.net4j.container;

import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.core.identity.IDCreateException;
import org.eclipse.ecf.provider.internal.net4j.protocol.ECFProtocolConstants;
import org.eclipse.ecf.provider.net4j.container.Net4jClientSOContainer;

/**
 * @author Eike Stepper
 */
public final class Net4jClientSOContainerFactory extends ClientSOContainerFactory
{
  public static final String TYPE = ECFProtocolConstants.PROTOCOL_NAME;

  public Net4jClientSOContainerFactory()
  {
    super(TYPE);
  }

  public Net4jClientSOContainer create(String description)
  {
    try
    {
      return new Net4jClientSOContainer();
    }
    catch (IDCreateException ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  public static Net4jClientSOContainer get(IManagedContainer container, String description)
  {
    return (Net4jClientSOContainer)container.getElement(PRODUCT_GROUP, TYPE, description);
  }
}