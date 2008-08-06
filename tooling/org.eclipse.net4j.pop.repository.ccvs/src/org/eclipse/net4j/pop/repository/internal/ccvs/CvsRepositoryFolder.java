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
package org.eclipse.net4j.pop.repository.internal.ccvs;

import org.eclipse.net4j.pop.repository.IRepositoryFolder;
import org.eclipse.net4j.pop.repository.IRepositoryTag;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.ui.UIUtil;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.internal.ccvs.core.CVSException;
import org.eclipse.team.internal.ccvs.core.CVSMessages;
import org.eclipse.team.internal.ccvs.core.CVSProviderPlugin;
import org.eclipse.team.internal.ccvs.core.CVSStatus;
import org.eclipse.team.internal.ccvs.core.CVSTag;
import org.eclipse.team.internal.ccvs.core.CVSTeamProvider;
import org.eclipse.team.internal.ccvs.core.ICVSFolder;
import org.eclipse.team.internal.ccvs.core.ICVSRemoteFolder;
import org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation;
import org.eclipse.team.internal.ccvs.core.Policy;
import org.eclipse.team.internal.ccvs.core.client.Checkout;
import org.eclipse.team.internal.ccvs.core.client.Command;
import org.eclipse.team.internal.ccvs.core.client.Request;
import org.eclipse.team.internal.ccvs.core.client.Session;
import org.eclipse.team.internal.ccvs.core.client.Update;
import org.eclipse.team.internal.ccvs.core.client.Command.LocalOption;
import org.eclipse.team.internal.ccvs.core.connection.CVSServerException;
import org.eclipse.team.internal.ccvs.core.resources.CVSWorkspaceRoot;
import org.eclipse.team.internal.ccvs.core.resources.RemoteFolder;
import org.eclipse.team.internal.ccvs.core.resources.RemoteModule;
import org.eclipse.team.internal.ccvs.ui.operations.CheckoutIntoOperation;
import org.eclipse.team.ui.TeamOperation;
import org.eclipse.ui.IWorkbenchPart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class CvsRepositoryFolder implements IRepositoryFolder
{
  private CvsRepositorySession session;

  private CvsRepositoryTag tag;

  private String path;

  private RemoteFolder cvsFolder;

  public CvsRepositoryFolder(CvsRepositorySession session, CvsRepositoryTag tag, String path)
  {
    this.session = session;
    this.tag = tag;
    this.path = path;
    cvsFolder = new RemoteFolder(null, session.getRepositoryLocation(), path, tag.getCvsTag());

  }

  public CvsRepositorySession getSession()
  {
    return session;
  }

  public IRepositoryTag getTag()
  {
    return tag;
  }

  public String getPath()
  {
    return path;
  }

  public RemoteFolder getCvsFolder()
  {
    return cvsFolder;
  }

  public void checkout(IContainer target, boolean recursive, IProgressMonitor monitor)
  {
    try
    {
      IWorkbenchPart part = UIUtil.getActiveWorkbenchPart();
      TeamOperation operation = new CheckoutIntoOperation(part, cvsFolder, target, recursive);
      operation.run(monitor);
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  public static void checkout(final ICVSRemoteFolder[] resources, final IProject[] projects,
      final IProgressMonitor monitor) throws TeamException
  {
    final TeamException[] eHolder = new TeamException[1];
    try
    {
      IWorkspaceRunnable workspaceRunnable = new IWorkspaceRunnable()
      {
        @SuppressWarnings("unchecked")
        public void run(IProgressMonitor pm) throws CoreException
        {
          try
          {
            pm.beginTask(null, 1000 * resources.length);

            // Get the location of the workspace root
            ICVSFolder root = CVSWorkspaceRoot.getCVSFolderFor(ResourcesPlugin.getWorkspace().getRoot());

            for (int i = 0; i < resources.length; i++)
            {
              IProject project = null;
              RemoteFolder resource = (RemoteFolder)resources[i];

              // Determine the provided target project if there is one
              if (projects != null)
              {
                project = projects[i];
              }

              // Determine the remote module to be checked out
              String moduleName;
              if (resource instanceof RemoteModule)
              {
                moduleName = ((RemoteModule)resource).getName();
              }
              else
              {
                moduleName = resource.getRepositoryRelativePath();
              }

              // Open a connection session to the repository
              ICVSRepositoryLocation repository = resource.getRepository();
              Session session = new Session(repository, root);
              try
              {
                session.open(Policy.subMonitorFor(pm, 50), false /* read-only */);

                // Determine the local target projects (either the project provider or the module expansions)
                final Set targetProjects = new HashSet();
                if (project == null)
                {

                  // Fetch the module expansions
                  IStatus status = Request.EXPAND_MODULES.execute(session, new String[] { moduleName }, Policy
                      .subMonitorFor(pm, 50));
                  if (status.getCode() == CVSStatus.SERVER_ERROR)
                  {
                    throw new CVSServerException(status);
                  }

                  // Convert the module expansions to local projects
                  String[] expansions = session.getModuleExpansions();
                  for (int j = 0; j < expansions.length; j++)
                  {
                    targetProjects.add(ResourcesPlugin.getWorkspace().getRoot().getProject(
                        new Path(null, expansions[j]).segment(0)));
                  }

                }
                else
                {
                  targetProjects.add(project);
                }

                // Prepare the target projects to receive resources
                // root.run(new ICVSRunnable()
                // {
                // public void run(IProgressMonitor monitor) throws CVSException
                // {
                // scrubProjects((IProject[])targetProjects.toArray(new IProject[targetProjects.size()]), monitor);
                // }
                // }, Policy.subMonitorFor(pm, 100));

                // Build the local options
                List localOptions = new ArrayList();
                // Add the option to load into the target project if one was supplied
                if (project != null)
                {
                  localOptions.add(Checkout.makeDirectoryNameOption(project.getName()));
                }
                // Prune empty directories if pruning enabled
                if (CVSProviderPlugin.getPlugin().getPruneEmptyDirectories())
                {
                  localOptions.add(Command.PRUNE_EMPTY_DIRECTORIES);
                }
                // Add the options related to the CVSTag
                CVSTag tag = resource.getTag();
                if (tag == null)
                {
                  // A null tag in a remote resource indicates HEAD
                  tag = CVSTag.DEFAULT;
                }
                localOptions.add(Update.makeTagOption(tag));

                // Perform the checkout
                IStatus status = Command.CHECKOUT.execute(session, Command.NO_GLOBAL_OPTIONS,
                    (LocalOption[])localOptions.toArray(new LocalOption[localOptions.size()]),
                    new String[] { moduleName }, null, Policy.subMonitorFor(pm, 800));
                if (status.getCode() == CVSStatus.SERVER_ERROR)
                {
                  // XXX Should we cleanup any partially checked out projects?
                  throw new CVSServerException(status);
                }

                // Bring the project into the workspace
                refreshProjects((IProject[])targetProjects.toArray(new IProject[targetProjects.size()]), Policy
                    .subMonitorFor(pm, 100));

              }
              finally
              {
                session.close();
              }
            }
          }
          catch (TeamException e)
          {
            // Pass it outside the workspace runnable
            eHolder[0] = e;
          }
          finally
          {
            pm.done();
          }
          // CoreException and OperationCanceledException are propagated
        }
      };
      ResourcesPlugin.getWorkspace().run(workspaceRunnable, getCheckoutRule(projects), 0, monitor);
    }
    catch (CoreException e)
    {
      throw CVSException.wrapException(e);
    }
    finally
    {
      monitor.done();
    }
    // Re-throw the TeamException, if one occurred
    if (eHolder[0] != null)
    {
      throw eHolder[0];
    }
  }

  @SuppressWarnings("unchecked")
  private static ISchedulingRule getCheckoutRule(final IProject[] projects)
  {
    if (projects.length == 1)
    {
      return ResourcesPlugin.getWorkspace().getRuleFactory().modifyRule(projects[0]);
    }
    else
    {
      Set rules = new HashSet();
      for (int i = 0; i < projects.length; i++)
      {
        ISchedulingRule modifyRule = ResourcesPlugin.getWorkspace().getRuleFactory().modifyRule(projects[i]);
        if (modifyRule instanceof IResource && ((IResource)modifyRule).getType() == IResource.ROOT)
        {
          // One of the projects is mapped to a provider that locks the workspace.
          // Just return the workspace root rule
          return modifyRule;
        }
        rules.add(modifyRule);
      }
      return new MultiRule((ISchedulingRule[])rules.toArray(new ISchedulingRule[rules.size()]));
    }
  }

  /*
   * Bring the provied projects into the workspace
   */
  /* internal use only */static void refreshProjects(IProject[] projects, IProgressMonitor monitor)
      throws CoreException, TeamException
  {
    monitor.beginTask(CVSMessages.CVSProvider_Creating_projects_2, projects.length * 100);
    try
    {
      for (int i = 0; i < projects.length; i++)
      {
        IProject project = projects[i];
        // Register the project with Team
        RepositoryProvider.map(project, CVSProviderPlugin.getTypeId());
        CVSTeamProvider provider = (CVSTeamProvider)RepositoryProvider.getProvider(project, CVSProviderPlugin
            .getTypeId());
        provider.setWatchEditEnabled(CVSProviderPlugin.getPlugin().isWatchEditEnabled());
      }

    }
    finally
    {
      monitor.done();
    }
  }
}
