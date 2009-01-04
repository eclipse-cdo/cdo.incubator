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
 * $Id: SequenceTypeImpl.java,v 1.1 2009-01-04 15:49:06 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.cdo.common.ocl.EcorePackage;
import org.eclipse.emf.cdo.common.ocl.SequenceType;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.types.operations.SequenceTypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SequenceTypeImpl
		extends CollectionTypeImpl
		implements SequenceType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SequenceTypeImpl() {
		super();
		setInstanceClass(List.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SequenceTypeImpl(EClassifier elementType) {
		super(elementType);
		setInstanceClass(List.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.SEQUENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public CollectionKind getKind() {
		return CollectionKind.SEQUENCE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkCollectionTypeName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SequenceTypeOperations.checkCollectionTypeName(this,
			diagnostics, context);
	}

} //SequenceTypeImpl
