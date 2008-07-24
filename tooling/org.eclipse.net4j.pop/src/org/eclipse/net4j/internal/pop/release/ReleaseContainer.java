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
package org.eclipse.net4j.internal.pop.release;

import org.eclipse.net4j.internal.pop.Element;
import org.eclipse.net4j.internal.pop.ElementContainer;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.release.IVersion;
import org.eclipse.net4j.pop.release.IRelease.Container;

/**
 * @author Eike Stepper
 */
public class ReleaseContainer extends ElementContainer<IRelease> implements IRelease.Container
{
  public ReleaseContainer(Element delegator)
  {
    super(delegator);
  }

  public IRelease addRelease(IVersion version)
  {
    IRelease release = new Release((Container)getDelegator(), version);
    addElement(release);
    return release;
  }

  public int getReleaseCount()
  {
    return getElementCount();
  }

  public IRelease getRelease(int index)
  {
    return getElement(index);
  }

  public IRelease[] getReleases()
  {
    return getElements(IRelease.class);
  }
}
