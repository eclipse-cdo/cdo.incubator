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
 * $Id: Pop.java,v 1.4 2008-08-09 09:58:10 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pop</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.Pop#getPopManager <em>Pop Manager</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#isActive <em>Active</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#getDevelopers <em>Developers</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#getRepository <em>Repository</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#getRootStream <em>Root Stream</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#getPrimaryModule <em>Primary Module</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Pop#getCheckoutManager <em>Checkout Manager</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.PopPackage#getPop()
 * @model
 * @generated
 */
public interface Pop extends PopElement, Assignee
{
  /**
   * Returns the value of the '<em><b>Pop Manager</b></em>' container reference. It is bidirectional and its opposite is
   * '{@link org.eclipse.net4j.pop.PopManager#getPops <em>Pops</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop Manager</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Pop Manager</em>' container reference.
   * @see #setPopManager(PopManager)
   * @see org.eclipse.net4j.pop.PopPackage#getPop_PopManager()
   * @see org.eclipse.net4j.pop.PopManager#getPops
   * @model opposite="pops" required="true" transient="false"
   * @generated
   */
  PopManager getPopManager();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Pop#getPopManager <em>Pop Manager</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Pop Manager</em>' container reference.
   * @see #getPopManager()
   * @generated
   */
  void setPopManager(PopManager value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.PopPackage#getPop_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Pop#getName <em>Name</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Active</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getPop_Active()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  boolean isActive();

  /**
   * Returns the value of the '<em><b>Developers</b></em>' containment reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.Developer}. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.Developer#getPop <em>Pop</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Developers</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Developers</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getPop_Developers()
   * @see org.eclipse.net4j.pop.Developer#getPop
   * @model opposite="pop" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<Developer> getDevelopers();

  /**
   * Returns the value of the '<em><b>Repository</b></em>' containment reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.Repository#getPop <em>Pop</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Repository</em>' containment reference.
   * @see #setRepository(Repository)
   * @see org.eclipse.net4j.pop.PopPackage#getPop_Repository()
   * @see org.eclipse.net4j.pop.Repository#getPop
   * @model opposite="pop" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  Repository getRepository();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Pop#getRepository <em>Repository</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Repository</em>' containment reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(Repository value);

  /**
   * Returns the value of the '<em><b>Root Stream</b></em>' containment reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.DevelopmentStream#getPop <em>Pop</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Stream</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Root Stream</em>' containment reference.
   * @see #setRootStream(DevelopmentStream)
   * @see org.eclipse.net4j.pop.PopPackage#getPop_RootStream()
   * @see org.eclipse.net4j.pop.DevelopmentStream#getPop
   * @model opposite="pop" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  DevelopmentStream getRootStream();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Pop#getRootStream <em>Root Stream</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Root Stream</em>' containment reference.
   * @see #getRootStream()
   * @generated
   */
  void setRootStream(DevelopmentStream value);

  /**
   * Returns the value of the '<em><b>Primary Module</b></em>' containment reference. It is bidirectional and its
   * opposite is '{@link org.eclipse.net4j.pop.PrimaryModule#getPop <em>Pop</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Module</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Primary Module</em>' containment reference.
   * @see #setPrimaryModule(PrimaryModule)
   * @see org.eclipse.net4j.pop.PopPackage#getPop_PrimaryModule()
   * @see org.eclipse.net4j.pop.PrimaryModule#getPop
   * @model opposite="pop" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  PrimaryModule getPrimaryModule();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Pop#getPrimaryModule <em>Primary Module</em>}' containment
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Primary Module</em>' containment reference.
   * @see #getPrimaryModule()
   * @generated
   */
  void setPrimaryModule(PrimaryModule value);

  /**
   * Returns the value of the '<em><b>Checkout Manager</b></em>' reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.CheckoutManager#getPop <em>Pop</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkout Manager</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Checkout Manager</em>' reference.
   * @see #setCheckoutManager(CheckoutManager)
   * @see org.eclipse.net4j.pop.PopPackage#getPop_CheckoutManager()
   * @see org.eclipse.net4j.pop.CheckoutManager#getPop
   * @model opposite="pop"
   * @generated
   */
  CheckoutManager getCheckoutManager();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Pop#getCheckoutManager <em>Checkout Manager</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Checkout Manager</em>' reference.
   * @see #getCheckoutManager()
   * @generated
   */
  void setCheckoutManager(CheckoutManager value);

} // Pop
