/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 248869
 *
 * </copyright>
 *
 * $Id: CollectionLiteralExpImpl.java,v 1.4 2009-01-07 07:21:27 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.expressions.CollectionLiteralPart;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.operations.CollectionLiteralExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Collection Literal Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl#getKind
 * <em>Kind</em>}</li>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl#getPart
 * <em>Part</em>}</li>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl#isSimpleRange
 * <em>Simple Range</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CollectionLiteralExpImpl
		extends LiteralExpImpl
		implements CollectionLiteralExp {

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind KIND_EDEFAULT = CollectionKind.SET_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionLiteralPart<CDOClassifier>> part;

	/**
	 * The default value of the '{@link #isSimpleRange() <em>Simple Range</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSimpleRange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMPLE_RANGE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CollectionLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.COLLECTION_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKind(CollectionKind newKind) {
		CollectionKind oldKind = kind;
		kind = newKind == null
			? KIND_EDEFAULT
			: newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.COLLECTION_LITERAL_EXP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CollectionLiteralPart<CDOClassifier>> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<CollectionLiteralPart<CDOClassifier>>(
				CollectionLiteralPart.class, this,
				OCLPackage.COLLECTION_LITERAL_EXP__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSimpleRange() {
		EList<CollectionLiteralPart<CDOClassifier>> partsList = getPart();

		int size = partsList.size();
		if (size == 1) {
			CollectionLiteralPart<CDOClassifier> part = partsList.get(0);

			return part instanceof CollectionRange;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkNoCollectionInstances(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollectionLiteralExpOperations.checkNoCollectionInstances(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkSetKind(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollectionLiteralExpOperations.checkSetKind(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkSequenceKind(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollectionLiteralExpOperations.checkSequenceKind(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkBagKind(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollectionLiteralExpOperations.checkBagKind(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkElementType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollectionLiteralExpOperations.checkElementType(this,
			diagnostics, context);
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
			case OCLPackage.COLLECTION_LITERAL_EXP__PART :
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
			case OCLPackage.COLLECTION_LITERAL_EXP__KIND :
				return getKind();
			case OCLPackage.COLLECTION_LITERAL_EXP__PART :
				return getPart();
			case OCLPackage.COLLECTION_LITERAL_EXP__SIMPLE_RANGE :
				return isSimpleRange()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case OCLPackage.COLLECTION_LITERAL_EXP__KIND :
				setKind((CollectionKind) newValue);
				return;
			case OCLPackage.COLLECTION_LITERAL_EXP__PART :
				getPart().clear();
				getPart()
					.addAll(
						(Collection<? extends CollectionLiteralPart<CDOClassifier>>) newValue);
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
			case OCLPackage.COLLECTION_LITERAL_EXP__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case OCLPackage.COLLECTION_LITERAL_EXP__PART :
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
			case OCLPackage.COLLECTION_LITERAL_EXP__KIND :
				return kind != KIND_EDEFAULT;
			case OCLPackage.COLLECTION_LITERAL_EXP__PART :
				return part != null && !part.isEmpty();
			case OCLPackage.COLLECTION_LITERAL_EXP__SIMPLE_RANGE :
				return isSimpleRange() != SIMPLE_RANGE_EDEFAULT;
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
		if (baseClass == org.eclipse.ocl.expressions.CollectionLiteralExp.class) {
			switch (derivedFeatureID) {
				case OCLPackage.COLLECTION_LITERAL_EXP__KIND :
					return ExpressionsPackage.COLLECTION_LITERAL_EXP__KIND;
				case OCLPackage.COLLECTION_LITERAL_EXP__PART :
					return ExpressionsPackage.COLLECTION_LITERAL_EXP__PART;
				case OCLPackage.COLLECTION_LITERAL_EXP__SIMPLE_RANGE :
					return ExpressionsPackage.COLLECTION_LITERAL_EXP__SIMPLE_RANGE;
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
		if (baseClass == org.eclipse.ocl.expressions.CollectionLiteralExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.COLLECTION_LITERAL_EXP__KIND :
					return OCLPackage.COLLECTION_LITERAL_EXP__KIND;
				case ExpressionsPackage.COLLECTION_LITERAL_EXP__PART :
					return OCLPackage.COLLECTION_LITERAL_EXP__PART;
				case ExpressionsPackage.COLLECTION_LITERAL_EXP__SIMPLE_RANGE :
					return OCLPackage.COLLECTION_LITERAL_EXP__SIMPLE_RANGE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, CDOClassifier, ?, ?, ?, ?, ?, ?, ?, ?>) v)
			.visitCollectionLiteralExp(this);
	}

} // CollectionLiteralExpImpl
