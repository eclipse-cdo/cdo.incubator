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
package org.eclipse.emf.cdo.threedee.common.descriptors.emf;

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

import org.eclipse.net4j.util.container.IPluginContainer;

import org.eclipse.emf.ecore.EPackage;

/**
 * @author Eike Stepper
 */
public class _INIT_EMF_
{
  public static void init(Registry registry)
  {
    IPluginContainer.INSTANCE.putElement("org.eclipse.emf.ecore.packageRegisties", "default", null,
        EPackage.Registry.INSTANCE);

    registry.register(new EAnnotationDescriptor());
    registry.register(new EAttributeDescriptor());
    registry.register(new EClassDescriptor());
    registry.register(new EClassifierDescriptor());
    registry.register(new EDataTypeDescriptor());
    registry.register(new EEnumDescriptor());
    registry.register(new EEnumLiteralDescriptor());
    registry.register(new EModelElementDescriptor());
    registry.register(new ENamedElementDescriptor());
    registry.register(new EOperationDescriptor());
    registry.register(new EPackageDescriptor());
    registry.register(new EPackageRegistryDescriptor());
    registry.register(new EParameterDescriptor());
    registry.register(new EReferenceDescriptor());
    registry.register(new EStructuralFeatureDescriptor());
    registry.register(new ETypedElementDescriptor());
  }
}
