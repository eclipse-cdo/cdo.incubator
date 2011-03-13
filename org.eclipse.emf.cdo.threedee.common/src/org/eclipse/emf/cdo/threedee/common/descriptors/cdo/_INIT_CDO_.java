/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.common.descriptors.cdo;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_CDO_
{
  public static void init(Registry registry)
  {
    Color color = Color.magenta;
    registry.register(new CDODescriptor(), color, 1f);

    registry.register(new BranchManagerDescriptor(), color, 1f);
    registry.register(new PackageRegistryDescriptor(), color, 1f);
    registry.register(new RevisionManagerDescriptor(), color, 1f);

    registry.register(new PackageUnitDescriptor(), color, 0.8f);
    registry.register(new RevisionCacheDescriptor(), color, 0.8f);

    registry.register(new PackageInfoDescriptor(), color, 0.6f);
    registry.register(new BranchDescriptor(), color, 0.6f);
    registry.register(new RevisionDescriptor(), color, 0.6f);
  }
}
