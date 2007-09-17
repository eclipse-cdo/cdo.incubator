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

/**
 * @author Eike Stepper
 */
public interface ECFProtocolConstants
{
  public static final String PROTOCOL_NAME = "ecf";

  public static final short SIGNAL_CONNECT = 1;

  public static final short SIGNAL_DISCONNECT = 2;

  public static final short SIGNAL_ASYNCH_MESSAGE = 3;

  public static final short SIGNAL_SYNCH_MESSAGE = 4;
}
