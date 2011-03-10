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

import org.eclipse.net4j.util.collection.Pair;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Geometry;
import javax.media.j3d.LineAttributes;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransparencyAttributes;

/**
 * @author Martin Fluegge
 */
public class LineShape extends ThreeDeeNode<Pair<Element, Element>>
{
  public LineShape(Pair<Element, Element> pair, Appearance appearance)
  {
    super(pair, appearance);
    appearance.getTransparencyAttributes().setCapability(TransparencyAttributes.ALLOW_VALUE_WRITE);
    appearance.getTransparencyAttributes().setCapability(TransparencyAttributes.ALLOW_VALUE_READ);
    appearance.setCapability(Appearance.ALLOW_LINE_ATTRIBUTES_READ);
    appearance.setCapability(Appearance.ALLOW_LINE_ATTRIBUTES_WRITE);
    appearance.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_READ);
    appearance.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_WRITE);
  }

  @Override
  public Shape3D getShape()
  {
    return (Shape3D)super.getShape();
  }

  public void setGeometry(Geometry geometry)
  {
    getShape().setGeometry(geometry);
  }

  @Override
  protected Node createShape(Appearance appearance)
  {
    Shape3D shape = new Shape3D();
    shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);
    shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
    shape.setCapability(Shape3D.ALLOW_APPEARANCE_READ);
    shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
    shape.setAppearance(appearance);
    return shape;
  }

  @Override
  protected void layout(ThreeDeeNode<Pair<Element, Element>>[] children, int n)
  {
    throw new UnsupportedOperationException("Should placement be done here?");
  }

  public void blink()
  {
    Appearance appearance = getShape().getAppearance();
    LineAttributes lineAttributes = appearance.getLineAttributes();
    if (lineAttributes == null)
    {
      lineAttributes = new LineAttributes();
      appearance.setLineAttributes(lineAttributes);
    }

    float lineWidth = lineAttributes.getLineWidth();
    lineAttributes.setLineWidth(lineWidth * 10);
    ColoringAttributes coloringAttributes = appearance.getColoringAttributes();

    if (coloringAttributes != null)
    {
      coloringAttributes = new ColoringAttributes();
      appearance.setColoringAttributes(coloringAttributes);
    }

    coloringAttributes.setColor(25, 0, 0);
  }
}
