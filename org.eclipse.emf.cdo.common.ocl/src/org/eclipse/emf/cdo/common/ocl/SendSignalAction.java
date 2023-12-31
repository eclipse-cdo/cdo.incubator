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
 * $Id: SendSignalAction.java,v 1.4 2009-01-07 07:21:33 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.model.CDOClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Send Signal Action</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.common.ocl.SendSignalAction#getSignal <em>
 * Signal</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#getSendSignalAction()
 * @model
 * @generated
 */
public interface SendSignalAction
		extends EObject {

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(CDOClass)
	 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#getSendSignalAction_Signal()
	 * @model required="true"
	 * @generated
	 */
	CDOClass getSignal();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.cdo.common.ocl.SendSignalAction#getSignal
	 * <em>Signal</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(CDOClass value);

} // SendSignalAction
