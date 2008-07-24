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

import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.internal.pop.ElementContainer;
import org.eclipse.net4j.pop.code.ICommitter;

/**
 * @author Eike Stepper
 */
public class CommitterContainer extends ElementContainer<ICommitter> implements ICommitter.Container
{
  public CommitterContainer(Element delegator)
  {
    super(delegator);
  }

  public ICommitter[] getCommitters()
  {
    return getElements(ICommitter.class);
  }

  public ICommitter getCommitter(int index)
  {
    return getElement(index);
  }

  public int getCommitterCount()
  {
    return getElementCount();
  }
}
