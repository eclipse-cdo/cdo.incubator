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

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Tag extends BranchPoint implements ITag
{
  private String tagName;

  public Tag(IBranch branch, Date date)
  {
    super(branch, date);
  }

  public String getTagName()
  {
    return tagName;
  }

  public void setTagName(String tagName)
  {
    this.tagName = tagName;
  }
}
