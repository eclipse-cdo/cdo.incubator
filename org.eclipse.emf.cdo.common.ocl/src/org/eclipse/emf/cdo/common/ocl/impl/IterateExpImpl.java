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
 * $Id: IterateExpImpl.java,v 1.3 2009-01-04 19:26:02 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Map;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.ocl.IterateExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.operations.IterateExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Iterate Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.common.ocl.impl.IterateExpImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterateExpImpl
		extends LoopExpImpl
		implements IterateExp {

	/**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
	protected Variable<CDOClassifier, CDOParameter> result;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected IterateExpImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OCLPackage.Literals.ITERATE_EXP;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public Variable<CDOClassifier, CDOParameter> getResult() {
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetResult(
			Variable<CDOClassifier, CDOParameter> newResult,
			NotificationChain msgs) {
    Variable<CDOClassifier, CDOParameter> oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCLPackage.ITERATE_EXP__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public void setResult(Variable<CDOClassifier, CDOParameter> newResult) {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCLPackage.ITERATE_EXP__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCLPackage.ITERATE_EXP__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.ITERATE_EXP__RESULT, newResult, newResult));
  }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkIterateType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IterateExpOperations
			.checkIterateType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkBodyType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IterateExpOperations.checkBodyType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkResultInit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IterateExpOperations.checkResultInit(this, diagnostics, context);
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case OCLPackage.ITERATE_EXP__RESULT:
        return basicSetResult(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case OCLPackage.ITERATE_EXP__RESULT:
        return getResult();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case OCLPackage.ITERATE_EXP__RESULT:
        setResult((Variable<CDOClassifier, CDOParameter>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case OCLPackage.ITERATE_EXP__RESULT:
        setResult((Variable<CDOClassifier, CDOParameter>)null);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case OCLPackage.ITERATE_EXP__RESULT:
        return result != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == org.eclipse.ocl.expressions.IterateExp.class)
    {
      switch (derivedFeatureID)
      {
        case OCLPackage.ITERATE_EXP__RESULT: return ExpressionsPackage.ITERATE_EXP__RESULT;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == org.eclipse.ocl.expressions.IterateExp.class)
    {
      switch (baseFeatureID)
      {
        case ExpressionsPackage.ITERATE_EXP__RESULT: return OCLPackage.ITERATE_EXP__RESULT;
        default: return -1;
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
		return ((Visitor<T, CDOClassifier, ?, ?, ?, CDOParameter, ?, ?, ?, ?>) v)
			.visitIterateExp(this);
	}

} // IterateExpImpl
