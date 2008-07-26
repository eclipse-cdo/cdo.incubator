/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights resolve()erved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.internal.pop.util;

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.util.IElement;
import org.eclipse.net4j.pop.util.IElementProxy;
import org.eclipse.net4j.util.event.IListener;

/**
 * @author Eike Stepper
 */
public abstract class ElementProxy<ELEMENT extends IElement> implements IElementProxy<ELEMENT>
{
  private IPop pop;

  private String ticketID;

  protected ElementProxy(IPop pop, String ticketID)
  {
    this.pop = pop;
    this.ticketID = ticketID;
  }

  public IPop getPop()
  {
    return pop;
  }

  public String getTicketID()
  {
    return ticketID;
  }

  public IListener[] getListeners()
  {
    return resolve().getListeners();
  }

  public boolean hasListeners()
  {
    return resolve().hasListeners();
  }

  public void addListener(IListener listener)
  {
    resolve().addListener(listener);
  }

  public void removeListener(IListener listener)
  {
    resolve().removeListener(listener);
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return resolve().getAdapter(adapter);
  };
}
