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
package org.eclipse.emf.cdo.threedee.common.descriptors;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

/**
 * @author Eike Stepper
 */
public class _INIT_
{
  public static void init(Registry registry)
  {
    registry.register(new ManagedContainerDescriptor());
    registry.register(new RepositoryDescriptor());
    registry.register(new BranchManagerDescriptor());
    registry.register(new BranchDescriptor());
    registry.register(new PackageRegistryDescriptor());
    registry.register(new PackageUnitDescriptor());
    registry.register(new PackageInfoDescriptor());
    registry.register(new PackageDescriptor());
    registry.register(new ClassDescriptor());
    registry.register(new RevisionManagerDescriptor());
    registry.register(new RevisionCacheDescriptor());
    registry.register(new RevisionDescriptor());
  }
}
