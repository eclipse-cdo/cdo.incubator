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

import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public final class Element
{
  public static final String ID_ATTRIBUTE = "id";

  public static final String KEY_ATTRIBUTE = "key";

  public static final String NAME_ATTRIBUTE = "name";

  public static final String LABEL_ATTRIBUTE = "label";

  private int id;

  private ElementDescriptor descriptor;

  private Map<String, String> attributes = new HashMap<String, String>();

  private Set<Element> references = new HashSet<Element>();

  public Element(int id, ElementDescriptor descriptor)
  {
    this.id = id;
    this.descriptor = descriptor;
  }

  public Element(ExtendedDataInputStream in, ElementProvider provider) throws IOException
  {
    id = in.readInt();
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
      Element element = provider.getElement(target);
      references.add(element);
    }
  }

  public void write(ExtendedDataOutputStream out) throws IOException
  {
    out.writeInt(id);
    out.writeString(descriptor.getName());

    out.writeInt(attributes.size());
    for (Entry<String, String> entry : attributes.entrySet())
    {
      out.writeString(entry.getKey());
      out.writeString(entry.getValue());
    }

    out.writeInt(references.size());
    for (Element target : references)
    {
      out.writeInt(target.getID());
    }
  }

  public int getID()
  {
    return id;
  }

  public ElementDescriptor getDescriptor()
  {
    return descriptor;
  }

  public Map<String, String> getAttributes()
  {
    return attributes;
  }

  public Set<Element> getReferences()
  {
    return references;
  }

  public void setAttribute(String key, String value)
  {
    if (key != null && value != null)
    {
      attributes.put(key, value);
    }
  }

  public void setIDAttribute(String value)
  {
    setAttribute(ID_ATTRIBUTE, value);
  }

  public void setKeyAttribute(String value)
  {
    setAttribute(KEY_ATTRIBUTE, value);
  }

  public void setNameAttribute(String value)
  {
    setAttribute(NAME_ATTRIBUTE, value);
  }

  public void setLabelAttribute(String value)
  {
    setAttribute(LABEL_ATTRIBUTE, value);
  }

  public void addReference(Object object, ElementProvider provider)
  {
    if (object != null)
    {
      Element element = provider.getElement(object);
      if (element != null)
      {
        references.add(element);
      }
    }
  }

  public void addReferences(Collection<?> objects, ElementProvider provider)
  {
    if (objects != null)
    {
      for (Object object : objects)
      {
        addReference(object, provider);
      }
    }
  }

  public void addReferences(Object[] objects, ElementProvider provider)
  {
    if (objects != null)
    {
      for (Object object : objects)
      {
        addReference(object, provider);
      }
    }
  }

  @Override
  public String toString()
  {
    return descriptor.getLabel(this);
  }
}
