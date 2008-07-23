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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class AbstractContainer<ELEMENT> extends AbstractElement
{
  private List<ELEMENT> elements = new ArrayList<ELEMENT>();

  protected AbstractContainer()
  {
  }

  protected void addElement(ELEMENT element)
  {
    synchronized (elements)
    {
      elements.add(element);
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

  @SuppressWarnings("unchecked")
  protected ELEMENT[] getElements(Class<ELEMENT> componentType)
  {
    synchronized (elements)
    {
      ELEMENT[] prototype = (ELEMENT[])Array.newInstance(componentType, elements.size());
      return elements.toArray(prototype);
    }
  }
}
