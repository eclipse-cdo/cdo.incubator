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
 * $Id: LoopExpImpl.java,v 1.4 2009-01-07 07:21:27 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOParameter;
import org.eclipse.emf.cdo.common.ocl.LoopExp;
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
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.operations.LoopExpOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Loop Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.LoopExpImpl#getBody <em>Body
 * </em>}</li>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.LoopExpImpl#getIterator <em>
 * Iterator</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class LoopExpImpl
		extends CallExpImpl
		implements LoopExp {

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected OCLExpression<CDOClassifier> body;

	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable<CDOClassifier, CDOParameter>> iterator;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LoopExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.LOOP_EXP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLExpression<CDOClassifier> getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBody(OCLExpression<CDOClassifier> newBody,
			NotificationChain msgs) {
		OCLExpression<CDOClassifier> oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, OCLPackage.LOOP_EXP__BODY, oldBody, newBody);
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
	public void setBody(OCLExpression<CDOClassifier> newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - OCLPackage.LOOP_EXP__BODY, null,
					msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - OCLPackage.LOOP_EXP__BODY, null,
					msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.LOOP_EXP__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Variable<CDOClassifier, CDOParameter>> getIterator() {
		if (iterator == null) {
			iterator = new EObjectContainmentEList<Variable<CDOClassifier, CDOParameter>>(
				Variable.class, this, OCLPackage.LOOP_EXP__ITERATOR);
		}
		return iterator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkSourceCollection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopExpOperations.checkSourceCollection(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkLoopVariableInit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopExpOperations.checkLoopVariableInit(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkLoopVariableType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopExpOperations.checkLoopVariableType(this, diagnostics,
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
			case OCLPackage.LOOP_EXP__BODY :
				return basicSetBody(null, msgs);
			case OCLPackage.LOOP_EXP__ITERATOR :
				return ((InternalEList<?>) getIterator()).basicRemove(otherEnd,
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
			case OCLPackage.LOOP_EXP__BODY :
				return getBody();
			case OCLPackage.LOOP_EXP__ITERATOR :
				return getIterator();
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
			case OCLPackage.LOOP_EXP__BODY :
				setBody((OCLExpression<CDOClassifier>) newValue);
				return;
			case OCLPackage.LOOP_EXP__ITERATOR :
				getIterator().clear();
				getIterator()
					.addAll(
						(Collection<? extends Variable<CDOClassifier, CDOParameter>>) newValue);
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
			case OCLPackage.LOOP_EXP__BODY :
				setBody((OCLExpression<CDOClassifier>) null);
				return;
			case OCLPackage.LOOP_EXP__ITERATOR :
				getIterator().clear();
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
			case OCLPackage.LOOP_EXP__BODY :
				return body != null;
			case OCLPackage.LOOP_EXP__ITERATOR :
				return iterator != null && !iterator.isEmpty();
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
		if (baseClass == org.eclipse.ocl.expressions.LoopExp.class) {
			switch (derivedFeatureID) {
				case OCLPackage.LOOP_EXP__BODY :
					return ExpressionsPackage.LOOP_EXP__BODY;
				case OCLPackage.LOOP_EXP__ITERATOR :
					return ExpressionsPackage.LOOP_EXP__ITERATOR;
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
		if (baseClass == org.eclipse.ocl.expressions.LoopExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.LOOP_EXP__BODY :
					return OCLPackage.LOOP_EXP__BODY;
				case ExpressionsPackage.LOOP_EXP__ITERATOR :
					return OCLPackage.LOOP_EXP__ITERATOR;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // LoopExpImpl
