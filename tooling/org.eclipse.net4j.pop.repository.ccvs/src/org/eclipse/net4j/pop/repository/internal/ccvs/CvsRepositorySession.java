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
import org.eclipse.net4j.pop.repository.ccvs.ICvsRepositorySession;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.team.internal.ccvs.core.CVSException;
import org.eclipse.team.internal.ccvs.core.ICVSFolder;
import org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation;
import org.eclipse.team.internal.ccvs.core.client.Session;
import org.eclipse.team.internal.ccvs.core.resources.CVSWorkspaceRoot;
import org.eclipse.team.internal.ccvs.core.util.KnownRepositories;

/**
 * @author Eike Stepper
 */
public class CvsRepositorySession extends RepositorySession implements ICvsRepositorySession
{
  private ICVSFolder localRoot;

  private ICVSRepositoryLocation repositoryLocation;

  private Session cvsSession;

  public CvsRepositorySession(CvsRepositoryAdapter adapter, String repositoryDescription, boolean writeAccess,
      IProgressMonitor monitor) throws CVSException
  {
    super(adapter, repositoryDescription, writeAccess);
    localRoot = CVSWorkspaceRoot.getCVSFolderFor(ResourcesPlugin.getWorkspace().getRoot());
    repositoryLocation = KnownRepositories.getInstance().getRepository(repositoryDescription);
    cvsSession = new Session(repositoryLocation, localRoot);
    cvsSession.open(monitor, writeAccess);
  }

  @Override
  public CvsRepositoryAdapter getAdapter()
  {
    return (CvsRepositoryAdapter)super.getAdapter();
  }

  public ICVSFolder getLocalRoot()
  {
    return localRoot;
  }

  public Session getCvsSession()
  {
    return cvsSession;
  }

  public ICVSRepositoryLocation getRepositoryLocation()
  {
    return repositoryLocation;
  }

  public void close()
  {
  }
}
