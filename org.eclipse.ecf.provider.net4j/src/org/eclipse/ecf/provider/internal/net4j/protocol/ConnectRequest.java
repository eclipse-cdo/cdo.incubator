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

import org.eclipse.net4j.IChannel;
import org.eclipse.net4j.internal.util.om.trace.ContextTracer;
import org.eclipse.net4j.signal.RequestWithConfirmation;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import org.eclipse.ecf.provider.internal.net4j.bundle.OM;

import java.io.IOException;

/**
 * @author Eike Stepper
 */
public class ConnectRequest extends RequestWithConfirmation<ConnectResult>
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ConnectRequest.class);

  private String repositoryName;

  public ConnectRequest(IChannel channel, String repositoryName)
  {
    super(channel);
    this.repositoryName = repositoryName;
  }

  @Override
  protected short getSignalID()
  {
    return ECFProtocolConstants.SIGNAL_CONNECT;
  }

  @Override
  protected void requesting(ExtendedDataOutputStream out) throws IOException
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Writing repositoryName: {0}", repositoryName);
    }

    out.writeString(repositoryName);
  }

  @Override
  protected ConnectResult confirming(ExtendedDataInputStream in) throws IOException
  {
    return new ConnectResult();
  }
}
