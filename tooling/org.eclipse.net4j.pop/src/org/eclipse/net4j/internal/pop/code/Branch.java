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
public class Branch extends Element implements IBranch
{
  private String name;

  private ITag startTag;

  private TagContainer tagContainer = new TagContainer(this);

  private BranchContainer branchContainer = new BranchContainer(this);

  public Branch(String name, ITag startTag)
  {
    this.name = name;
    this.startTag = startTag;
  }

  public String getName()
  {
    return name;
  }

  public ITag getStartTag()
  {
    return startTag;
  }

  public ITag addTag(String name, Date date)
  {
    ITag tag = new Tag(this, name, date);
    tagContainer.addElement(tag);
    return tag;
  }

  public ITag getTag(int index)
  {
    return tagContainer.getElement(index);
  }

  public int getTagCount()
  {
    return tagContainer.getElementCount();
  }

  public ITag[] getTags()
  {
    return tagContainer.getElements(ITag.class);
  }

  public IBranch addBranch(ITag startTag)
  {
    IBranch branch = new Branch(name, startTag);
    branchContainer.addElement(branch);
    return branch;
  }

  public IBranch getBranch(int index)
  {
    return branchContainer.getBranch(index);
  }

  public int getBranchCount()
  {
    return branchContainer.getBranchCount();
  }

  public IBranch[] getBranchs()
  {
    return branchContainer.getBranchs();
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Branch[name={0}, startTag={1}]", name, startTag);
  }
}
