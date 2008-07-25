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
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.delivery.IDelivery;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface ITaskStream extends IStream
{
  public IIntegrationStream getParentStream();

  public IDelivery addDelivery(Date deliveryDate);

  // /**
  // * @author Eike Stepper
  // */
  // public interface Container extends IElement
  // {
  // public int getTaskStreamCount();
  //
  // public ITaskStream getTaskStream(int index);
  //
  // public ITaskStream[] getTaskStreams();
  // }
}