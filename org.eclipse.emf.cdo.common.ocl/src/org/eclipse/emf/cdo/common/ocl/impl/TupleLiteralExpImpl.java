/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2008 IBM Corporation, Zeligsoft Inc., and others.
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
 * $Id: TupleLiteralExpImpl.java,v 1.4 2009-01-07 07:21:27 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOFeature;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.TupleLiteralExp;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.operations.TupleLiteralExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tuple Literal Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralExpImpl#getPart
 * <em>Part</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TupleLiteralExpImpl
		extends LiteralExpImpl
		implements TupleLiteralExp {

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<TupleLiteralPart<CDOClassifier, CDOFeature>> part;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TupleLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.TUPLE_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TupleLiteralPart<CDOClassifier, CDOFeature>> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<TupleLiteralPart<CDOClassifier, CDOFeature>>(
				TupleLiteralPart.class, this,
				OCLPackage.TUPLE_LITERAL_EXP__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkTupleType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TupleLiteralExpOperations.checkTupleType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkPartsUnique(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TupleLiteralExpOperations.checkPartsUnique(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLPackage.TUPLE_LITERAL_EXP__PART :
				return ((InternalEList<?>) getPart()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLPackage.TUPLE_LITERAL_EXP__PART :
				return getPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLPackage.TUPLE_LITERAL_EXP__PART :
				getPart().clear();
				getPart()
					.addAll(
						(Collection<? extends TupleLiteralPart<CDOClassifier, CDOFeature>>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCLPackage.TUPLE_LITERAL_EXP__PART :
				getPart().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCLPackage.TUPLE_LITERAL_EXP__PART :
				return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.TupleLiteralExp.class) {
			switch (derivedFeatureID) {
				case OCLPackage.TUPLE_LITERAL_EXP__PART :
					return ExpressionsPackage.TUPLE_LITERAL_EXP__PART;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.TupleLiteralExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.TUPLE_LITERAL_EXP__PART :
					return OCLPackage.TUPLE_LITERAL_EXP__PART;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, CDOClassifier, ?, CDOFeature, ?, ?, ?, ?, ?, ?>) v)
			.visitTupleLiteralExp(this);
	}

} // TupleLiteralExpImpl
