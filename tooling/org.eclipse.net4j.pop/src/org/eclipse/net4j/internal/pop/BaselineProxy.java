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

import org.eclipse.net4j.internal.pop.util.ElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementProxy;
import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.code.ITag;

/**
 * @author Eike Stepper
 */
public class BaselineProxy extends ElementProxy<IBaseline> implements IBaseline
{
  private String tagName;

  private BaselineProxy(IPop pop, String ticketID, String tagName)
  {
    super(pop, ticketID);
    this.tagName = tagName;
  }

  public BaselineProxy(IBaseline baseline, String tagName)
  {
    super(baseline.getStream().getPop(), baseline.getStream().getTicket().getID(), baseline);
    this.tagName = tagName;
  }

  public IElementProxy<? extends IBaseline> copy()
  {
    return new BaselineProxy(getPop(), getTicketID(), tagName);
  }

  public String getTagName()
  {
    return tagName;
  }

  public IStream getStream()
  {
    return getElement().getStream();
  }

  public ITag getTag()
  {
    return getElement().getTag();
  }

  @Override
  protected IBaseline resolve()
  {
    return ((IElementResolver)getPop()).resolve(this);
  }
}
