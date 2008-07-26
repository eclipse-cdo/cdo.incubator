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

  public IBaseline createTaskBaseline(IIntegrationStream stream, Date date, ITicket ticket)
  {
    checkArgument(stream, "stream");
    checkArgument(date, "date");
    checkArgument(ticket, "ticket");
    String branchName = getTaskBranchName(stream, date, ticket);
    String tagName = getStartTag(branchName);
    return new Baseline(stream, tagName, date);
  }

  public ITag createMilestoneTag(IRelease release, Date date, String name)
  {
    checkArgument(release, "release");
    checkArgument(name, "name");
    String tagName = getMilestoneTagName(release, date, name);
    return release.getStream().getBranch().addTag(tagName, date);
  }

  public ITag createReleaseTag(IIntegrationStream stream, Date date, IVersion version)
  {
    checkArgument(stream, "stream");
    checkArgument(version, "version");
    String tagName = getReleaseTagName(stream, date, version);
    return stream.getBranch().addTag(tagName, date);
  }

  public Date getTagDate(ITag tag)
  {
    checkArgument(tag, "tag");
    // TODO Implement DefaultCodeStrategy.getTagDate(tag)
    throw new UnsupportedOperationException("Not yet implemented");
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
    ITag tag = baselineBranch.addTag(tagName, baselineTag.getDate());
    return baselineBranch.addBranch(branchName, tag);
  }

  protected String getMaintenanceBranchName(IRelease baseline, ITicket ticket)
  {
    IVersion baselineVersion = baseline.getVersion();
    return "R" + baselineVersion.getMajor() + "_" + baselineVersion.getMinor() + "_maintenance";
  }

  protected String getTaskBranchName(IBaseline baseline, ITicket ticket)
  {
    Date date = baseline.getTag().getDate();
    IIntegrationStream stream = (IIntegrationStream)baseline.getStream();
    return getTaskBranchName(stream, date, ticket);
  }

  @SuppressWarnings("deprecation")
  protected String getTaskBranchName(IIntegrationStream stream, Date date, ITicket ticket)
  {
    return "task_" + date.getYear() + date.getMonth() + date.getDay();
  }

  protected String getReleaseTagName(IIntegrationStream stream, Date date, IVersion version)
  {
    return "release_" + version.getMajor() + "_" + version.getMinor() + "_" + version.getMicro();
  }

  protected String getMilestoneTagName(IRelease release, Date date, String name)
  {
    String releaseTagName = getReleaseTagName(release.getStream(), release.getTag().getDate(), release.getVersion());
    return releaseTagName + "_" + name;
  }

  protected String getStartTag(String branchName)
  {
    return "Root_" + branchName;
  }
}
