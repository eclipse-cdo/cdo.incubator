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
import org.eclipse.net4j.pop.repository.ccvs.ICvsRepositoryAdapter;
import org.eclipse.net4j.util.ui.UIUtil;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.team.internal.ccvs.core.CVSProviderPlugin;
import org.eclipse.team.internal.ccvs.core.ICVSRemoteFolder;
import org.eclipse.team.internal.ccvs.ui.operations.CheckoutIntoOperation;
import org.eclipse.team.ui.TeamOperation;
import org.eclipse.ui.IWorkbenchPart;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class CvsRepositoryAdapter extends RepositoryAdapter implements ICvsRepositoryAdapter
{
  public CvsRepositoryAdapter()
  {
  }

  @Override
  public String getType()
  {
    return CVSProviderPlugin.getTypeId();
  }

  @Override
  public void checkoutBranch(String branchName, IPath location)
  {
    ICVSRemoteFolder remoteFolder = null;
    IContainer localFolder = null;
    TeamOperation operation = new CheckoutIntoOperation(getPart(), remoteFolder, localFolder, true);
    operation.run();
  }

  @Override
  public void checkoutDate(Date date, IPath location)
  {
  }

  @Override
  public void checkoutTag(String tagName, IPath location)
  {
  }

  private static IWorkbenchPart getPart()
  {
    return UIUtil.getActiveWorkbenchPart();
  }
}
