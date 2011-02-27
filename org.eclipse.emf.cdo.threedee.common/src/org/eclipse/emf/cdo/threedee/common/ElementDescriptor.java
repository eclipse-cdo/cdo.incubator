package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.descriptors._INIT_;

import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class ElementDescriptor implements Comparable<ElementDescriptor>
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

  public abstract Class<?> getType();

  public int compareTo(ElementDescriptor d2)
  {
    Class<?> t1 = getType();
    Class<?> t2 = d2.getType();

    boolean a = t1.isAssignableFrom(t2);
    boolean b = t2.isAssignableFrom(t1);

    if (a && !b)
    {
      return 1;
    }

    if (b && !a)
    {
      return -1;
    }

    return t1.getName().compareTo(t2.getName());
  }

  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
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

  public boolean matches(Object object)
  {
    return getType().isInstance(object);
  }

  public boolean isActive(Object object)
  {
    return LifecycleUtil.isActive(object);
  }

  public abstract void initElement(Object object, Element element);

  public ElementEvent.Call createCallEvent(Element sourceElement, Element targetElement, String what, When when)
  {
    return new ElementEvent.Call(sourceElement, targetElement, what, when);
  }

  public ElementEvent createTransmitEvent(Element connector)
  {
    return new ElementEvent.Transmit(connector);
  }

  public Pair<ElementEvent.Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return doCreateChangeEvent(oldElement, newObject);
  }

  protected final Pair<ElementEvent.Change, Element> doCreateChangeEvent(Element oldElement, Object newObject)
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

    private List<ElementDescriptor> values;

    public void register(ElementDescriptor descriptor)
    {
      put(descriptor.getName(), descriptor);
    }

    @Override
    public ElementDescriptor put(String key, ElementDescriptor value)
    {
      values = null;
      return super.put(key, value);
    }

    @Override
    public Collection<ElementDescriptor> values()
    {
      if (values == null)
      {
        values = new ArrayList<ElementDescriptor>(super.values());
        Collections.sort(values);
      }

      return values;
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
