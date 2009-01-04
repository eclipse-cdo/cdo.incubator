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
 * $Id: AssociationClassCallExpImpl.java,v 1.3 2009-01-04 19:26:02 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Association Class Call Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.common.ocl.impl.AssociationClassCallExpImpl#getReferredAssociationClass <em>Referred Association Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassCallExpImpl
		extends NavigationCallExpImpl
		implements AssociationClassCallExp {

	/**
   * The cached value of the '{@link #getReferredAssociationClass() <em>Referred Association Class</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReferredAssociationClass()
   * @generated
   * @ordered
   */
	protected CDOClassifier referredAssociationClass;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected AssociationClassCallExpImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OCLPackage.Literals.ASSOCIATION_CLASS_CALL_EXP;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOClassifier getReferredAssociationClass() {
    if (referredAssociationClass != null && ((EObject)referredAssociationClass).eIsProxy())
    {
      InternalEObject oldReferredAssociationClass = (InternalEObject)referredAssociationClass;
      referredAssociationClass = (CDOClassifier)eResolveProxy(oldReferredAssociationClass);
      if (referredAssociationClass != oldReferredAssociationClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS, oldReferredAssociationClass, referredAssociationClass));
      }
    }
    return referredAssociationClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOClassifier basicGetReferredAssociationClass() {
    return referredAssociationClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public void setReferredAssociationClass(
			CDOClassifier newReferredAssociationClass) {
    CDOClassifier oldReferredAssociationClass = referredAssociationClass;
    referredAssociationClass = newReferredAssociationClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS, oldReferredAssociationClass, referredAssociationClass));
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS:
        if (resolve) return getReferredAssociationClass();
        return basicGetReferredAssociationClass();
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
      case OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS:
        setReferredAssociationClass((CDOClassifier)newValue);
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
      case OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS:
        setReferredAssociationClass((CDOClassifier)null);
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
      case OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS:
        return referredAssociationClass != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == org.eclipse.ocl.expressions.AssociationClassCallExp.class)
    {
      switch (derivedFeatureID)
      {
        case OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS: return ExpressionsPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS;
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
    if (baseClass == org.eclipse.ocl.expressions.AssociationClassCallExp.class)
    {
      switch (baseFeatureID)
      {
        case ExpressionsPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS: return OCLPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS;
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
		return ((Visitor<T, CDOClassifier, ?, CDOFeature, ?, ?, ?, ?, ?, ?>) v)
			.visitAssociationClassCallExp(this);
	}

} // AssociationClassCallExpImpl
