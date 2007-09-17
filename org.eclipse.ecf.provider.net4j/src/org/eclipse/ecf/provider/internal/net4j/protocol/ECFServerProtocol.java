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

import org.eclipse.net4j.signal.SignalReactor;

/**
 * @author Eike Stepper
 */
public class ECFServerProtocol extends ECFProtocol
{
  public ECFServerProtocol()
  {
  }

  @Override
  protected SignalReactor doCreateSignalReactor(short signalID)
  {
    switch (signalID)
    {
    case ECFProtocolConstants.SIGNAL_CONNECT:
      return new ConnectIndication();

    case ECFProtocolConstants.SIGNAL_DISCONNECT:
      return new DisconnectIndication();

    default:
      return super.doCreateSignalReactor(signalID);
    }
  }
}
