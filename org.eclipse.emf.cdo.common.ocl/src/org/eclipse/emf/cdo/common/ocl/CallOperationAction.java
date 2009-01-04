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
 *   Zeligsoft - Bug 256040
 * 
 * </copyright>
 *
 * $Id: CallOperationAction.java,v 1.1 2009-01-04 15:49:08 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.common.ocl.CallOperationAction#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.common.ocl.EcorePackage#getCallOperationAction()
 * @model
 * @generated
 */
public interface CallOperationAction
		extends EObject {

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(EOperation)
	 * @see org.eclipse.emf.cdo.common.ocl.EcorePackage#getCallOperationAction_Operation()
	 * @model required="true"
	 * @generated
	 */
	EOperation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.common.ocl.CallOperationAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EOperation value);

} // CallOperationAction
