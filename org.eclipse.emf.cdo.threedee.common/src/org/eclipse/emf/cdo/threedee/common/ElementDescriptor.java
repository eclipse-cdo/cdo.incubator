package org.eclipse.emf.cdo.threedee.common;


/**
 * @author Eike Stepper
 */
public class ElementDescriptor
{
  private String name;

  protected ElementDescriptor(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void initElement(Element element, Object object)
  {
    // TODO: implement ElementDescriptor.initElement(element, object)
    throw new UnsupportedOperationException();
  }

  public static ElementDescriptor getByName(String descriptorName)
  {
    // TODO: implement ElementDescriptor.get(descriptorName)
    throw new UnsupportedOperationException();
  }

  public static ElementDescriptor getByObject(Object object)
  {
    // TODO: implement ElementDescriptor.getByObject(object)
    throw new UnsupportedOperationException();
  }
}
