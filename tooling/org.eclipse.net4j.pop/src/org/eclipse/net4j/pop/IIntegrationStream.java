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

import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface IIntegrationStream extends IStream
{
  public IIntegrationStream getParentStream();

  public ITaskStream addTaskStream(IStreamBaseline baseline, ITicket ticket);

  public ITaskStream addTaskStream(Date baselineDate, ITicket ticket);

  public int getTaskStreamCount();

  public ITaskStream getTaskStream(int index);

  public ITaskStream[] getTaskStreams();

  public int getReleaseCount();

  public IRelease getRelease(int index);

  public IRelease[] getReleases();
}
