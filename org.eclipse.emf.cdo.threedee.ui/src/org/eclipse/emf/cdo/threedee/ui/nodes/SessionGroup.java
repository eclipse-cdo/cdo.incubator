/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.nodes;

import org.eclipse.emf.cdo.threedee.Session;

import javax.media.j3d.Appearance;
import javax.media.j3d.Node;

/**
 * @author Eike Stepper
 */
public class SessionGroup extends ThreeDeeNode<Session>
{
  public SessionGroup(Session session)
  {
    super(session, null);
  }

  @Override
  protected void layout(ThreeDeeNode<Session>[] children, int n)
  {
    for (int i = 0; i < n; i++)
    {
      SessionGroup child = (SessionGroup)children[i];
      child.layout();
    }
  }

  @Override
  protected Node createShape(Appearance appearance)
  {
    return null;
  }
}
