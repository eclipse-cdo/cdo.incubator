package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.emf.cdo.threedee.common.descriptors.BranchDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.BranchManagerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.ClassDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.PackageDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.PackageInfoDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.PackageRegistryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.PackageUnitDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.RepositoryDescriptor;

import java.util.HashMap;

/**
 * @author Eike Stepper
 */
public abstract class ElementDescriptor
{
  private String name;

  public ElementDescriptor(String name)
  {
    this.name = name;
  }

  public ElementDescriptor()
  {
    name = getClass().getSimpleName();
    name = strip(name, "ElementDescriptor");
    name = strip(name, "Descriptor");
  }

  public String getName()
  {
    return name;
  }

  public String getLabel(Element element)
  {
    String label = element.getAttributes().get(Element.ID_ATTRIBUTE);
    if (label == null)
    {
      label = element.getAttributes().get(Element.KEY_ATTRIBUTE);
      if (label == null)
      {
        label = element.getAttributes().get(Element.NAME_ATTRIBUTE);
        if (label == null)
        {
          label = element.getAttributes().get(Element.LABEL_ATTRIBUTE);
          if (label == null)
          {
            return name;
          }
        }
      }
    }

    return name + " " + label;
  }

  public abstract boolean matches(Object object);

  public abstract void initElement(Object object, Element element, ElementProvider provider);

  private static String strip(String string, String suffix)
  {
    if (string.endsWith(suffix))
    {
      return string.substring(0, string.length() - suffix.length());
    }

    return string;
  }

  /**
   * @author Eike Stepper
   */
  public static class Registry extends HashMap<String, ElementDescriptor>
  {
    public static final Registry INSTANCE = new Registry();

    private static final long serialVersionUID = 1L;

    public void register(ElementDescriptor descriptor)
    {
      put(descriptor.getName(), descriptor);
    }

    public ElementDescriptor match(Object object)
    {
      for (ElementDescriptor descriptor : values())
      {
        if (descriptor.matches(object))
        {
          return descriptor;
        }
      }

      return null;
    }

    static
    {
      INSTANCE.register(new RepositoryDescriptor());
      INSTANCE.register(new BranchManagerDescriptor());
      INSTANCE.register(new BranchDescriptor());
      INSTANCE.register(new PackageRegistryDescriptor());
      INSTANCE.register(new PackageUnitDescriptor());
      INSTANCE.register(new PackageInfoDescriptor());
      INSTANCE.register(new PackageDescriptor());
      INSTANCE.register(new ClassDescriptor());
    }
  }
}
