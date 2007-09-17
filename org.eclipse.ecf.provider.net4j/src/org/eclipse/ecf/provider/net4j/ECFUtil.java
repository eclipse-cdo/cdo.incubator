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
package org.eclipse.ecf.provider.net4j;

import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.provider.internal.net4j.container.Net4jClientContainerInjector;
import org.eclipse.ecf.provider.internal.net4j.container.Net4jClientSOContainerFactory;
import org.eclipse.ecf.provider.internal.net4j.container.Net4jServerContainerInjector;
import org.eclipse.ecf.provider.internal.net4j.container.Net4jServerSOContainerFactory;
import org.eclipse.ecf.provider.internal.net4j.protocol.ECFClientProtocolFactory;
import org.eclipse.ecf.provider.internal.net4j.protocol.ECFServerProtocolFactory;

/**
 * @author Eike Stepper
 */
public final class ECFUtil
{
  private ECFUtil()
  {
  }

  public static void prepareServerContainer(IManagedContainer container)
  {
    container.registerFactory(new ECFServerProtocolFactory());
    container.registerFactory(new Net4jServerSOContainerFactory());
    container.addPostProcessor(new Net4jServerContainerInjector());
  }

  public static void prepareClientContainer(IManagedContainer container)
  {
    container.registerFactory(new ECFClientProtocolFactory());
    container.registerFactory(new Net4jClientSOContainerFactory());
    container.addPostProcessor(new Net4jClientContainerInjector());
  }
}
