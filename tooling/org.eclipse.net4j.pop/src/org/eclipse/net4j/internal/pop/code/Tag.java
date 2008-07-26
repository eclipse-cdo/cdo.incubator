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

import org.eclipse.net4j.internal.pop.util.Element;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ITag;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Tag extends Element implements ITag
{
  private IBranch branch;

  private String name;

  private Date date;

  public Tag(IBranch branch, String name, Date date)
  {
    checkArgument(branch, "branch");
    checkArgument(name, "name");
    checkArgument(date, "date");
    this.branch = branch;
    this.name = name;
    this.date = date;
  }

  public IBranch getBranch()
  {
    return branch;
  }

  public String getName()
  {
    return name;
  }

  public Date getDate()
  {
    return date;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Branch[branch={0}, name={1}, date={2,date} {2,time}]", branch, name, date);
  }
}
