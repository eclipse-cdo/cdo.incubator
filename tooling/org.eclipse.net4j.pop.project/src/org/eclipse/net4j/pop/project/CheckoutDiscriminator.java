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
 * $Id: CheckoutDiscriminator.java,v 1.1 2008-08-05 05:54:20 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.net4j.pop.base.PopElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout Discriminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.CheckoutDiscriminator#getCheckouts <em>Checkouts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getCheckoutDiscriminator()
 * @model abstract="true"
 * @generated
 */
public interface CheckoutDiscriminator extends PopElement
{
  /**
   * Returns the value of the '<em><b>Checkouts</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.project.Checkout}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.Checkout#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkouts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checkouts</em>' reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCheckoutDiscriminator_Checkouts()
   * @see org.eclipse.net4j.pop.project.Checkout#getDiscriminator
   * @model opposite="discriminator" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<Checkout> getCheckouts();

} // CheckoutDiscriminator
