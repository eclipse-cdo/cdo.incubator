/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 241426
 * 
 * </copyright>
 *
 * $Id: TupleTypeImpl.java,v 1.4 2009-01-07 07:21:26 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOFeature;
import org.eclipse.emf.cdo.common.model.CDOOperation;
import org.eclipse.emf.cdo.common.ocl.AnyType;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.TupleType;
import org.eclipse.emf.cdo.common.ocl.internal.OCLStandardLibraryImpl;
import org.eclipse.emf.cdo.internal.common.model.CDOClassImpl;
import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.types.operations.TupleTypeOperations;
import org.eclipse.ocl.util.Tuple;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tuple Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class TupleTypeImpl
		extends CDOClassImpl
		implements TupleType {

	private EList<CDOOperation> operations;

	private EList<CDOFeature> properties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected TupleTypeImpl() {
		super();

		instanceClass = Tuple.class;
		instanceClassName = instanceClass.getName();
		instanceTypeName = instanceClass.getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.TUPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkTupleTypeName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TupleTypeOperations.checkTupleTypeName(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkPartNamesUnique(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TupleTypeOperations.checkPartNamesUnique(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkFeaturesOnlyProperties(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TupleTypeOperations.checkFeaturesOnlyProperties(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CDOFeature> oclProperties() {
		if (properties == null) {
			properties = new DelegatingEList<CDOFeature>() {

				private static final long serialVersionUID = -4098965170992199523L;

				@Override
				protected List<CDOFeature> delegateList() {
					return getEStructuralFeatures();
				}
			};
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CDOOperation> oclOperations() {
		if (operations == null) {
			operations = ((AnyType) OCLStandardLibraryImpl.INSTANCE.getOclAny())
				.oclOperations();
		}

		return operations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (name == null) {
			StringBuffer myName = new StringBuffer();
			myName.append(SINGLETON_NAME).append('(');

			for (Iterator<EStructuralFeature> iter = oclProperties().iterator(); iter
				.hasNext();) {
				EStructuralFeature next = iter.next();

				myName.append(next.getName());

				EClassifier type = next.getEType();
				if (type != null) {
					myName.append(" : "); //$NON-NLS-1$
					myName.append(type.getName());
				}

				if (iter.hasNext()) {
					myName.append(", "); //$NON-NLS-1$
				}
			}

			myName.append(')');
			name = myName.toString();
		}

		return name;
	}

} // TupleTypeImpl
