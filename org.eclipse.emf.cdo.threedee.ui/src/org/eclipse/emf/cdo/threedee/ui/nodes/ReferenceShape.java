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
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld;

import org.eclipse.net4j.util.collection.Pair;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.LineAttributes;
import javax.media.j3d.TransparencyAttributes;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class ReferenceShape extends LineShape
{
  private boolean containment;

  public ReferenceShape(ThreeDeeWorld world, Element from, Element to, boolean containment)
  {
    super(world, new Pair<Element, Element>(from, to), createAppearance(containment));
    this.containment = containment;
  }

  public boolean isContainment()
  {
    return containment;
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
    transparencyAttributes.setTransparency(0.75f);
    return appearance;
  }

  @Override
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
