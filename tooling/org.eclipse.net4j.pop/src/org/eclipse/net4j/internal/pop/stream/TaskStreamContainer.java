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
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.stream.ITaskStream;
import org.eclipse.net4j.pop.ticket.ITicket;

/**
 * @author Eike Stepper
 */
public class TaskStreamContainer extends ElementContainer<ITaskStream> implements ITaskStream.Container
{
  public TaskStreamContainer(Element notifier)
  {
    super(notifier);
  }

  public ITaskStream addTaskStream(IBranch branch, ITicket ticket)
  {
    ITaskStream taskStream = new TaskStream(this, branch, ticket);
    addElement(taskStream);
    return taskStream;
  }

  public ITaskStream getTaskStream(int index)
  {
    return getElement(index);
  }

  public int getTaskStreamCount()
  {
    return getElementCount();
  }

  public ITaskStream[] getTaskStreams()
  {
    return getElements(ITaskStream.class);
  }
}
