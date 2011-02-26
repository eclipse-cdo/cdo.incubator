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
package org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.shapes.RepositoryShape3D;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.IShapeFactory;
import org.eclipse.emf.cdo.threedee.ui.util.ThreeDeeWorldUtil;

import com.sun.j3d.utils.geometry.Primitive;

import javax.media.j3d.Node;
import javax.vecmath.Color3f;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class RepositoryShapeFactory implements IShapeFactory
{
  public Node createShape(Element element)
  {
    RepositoryShape3D repositoryShape = new RepositoryShape3D(.1f, .1f, .1f, Primitive.GENERATE_TEXTURE_COORDS,
        ThreeDeeWorldUtil.getDefaultAppearance(new Color3f(Color.green)));
    return repositoryShape;
  }
}
