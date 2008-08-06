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
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.WrappedException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.team.internal.ccvs.core.CVSException;
import org.eclipse.team.internal.ccvs.core.CVSProviderPlugin;
import org.eclipse.team.internal.ccvs.core.CVSTag;
import org.eclipse.team.internal.ccvs.core.ICVSFolder;
import org.eclipse.team.internal.ccvs.core.Policy;
import org.eclipse.team.internal.ccvs.core.client.Checkout;
import org.eclipse.team.internal.ccvs.core.client.Command;
import org.eclipse.team.internal.ccvs.core.client.Session;
import org.eclipse.team.internal.ccvs.core.client.Update;
import org.eclipse.team.internal.ccvs.core.client.Command.LocalOption;
import org.eclipse.team.internal.ccvs.core.resources.CVSWorkspaceRoot;
import org.eclipse.team.internal.ccvs.core.resources.RemoteFolder;
import org.eclipse.team.internal.ccvs.core.syncinfo.FolderSyncInfo;

import java.util.ArrayList;
import java.util.List;

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

  public void checkoutAs(IContainer parent, String localName, boolean recursive, IProgressMonitor monitor)
  {
    try
    {
      ICVSFolder parentFolder = CVSWorkspaceRoot.getCVSFolderFor(parent);
      if (localName == null)
      {
        IPath path = new Path(null, cvsFolder.getRepositoryRelativePath());
        if (path.segmentCount() > 1)
        {
          localName = path.lastSegment();
        }
      }

      // Add recurse option
      List<LocalOption> localOptions = new ArrayList<LocalOption>();
      if (!recursive)
      {
        localOptions.add(Command.DO_NOT_RECURSE);
      }

      if (localName != null)
      {
        localOptions.add(Checkout.makeDirectoryNameOption(localName));
      }

      // Prune empty directories if pruning enabled
      if (CVSProviderPlugin.getPlugin().getPruneEmptyDirectories())
      {
        localOptions.add(Command.PRUNE_EMPTY_DIRECTORIES);
      }

      // Add the options related to the CVSTag
      CVSTag tag = cvsFolder.getTag();
      if (tag == null || ObjectUtil.equals(tag.getName(), CVSTag.DEFAULT.getName()))
      {
        tag = CVSTag.DEFAULT;
      }

      localOptions.add(Update.makeTagOption(tag));

      // Perform the checkout
      Session cvsSession = session.getCvsSession();
      IStatus status = Command.CHECKOUT.execute(cvsSession, Command.NO_GLOBAL_OPTIONS, localOptions
          .toArray(new LocalOption[localOptions.size()]), new String[] { cvsFolder.getRepositoryRelativePath() }, null,
          Policy.subMonitorFor(monitor, 80));
      if (!status.isOK())
      {
        throw new CoreException(status);
      }

      ICVSFolder targetFolder = parentFolder.getFolder(localName);
      String root = session.getCvsSession().getCVSRepositoryLocation().getLocation(false);
      manageFolder(targetFolder, root);
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  private static void manageFolder(ICVSFolder folder, String root) throws CVSException
  {
    // Ensure that the parent is a CVS folder
    ICVSFolder parent = folder.getParent();
    if (!parent.isCVSFolder())
    {
      parent.setFolderSyncInfo(new FolderSyncInfo(FolderSyncInfo.VIRTUAL_DIRECTORY, root, CVSTag.DEFAULT, true));
      IResource resource = parent.getIResource();
      if (resource.getType() != IResource.PROJECT)
      {
        manageFolder(parent, root);
      }
    }

    // reset the folder sync info so it will be managed by it's parent
    folder.setFolderSyncInfo(folder.getFolderSyncInfo());
  }
}
