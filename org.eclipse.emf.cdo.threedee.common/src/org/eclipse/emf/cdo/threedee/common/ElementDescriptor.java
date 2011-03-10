package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.descriptors._INIT_;

import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.event.ValueNotifier;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public abstract class ElementDescriptor implements Comparable<ElementDescriptor>
{
  public static final ThreadLocal<Boolean> INITIALIZING_ELEMENT = new ThreadLocal<Boolean>()
  {
    @Override
    protected Boolean initialValue()
    {
      return false;
    }
  };

  protected static final Class<ElementDescriptor> FOLDER_TYPE = ElementDescriptor.class;

  private static final Color[] COLORS = initColors();

  private static int nextColor;

  private ValueNotifier<Color> color = new ValueNotifier<Color>(getNextColor());

  public ElementDescriptor()
  {
  }

  public abstract Class<?> getElementType();

  public boolean isFolder()
  {
    return getElementType() == FOLDER_TYPE;
  }

  public final String getName()
  {
    return getClass().getSimpleName();
  }

  public String getLabel()
  {
    return getBaseLabel();
  }

  protected String getBaseLabel()
  {
    return strip(getClass().getSimpleName(), "Descriptor");
  }

  public ValueNotifier<Color> getColor()
  {
    return color;
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
            return getLabel();
          }
        }
      }
    }

    return getLabel() + " " + label;
  }

  public ElementDescriptor getSuperDescriptor()
  {
    String superName = getSuperDescriptorName();
    return Registry.INSTANCE.get(superName);
  }

  protected String getSuperDescriptorName()
  {
    return getClass().getSuperclass().getSimpleName();
  }

  public List<ElementDescriptor> getSubDescriptors()
  {
    return Registry.INSTANCE.getSubDescriptors(getName());
  }

  public boolean matches(Object object)
  {
    return getElementType().isInstance(object);
  }

  public boolean isActive(Object object)
  {
    return LifecycleUtil.isActive(object);
  }

  public void initElement(Object object, Element element)
  {
    try
    {
      INITIALIZING_ELEMENT.set(true);
      doInitElement(object, element);
    }
    finally
    {
      INITIALIZING_ELEMENT.set(false);
    }
  }

  protected abstract void doInitElement(Object object, Element element);

  public boolean isHomogenous()
  {
    return true;
  }

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

  public int compareTo(ElementDescriptor d2)
  {
    Class<?> t1 = getElementType();
    Class<?> t2 = d2.getElementType();

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

  @Override
  public String toString()
  {
    return getName();
  }

  private static String strip(String string, String suffix)
  {
    if (string.endsWith(suffix))
    {
      return string.substring(0, string.length() - suffix.length());
    }

    return string;
  }

  private static Color[] initColors()
  {
    List<Color> colors = new ArrayList<Color>();
    colors.add(Color.pink);
    colors.add(Color.blue);
    colors.add(Color.cyan);
    colors.add(Color.darkGray);
    colors.add(Color.gray);
    colors.add(Color.green);
    colors.add(Color.lightGray);
    colors.add(Color.magenta);
    colors.add(Color.red);
    colors.add(Color.white);
    colors.add(Color.yellow);
    colors.add(new Color(20, 93, 20));
    colors.add(new Color(200, 50, 50));
    colors.add(new Color(100, 98, 77));
    colors.add(new Color(200, 20, 200));
    colors.add(new Color(0, 100, 100));
    colors.add(new Color(0, 200, 200));
    colors.add(new Color(100, 0, 100));
    colors.add(new Color(200, 0, 200));
    colors.add(new Color(100, 100, 0));
    colors.add(new Color(200, 200, 0));
    colors.add(new Color(255, 100, 100));
    colors.add(new Color(255, 200, 200));
    colors.add(new Color(100, 255, 100));
    colors.add(new Color(200, 255, 200));
    colors.add(new Color(100, 100, 225));
    colors.add(new Color(200, 200, 255));
    colors.add(new Color(100, 255, 255));
    colors.add(new Color(200, 255, 255));
    colors.add(new Color(255, 255, 100));
    colors.add(new Color(255, 255, 200));
    colors.add(new Color(255, 100, 255));
    colors.add(new Color(255, 200, 255));
    return colors.toArray(new Color[colors.size()]);
  }

  private static Color getNextColor()
  {
    try
    {
      nextColor = nextColor % COLORS.length;
      return COLORS[nextColor];
    }
    finally
    {
      ++nextColor;
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Registry extends HashMap<String, ElementDescriptor>
  {
    public static final Registry INSTANCE = new Registry();

    private static final long serialVersionUID = 1L;

    private List<ElementDescriptor> values;

    private List<ElementDescriptor> rootDescriptors;

    private Map<String, List<ElementDescriptor>> subDescriptors;

    public void register(ElementDescriptor descriptor)
    {
      put(descriptor.getName(), descriptor);
    }

    @Override
    public ElementDescriptor put(String key, ElementDescriptor value)
    {
      values = null;
      rootDescriptors = null;
      subDescriptors = null;
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

    public List<ElementDescriptor> getRootDescriptors()
    {
      if (rootDescriptors == null)
      {
        initHierarchy();
      }

      return rootDescriptors;
    }

    public List<ElementDescriptor> getSubDescriptors(String name)
    {

      List<ElementDescriptor> result = subDescriptors.get(name);
      if (result == null)
      {
        return Collections.emptyList();
      }

      return result;
    }

    private void initHierarchy()
    {
      rootDescriptors = new ArrayList<ElementDescriptor>();
      subDescriptors = new HashMap<String, List<ElementDescriptor>>();
      for (ElementDescriptor descriptor : values())
      {
        String superName = descriptor.getSuperDescriptorName();
        ElementDescriptor superDescriptor = get(superName);
        if (superDescriptor != null)
        {
          List<ElementDescriptor> list = subDescriptors.get(superName);
          if (list == null)
          {
            list = new ArrayList<ElementDescriptor>();
            subDescriptors.put(superName, list);
          }

          list.add(descriptor);
        }
        else
        {
          rootDescriptors.add(descriptor);
        }
      }
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
