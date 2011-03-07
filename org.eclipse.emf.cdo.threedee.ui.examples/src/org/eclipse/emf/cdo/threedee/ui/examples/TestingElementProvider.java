/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.examples;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.AcceptorDescriptor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin Fluegge
 */
public class TestingElementProvider implements ElementProvider
{
  private Map<Integer, Element> elements = new HashMap<Integer, Element>();

  private int id = 0;

  public int getID()
  {
    return id;
  }

  public Element createElement(ElementDescriptor descriptor)
  {
    Element element = new Element(++id, descriptor, this);
    elements.put(element.getID(), element);
    return element;
  }

  public Element getElement(Object object, boolean addOnDemand)
  {
    return elements.get(id);
  }

  public Element getElement(int id)
  {
    return elements.get(id);
  }

  public synchronized Element createElement()
  {
    return createElement(new AcceptorDescriptor());
  }
}
