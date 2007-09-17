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
import org.eclipse.net4j.signal.IndicationWithResponse;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import org.eclipse.ecf.provider.internal.net4j.bundle.OM;

import java.io.IOException;

/**
 * @author Eike Stepper
 */
public class DisconnectIndication extends IndicationWithResponse
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, DisconnectIndication.class);

  public DisconnectIndication()
  {
  }

  @Override
  protected short getSignalID()
  {
    return ECFProtocolConstants.SIGNAL_DISCONNECT;
  }

  @Override
  protected void indicating(ExtendedDataInputStream in) throws IOException
  {
  }

  @Override
  protected void responding(ExtendedDataOutputStream out) throws IOException
  {
  }
}
