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
package org.eclipse.net4j.pop.repository;

import org.eclipse.net4j.util.registry.IRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Eike Stepper
 */
public interface IRepositoryAdapter extends IAdaptable
{
  public String getType();

  public IRepositoryTag.Branch createBranchTag(String name);

  public IRepositoryTag.Version createVersionTag(String name);

  public IRepositoryTag.Date createDateTag(java.util.Date date);

  public IRepositorySession openSession(String repositoryDescription, boolean writeAccess, IProgressMonitor monitor);

  /**
   * @author Eike Stepper
   */
  public interface Registry extends IRegistry<String, IRepositoryAdapter>
  {
    Registry INSTANCE = org.eclipse.net4j.pop.internal.repository.RepositoryAdapterFactory.INSTANCE;
  }

}
