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
package org.eclipse.net4j.pop.stream;

import org.eclipse.net4j.pop.IElement;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public interface IMaintenanceStream extends IStream, IRelease.Container
{
  public Container getContainer();

  /**
   * @author Eike Stepper
   */
  public interface Container extends IElement
  {
    public IMaintenanceStream addMaintenanceStream(IBranch branch, ITicket ticket);

    public int getMaintenanceStreamCount();

    public IMaintenanceStream getMaintenanceStream(int index);

    public IMaintenanceStream[] getMaintenanceStreams();
  }
}
