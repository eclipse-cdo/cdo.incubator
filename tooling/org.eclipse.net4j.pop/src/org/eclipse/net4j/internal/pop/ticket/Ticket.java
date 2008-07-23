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
package org.eclipse.net4j.internal.pop.ticket;

import org.eclipse.net4j.internal.pop.AbstractElement;
import org.eclipse.net4j.pop.stream.IStream;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public class Ticket extends AbstractElement implements ITicket
{
  public Ticket()
  {
  }

  public IStream getStream()
  {
    return null;
  }

  public String getTicketID()
  {
    return null;
  }
}
