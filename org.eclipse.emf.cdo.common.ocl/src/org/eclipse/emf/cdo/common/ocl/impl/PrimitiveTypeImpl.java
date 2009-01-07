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
 * $Id: PrimitiveTypeImpl.java,v 1.4 2009-01-07 07:21:29 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import org.eclipse.emf.cdo.common.model.CDOOperation;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.PrimitiveType;
import org.eclipse.emf.cdo.common.ocl.internal.OCLStandardLibraryImpl;
import org.eclipse.emf.cdo.internal.common.model.CDOTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Primitive Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PrimitiveTypeImpl
		extends CDOTypeImpl
		implements PrimitiveType {

	protected EList<CDOOperation> operations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CDOOperation> oclOperations() {
		if (operations == null) {
			PrimitiveType prototype;
			String myName = getName();

			if (BOOLEAN_NAME.equals(myName)) {
				prototype = (PrimitiveType) OCLStandardLibraryImpl.INSTANCE
					.getBoolean();
			} else if (STRING_NAME.equals(myName)) {
				prototype = (PrimitiveType) OCLStandardLibraryImpl.INSTANCE
					.getString();
			} else if (INTEGER_NAME.equals(myName)) {
				prototype = (PrimitiveType) OCLStandardLibraryImpl.INSTANCE
					.getInteger();
			} else if (REAL_NAME.equals(myName)) {
				prototype = (PrimitiveType) OCLStandardLibraryImpl.INSTANCE
					.getReal();
			} else {
				prototype = (PrimitiveType) OCLStandardLibraryImpl.INSTANCE
					.getUnlimitedNatural();
			}

			if (prototype == this) {
				// I *am* the standard library type!
				operations = OCLStandardLibraryImpl.getExistingOperations(this);
			} else {
				// the prototype defines my operations for me
				operations = prototype.oclOperations();
			}
		}

		return operations;
	}

} // PrimitiveTypeImpl
