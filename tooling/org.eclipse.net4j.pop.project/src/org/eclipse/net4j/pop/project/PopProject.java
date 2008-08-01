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
 * $Id: PopProject.java,v 1.9 2008-08-01 11:03:27 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.net4j.pop.base.PopElement;

import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pop Project</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getTeamProvider <em>Team Provider</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getRepositoryUrl <em>Repository Url</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getCommitters <em>Committers</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getCodeRoots <em>Code Roots</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getMainBranch <em>Main Branch</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.PopProject#getRootStream <em>Root Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject()
 * @model
 * @generated
 */
public interface PopProject extends PopElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Team Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Team Provider</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team Provider</em>' attribute.
   * @see #setTeamProvider(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_TeamProvider()
   * @model required="true"
   * @generated
   */
  String getTeamProvider();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getTeamProvider <em>Team Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Team Provider</em>' attribute.
   * @see #getTeamProvider()
   * @generated
   */
  void setTeamProvider(String value);

  /**
   * Returns the value of the '<em><b>Repository Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository Url</em>' attribute.
   * @see #setRepositoryUrl(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_RepositoryUrl()
   * @model required="true"
   * @generated
   */
  String getRepositoryUrl();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getRepositoryUrl <em>Repository Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository Url</em>' attribute.
   * @see #getRepositoryUrl()
   * @generated
   */
  void setRepositoryUrl(String value);

  /**
   * Returns the value of the '<em><b>Code Roots</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.project.CodeRoot}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.CodeRoot#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Roots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Roots</em>' containment reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_CodeRoots()
   * @see org.eclipse.net4j.pop.project.CodeRoot#getPopProject
   * @model opposite="popProject" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<CodeRoot> getCodeRoots();

  /**
   * Returns the value of the '<em><b>Committers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.project.Committer}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.Committer#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Committers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Committers</em>' containment reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_Committers()
   * @see org.eclipse.net4j.pop.project.Committer#getPopProject
   * @model opposite="popProject" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<Committer> getCommitters();

  /**
   * Returns the value of the '<em><b>Main Branch</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.MainBranch#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Branch</em>' containment reference.
   * @see #setMainBranch(MainBranch)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_MainBranch()
   * @see org.eclipse.net4j.pop.project.MainBranch#getPopProject
   * @model opposite="popProject" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  MainBranch getMainBranch();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getMainBranch <em>Main Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Branch</em>' containment reference.
   * @see #getMainBranch()
   * @generated
   */
  void setMainBranch(MainBranch value);

  /**
   * Returns the value of the '<em><b>Root Stream</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.RootStream#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Stream</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Stream</em>' containment reference.
   * @see #setRootStream(RootStream)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_RootStream()
   * @see org.eclipse.net4j.pop.project.RootStream#getPopProject
   * @model opposite="popProject" containment="true" resolveProxies="true" required="true"
   * @generated
   */
  RootStream getRootStream();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getRootStream <em>Root Stream</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Stream</em>' containment reference.
   * @see #getRootStream()
   * @generated
   */
  void setRootStream(RootStream value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" idRequired="true" nameRequired="true" emailRequired="true" entryRequired="true"
   * @generated
   */
  Release addCommitter(String id, String name, String email, Date entry);

} // PopProject
