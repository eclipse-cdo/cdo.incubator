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
package org.eclipse.net4j.internal.pop.code;

import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ITag;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class MainBranch extends Branch implements ITag
{
  private Date startDate;

  public MainBranch(String name, Date startDate)
  {
    super(name);
    this.startDate = startDate;
    setStartTag(this);
  }

  public IBranch getBranch()
  {
    return this;
  }

  public Date getDate()
  {
    return startDate;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("MainBranch[name={0}, startDate={1,date} {1,time}]", getName(), startDate);
  }
}
