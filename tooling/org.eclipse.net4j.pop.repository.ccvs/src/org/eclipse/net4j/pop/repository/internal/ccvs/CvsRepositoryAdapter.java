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
import org.eclipse.net4j.util.WrappedException;
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
  public void checkoutBranch(IPath target, String repository, String module, String branch)
  {
    ICVSRemoteFolder remoteFolder =CVSProviderPlugin.getPlugin().
    IContainer localFolder = null;

    try
    {
      TeamOperation operation = new CheckoutIntoOperation(getPart(), remoteFolder, localFolder, true);
      operation.run();
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  @Override
  public void checkoutTag(IPath target, String repository, String module, String tag)
  {
  }

  @Override
  public void checkoutDate(IPath target, String repository, String module, Date date)
  {
  }

  private static IWorkbenchPart getPart()
  {
    return UIUtil.getActiveWorkbenchPart();
  }
}
