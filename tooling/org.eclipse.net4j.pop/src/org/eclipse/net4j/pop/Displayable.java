/**
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *
 * $Id: Displayable.java,v 1.4 2008-08-11 07:21:04 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Displayable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Displayable#getDisplayString <em>Display String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getDisplayable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Displayable extends EObject
{
  /**
   * Returns the value of the '<em><b>Display String</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of the '<em>Display String</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getDisplayable_DisplayString()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  String getDisplayString();

} // Displayable
