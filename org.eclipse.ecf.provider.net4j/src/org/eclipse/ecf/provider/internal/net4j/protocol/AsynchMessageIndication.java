/***************************************************************************
 * Copyright (c) 2004 - 2007 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.ecf.provider.internal.net4j.protocol;

import org.eclipse.net4j.internal.util.om.trace.ContextTracer;
import org.eclipse.net4j.signal.Indication;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;

import org.eclipse.ecf.provider.internal.net4j.bundle.OM;

import java.io.IOException;

/**
 * @author Eike Stepper
 */
public class AsynchMessageIndication extends Indication
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, AsynchMessageIndication.class);

  public AsynchMessageIndication()
  {
  }

  @Override
  protected short getSignalID()
  {
    return ECFProtocolConstants.SIGNAL_ASYNCH_MESSAGE;
  }

  @Override
  protected void indicating(ExtendedDataInputStream in) throws IOException
  {
  }
}
