/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.common;

/**
 * @author Eike Stepper
 */
public interface ThreeDeeProtocol
{
  public static final String PROTOCOL_NAME = "threedee";

  public static final int PROTOCOL_PORT = 2040;

  public static final short SIGNAL_OPEN_SESSION = 0;

  public static final short SIGNAL_SEND_EVENT = 1;
}
