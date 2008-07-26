package org.eclipse.net4j.pop.code;

import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IIntegrationStream;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.pop.util.IElement;

/**
 * @author Eike Stepper
 */
public interface ICodeStrategy extends IElement
{
  public static final ICodeStrategy DEFAULT = new org.eclipse.net4j.internal.pop.code.DefaultCodeStrategy();

  public IBranch createMaintenanceBranch(IRelease baseline, ITicket ticket);

  public IBranch createTaskBranch(IBaseline baseline, ITicket ticket);

  public IBaseline createTaskBaseline(IIntegrationStream stream, ITicket ticket);

  public ITag createReleaseTag(IIntegrationStream stream, IVersion version);

  public ITag createMilestoneTag(IRelease release, String name);
}
