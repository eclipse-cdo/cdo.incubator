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

import org.eclipse.net4j.internal.pop.Baseline;
import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ICodeStrategy;
import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.ticket.ITicket;

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
    checkArgument(baseline, "baseline");
    checkArgument(ticket, "ticket");
    String branchName = getMaintenanceBranchName(baseline, ticket);
    return createBranch(baseline, branchName);
  }

  public IBranch createTaskBranch(IBaseline baseline, ITicket ticket)
  {
    checkArgument(baseline, "baseline");
    checkArgument(ticket, "ticket");
    String branchName = getTaskBranchName(baseline, ticket);
    return createBranch(baseline, branchName);
  }

  public IBaseline createTaskBaseline(IIntegrationStream stream, ITicket ticket)
  {
    checkArgument(stream, "stream");
    checkArgument(ticket, "ticket");
    String branchName = getTaskBranchName(stream, ticket);
    String tagName = getStartTag(branchName);
    return new Baseline(stream, tagName);
  }

  public ITag createMilestoneTag(IRelease release, String name)
  {
    checkArgument(release, "release");
    checkArgument(name, "name");
    String tagName = getMilestoneTagName(release, name);
    return release.getStream().getBranch().addTag(tagName);
  }

  public ITag createReleaseTag(IIntegrationStream stream, IVersion version)
  {
    checkArgument(stream, "stream");
    checkArgument(version, "version");
    String tagName = getReleaseTagName(stream, version);
    return stream.getBranch().addTag(tagName);
  }

  @Override
  public String toString()
  {
    return "DEFAULT";
  }

  protected IBranch createBranch(IBaseline baseline, String branchName)
  {
    String tagName = getStartTag(branchName);

    ITag baselineTag = baseline.getTag();
    IBranch baselineBranch = baselineTag.getBranch();
    ITag tag = baselineBranch.addTag(tagName);
    return baselineBranch.addBranch(branchName, tag);
  }

  protected String getMaintenanceBranchName(IRelease baseline, ITicket ticket)
  {
    IVersion baselineVersion = baseline.getVersion();
    return "R" + baselineVersion.getMajor() + "_" + baselineVersion.getMinor() + "_maintenance";
  }

  protected String getTaskBranchName(IBaseline baseline, ITicket ticket)
  {
    IIntegrationStream stream = (IIntegrationStream)baseline.getStream();
    return getTaskBranchName(stream, ticket);
  }

  protected String getTaskBranchName(IIntegrationStream stream, ITicket ticket)
  {
    return "task_" + ticket.getID();
  }

  protected String getReleaseTagName(IStream stream, IVersion version)
  {
    return "release_" + version.getMajor() + "_" + version.getMinor() + "_" + version.getMicro();
  }

  protected String getMilestoneTagName(IRelease release, String name)
  {
    String releaseTagName = getReleaseTagName(release.getStream(), release.getVersion());
    return releaseTagName + "_" + name;
  }

  protected String getStartTag(String branchName)
  {
    return "Root_" + branchName;
  }
}
