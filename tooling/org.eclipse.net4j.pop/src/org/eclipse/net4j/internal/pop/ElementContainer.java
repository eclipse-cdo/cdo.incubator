/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.pop.IElement;

import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class ElementContainer<ELEMENT extends IElement> extends Element
{
  private List<ELEMENT> elements = new ArrayList<ELEMENT>();

  private Element delegator;

  protected ElementContainer(Element delegator)
  {
    this.delegator = delegator;
  }

  protected Element getDelegator()
  {
    return delegator;
  }

  protected void addElement(ELEMENT element)
  {
    synchronized (elements)
    {
      if (!elements.contains(element))
      {
        elements.add(element);
        delegator.fireEvent(new ElementAddedEvent(delegator, element));
      }
    }
  }

  protected void removeElement(ELEMENT element)
  {
    synchronized (elements)
    {
      if (!elements.remove(element))
      {
        delegator.fireEvent(new ElementRemovedEvent(delegator, element));
      }
    }
  }

  protected int getElementCount()
  {
    synchronized (elements)
    {
      return elements.size();
    }
  }

  protected ELEMENT getElement(int index)
  {
    synchronized (elements)
    {
      return elements.get(index);
    }
  }

  protected List<ELEMENT> getElements()
  {
    return elements;
  }

  @SuppressWarnings("unchecked")
  protected ELEMENT[] getElements(Class<ELEMENT> componentType)
  {
    synchronized (elements)
    {
      ELEMENT[] prototype = (ELEMENT[])Array.newInstance(componentType, elements.size());
      return elements.toArray(prototype);
    }
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("{0}[{1}]", getClass().getSimpleName(), elements);
  }
}
