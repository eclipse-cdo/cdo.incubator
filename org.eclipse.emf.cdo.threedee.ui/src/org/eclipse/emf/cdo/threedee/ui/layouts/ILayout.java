/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.layouts;

import javax.media.j3d.Node;
import javax.vecmath.Vector3f;

/**
 * @author Martin Fluegge
 */
public interface ILayout
{
  /**
   * searches for the best free position for the given node
   */
  public Vector3f getAvailablePosition(Node node);
}
