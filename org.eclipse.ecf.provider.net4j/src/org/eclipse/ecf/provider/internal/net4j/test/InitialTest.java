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
package org.eclipse.ecf.provider.internal.net4j.test;

import org.eclipse.net4j.tests.AbstractTransportTest;
import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.identity.IDFactory;
import org.eclipse.ecf.core.sharedobject.ISharedObjectContainerConfig;
import org.eclipse.ecf.provider.generic.SOContainerConfig;
import org.eclipse.ecf.provider.generic.TCPServerSOContainer;
import org.eclipse.ecf.provider.internal.net4j.container.Net4jClientSOContainerFactory;
import org.eclipse.ecf.provider.internal.net4j.container.Net4jServerSOContainerFactory;
import org.eclipse.ecf.provider.net4j.ECFUtil;
import org.eclipse.ecf.provider.net4j.container.Net4jClientSOContainer;
import org.eclipse.ecf.provider.net4j.container.Net4jServerSOContainer;
import org.eclipse.internal.net4j.Acceptor;

/**
 * @author Eike Stepper
 */
public class InitialTest extends AbstractTransportTest
{
  @Override
  protected IManagedContainer createContainer()
  {
    IManagedContainer container = super.createContainer();
    ECFUtil.prepareServerContainer(container);
    ECFUtil.prepareClientContainer(container);
    return container;
  }

  public void testFirst() throws Exception
  {
    Acceptor acceptor = getAcceptor();
    acceptor.activate();

    Net4jServerSOContainer server = Net4jServerSOContainerFactory.get(container, "group1");
    Net4jClientSOContainer client = Net4jClientSOContainerFactory.get(container, "tcp://localhost/group1");
    client.connect(server.getID(), null);

    ISharedObjectContainerConfig config = new SOContainerConfig(IDFactory.getDefault().createGUID());
    Net4jClientSOContainer container = new Net4jClientSOContainer(config);
    // now join group
    ID serverID = IDFactory.getDefault().createStringID(TCPServerSOContainer.getDefaultServerURL());
    container.connect(serverID, null);
    Thread.sleep(200000);
  }
}
