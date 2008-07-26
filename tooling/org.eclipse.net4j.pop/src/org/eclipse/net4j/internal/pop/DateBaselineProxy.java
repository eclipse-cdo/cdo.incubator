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
import org.eclipse.net4j.pop.IDateBaseline;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.code.ITag;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class DateBaselineProxy extends ElementProxy<IDateBaseline> implements IDateBaseline
{
  private DateBaselineProxy(IPop pop, String ticketID)
  {
    super(pop, ticketID);
  }

  public DateBaselineProxy(IDateBaseline dateBaseline)
  {
    super(dateBaseline.getStream().getPop(), dateBaseline.getStream().getTicket().getID(), dateBaseline);
  }

  public IElementProxy<? extends IDateBaseline> copy()
  {
    return new DateBaselineProxy(getPop(), getTicketID());
  }

  public IStream getStream()
  {
    return getElement().getStream();
  }

  public ITag getTag()
  {
    return getElement().getTag();
  }

  public Date getDate()
  {
    return getElement().getDate();
  }

  @Override
  protected IDateBaseline resolve()
  {
    return ((IElementResolver)getPop()).resolve(this);
  }
}
