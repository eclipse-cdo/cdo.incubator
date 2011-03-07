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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeUtil;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.Node;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Vector3d;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class ElementGroup extends ThreeDeeNode<Element>
{
  private static final double SPHERE_DISTANCE = 2.0d * ElementSphere.RADIUS + 0.08d;

  private static final double PI = Math.PI;

  private static final double TWO_PI = 2.0d * PI;

  private static final double HALF_PI = 0.5d * PI;

  private static final double THREE_HALF_PI = PI + HALF_PI;

  public ElementGroup(Element element)
  {
    super(element, createAppearance(element));
  }

  @Override
  public ElementSphere getShape()
  {
    return (ElementSphere)super.getShape();
  }

  @Override
  protected void layout(ThreeDeeNode<Element>[] children, int n)
  {
    double circumference = SPHERE_DISTANCE * n;
    double radius = circumference / TWO_PI;
    double distanceAngle = TWO_PI / n;
    double phi = 0.0d;

    for (int i = 0; i < n; i++)
    {
      ElementGroup child = (ElementGroup)children[i];

      double x = radius * Math.cos(phi);
      double y = radius * Math.sin(phi);

      Transform3D transform = new Transform3D();
      Vector3d translation = new Vector3d(x, y, 1.0d + radius);
      transform.setTranslation(translation);

      double scalarProductX = -y / x;
      double scalarProductY = 1.0d;
      double rotationAngle = 0.75d;
      if (HALF_PI < phi && phi < THREE_HALF_PI)
      {
        rotationAngle = -rotationAngle;
      }

      AxisAngle4d rotation = new AxisAngle4d(scalarProductX, scalarProductY, 0.0d, rotationAngle);
      transform.setRotation(rotation);

      child.setTransform(transform);
      child.layout();

      phi += distanceAngle;
    }
  }

  @Override
  protected Node createShape(Appearance appearance)
  {
    return new ElementSphere(appearance);
  }

  private static Appearance createAppearance(Element element)
  {
    Color color = element.getDescriptor().getColor().getValue();
    return ThreeDeeUtil.getDefaultAppearance(color);
  }

  /**
   * @author Eike Stepper
   */
  public final class ElementSphere extends Sphere
  {
    public static final float RADIUS = .1f;

    public ElementSphere(Appearance appearance)
    {
      super(.1f, appearance);
      setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);
      setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);

      appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);
      appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);
      RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
      if (renderingAttributes == null)
      {
        renderingAttributes = new RenderingAttributes();
        renderingAttributes.setCapability(RenderingAttributes.ALLOW_VISIBLE_WRITE);
        appearance.setRenderingAttributes(renderingAttributes);
      }
    }
  }
}
