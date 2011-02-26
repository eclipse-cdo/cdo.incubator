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
    registry.register(new MapEntryDescriptor());

    registry.register(new EModelElementDescriptor());
    registry.register(new ENamedElementDescriptor());
    registry.register(new ETypedElementDescriptor());
    registry.register(new EAnnotationDescriptor());
    registry.register(new EPackageRegistryDescriptor());
    registry.register(new EPackageDescriptor());
    registry.register(new EClassifierDescriptor());
    registry.register(new EDataTypeDescriptor());
    registry.register(new EEnumDescriptor());
    registry.register(new EEnumLiteralDescriptor());
    registry.register(new EClassDescriptor());
    registry.register(new EStructuralFeatureDescriptor());
    registry.register(new EAttributeDescriptor());
    registry.register(new EReferenceDescriptor());
    registry.register(new EOperationDescriptor());
    registry.register(new EParameterDescriptor());

    registry.register(new RepositoryDescriptor());

    registry.register(new BranchManagerDescriptor());
    registry.register(new BranchDescriptor());

    registry.register(new PackageRegistryDescriptor());
    registry.register(new PackageUnitDescriptor());
    registry.register(new PackageInfoDescriptor());

    registry.register(new RevisionManagerDescriptor());
    registry.register(new RevisionCacheDescriptor());
    registry.register(new RevisionDescriptor());

    registry.register(new SessionManagerDescriptor());
    registry.register(new SessionDescriptor());
    registry.register(new ViewDescriptor());
    registry.register(new TransactionDescriptor());
  }
}
