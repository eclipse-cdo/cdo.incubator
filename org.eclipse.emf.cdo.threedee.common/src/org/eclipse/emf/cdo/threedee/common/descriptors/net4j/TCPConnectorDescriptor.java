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
package org.eclipse.emf.cdo.threedee.common.descriptors.net4j;

import org.eclipse.emf.cdo.threedee.common.Element;

import java.net.Socket;

/**
 * @author Eike Stepper
 */
@SuppressWarnings("restriction")
public class TCPConnectorDescriptor extends ConnectorDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return org.eclipse.net4j.internal.tcp.TCPConnector.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    super.initElement(object, element);

    org.eclipse.net4j.internal.tcp.TCPConnector connector = (org.eclipse.net4j.internal.tcp.TCPConnector)object;
    Socket socket = connector.getSocketChannel().socket();

    String local = socket.getLocalAddress().getHostAddress() + ":" + socket.getLocalPort();
    String remote = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();

    element.setLabelAttribute(local + " --> " + remote);
    element.setAttribute("local", local);
    element.setAttribute("remote", remote);
    element.addReference(true, connector.getSocketChannel());
    element.addReference(false, connector.getSelector());
  }
}
