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
 * $Id: RepositoryModule.java,v 1.2 2008-08-05 18:39:26 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.net4j.pop.base.PopElement;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Repository Module</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.RepositoryModule#getPopProject <em>Pop Project</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.RepositoryModule#getAdapter <em>Adapter</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.RepositoryModule#getAdapterType <em>Adapter Type</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.RepositoryModule#getRepositoryDescriptor <em>Repository Descriptor</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.RepositoryModule#getModuleDescriptor <em>Module Descriptor</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getRepositoryModule()
 * @model abstract="true"
 * @generated
 */
public interface RepositoryModule extends PopElement
{
  /**
   * Returns the value of the '<em><b>Pop Project</b></em>' container reference. It is bidirectional and its opposite is
   * '{@link org.eclipse.net4j.pop.project.PopProject#getPrimaryModule <em>Primary Module</em>}'. <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Pop Project</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Pop Project</em>' container reference.
   * @see #setPopProject(PopProject)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getRepositoryModule_PopProject()
   * @see org.eclipse.net4j.pop.project.PopProject#getPrimaryModule
   * @model opposite="primaryModule" required="true" transient="false"
   * @generated
   */
  PopProject getPopProject();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.RepositoryModule#getPopProject <em>Pop Project</em>}'
   * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Pop Project</em>' container reference.
   * @see #getPopProject()
   * @generated
   */
  void setPopProject(PopProject value);

  /**
   * Returns the value of the '<em><b>Adapter</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Adapter</em>' attribute.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getRepositoryModule_Adapter()
   * @model dataType="org.eclipse.net4j.pop.project.RepositoryAdapter" required="true" transient="true"
   *        changeable="false" volatile="true" derived="true"
   * @generated
   */
  IRepositoryAdapter getAdapter();

  /**
   * Returns the value of the '<em><b>Adapter Type</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Adapter Type</em>' attribute.
   * @see #setAdapterType(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getRepositoryModule_AdapterType()
   * @model required="true"
   * @generated
   */
  String getAdapterType();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.RepositoryModule#getAdapterType <em>Adapter Type</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Adapter Type</em>' attribute.
   * @see #getAdapterType()
   * @generated
   */
  void setAdapterType(String value);

  /**
   * Returns the value of the '<em><b>Repository Descriptor</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository Descriptor</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Repository Descriptor</em>' attribute.
   * @see #setRepositoryDescriptor(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getRepositoryModule_RepositoryDescriptor()
   * @model required="true"
   * @generated
   */
  String getRepositoryDescriptor();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.RepositoryModule#getRepositoryDescriptor
   * <em>Repository Descriptor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Repository Descriptor</em>' attribute.
   * @see #getRepositoryDescriptor()
   * @generated
   */
  void setRepositoryDescriptor(String value);

  /**
   * Returns the value of the '<em><b>Module Descriptor</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Descriptor</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Module Descriptor</em>' attribute.
   * @see #setModuleDescriptor(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getRepositoryModule_ModuleDescriptor()
   * @model required="true"
   * @generated
   */
  String getModuleDescriptor();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.RepositoryModule#getModuleDescriptor
   * <em>Module Descriptor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Module Descriptor</em>' attribute.
   * @see #getModuleDescriptor()
   * @generated
   */
  void setModuleDescriptor(String value);

} // RepositoryModule
