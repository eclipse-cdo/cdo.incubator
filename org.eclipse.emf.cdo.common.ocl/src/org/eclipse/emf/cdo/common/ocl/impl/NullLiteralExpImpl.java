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
 * $Id: NullLiteralExpImpl.java,v 1.4 2009-01-07 07:21:28 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.ocl.NullLiteralExp;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Null Literal Exp</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class NullLiteralExpImpl
		extends LiteralExpImpl
		implements NullLiteralExp {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NullLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.NULL_LITERAL_EXP;
	}

	/**
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, CDOClassifier, ?, ?, ?, ?, ?, ?, ?, ?>) v)
			.visitNullLiteralExp(this);
	}

} // NullLiteralExpImpl
