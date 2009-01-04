/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id: ExpressionInOCLImpl.java,v 1.2 2009-01-04 17:56:36 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Collection;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.ocl.ExpressionInOCL;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Expression In OCL</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl#getBodyExpression
 * <em>Body Expression</em>}</li>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl#getContextVariable
 * <em>Context Variable</em>}</li>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl#getResultVariable
 * <em>Result Variable</em>}</li>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl#getParameterVariable
 * <em>Parameter Variable</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExpressionInOCLImpl
		extends EObjectImpl
		implements ExpressionInOCL {

	/**
	 * The cached value of the '{@link #getBodyExpression()
	 * <em>Body Expression</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBodyExpression()
	 * @generated
	 * @ordered
	 */
	protected OCLExpression<CDOClassifier> bodyExpression;

	/**
	 * The cached value of the '{@link #getContextVariable()
	 * <em>Context Variable</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getContextVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable<CDOClassifier, CDOParameter> contextVariable;

	/**
	 * The cached value of the '{@link #getResultVariable()
	 * <em>Result Variable</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResultVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable<CDOClassifier, CDOParameter> resultVariable;

	/**
	 * The cached value of the '{@link #getParameterVariable()
	 * <em>Parameter Variable</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameterVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable<CDOClassifier, CDOParameter>> parameterVariable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExpressionInOCLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.EXPRESSION_IN_OCL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLExpression<CDOClassifier> getBodyExpression() {
		return bodyExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBodyExpression(
			OCLExpression<CDOClassifier> newBodyExpression,
			NotificationChain msgs) {
		OCLExpression<CDOClassifier> oldBodyExpression = bodyExpression;
		bodyExpression = newBodyExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				oldBodyExpression, newBodyExpression);
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
	public void setBodyExpression(OCLExpression<CDOClassifier> newBodyExpression) {
		if (newBodyExpression != bodyExpression) {
			NotificationChain msgs = null;
			if (bodyExpression != null)
				msgs = ((InternalEObject) bodyExpression).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, null,
					msgs);
			if (newBodyExpression != null)
				msgs = ((InternalEObject) newBodyExpression).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, null,
					msgs);
			msgs = basicSetBodyExpression(newBodyExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				newBodyExpression, newBodyExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable<CDOClassifier, CDOParameter> getContextVariable() {
		return contextVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContextVariable(
			Variable<CDOClassifier, CDOParameter> newContextVariable,
			NotificationChain msgs) {
		Variable<CDOClassifier, CDOParameter> oldContextVariable = contextVariable;
		contextVariable = newContextVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				oldContextVariable, newContextVariable);
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
	public void setContextVariable(
			Variable<CDOClassifier, CDOParameter> newContextVariable) {
		if (newContextVariable != contextVariable) {
			NotificationChain msgs = null;
			if (contextVariable != null)
				msgs = ((InternalEObject) contextVariable).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, null,
					msgs);
			if (newContextVariable != null)
				msgs = ((InternalEObject) newContextVariable).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, null,
					msgs);
			msgs = basicSetContextVariable(newContextVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				newContextVariable, newContextVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable<CDOClassifier, CDOParameter> getResultVariable() {
		return resultVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResultVariable(
			Variable<CDOClassifier, CDOParameter> newResultVariable,
			NotificationChain msgs) {
		Variable<CDOClassifier, CDOParameter> oldResultVariable = resultVariable;
		resultVariable = newResultVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				oldResultVariable, newResultVariable);
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
	public void setResultVariable(
			Variable<CDOClassifier, CDOParameter> newResultVariable) {
		if (newResultVariable != resultVariable) {
			NotificationChain msgs = null;
			if (resultVariable != null)
				msgs = ((InternalEObject) resultVariable).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, null,
					msgs);
			if (newResultVariable != null)
				msgs = ((InternalEObject) newResultVariable).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, null,
					msgs);
			msgs = basicSetResultVariable(newResultVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				newResultVariable, newResultVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Variable<CDOClassifier, CDOParameter>> getParameterVariable() {
		if (parameterVariable == null) {
			parameterVariable = new EObjectContainmentEList<Variable<CDOClassifier, CDOParameter>>(
				Variable.class, this,
				OCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE);
		}
		return parameterVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, CDOClassifier, ?, ?, ?, CDOParameter, ?, ?, ?, ?>) v)
			.visitExpressionInOCL(this);
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
			case OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION :
				return basicSetBodyExpression(null, msgs);
			case OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE :
				return basicSetContextVariable(null, msgs);
			case OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE :
				return basicSetResultVariable(null, msgs);
			case OCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE :
				return ((InternalEList<?>) getParameterVariable()).basicRemove(
					otherEnd, msgs);
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
			case OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION :
				return getBodyExpression();
			case OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE :
				return getContextVariable();
			case OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE :
				return getResultVariable();
			case OCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE :
				return getParameterVariable();
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
			case OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION :
				setBodyExpression((OCLExpression<CDOClassifier>) newValue);
				return;
			case OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE :
				setContextVariable((Variable<CDOClassifier, CDOParameter>) newValue);
				return;
			case OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE :
				setResultVariable((Variable<CDOClassifier, CDOParameter>) newValue);
				return;
			case OCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE :
				getParameterVariable().clear();
				getParameterVariable()
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
			case OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION :
				setBodyExpression((OCLExpression<CDOClassifier>) null);
				return;
			case OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE :
				setContextVariable((Variable<CDOClassifier, CDOParameter>) null);
				return;
			case OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE :
				setResultVariable((Variable<CDOClassifier, CDOParameter>) null);
				return;
			case OCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE :
				getParameterVariable().clear();
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
			case OCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION :
				return bodyExpression != null;
			case OCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE :
				return contextVariable != null;
			case OCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE :
				return resultVariable != null;
			case OCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE :
				return parameterVariable != null
					&& !parameterVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ExpressionInOCLImpl
