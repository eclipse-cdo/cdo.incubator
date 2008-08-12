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

import org.eclipse.net4j.pop.internal.repository.RepositorySession;
import org.eclipse.net4j.pop.repository.IRepositoryFolder;
import org.eclipse.net4j.pop.repository.IRepositoryTag;
import org.eclipse.net4j.pop.repository.IRepositoryTag.Branch;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.team.internal.ccvs.core.CVSException;
import org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation;
import org.eclipse.team.internal.ccvs.core.client.Session;
import org.eclipse.team.internal.ccvs.core.resources.CVSWorkspaceRoot;
import org.eclipse.team.internal.ccvs.core.util.KnownRepositories;

/**
 * @author Eike Stepper
 */
public class CvsRepositorySession extends RepositorySession
{
  private ICVSRepositoryLocation repositoryLocation;

  private Session cvsSession;

  public CvsRepositorySession(CvsRepositoryAdapter adapter, String repositoryDescription, IContainer localRoot,
      boolean writeAccess, IProgressMonitor monitor) throws CVSException
  {
    super(adapter, repositoryDescription, localRoot, writeAccess);
    repositoryLocation = KnownRepositories.getInstance().getRepository(repositoryDescription);
    cvsSession = new Session(repositoryLocation, CVSWorkspaceRoot.getCVSFolderFor(localRoot));
    cvsSession.open(monitor, writeAccess);
  }

  @Override
  public CvsRepositoryAdapter getAdapter()
  {
    return (CvsRepositoryAdapter)super.getAdapter();
  }

  public ICVSRepositoryLocation getRepositoryLocation()
  {
    return repositoryLocation;
  }

  public Session getCvsSession()
  {
    return cvsSession;
  }

  public IRepositoryFolder getFolder(IRepositoryTag tag, String path)
  {
    return new CvsRepositoryFolder(this, (CvsRepositoryTag)tag, path);
  }

  public Branch branch(String branchName, String rootTagName, IProgressMonitor monitor)
  {
    // TODO: implement CvsRepositorySession.branch(branchName, rootTagName, monitor)
    throw new UnsupportedOperationException();
  }

  public void close()
  {
    cvsSession.close();
  }
}
