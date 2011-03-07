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

import org.eclipse.net4j.util.collection.Pair;

import javax.media.j3d.Appearance;
import javax.media.j3d.Geometry;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransparencyAttributes;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class ReferenceShape extends ThreeDeeNode<Pair<Element, Element>>
{
  private boolean containment;

  public ReferenceShape(Element from, Element to, boolean containment)
  {
    super(new Pair<Element, Element>(from, to), createAppearance(containment));
    this.containment = containment;
  }

  public boolean isContainment()
  {
    return containment;
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
    shape.setAppearance(appearance);
    return shape;
  }

  private static Appearance createAppearance(boolean containment)
  {
    Appearance appearance = ThreeDeeUtil.getDefaultAppearance(containment ? Color.white : Color.gray);

    TransparencyAttributes transparencyAttributes = appearance.getTransparencyAttributes();
    if (transparencyAttributes == null)
    {
      transparencyAttributes = new TransparencyAttributes();
      appearance.setTransparencyAttributes(transparencyAttributes);
    }

    transparencyAttributes.setTransparencyMode(TransparencyAttributes.FASTEST);
    transparencyAttributes.setTransparency(0.5f);
    return appearance;
  }

  @Override
  public void layout()
  {
    throw new UnsupportedOperationException("Should plcaement be done here?");
  }
}
