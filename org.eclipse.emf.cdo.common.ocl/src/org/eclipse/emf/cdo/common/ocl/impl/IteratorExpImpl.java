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
 * $Id: IteratorExpImpl.java,v 1.4 2009-01-07 07:21:26 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOParameter;
import org.eclipse.emf.cdo.common.ocl.IteratorExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.expressions.operations.IteratorExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Iterator Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class IteratorExpImpl
		extends LoopExpImpl
		implements IteratorExp {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IteratorExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.ITERATOR_EXP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkBooleanType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IteratorExpOperations.checkBooleanType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkCollectType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IteratorExpOperations.checkCollectType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkSelectRejectType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IteratorExpOperations.checkSelectRejectType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkBooleanBodyType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IteratorExpOperations.checkBooleanBodyType(this, diagnostics,
			context);
	}

	/**
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, CDOClassifier, ?, ?, ?, CDOParameter, ?, ?, ?, ?>) v)
			.visitIteratorExp(this);
	}

} // IteratorExpImpl
