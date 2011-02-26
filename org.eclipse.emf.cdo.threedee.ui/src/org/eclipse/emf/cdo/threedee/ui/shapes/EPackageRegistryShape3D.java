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
package org.eclipse.emf.cdo.threedee.ui.shapes;

import org.eclipse.emf.cdo.threedee.ui.util.ThreeDeeWorldUtil;

import com.sun.j3d.utils.geometry.Sphere;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class EPackageRegistryShape3D extends Sphere
{
  public EPackageRegistryShape3D()
  {
    super(.1f, ThreeDeeWorldUtil.getDefaultAppearance(Color.green));
  }
}
