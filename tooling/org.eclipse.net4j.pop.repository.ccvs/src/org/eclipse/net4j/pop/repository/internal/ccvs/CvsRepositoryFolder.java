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

import org.eclipse.team.internal.ccvs.core.resources.RemoteFolder;

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
}
