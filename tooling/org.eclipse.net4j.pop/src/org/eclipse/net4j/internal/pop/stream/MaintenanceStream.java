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

import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.stream.IMaintenanceStream;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public class MaintenanceStream extends IntegrationStream implements IMaintenanceStream
{
  private Container container;

  public MaintenanceStream(Container container, IBranch branch, ITicket ticket)
  {
    super(branch, ticket);
    this.container = container;
  }

  public Container getContainer()
  {
    return container;
  }
}
