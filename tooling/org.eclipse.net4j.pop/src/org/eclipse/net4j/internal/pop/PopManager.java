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

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IPopManager;
import org.eclipse.net4j.util.container.Container;

import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class PopManager extends Container<IPop> implements IPopManager
{
  public static final PopManager INSTANCE = new PopManager();

  private Map<String, Pop> elements = new HashMap<String, Pop>();

  private PopManager()
  {
  }

  public void addPop(IPop element)
  {
    String id = element.getID();
    synchronized (elements)
    {
      if (elements.containsKey(id))
      {
        throw new IllegalStateException("Duplicate  ID: " + id);
      }

      elements.put(id, (Pop)element);
      if (isActive())
      {
        fireElementAddedEvent(element);
      }
    }
  }

  public Pop getPop(String id)
  {
    checkActive();
    synchronized (elements)
    {
      return elements.get(id);
    }
  }

  public Pop[] getPops()
  {
    checkActive();
    synchronized (elements)
    {
      List<Pop> list = new ArrayList<Pop>(elements.values());
      Collections.sort(list);
      return list.toArray(new Pop[list.size()]);
    }
  }

  public Pop[] getElements()
  {
    return getPops();
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    initPops();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    elements.clear();
    super.doDeactivate();
  }

  protected void initPops()
  {
    // TODO Implement PopManager.initPops()
  }
}
