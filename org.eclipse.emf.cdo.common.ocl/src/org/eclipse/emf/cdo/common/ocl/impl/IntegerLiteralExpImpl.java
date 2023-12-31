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
 * $Id: IntegerLiteralExpImpl.java,v 1.4 2009-01-07 07:21:26 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.operations.IntegerLiteralExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Integer Literal Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.IntegerLiteralExpImpl#getIntegerSymbol
 * <em>Integer Symbol</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IntegerLiteralExpImpl
		extends NumericLiteralExpImpl
		implements IntegerLiteralExp {

	/**
	 * The default value of the '{@link #getIntegerSymbol()
	 * <em>Integer Symbol</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIntegerSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTEGER_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegerSymbol()
	 * <em>Integer Symbol</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIntegerSymbol()
	 * @generated
	 * @ordered
	 */
	protected Integer integerSymbol = INTEGER_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IntegerLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.INTEGER_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getIntegerSymbol() {
		return integerSymbol;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIntegerSymbol(Integer newIntegerSymbol) {
		Integer oldIntegerSymbol = integerSymbol;
		integerSymbol = newIntegerSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL,
				oldIntegerSymbol, integerSymbol));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkIntegerType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IntegerLiteralExpOperations.checkIntegerType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
				return getIntegerSymbol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
				setIntegerSymbol((Integer) newValue);
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
			case OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
				setIntegerSymbol(INTEGER_SYMBOL_EDEFAULT);
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
			case OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
				return INTEGER_SYMBOL_EDEFAULT == null
					? integerSymbol != null
					: !INTEGER_SYMBOL_EDEFAULT.equals(integerSymbol);
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
		if (baseClass == org.eclipse.ocl.expressions.IntegerLiteralExp.class) {
			switch (derivedFeatureID) {
				case OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
					return ExpressionsPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL;
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
		if (baseClass == org.eclipse.ocl.expressions.IntegerLiteralExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
					return OCLPackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL;
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
			.visitIntegerLiteralExp(this);
	}

} // IntegerLiteralExpImpl
