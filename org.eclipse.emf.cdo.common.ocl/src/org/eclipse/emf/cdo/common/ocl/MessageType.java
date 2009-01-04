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
 * $Id: MessageType.java,v 1.3 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.fake.CDOClass;
import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.CDOOperation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message Type</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#getMessageType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedName WellFormedInstanceTypeName'"
 * @generated
 */
public interface MessageType
		extends
		CDOClass,
		org.eclipse.ocl.types.MessageType<CDOClassifier, CDOOperation, CDOFeature> {
	// no additional features
} // MessageType
