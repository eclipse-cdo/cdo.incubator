package org.eclipse.ecf.provider.internal.net4j.container;

import org.eclipse.net4j.internal.util.factory.Factory;

/**
 * @author Eike Stepper
 */
public abstract class ServerSOContainerFactory extends Factory
{
  public static final String PRODUCT_GROUP = "org.eclipse.ecf.serverSOContainers";

  public ServerSOContainerFactory(String type)
  {
    super(PRODUCT_GROUP, type);
  }
}