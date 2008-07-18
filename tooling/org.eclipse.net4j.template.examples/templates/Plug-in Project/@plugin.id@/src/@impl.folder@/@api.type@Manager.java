/***************************************************************************
 * Copyright (c) 2004 - 2008 @author.name@, @author.country@.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    @author.name@ - initial API and implementation
 **************************************************************************/
package @impl.package@;

import @api.package@.I@api.type@Manager;
import @api.package@.I@api.type@;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * \@author @author.name@
 */
public class @api.type@Manager extends Container<I@api.type@> implements I@api.type@Manager
{
  public static final @api.type@Manager INSTANCE = new @api.type@Manager();
  
  private Map<String, @api.type@> elements = new HashMap<String, @api.type@>();
  
  private @api.type@Manager()
  {
  }
  
  public void add@api.type@(I@api.type@ element)
  {
    String id = element.getID();
    synchronized (elements)
    {
      if (elements.containsKey(id))
      {
        throw new IllegalStateException("Duplicate  ID: " + id);
      }

      elements.put(id, (@api.type@)element);
      if (isActive())
      {
        fireElementAddedEvent(element);
      }
    }
  }
  
  public @api.type@ get@api.type@(String id)
  {
    checkActive();
    synchronized (elements)
    {
      return elements.get(id);
    }
  }

  public @api.type@[] get@api.type@s()
  {
    checkActive();
    synchronized (elements)
    {
      List<@api.type@> list = new ArrayList<@api.type@>(elements.values());
      Collections.sort(list);
      return list.toArray(new @api.type@[list.size()]);
    }
  }
  
  public @api.type@[] getElements()
  {
    return get@api.type@s();
  }

  \@SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  \@Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    init@api.type@s();
  }

  \@Override
  protected void doDeactivate() throws Exception
  {
    elements.clear();
    super.doDeactivate();
  }

  protected void init@api.type@s()
  {
    // TODO Implement @api.type@Manager.init@api.type@s()
  }
}
