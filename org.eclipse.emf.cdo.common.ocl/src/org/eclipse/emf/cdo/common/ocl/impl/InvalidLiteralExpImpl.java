/**
 * <copyright>
 * 
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: InvalidLiteralExpImpl.java,v 1.1 2009-01-04 15:49:07 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import org.eclipse.emf.cdo.common.ocl.EcorePackage;
import org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invalid Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InvalidLiteralExpImpl
		extends LiteralExpImpl
		implements InvalidLiteralExp {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvalidLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.INVALID_LITERAL_EXP;
	}

	/**
	 * @generated NOT
	 */
	@Override @SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?>) v).visitInvalidLiteralExp(this);
	}

} //InvalidLiteralExpImpl
