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

import org.eclipse.spi.net4j.Channel;

/**
 * @author Eike Stepper
 */
public class ChannelDescriptor extends Net4jDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return Channel.class;
  }

  @Override
  protected void doInitElement(Object object, Element element)
  {
    Channel channel = (Channel)object;
    element.setIDAttribute(channel.getID());
    element.setAttribute("location", channel.getLocation());
    element.setAttribute("user", channel.getUserID());
    element.addReference(true, channel.getReceiveHandler());
    // element.addReference(true, channel.getSendQueue());
  }
}
