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
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public abstract class ThreeDeeNode<MODEL> extends BranchGroup
{
  private MODEL model;

  private TransformGroup transformGroup;

  private Node shape;

  private ThreeDeeNode<MODEL>[] children;

  public ThreeDeeNode(MODEL model, Appearance appearance)
  {
    this.model = model;
    setCapability(ALLOW_DETACH);

    shape = createShape(appearance);

    transformGroup = new TransformGroup();
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    transformGroup.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
    transformGroup.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
    transformGroup.addChild(shape);

    appearance.setCapability(Appearance.ALLOW_MATERIAL_READ);
    appearance.setCapability(Appearance.ALLOW_MATERIAL_WRITE);
    appearance.getMaterial().setCapability(Material.ALLOW_COMPONENT_READ);
    appearance.getMaterial().setCapability(Material.ALLOW_COMPONENT_WRITE);
    super.addChild(transformGroup);
  }

  public MODEL getModel()
  {
    return model;
  }

  public void getTransform(Transform3D transform)
  {
    transformGroup.getTransform(transform);
  }

  public void setTransform(Transform3D transform)
  {
    transformGroup.setTransform(transform);
  }

  public Node getShape()
  {
    return shape;
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

  public RenderingAttributes getRenderingAttributes()
  {
    Appearance appearance = getAppearance();
    RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
    if (renderingAttributes == null)
    {
      renderingAttributes = new RenderingAttributes();
      appearance.setRenderingAttributes(renderingAttributes);
    }

    return renderingAttributes;
  }

  public boolean isVisible()
  {
    return getRenderingAttributes().getVisible();
  }

  public void setVisible(boolean visible)
  {
    getRenderingAttributes().setVisible(visible);
  }

  @SuppressWarnings("unchecked")
  public synchronized ThreeDeeNode<MODEL>[] getChildren()
  {
    if (children == null)
    {
      List<ThreeDeeNode<MODEL>> list = new ArrayList<ThreeDeeNode<MODEL>>();

      Enumeration<?> allChildren = transformGroup.getAllChildren();
      while (allChildren.hasMoreElements())
      {
        Node nextElement = (Node)allChildren.nextElement();
        if (nextElement != shape && nextElement instanceof ThreeDeeNode)
        {
          list.add((ThreeDeeNode<MODEL>)nextElement);
        }
      }

      children = list.toArray(new ThreeDeeNode[list.size()]);
    }

    return children;
  }

  @Override
  public synchronized void addChild(Node child)
  {
    transformGroup.addChild(child);
    children = null;
  }

  @Override
  public synchronized void removeChild(Node child)
  {
    transformGroup.removeChild(child);
    children = null;
  }

  public final void layout()
  {
    ThreeDeeNode<MODEL>[] children = getChildren();
    int n = children.length;
    if (n != 0)
    {
      layout(children, n);
    }
  }

  protected abstract void layout(ThreeDeeNode<MODEL>[] children, int n);

  protected abstract Node createShape(Appearance appearance);
}
