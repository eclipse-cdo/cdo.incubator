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

import org.eclipse.net4j.pop.repository.IRepositoryTag;

import org.eclipse.team.internal.ccvs.core.CVSTag;

/**
 * @author Eike Stepper
 */
public abstract class CvsRepositoryTag implements IRepositoryTag
{
  private CvsRepositoryAdapter adapter;

  private CVSTag cvsTag;

  protected CvsRepositoryTag(CvsRepositoryAdapter adapter, CVSTag cvsTag)
  {
    this.adapter = adapter;
    this.cvsTag = cvsTag;
  }

  public CvsRepositoryAdapter getAdapter()
  {
    return adapter;
  }

  public CVSTag getCvsTag()
  {
    return cvsTag;
  }

  public String asString()
  {
    return cvsTag.getName();
  }

  /**
   * @author Eike Stepper
   */
  public static class Branch extends CvsRepositoryTag implements IRepositoryTag.Branch
  {
    public Branch(CvsRepositoryAdapter adapter, String name)
    {
      super(adapter, new CVSTag(name, CVSTag.BRANCH));
    }

    public String getName()
    {
      return getCvsTag().getName();
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Version extends CvsRepositoryTag implements IRepositoryTag.Version
  {
    public Version(CvsRepositoryAdapter adapter, String name)
    {
      super(adapter, new CVSTag(name, CVSTag.VERSION));
    }

    public String getName()
    {
      return getCvsTag().getName();
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Date extends CvsRepositoryTag implements IRepositoryTag.Date
  {
    public Date(CvsRepositoryAdapter adapter, java.util.Date date)
    {
      super(adapter, new CVSTag(date));
    }

    public java.util.Date getDate()
    {
      return getCvsTag().asDate();
    }
  }
}
