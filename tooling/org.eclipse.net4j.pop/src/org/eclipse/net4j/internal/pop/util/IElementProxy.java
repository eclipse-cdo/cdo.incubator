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
package org.eclipse.net4j.internal.pop.util;

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.util.IElement;

/**
 * @author Eike Stepper
 */
public interface IElementProxy<ELEMENT extends IElement> extends IElement
{
  public IPop getPop();

  public String getTicketID();

  public ELEMENT getElement();

  public IElementProxy<? extends ELEMENT> copy();
}
