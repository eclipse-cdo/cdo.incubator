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
package org.eclipse.net4j.pop.internal.repository;

import org.eclipse.net4j.pop.repository.IRepositorySession;

import org.eclipse.core.runtime.PlatformObject;

/**
 * @author Eike Stepper
 */
public abstract class RepositorySession extends PlatformObject implements IRepositorySession
{
  private RepositoryAdapter adapter;

  private String repositoryDescription;

  private boolean writeAccess;

  public RepositorySession(RepositoryAdapter adapter, String repositoryDescription, boolean writeAccess)
  {
    this.adapter = adapter;
    this.repositoryDescription = repositoryDescription;
    this.writeAccess = writeAccess;
  }

  public RepositoryAdapter getAdapter()
  {
    return adapter;
  }

  public String getRepositoryDescription()
  {
    return repositoryDescription;
  }

  public boolean isWriteAccess()
  {
    return writeAccess;
  }
}
