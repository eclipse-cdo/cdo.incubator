package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.descriptors._INIT_;

import org.eclipse.net4j.util.collection.Pair;

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
    String label = element.getAttributes().get(Element.LABEL_ATTRIBUTE);
    if (label == null)
    {
      label = element.getAttributes().get(Element.NAME_ATTRIBUTE);
      if (label == null)
      {
        label = element.getAttributes().get(Element.KEY_ATTRIBUTE);
        if (label == null)
        {
          label = element.getAttributes().get(Element.ID_ATTRIBUTE);
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

  public abstract void initElement(Object object, Element element);

  public ElementEvent.Call createCallEvent(Element sourceElement, Element targetElement, When when)
  {
    return new ElementEvent.Call(sourceElement, targetElement, when);
  }

  public Pair<ElementEvent.Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    Element newElement = new Element(oldElement.getID(), oldElement.getDescriptor(), oldElement.getProvider());
    initElement(newObject, newElement);

    Change event = newElement.compare(oldElement);
    if (event == null)
    {
      return null;
    }

    return new Pair<Change, Element>(event, newElement);
  }

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
      _INIT_.init(INSTANCE);
    }
  }
}
