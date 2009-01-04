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
 * $Id: Variable.java,v 1.2 2009-01-04 17:56:36 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.fake.CDOTypedElement;

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
