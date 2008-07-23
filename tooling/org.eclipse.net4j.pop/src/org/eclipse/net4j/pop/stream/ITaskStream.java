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

import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.delivery.IDelivery;

import org.eclipse.core.runtime.IAdaptable;

/**
 * @author Eike Stepper
 */
public interface ITaskStream extends IStream, IDelivery.Container
{
  public Container getTaskStreamContainer();

  /**
   * @author Eike Stepper
   */
  public interface Container extends IAdaptable
  {
    public ITaskStream addTaskStream(ITag baseline, String ticketID);

    public int getTaskStreamCount();

    public ITaskStream getTaskStream(int index);

    public ITaskStream[] getTaskStreams();
  }
}
