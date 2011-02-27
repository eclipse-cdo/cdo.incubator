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
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.db._INIT_CDO_DB_;

/**
 * @author Eike Stepper
 */
public class _INIT_CDO_
{
  public static void init(Registry registry)
  {
    _INIT_CDO_DB_.init(registry);

    registry.register(new BranchDescriptor());
    registry.register(new BranchManagerDescriptor());
    registry.register(new CDOObjectDescriptor());
    registry.register(new CDOSavepointDescriptor());
    registry.register(new CDOSessionDescriptor());
    registry.register(new CDOTransactionDescriptor());
    registry.register(new CDOViewDescriptor());
    registry.register(new PackageInfoDescriptor());
    registry.register(new PackageRegistryDescriptor());
    registry.register(new PackageUnitDescriptor());
    registry.register(new RepositoryDescriptor());
    registry.register(new RevisionCacheDescriptor());
    registry.register(new RevisionDescriptor());
    registry.register(new RevisionManagerDescriptor());
    registry.register(new SessionDescriptor());
    registry.register(new SessionManagerDescriptor());
    registry.register(new StoreDescriptor());
    registry.register(new TransactionDescriptor());
    registry.register(new ViewDescriptor());
  }
}
