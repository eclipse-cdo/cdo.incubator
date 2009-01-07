/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2008 IBM Corporation, Zeligsoft Inc., and others.
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
 * $Id: Variable.java,v 1.4 2009-01-07 07:21:30 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOParameter;
import org.eclipse.emf.cdo.common.model.CDOTypedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#getVariable()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedName'"
 * @generated
 */
public interface Variable
		extends CDOTypedElement,
		org.eclipse.ocl.expressions.Variable<CDOClassifier, CDOParameter> {
} // Variable
