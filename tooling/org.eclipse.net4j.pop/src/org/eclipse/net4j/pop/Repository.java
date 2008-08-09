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
 * $Id: Repository.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.repository.IRepositoryAdapter;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Repository</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Repository#getPop <em>Pop</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Repository#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Repository#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Repository#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Repository#getMainBranch <em>Main Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends PopElement
{
  /**
   * Returns the value of the '<em><b>Pop</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Pop#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop</em>' container reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop</em>' container reference.
   * @see #setPop(Pop)
   * @see org.eclipse.net4j.pop.PopPackage#getRepository_Pop()
   * @see org.eclipse.net4j.pop.Pop#getRepository
   * @model opposite="repository" required="true" transient="false"
   * @generated
   */
  Pop getPop();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Repository#getPop <em>Pop</em>}' container reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Pop</em>' container reference.
   * @see #getPop()
   * @generated
   */
  void setPop(Pop value);

  /**
   * Returns the value of the '<em><b>Adapter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapter</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getRepository_Adapter()
   * @model dataType="org.eclipse.net4j.pop.RepositoryAdapter" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  IRepositoryAdapter getAdapter();

  /**
   * Returns the value of the '<em><b>Adapter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapter Type</em>' attribute.
   * @see #setAdapterType(String)
   * @see org.eclipse.net4j.pop.PopPackage#getRepository_AdapterType()
   * @model required="true"
   * @generated
   */
  String getAdapterType();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Repository#getAdapterType <em>Adapter Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Adapter Type</em>' attribute.
   * @see #getAdapterType()
   * @generated
   */
  void setAdapterType(String value);

  /**
   * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descriptor</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptor</em>' attribute.
   * @see #setDescriptor(String)
   * @see org.eclipse.net4j.pop.PopPackage#getRepository_Descriptor()
   * @model required="true"
   * @generated
   */
  String getDescriptor();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Repository#getDescriptor <em>Descriptor</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Descriptor</em>' attribute.
   * @see #getDescriptor()
   * @generated
   */
  void setDescriptor(String value);

  /**
   * Returns the value of the '<em><b>Main Branch</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.MainBranch#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Branch</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Branch</em>' containment reference.
   * @see #setMainBranch(MainBranch)
   * @see org.eclipse.net4j.pop.PopPackage#getRepository_MainBranch()
   * @see org.eclipse.net4j.pop.MainBranch#getRepository
   * @model opposite="repository" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  MainBranch getMainBranch();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Repository#getMainBranch <em>Main Branch</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Branch</em>' containment reference.
   * @see #getMainBranch()
   * @generated
   */
  void setMainBranch(MainBranch value);

} // Repository
