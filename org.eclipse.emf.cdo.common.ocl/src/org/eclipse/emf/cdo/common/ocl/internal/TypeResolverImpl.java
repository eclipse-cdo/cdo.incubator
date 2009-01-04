/**
 * <copyright> 
 *
 * Copyright (c) 2005, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 182994
 *
 * </copyright>
 *
 * $Id: TypeResolverImpl.java,v 1.2 2009-01-04 17:56:36 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.internal;

import org.eclipse.emf.cdo.common.fake.CDOClass;
import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.CDOOperation;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.model.CDOPackage;
import org.eclipse.emf.cdo.common.ocl.EcoreEnvironment;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.AbstractTypeResolver;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.TypeResolver;

/**
 * Ecore implementation of the {@link TypeResolver} interface.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TypeResolverImpl
		extends
		AbstractTypeResolver<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOParameter> {

	/**
	 * Initializes me with an environment. I create my own resource for
	 * persistence of model-based types.
	 * 
	 * @param env
	 *            the environment that I persist
	 */
	public TypeResolverImpl(EcoreEnvironment env) {
		super(env);
	}

	/**
	 * Initializes me with a resource in which I will persist the model-based
	 * types that I generate in my associated {@link Environment}.
	 * 
	 * @param env
	 *            my environment
	 * @param resource
	 *            my resource
	 */
	public TypeResolverImpl(EcoreEnvironment env, Resource resource) {
		super(env, resource);
	}

	// Documentation copied from the inherited implementation
	@Override
	protected Resource createResource() {
		Resource.Factory factory = OCLEcorePlugin.getEcoreResourceFactory();

		return factory.createResource(URI.createURI("ocl:///oclenv.ecore")); //$NON-NLS-1$
	}

	// Documentation copied from the inherited implementation
	@Override
	protected CDOPackage createTuplePackage() {
		CDOPackage result = super.createTuplePackage();

		result.setEFactoryInstance(new TupleFactory());

		return result;
	}

	// Documentation copied from the inherited specification
	@Override
	protected CDOPackage createPackage(String name) {
		CDOPackage result = EcoreFactory.eINSTANCE.createEPackage();

		result.setName(name);
		getResource().getContents().add(result);

		return result;
	}

	// Documentation copied from the inherited specification
	@Override
	protected CDOPackage findPackage(String name) {
		CDOPackage result = null;

		for (EObject o : getResource().getContents()) {
			if (o instanceof CDOPackage) {
				CDOPackage epkg = (CDOPackage) o;

				if (name.equals(epkg.getName())) {
					result = epkg;
					break;
				}
			}
		}

		return result;
	}

	// Documentation copied from the inherited specification
	@Override
	protected void addClassifier(CDOPackage pkg, CDOClassifier classifier) {
		pkg.getEClassifiers().add(classifier);
	}

	// Documentation copied from the inherited specification
	@Override
	protected void addOperation(CDOClassifier owner, CDOOperation operation) {
		((EClass) owner).getEOperations().add(operation);
	}

	// Documentation copied from the inherited specification
	@Override
	protected void addProperty(CDOClassifier owner, CDOFeature property) {
		((EClass) owner).getEStructuralFeatures().add(property);
	}

	// Documentation copied from the inherited specification
	@Override
	protected CDOClass createShadowClass(CDOClassifier type) {
		return OCLStandardLibraryImpl.createShadowClass(type);
	}

	// Documentation copied from the inherited specification
	@Override
	protected CDOClassifier getShadowedClassifier(CDOClassifier shadow) {
		if (shadow instanceof CDOClass) {
			return OCLStandardLibraryImpl.getRealClassifier((CDOClass) shadow);
		}

		return null;
	}
}
