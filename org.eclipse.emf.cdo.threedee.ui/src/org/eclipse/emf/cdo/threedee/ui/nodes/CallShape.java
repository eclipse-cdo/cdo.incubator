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
import javax.media.j3d.TransparencyAttributes;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class CallShape extends LineShape
{
  public CallShape(Element from, Element to)
  {
    super(new Pair<Element, Element>(from, to), createAppearance());
  }

  private static Appearance createAppearance()
  {
    Appearance appearance = ThreeDeeUtil.getDefaultAppearance(Color.red);

    TransparencyAttributes transparencyAttributes = appearance.getTransparencyAttributes();
    if (transparencyAttributes == null)
    {
      transparencyAttributes = new TransparencyAttributes();
      appearance.setTransparencyAttributes(transparencyAttributes);
    }

    transparencyAttributes.setTransparencyMode(TransparencyAttributes.FASTEST);
    transparencyAttributes.setTransparency(0.0f);
    return appearance;
  }
}
