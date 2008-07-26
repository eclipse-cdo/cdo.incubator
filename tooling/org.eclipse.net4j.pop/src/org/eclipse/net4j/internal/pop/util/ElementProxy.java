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
import org.eclipse.net4j.util.ImplementationError;
import org.eclipse.net4j.util.event.IListener;

import java.lang.ref.WeakReference;

/**
 * @author Eike Stepper
 */
public abstract class ElementProxy<ELEMENT extends IElement> implements IElementProxy<ELEMENT>
{
  private IPop pop;

  private String ticketID;

  private WeakReference<ELEMENT> cache;

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
  }

  @Override
  public boolean equals(Object obj)
  {
    return resolve().equals(obj);
  }

  @Override
  public int hashCode()
  {
    return resolve().hashCode();
  }

  @Override
  public String toString()
  {
    return resolve().toString();
  }

  public ELEMENT getElement()
  {
    if (cache != null)
    {
      ELEMENT element = cache.get();
      if (element != null)
      {
        return element;
      }
    }

    ELEMENT element = resolve();
    if (element == null)
    {
      throw new ImplementationError("doResolve() must not return null");
    }

    cache = new WeakReference<ELEMENT>(element);
    return element;
  }

  protected abstract ELEMENT resolve();;
}
