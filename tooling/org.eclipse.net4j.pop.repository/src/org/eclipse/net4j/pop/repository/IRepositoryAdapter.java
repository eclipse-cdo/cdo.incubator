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
import org.eclipse.core.runtime.IPath;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface IRepositoryAdapter extends IAdaptable
{
  public String getType();

  public void checkoutBranch(String branchName, IPath location);

  public void checkoutDate(Date date, IPath location);

  public void checkoutTag(String tagName, IPath location);

  /**
   * @author Eike Stepper
   */
  public interface Registry extends IRegistry<String, IRepositoryAdapter>
  {
    Registry INSTANCE = org.eclipse.net4j.pop.internal.repository.RepositoryAdapterFactory.INSTANCE;
  }
}
