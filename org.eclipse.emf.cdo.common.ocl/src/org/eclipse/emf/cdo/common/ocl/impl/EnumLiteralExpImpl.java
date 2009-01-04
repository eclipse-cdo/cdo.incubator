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
 * $Id: EnumLiteralExpImpl.java,v 1.3 2009-01-04 19:26:02 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Map;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOEnumLiteral;
import org.eclipse.emf.cdo.common.ocl.EnumLiteralExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.operations.EnumLiteralExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Enum Literal Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.common.ocl.impl.EnumLiteralExpImpl#getReferredEnumLiteral <em>Referred Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumLiteralExpImpl
		extends LiteralExpImpl
		implements EnumLiteralExp {

	/**
   * The cached value of the '{@link #getReferredEnumLiteral() <em>Referred Enum Literal</em>}' reference.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getReferredEnumLiteral()
   * @generated
   * @ordered
   */
	protected CDOEnumLiteral referredEnumLiteral;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected EnumLiteralExpImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OCLPackage.Literals.ENUM_LITERAL_EXP;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOEnumLiteral getReferredEnumLiteral() {
    if (referredEnumLiteral != null && ((EObject)referredEnumLiteral).eIsProxy())
    {
      InternalEObject oldReferredEnumLiteral = (InternalEObject)referredEnumLiteral;
      referredEnumLiteral = (CDOEnumLiteral)eResolveProxy(oldReferredEnumLiteral);
      if (referredEnumLiteral != oldReferredEnumLiteral)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL, oldReferredEnumLiteral, referredEnumLiteral));
      }
    }
    return referredEnumLiteral;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOEnumLiteral basicGetReferredEnumLiteral() {
    return referredEnumLiteral;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public void setReferredEnumLiteral(CDOEnumLiteral newReferredEnumLiteral) {
    CDOEnumLiteral oldReferredEnumLiteral = referredEnumLiteral;
    referredEnumLiteral = newReferredEnumLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL, oldReferredEnumLiteral, referredEnumLiteral));
  }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkEnumType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EnumLiteralExpOperations.checkEnumType(this, diagnostics,
			context);
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
        if (resolve) return getReferredEnumLiteral();
        return basicGetReferredEnumLiteral();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
        setReferredEnumLiteral((CDOEnumLiteral)newValue);
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
      case OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
        setReferredEnumLiteral((CDOEnumLiteral)null);
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
      case OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
        return referredEnumLiteral != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == org.eclipse.ocl.expressions.EnumLiteralExp.class)
    {
      switch (derivedFeatureID)
      {
        case OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL: return ExpressionsPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL;
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
    if (baseClass == org.eclipse.ocl.expressions.EnumLiteralExp.class)
    {
      switch (baseFeatureID)
      {
        case ExpressionsPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL: return OCLPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL;
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
		return ((Visitor<T, CDOClassifier, ?, ?, CDOEnumLiteral, ?, ?, ?, ?, ?>) v)
			.visitEnumLiteralExp(this);
	}

} // EnumLiteralExpImpl
