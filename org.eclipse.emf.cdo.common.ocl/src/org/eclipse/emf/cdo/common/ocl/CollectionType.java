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
 * $Id: CollectionType.java,v 1.1 2009-01-04 15:49:07 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.cdo.common.ocl.EcorePackage#getCollectionType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedName WellFormedInstanceTypeName'"
 * @generated
 */
public interface CollectionType
		extends EDataType,
		org.eclipse.ocl.types.CollectionType<EClassifier, EOperation> {
	// no additional features
} // CollectionType
