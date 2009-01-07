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
 * $Id: TupleType.java,v 1.4 2009-01-07 07:21:33 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.model.CDOClass;
import org.eclipse.emf.cdo.common.model.CDOFeature;
import org.eclipse.emf.cdo.common.model.CDOOperation;
import org.eclipse.emf.cdo.common.model.CDOType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Tuple Type</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#getTupleType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedName WellFormedInstanceTypeName'"
 * @generated
 */
public interface TupleType
		extends CDOClass, CDOType,
		org.eclipse.ocl.types.TupleType<CDOOperation, CDOFeature> {
	// no additional features
} // TupleType
