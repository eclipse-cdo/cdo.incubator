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
 * $Id: RootStream.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.RootStream#getPop <em>Pop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getRootStream()
 * @model
 * @generated
 */
public interface RootStream extends DevelopmentStream
{
  /**
   * Returns the value of the '<em><b>Pop</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Pop#getRootStream <em>Root Stream</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop</em>' container reference.
   * @see #setPop(Pop)
   * @see org.eclipse.net4j.pop.PopPackage#getRootStream_Pop()
   * @see org.eclipse.net4j.pop.Pop#getRootStream
   * @model opposite="rootStream" required="true" transient="false"
   * @generated
   */
  Pop getPop();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.RootStream#getPop <em>Pop</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop</em>' container reference.
   * @see #getPop()
   * @generated
   */
  void setPop(Pop value);

} // RootStream
