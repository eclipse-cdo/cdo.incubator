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
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.code.ITag;

/**
 * @author Eike Stepper
 */
public class TagContainer extends ElementContainer<ITag> implements ITag.Container
{
  public TagContainer(Element delegator)
  {
    super(delegator);
  }

  public ITag[] getTags()
  {
    return getElements(ITag.class);
  }

  public ITag getTag(int index)
  {
    return getElement(index);
  }

  public int getTagCount()
  {
    return getElementCount();
  }
}
