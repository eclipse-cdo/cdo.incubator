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
 * $Id: SetType.java,v 1.3 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOOperation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Set Type</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#getSetType()
 * @model
 * @generated
 */
public interface SetType
		extends CollectionType,
		org.eclipse.ocl.types.SetType<CDOClassifier, CDOOperation> {
	// no additional features
} // SetType
