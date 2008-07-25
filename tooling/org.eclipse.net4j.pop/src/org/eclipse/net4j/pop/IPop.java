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

import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ICommitter;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.stream.IDevelopmentStream;
import org.eclipse.net4j.pop.stream.IIntegrationStream;
import org.eclipse.net4j.pop.stream.IStreamBaseline;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.pop.util.IElement;

import java.util.Date;

/**
 * Represents a <em>point of process</em>, a concept similar to a <em>project</em>.
 * <p>
 * 
 * @author Eike Stepper
 */
public interface IPop extends IDevelopmentStream, ICommitter.Container
{
  /**
   * Returns this instance.
   */
  public IPop getStream();

  /**
   * Returns <code>null</code>.
   */
  public IPop getParentStream();

  /**
   * Returns <code>null</code>.
   */
  public IPop getParentElement();

  public String getName();

  public Strategy getStrategy();

  public ICommitter addCommitter(String name, String email, String ticketAccount, String codeAccount);

  /**
   * @author Eike Stepper
   */
  public interface Strategy extends IElement
  {
    public static final Strategy DEFAULT = new org.eclipse.net4j.internal.pop.PopStrategy();

    public IBranch createMaintenanceBranch(IRelease baseline, ITicket ticket);

    public IBranch createTaskBranch(IStreamBaseline baseline, ITicket ticket);

    public ITag createReleaseTag(IIntegrationStream stream, IVersion version);

    public ITag createMilestoneTag(IRelease release, String name);

    public Date getTagDate(ITag tag);

  }
}
