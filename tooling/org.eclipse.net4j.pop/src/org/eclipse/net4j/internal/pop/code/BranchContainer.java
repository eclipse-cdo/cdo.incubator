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
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.IBranchContainer;

/**
 * @author Eike Stepper
 */
public class BranchContainer extends ElementContainer<IBranch> implements IBranchContainer
{
  public BranchContainer(Element delegator)
  {
    super(delegator);
  }

  public IBranch[] getBranchs()
  {
    return getElements(IBranch.class);
  }

  public IBranch getBranch(int index)
  {
    return getElement(index);
  }

  public int getBranchCount()
  {
    return getElementCount();
  }
}
