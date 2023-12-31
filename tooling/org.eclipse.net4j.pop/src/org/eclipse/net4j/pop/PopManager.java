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
 * $Id: PopManager.java,v 1.9 2008-08-11 09:36:04 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.model.IModelManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Manager</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.PopManager#getPops <em>Pops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getPopManager()
 * @model
 * @generated
 */
public interface PopManager extends PopElement
{
  /**
   * @ADDED
   */
  public static final PopManager INSTANCE = org.eclipse.net4j.pop.impl.PopManagerImpl.INSTANCE;

  /**
   * Returns the value of the '<em><b>Pops</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Pop}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Pop#getPopManager <em>Pop Manager</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pops</em>' reference list isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pops</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getPopManager_Pops()
   * @see org.eclipse.net4j.pop.Pop#getPopManager
   * @model opposite="popManager" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Pop> getPops();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" nameRequired="true" repositoryStrategyTypeRequired="true" repositoryAdapterTypeRequired="true" repositoryDescriptorRequired="true"
   * @generated
   */
  Pop createPop(String name, String repositoryStrategyType, String repositoryAdapterType, String repositoryDescriptor);

  /**
   * @ADDED
   */
  public IModelManager getModelManager();

} // PopManager
