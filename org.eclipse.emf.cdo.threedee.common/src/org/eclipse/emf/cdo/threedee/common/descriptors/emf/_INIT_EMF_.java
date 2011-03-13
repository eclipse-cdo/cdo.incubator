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

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_EMF_
{
  public static void init(Registry registry)
  {
    IPluginContainer.INSTANCE.putElement("org.eclipse.emf.ecore.packageRegisties", "default", null,
        EPackage.Registry.INSTANCE);

    Color color = Color.yellow;
    registry.register(new EMFDescriptor(), color, 1f);
    registry.register(new EPackageRegistryDescriptor(), color, 1f);
    registry.register(new EPackageDescriptor(), color, 1f);
    registry.register(new EModelElementDescriptor(), color, 1f);
    registry.register(new ENamedElementDescriptor(), color, 1f);
    registry.register(new ETypedElementDescriptor(), color, 1f);

    registry.register(new EClassifierDescriptor(), color, 0.8f);
    registry.register(new EClassDescriptor(), color, 0.8f);
    registry.register(new EDataTypeDescriptor(), color, 0.8f);
    registry.register(new EEnumDescriptor(), color, 0.8f);

    registry.register(new EStructuralFeatureDescriptor(), color, 0.6f);
    registry.register(new EAttributeDescriptor(), color, 0.6f);
    registry.register(new EReferenceDescriptor(), color, 0.6f);
    registry.register(new EEnumLiteralDescriptor(), color, 0.6f);
    registry.register(new EOperationDescriptor(), color, 0.6f);

    registry.register(new EParameterDescriptor(), color, 0.4f);
    registry.register(new EAnnotationDescriptor(), color, 0.4f);
  }
}
