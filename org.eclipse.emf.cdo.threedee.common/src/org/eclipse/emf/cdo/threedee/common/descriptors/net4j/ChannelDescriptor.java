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
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.spi.net4j.Channel;

/**
 * @author Eike Stepper
 */
public class ChannelDescriptor extends ElementDescriptor
{
  @Override
  public Class<?> getType()
  {
    return Channel.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    Channel channel = (Channel)object;
    element.setIDAttribute(channel.getID());
    element.setAttribute("location", channel.getLocation());
    element.setAttribute("user", channel.getUserID());
    // element.addReference(false, channel.getMultiplexer());
    element.addReference(true, channel.getReceiveHandler());
  }
}
