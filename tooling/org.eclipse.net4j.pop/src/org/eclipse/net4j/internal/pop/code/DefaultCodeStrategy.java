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
package org.eclipse.net4j.internal.pop.code;

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ICodeStrategy;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class DefaultCodeStrategy extends Element implements ICodeStrategy
{
  public DefaultCodeStrategy()
  {
  }

  public IBranch createMaintenanceBranch(IRelease baseline, ITicket ticket)
  {
    IVersion baselineVersion = baseline.getVersion();
    ITag baselineTag = baseline.getTag();
    IBranch baselineBranch = baselineTag.getBranch();

    String branchName = "R" + baselineVersion.getMajor() + "_" + baselineVersion.getMinor() + "_maintenance";
    String tagName = "Root_" + branchName;
    ITag tag = baselineBranch.addTag(tagName, baselineTag.getDate());
    return baselineBranch.addBranch(branchName, tag);
  }

  public IBranch createTaskBranch(IBaseline baseline, ITicket ticket)
  {
    // TODO Implement DefaultCodeStrategy.createTaskBranch(baseline, ticket)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public IBaseline createTaskBaseline(IIntegrationStream stream, Date date, ITicket ticket)
  {
    // TODO Implement DefaultCodeStrategy.createTaskBaseline(stream, date, ticket)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public ITag createMilestoneTag(IRelease release, String name)
  {
    // TODO Implement DefaultCodeStrategy.createMilestoneTag(release, name)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public ITag createReleaseTag(IIntegrationStream stream, IVersion version)
  {
    // TODO Implement DefaultCodeStrategy.createReleaseTag(stream, version)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public Date getTagDate(ITag tag)
  {
    // TODO Implement DefaultCodeStrategy.getTagDate(tag)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public String toString()
  {
    return "DEFAULT";
  }
}
