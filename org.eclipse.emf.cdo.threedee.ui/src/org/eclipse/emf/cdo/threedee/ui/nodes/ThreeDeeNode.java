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
package org.eclipse.emf.cdo.threedee.ui.nodes;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeNode extends BranchGroup
{
  protected TransformGroup transformGroup;

  protected Node shape;

  public ThreeDeeNode()
  {
    transformGroup = new TransformGroup();
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    transformGroup.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
    transformGroup.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
    super.addChild(transformGroup);
  }

  @Override
  public void addChild(Node child)
  {
    transformGroup.addChild(child);
  }

  @Override
  public void removeChild(Node child)
  {
    transformGroup.removeChild(child);
  }

  public void setTransform(Transform3D transform)
  {
    transformGroup.setTransform(transform);
  }

  public void setShape(Node shape)
  {
    this.shape = shape;
    transformGroup.addChild(shape);
  }

  public Node getShape()
  {
    return shape;
  }
}
