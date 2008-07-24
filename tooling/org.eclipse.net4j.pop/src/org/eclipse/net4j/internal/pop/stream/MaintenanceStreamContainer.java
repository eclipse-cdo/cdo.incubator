/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.internal.pop.stream;

import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.internal.pop.ElementContainer;
import org.eclipse.net4j.pop.stream.IMaintenanceStream;

/**
 * @author Eike Stepper
 */
public class MaintenanceStreamContainer extends ElementContainer<IMaintenanceStream> implements
    IMaintenanceStream.Container
{
  public MaintenanceStreamContainer(Element delegator)
  {
    super(delegator);
  }

  public IMaintenanceStream getMaintenanceStream(int index)
  {
    return getElement(index);
  }

  public int getMaintenanceStreamCount()
  {
    return getElementCount();
  }

  public IMaintenanceStream[] getMaintenanceStreams()
  {
    return getElements(IMaintenanceStream.class);
  }
}
