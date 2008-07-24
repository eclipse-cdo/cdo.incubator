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

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IPopElement;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.stream.IStream;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.util.ImplementationError;

/**
 * @author Eike Stepper
 */
public abstract class PopElement extends Element implements IPopElement
{
  protected PopElement()
  {
    if (this instanceof IStream)
    {
      throw new ImplementationError();
    }
  }

  public IPop getPop()
  {
    return getParentElement().getPop();
  }

  public IBranch getBranch()
  {
    return getParentElement().getBranch();
  }

  public IStream getParentStream()
  {
    return getParentElement().getParentStream();
  }

  public IStream getStream()
  {
    return getParentElement().getStream();
  }

  public ITicket getTicket()
  {
    return getParentElement().getTicket();
  }
}
