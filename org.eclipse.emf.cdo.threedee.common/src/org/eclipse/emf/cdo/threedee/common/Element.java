/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.common;

import org.eclipse.emf.cdo.threedee.common.ElementEvent.Call.When;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change.ChangeInfo;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change.ChangeInfo.Attribute;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change.ChangeInfo.Reference;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change.ChangeInfo.Reference.Kind;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.container.ContainerEvent;
import org.eclipse.net4j.util.container.IContainerDelta;
import org.eclipse.net4j.util.event.Event;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Eike Stepper
 */
public final class Element extends Container<Element>
{
  public static final String LABEL_ATTRIBUTE = "label";

  public static final String NAME_ATTRIBUTE = "name";

  public static final String KEY_ATTRIBUTE = "key";

  public static final String ID_ATTRIBUTE = "id";

  private int id;

  private int containerID;

  private ElementDescriptor descriptor;

  private ElementProvider provider;

  private Map<String, String> attributes = new HashMap<String, String>();

  private Map<Integer, Boolean> references = new HashMap<Integer, Boolean>();

  public Element(int id, ElementDescriptor descriptor, ElementProvider provider)
  {
    this.id = id;
    this.descriptor = descriptor;
    this.provider = provider;
    activate();
  }

  public Element(ExtendedDataInputStream in, ElementProvider provider) throws IOException
  {
    this.provider = provider;
    id = in.readInt();
    containerID = in.readInt();
    String descriptorName = in.readString();
    descriptor = ElementDescriptor.Registry.INSTANCE.get(descriptorName);
    if (descriptor == null)
    {
      throw new IllegalStateException("Descriptor missing: " + descriptorName);
    }

    int size = in.readInt();
    for (int i = 0; i < size; i++)
    {
      String key = in.readString();
      String value = in.readString();
      attributes.put(key, value);
    }

    size = in.readInt();
    for (int i = 0; i < size; i++)
    {
      int target = in.readInt();
      references.put(Math.abs(target), target < 0 ? Boolean.TRUE : Boolean.FALSE);
    }

    activate();
  }

  public void write(ExtendedDataOutputStream out) throws IOException
  {
    out.writeInt(id);
    out.writeInt(containerID);
    out.writeString(descriptor.getName());

    out.writeInt(attributes.size());
    for (Entry<String, String> entry : attributes.entrySet())
    {
      out.writeString(entry.getKey());
      out.writeString(entry.getValue());
    }

    out.writeInt(references.size());
    for (Entry<Integer, Boolean> entry : references.entrySet())
    {
      int target = entry.getKey();
      if (Boolean.TRUE.equals(entry.getValue()))
      {
        target = -target;
      }

      out.writeInt(target);
    }
  }

  public int getID()
  {
    return id;
  }

  public int getContainerID()
  {
    return containerID;
  }

  public Element getContainer()
  {
    return provider.getElement(containerID);
  }

  public ElementDescriptor getDescriptor()
  {
    return descriptor;
  }

  public ElementProvider getProvider()
  {
    return provider;
  }

  public Map<String, String> getAttributes()
  {
    return attributes;
  }

  public Map<Integer, Boolean> getReferences()
  {
    return references;
  }

  public void setAttributes(Map<?, ?> map)
  {
    for (Entry<?, ?> entry : map.entrySet())
    {
      Object key = entry.getKey();
      if (key != null)
      {
        setAttribute(String.valueOf(key), entry.getValue());
      }
    }
  }

  public void setAttribute(String key, Object value)
  {
    if (key != null)
    {
      if (value != null)
      {
        attributes.put(key, String.valueOf(value));
      }
      else
      {
        attributes.remove(key);
      }
    }
  }

  public void setIDAttribute(Object value)
  {
    setAttribute(ID_ATTRIBUTE, value);
  }

  public void setKeyAttribute(Object value)
  {
    setAttribute(KEY_ATTRIBUTE, value);
  }

  public void setNameAttribute(Object value)
  {
    setAttribute(NAME_ATTRIBUTE, value);
  }

  public void setLabelAttribute(Object value)
  {
    setAttribute(LABEL_ATTRIBUTE, value);
  }

  private void addReference(boolean containment, Element element)
  {
    if (element != null)
    {
      references.put(element.getID(), containment);
      if (containment)
      {
        element.containerID = id;
      }
    }
  }

  public void addReference(boolean containment, Object object)
  {
    if (object != null)
    {
      Element element = provider.getElement(object, containment);
      addReference(containment, element);
    }
  }

  public void addReferences(boolean containment, Collection<?> objects)
  {
    if (objects != null)
    {
      for (Object object : objects)
      {
        addReference(containment, object);
      }
    }
  }

  public void addReferences(boolean containment, Object[] objects)
  {
    if (objects != null)
    {
      for (Object object : objects)
      {
        addReference(containment, object);
      }
    }
  }

  public Change compare(Element oldElement)
  {
    Change result = new Change(id);
    compareAttributes(oldElement, result);
    compareReferences(oldElement, result);
    return result.isEmpty() ? null : result;
  }

  private void compareAttributes(Element oldElement, Change result)
  {
    Map<String, String> oldAttributes = oldElement.getAttributes();
    for (Entry<String, String> entry : attributes.entrySet())
    {
      String key = entry.getKey();
      String newValue = entry.getValue();
      String oldValue = oldAttributes.get(key);
      if (!ObjectUtil.equals(oldValue, newValue))
      {
        result.attributeChanged(key, newValue);
      }
    }

    for (String key : oldAttributes.keySet())
    {
      if (!attributes.containsKey(key))
      {
        result.attributeRemoved(key);
      }
    }
  }

  private void compareReferences(Element oldElement, Change result)
  {
    Map<Integer, Boolean> oldReferences = oldElement.getReferences();
    for (Entry<Integer, Boolean> entry : references.entrySet())
    {
      int id = entry.getKey();
      Boolean newContainment = entry.getValue();
      Boolean oldContainment = oldReferences.get(id);

      if (oldContainment == Boolean.TRUE)
      {
        if (newContainment == Boolean.TRUE)
        {
          // Do nothing
        }
        else if (newContainment == Boolean.FALSE)
        {
          result.referenceType(id, false);
        }
        else
        {
          result.referenceRemoved(id, true);
        }
      }
      else if (oldContainment == Boolean.FALSE)
      {
        if (newContainment == Boolean.TRUE)
        {
          result.referenceType(id, true);
        }
        else if (newContainment == Boolean.FALSE)
        {
          // Do nothing
        }
        else
        {
          result.referenceRemoved(id, false);
        }
      }
      else
      {
        if (newContainment == Boolean.TRUE)
        {
          result.referenceAdded(id, true);
        }
        else if (newContainment == Boolean.FALSE)
        {
          result.referenceAdded(id, false);
        }
        else
        {
          // Do nothing
        }
      }
    }

    for (Entry<Integer, Boolean> entry : oldReferences.entrySet())
    {
      Integer id = entry.getKey();
      if (!references.containsKey(id))
      {
        result.referenceRemoved(id, Boolean.TRUE == entry.getValue());
      }
    }
  }

  public void apply(Change event)
  {
    ContainerEvent<Element> containerEvent = null;

    for (ChangeInfo changeInfo : event.getChangeInfos())
    {
      if (changeInfo instanceof Attribute)
      {
        Attribute attributeChange = (Attribute)changeInfo;
        String key = attributeChange.getKey();
        String value = attributeChange.getValue();
        if (value == null)
        {
          attributes.remove(key);
        }
        else
        {
          attributes.put(key, value);
        }
      }
      else
      {
        Reference referenceChange = (Reference)changeInfo;
        Kind kind = referenceChange.getKind();
        int id = referenceChange.getID();
        boolean containment = referenceChange.isContainment();
        Element element = provider.getElement(id);

        switch (kind)
        {
        case ADDED:
          references.put(id, containment);
          if (element != null && containment)
          {
            element.containerID = this.id;
            if (containerEvent == null)
            {
              containerEvent = new ContainerEvent<Element>(this);
            }

            containerEvent.addDelta(element, IContainerDelta.Kind.ADDED);
          }
          break;

        case TYPE:
          references.put(id, containment);
          if (element != null)
          {
            if (containerEvent == null)
            {
              containerEvent = new ContainerEvent<Element>(this);
            }

            if (containment)
            {
              element.containerID = this.id;
              containerEvent.addDelta(element, IContainerDelta.Kind.ADDED);
            }
            else
            {
              element.containerID = 0;
              containerEvent.addDelta(element, IContainerDelta.Kind.REMOVED);
            }
          }
          break;

        case REMOVED:
          references.remove(id);
          if (element != null && containment)
          {
            element.containerID = 0;
            if (containerEvent == null)
            {
              containerEvent = new ContainerEvent<Element>(this);
            }

            containerEvent.addDelta(element, IContainerDelta.Kind.REMOVED);
          }
          break;
        }
      }
    }

    if (containerEvent != null)
    {
      fireEvent(containerEvent);
    }
    else
    {
      fireEvent(new Event(this));
    }
  }

  public Element[] getElements()
  {
    List<Element> result = new ArrayList<Element>();
    for (Entry<Integer, Boolean> entry : references.entrySet())
    {
      if (Boolean.TRUE.equals(entry.getValue()))
      {
        int id = entry.getKey();
        Element element = provider.getElement(id);
        if (element != null)
        {
          result.add(element);
        }
      }
    }

    return result.toArray(new Element[result.size()]);
  }

  @Override
  public boolean isEmpty()
  {
    for (Entry<Integer, Boolean> entry : references.entrySet())
    {
      if (Boolean.TRUE.equals(entry.getValue()))
      {
        return false;
      }
    }

    return true;
  }

  public void fireCallEvent(Element source, String what, When when)
  {
    IEvent event = new CallEvent(source, what, when);
    System.err.println(event);
    fireEvent(event);
  }

  public void fireTransmissionEvent(Element receiver)
  {
    IEvent event = new TransmissionEvent(receiver);
    System.err.println(event);
    fireEvent(event);
  }

  @Override
  public String toString()
  {
    return descriptor.getLabel(this);
  }

  /**
   * @author Eike Stepper
   */
  public final class CallEvent extends Event
  {
    private static final long serialVersionUID = 1L;

    private Element target;

    private String what;

    private When when;

    private CallEvent(Element target, String what, When when)
    {
      super(Element.this);
      this.target = target;
      this.what = what;
      this.when = when;
    }

    @Override
    public Element getSource()
    {
      return (Element)super.getSource();
    }

    public Element getTarget()
    {
      return target;
    }

    public String getWhat()
    {
      return what;
    }

    public When getWhen()
    {
      return when;
    }

    @Override
    public String toString()
    {
      return "CALL " + getTarget();
    }
  }

  /**
   * @author Eike Stepper
   */
  public final class TransmissionEvent extends Event
  {
    private static final long serialVersionUID = 1L;

    private Element receiver;

    private TransmissionEvent(Element receiver)
    {
      super(Element.this);
      this.receiver = receiver;
    }

    @Override
    public Element getSource()
    {
      return (Element)super.getSource();
    }

    public Element getReceiver()
    {
      return receiver;
    }

    @Override
    public String toString()
    {
      return "TRANSMISSION " + getSource();
    }
  }
}
