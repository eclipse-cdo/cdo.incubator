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

import org.eclipse.net4j.pop.internal.repository.RepositoryAdapter;
import org.eclipse.net4j.pop.repository.IRepositorySession;
import org.eclipse.net4j.pop.repository.IRepositoryTag;
import org.eclipse.net4j.pop.repository.IRepositoryTag.Branch;
import org.eclipse.net4j.pop.repository.IRepositoryTag.Version;
import org.eclipse.net4j.util.WrappedException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.team.internal.ccvs.core.CVSException;
import org.eclipse.team.internal.ccvs.core.CVSTag;

/**
 * @author Eike Stepper
 */
public class CvsRepositoryAdapter extends RepositoryAdapter
{
  public static final String TYPE = "CVS";

  public static final String DEFAULT_MAIN_BRANCH_NAME = CVSTag.DEFAULT.getName();

  public CvsRepositoryAdapter()
  {
  }

  public String getType()
  {
    return TYPE;
  }

  public String getDefaultMainBranchName()
  {
    return DEFAULT_MAIN_BRANCH_NAME;
  }

  public Branch createBranchTag(String name)
  {
    return new CvsRepositoryTag.Branch(this, name);
  }

  public Version createVersionTag(String name)
  {
    return new CvsRepositoryTag.Version(this, name);
  }

  public IRepositoryTag.Date createDateTag(java.util.Date date)
  {
    return new CvsRepositoryTag.Date(this, date);
  }

  public IRepositorySession openSession(String repositoryDescriptor, IContainer localRoot, boolean writeAccess,
      IProgressMonitor monitor)
  {
    try
    {
      return new CvsRepositorySession(this, repositoryDescriptor, localRoot, writeAccess, monitor);
    }
    catch (CVSException ex)
    {
      throw WrappedException.wrap(ex);
    }
  }
}
