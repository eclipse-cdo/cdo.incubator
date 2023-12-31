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
 * $Id: CollectionRangeImpl.java,v 1.4 2009-01-07 07:21:29 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.ocl.CollectionRange;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.operations.CollectionRangeOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Collection Range</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.CollectionRangeImpl#getFirst
 * <em>First</em>}</li>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.CollectionRangeImpl#getLast
 * <em>Last</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CollectionRangeImpl
		extends CollectionLiteralPartImpl
		implements CollectionRange {

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected OCLExpression<CDOClassifier> first;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected OCLExpression<CDOClassifier> last;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CollectionRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.COLLECTION_RANGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLExpression<CDOClassifier> getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFirst(
			OCLExpression<CDOClassifier> newFirst, NotificationChain msgs) {
		OCLExpression<CDOClassifier> oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, OCLPackage.COLLECTION_RANGE__FIRST, oldFirst,
				newFirst);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFirst(OCLExpression<CDOClassifier> newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject) first)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- OCLPackage.COLLECTION_RANGE__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject) newFirst)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- OCLPackage.COLLECTION_RANGE__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.COLLECTION_RANGE__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLExpression<CDOClassifier> getLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLast(OCLExpression<CDOClassifier> newLast,
			NotificationChain msgs) {
		OCLExpression<CDOClassifier> oldLast = last;
		last = newLast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, OCLPackage.COLLECTION_RANGE__LAST, oldLast,
				newLast);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLast(OCLExpression<CDOClassifier> newLast) {
		if (newLast != last) {
			NotificationChain msgs = null;
			if (last != null)
				msgs = ((InternalEObject) last).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - OCLPackage.COLLECTION_RANGE__LAST,
					null, msgs);
			if (newLast != null)
				msgs = ((InternalEObject) newLast).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - OCLPackage.COLLECTION_RANGE__LAST,
					null, msgs);
			msgs = basicSetLast(newLast, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.COLLECTION_RANGE__LAST, newLast, newLast));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkRangeType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollectionRangeOperations.checkRangeType(this, diagnostics,
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
			case OCLPackage.COLLECTION_RANGE__FIRST :
				return basicSetFirst(null, msgs);
			case OCLPackage.COLLECTION_RANGE__LAST :
				return basicSetLast(null, msgs);
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
			case OCLPackage.COLLECTION_RANGE__FIRST :
				return getFirst();
			case OCLPackage.COLLECTION_RANGE__LAST :
				return getLast();
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
			case OCLPackage.COLLECTION_RANGE__FIRST :
				setFirst((OCLExpression<CDOClassifier>) newValue);
				return;
			case OCLPackage.COLLECTION_RANGE__LAST :
				setLast((OCLExpression<CDOClassifier>) newValue);
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
			case OCLPackage.COLLECTION_RANGE__FIRST :
				setFirst((OCLExpression<CDOClassifier>) null);
				return;
			case OCLPackage.COLLECTION_RANGE__LAST :
				setLast((OCLExpression<CDOClassifier>) null);
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
			case OCLPackage.COLLECTION_RANGE__FIRST :
				return first != null;
			case OCLPackage.COLLECTION_RANGE__LAST :
				return last != null;
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
		if (baseClass == org.eclipse.ocl.expressions.CollectionRange.class) {
			switch (derivedFeatureID) {
				case OCLPackage.COLLECTION_RANGE__FIRST :
					return ExpressionsPackage.COLLECTION_RANGE__FIRST;
				case OCLPackage.COLLECTION_RANGE__LAST :
					return ExpressionsPackage.COLLECTION_RANGE__LAST;
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
		if (baseClass == org.eclipse.ocl.expressions.CollectionRange.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.COLLECTION_RANGE__FIRST :
					return OCLPackage.COLLECTION_RANGE__FIRST;
				case ExpressionsPackage.COLLECTION_RANGE__LAST :
					return OCLPackage.COLLECTION_RANGE__LAST;
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
		return ((Visitor<T, CDOClassifier, ?, ?, ?, ?, ?, ?, ?, ?>) v)
			.visitCollectionRange(this);
	}

} // CollectionRangeImpl
