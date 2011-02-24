package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.net4j.util.container.FactoryNotFoundException;
import org.eclipse.net4j.util.container.IPluginContainer;

/**
 * @author Eike Stepper
 */
public abstract class ElementDescriptor
{
  private static final String PRODUCT_GROUP = "org.eclipse.emf.cdo.threedee.elementDescriptors";

  private String name;

  protected ElementDescriptor()
  {
  }

  public String getName()
  {
    return name;
  }

  private void setName(String name)
  {
    this.name = name;
  }

  public abstract void initElement(Object object, Element element, ElementProvider provider);

  public static ElementDescriptor get(String name)
  {
    try
    {
      ElementDescriptor element = (ElementDescriptor)IPluginContainer.INSTANCE.getElement(PRODUCT_GROUP, name, null);
      element.setName(name);
      return element;
    }
    catch (FactoryNotFoundException ex)
    {
      return null;
    }
  }

  /**
   * @author Eike Stepper
   */
  public static abstract class DescriptorFactory extends org.eclipse.net4j.util.factory.Factory
  {
    public DescriptorFactory(String name)
    {
      super(PRODUCT_GROUP, name);
    }
  }
}
