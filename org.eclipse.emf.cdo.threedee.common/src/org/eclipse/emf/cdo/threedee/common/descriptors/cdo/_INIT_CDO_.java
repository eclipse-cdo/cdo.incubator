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
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.client.CDOClientDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.client.CDOObjectDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.client.CDOSavepointDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.client.CDOSessionDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.client.CDOTransactionDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.client.CDOViewDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.CDOServerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.ClassMappingDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.DBStoreDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.IDHandlerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.MappingStrategyDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.MetaDataManagerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.RepositoryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.SessionDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.SessionManagerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.StoreDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.TransactionDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.TypeMappingDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.server.ViewDescriptor;

/**
 * @author Eike Stepper
 */
public class _INIT_CDO_
{
  public static void init(Registry registry)
  {
    registry.register(new CDODescriptor());
    registry.register(new CDOClientDescriptor());
    registry.register(new CDOServerDescriptor());
    registry.register(new ClassMappingDescriptor());
    registry.register(new DBStoreDescriptor());
    registry.register(new IDHandlerDescriptor());
    registry.register(new MappingStrategyDescriptor());
    registry.register(new MetaDataManagerDescriptor());
    registry.register(new TypeMappingDescriptor());
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
