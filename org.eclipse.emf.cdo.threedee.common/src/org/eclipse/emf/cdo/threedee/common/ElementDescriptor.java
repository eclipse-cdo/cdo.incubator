package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.net4j.util.container.IPluginContainer;

/**
 * @author Eike Stepper
 */
public abstract class ElementDescriptor
{
  private static final String PRODUCT_GROUP = "org.eclipse.emf.cdo.threedee.elementDescriptors";

  private static final String FACTORY_TYPE = "default";

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
    ElementDescriptor element = (ElementDescriptor)IPluginContainer.INSTANCE.getElement(PRODUCT_GROUP, FACTORY_TYPE,
        name);
    element.setName(name);
    return element;
  }

  /**
   * @author Eike Stepper
   */
  public static abstract class Factory extends org.eclipse.net4j.util.factory.Factory
  {
    public Factory()
    {
      super(PRODUCT_GROUP, FACTORY_TYPE);
    }
  }
}
