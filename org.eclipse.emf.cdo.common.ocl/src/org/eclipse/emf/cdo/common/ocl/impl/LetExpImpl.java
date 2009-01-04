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
 * $Id: LetExpImpl.java,v 1.2 2009-01-04 17:56:36 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Map;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.ocl.LetExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.operations.LetExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Let Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.LetExpImpl#getIn <em>In</em>}</li>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.impl.LetExpImpl#getVariable <em>
 * Variable</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LetExpImpl
		extends OCLExpressionImpl
		implements LetExp {

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected OCLExpression<CDOClassifier> in;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable<CDOClassifier, CDOParameter> variable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LetExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.LET_EXP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLExpression<CDOClassifier> getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIn(OCLExpression<CDOClassifier> newIn,
			NotificationChain msgs) {
		OCLExpression<CDOClassifier> oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, OCLPackage.LET_EXP__IN, oldIn, newIn);
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
	public void setIn(OCLExpression<CDOClassifier> newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject) in)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- OCLPackage.LET_EXP__IN, null, msgs);
			if (newIn != null)
				msgs = ((InternalEObject) newIn)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- OCLPackage.LET_EXP__IN, null, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.LET_EXP__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable<CDOClassifier, CDOParameter> getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetVariable(
			Variable<CDOClassifier, CDOParameter> newVariable,
			NotificationChain msgs) {
		Variable<CDOClassifier, CDOParameter> oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, OCLPackage.LET_EXP__VARIABLE, oldVariable,
				newVariable);
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
	public void setVariable(Variable<CDOClassifier, CDOParameter> newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject) variable).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - OCLPackage.LET_EXP__VARIABLE,
					null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject) newVariable).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - OCLPackage.LET_EXP__VARIABLE,
					null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.LET_EXP__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkLetType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LetExpOperations.checkLetType(this, diagnostics, context);
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
			case OCLPackage.LET_EXP__IN :
				return basicSetIn(null, msgs);
			case OCLPackage.LET_EXP__VARIABLE :
				return basicSetVariable(null, msgs);
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
			case OCLPackage.LET_EXP__IN :
				return getIn();
			case OCLPackage.LET_EXP__VARIABLE :
				return getVariable();
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
			case OCLPackage.LET_EXP__IN :
				setIn((OCLExpression<CDOClassifier>) newValue);
				return;
			case OCLPackage.LET_EXP__VARIABLE :
				setVariable((Variable<CDOClassifier, CDOParameter>) newValue);
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
			case OCLPackage.LET_EXP__IN :
				setIn((OCLExpression<CDOClassifier>) null);
				return;
			case OCLPackage.LET_EXP__VARIABLE :
				setVariable((Variable<CDOClassifier, CDOParameter>) null);
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
			case OCLPackage.LET_EXP__IN :
				return in != null;
			case OCLPackage.LET_EXP__VARIABLE :
				return variable != null;
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
		if (baseClass == org.eclipse.ocl.expressions.LetExp.class) {
			switch (derivedFeatureID) {
				case OCLPackage.LET_EXP__IN :
					return ExpressionsPackage.LET_EXP__IN;
				case OCLPackage.LET_EXP__VARIABLE :
					return ExpressionsPackage.LET_EXP__VARIABLE;
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
		if (baseClass == org.eclipse.ocl.expressions.LetExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.LET_EXP__IN :
					return OCLPackage.LET_EXP__IN;
				case ExpressionsPackage.LET_EXP__VARIABLE :
					return OCLPackage.LET_EXP__VARIABLE;
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
		return ((Visitor<T, CDOClassifier, ?, ?, ?, CDOParameter, ?, ?, ?, ?>) v)
			.visitLetExp(this);
	}

} // LetExpImpl
