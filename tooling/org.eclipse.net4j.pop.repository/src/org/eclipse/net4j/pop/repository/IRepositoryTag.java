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

/**
 * @author Eike Stepper
 */
public interface IRepositoryTag
{
  public IRepositoryAdapter getAdapter();

  public String asString();

  /**
   * @author Eike Stepper
   */
  public interface Branch extends IRepositoryTag
  {
    public String getName();
  }

  /**
   * @author Eike Stepper
   */
  public interface Version extends IRepositoryTag
  {
    public String getName();
  }

  /**
   * @author Eike Stepper
   */
  public interface Date extends IRepositoryTag
  {
    public java.util.Date getDate();
  }
}
