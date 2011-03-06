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

import com.sun.j3d.utils.geometry.Primitive;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Node;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
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

  public Node getShape()
  {
    return shape;
  }

  public void setShape(Node shape)
  {
    if (this.shape != null)
    {
      transformGroup.removeChild(this.shape);
    }

    this.shape = shape;

    if (this.shape != null)
    {
      transformGroup.addChild(this.shape);
    }
  }

  public void getTransform(Transform3D transform)
  {
    transformGroup.getTransform(transform);
  }

  public void setTransform(Transform3D transform)
  {
    transformGroup.setTransform(transform);
  }

  public Appearance getAppearance()
  {
    if (shape instanceof Shape3D)
    {
      return ((Shape3D)shape).getAppearance();
    }

    if (shape instanceof Primitive)
    {
      return ((Primitive)shape).getAppearance();
    }

    if (shape == null)
    {
      throw new IllegalStateException("Shape is null");
    }

    throw new IllegalStateException("Shape has no appearance: " + shape.getClass().getName());
  }

  public boolean isVisible()
  {
    Appearance appearance = getAppearance();
    RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
    if (renderingAttributes != null)
    {
      return renderingAttributes.getVisible();
    }

    return false;
  }

  public void setVisible(boolean visible)
  {
    Appearance appearance = getAppearance();
    RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
    if (renderingAttributes != null)
    {
      renderingAttributes.setVisible(visible);
    }
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
}
