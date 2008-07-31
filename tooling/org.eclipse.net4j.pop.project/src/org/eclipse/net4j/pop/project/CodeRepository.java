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
 * $Id: CodeRepository.java,v 1.2 2008-07-31 13:35:41 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Code Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.CodeRepository#getTeamProvider <em>Team Provider</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.CodeRepository#getRepositoryUrl <em>Repository Url</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.CodeRepository#getCodeRoots <em>Code Roots</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.CodeRepository#getCommitters <em>Committers</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.CodeRepository#getMainBranch <em>Main Branch</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.CodeRepository#getPopProject <em>Pop Project</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository()
 * @model
 * @generated
 */
public interface CodeRepository extends EObject
{
  /**
   * Returns the value of the '<em><b>Team Provider</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Team Provider</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Team Provider</em>' attribute.
   * @see #setTeamProvider(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository_TeamProvider()
   * @model required="true"
   * @generated
   */
  String getTeamProvider();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRepository#getTeamProvider <em>Team Provider</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Team Provider</em>' attribute.
   * @see #getTeamProvider()
   * @generated
   */
  void setTeamProvider(String value);

  /**
   * Returns the value of the '<em><b>Repository Url</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository Url</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Repository Url</em>' attribute.
   * @see #setRepositoryUrl(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository_RepositoryUrl()
   * @model required="true"
   * @generated
   */
  String getRepositoryUrl();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRepository#getRepositoryUrl
   * <em>Repository Url</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Repository Url</em>' attribute.
   * @see #getRepositoryUrl()
   * @generated
   */
  void setRepositoryUrl(String value);

  /**
   * Returns the value of the '<em><b>Code Roots</b></em>' containment reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.project.CodeRoot}. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.project.CodeRoot#getRepository <em>Repository</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Roots</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Code Roots</em>' containment reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository_CodeRoots()
   * @see org.eclipse.net4j.pop.project.CodeRoot#getRepository
   * @model opposite="repository" containment="true" required="true"
   * @generated
   */
  EList<CodeRoot> getCodeRoots();

  /**
   * Returns the value of the '<em><b>Committers</b></em>' containment reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.project.Committer}. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.project.Committer#getRepository <em>Repository</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Committers</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Committers</em>' containment reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository_Committers()
   * @see org.eclipse.net4j.pop.project.Committer#getRepository
   * @model opposite="repository" containment="true" required="true"
   * @generated
   */
  EList<Committer> getCommitters();

  /**
   * Returns the value of the '<em><b>Main Branch</b></em>' containment reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.project.MainBranch#getCodeRepository <em>Code Repository</em>}'. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Branch</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Main Branch</em>' containment reference.
   * @see #setMainBranch(MainBranch)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository_MainBranch()
   * @see org.eclipse.net4j.pop.project.MainBranch#getCodeRepository
   * @model opposite="codeRepository" containment="true" required="true"
   * @generated
   */
  MainBranch getMainBranch();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRepository#getMainBranch <em>Main Branch</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Main Branch</em>' containment reference.
   * @see #getMainBranch()
   * @generated
   */
  void setMainBranch(MainBranch value);

  /**
   * Returns the value of the '<em><b>Pop Project</b></em>' reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.project.PopProject#getCodeRepository <em>Code Repository</em>}'. <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Pop Project</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Pop Project</em>' reference.
   * @see #setPopProject(PopProject)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRepository_PopProject()
   * @see org.eclipse.net4j.pop.project.PopProject#getCodeRepository
   * @model opposite="codeRepository"
   * @generated
   */
  PopProject getPopProject();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRepository#getPopProject <em>Pop Project</em>}'
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Pop Project</em>' reference.
   * @see #getPopProject()
   * @generated
   */
  void setPopProject(PopProject value);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @model required="true" idRequired="true" nameRequired="true" emailRequired="true" entryRequired="true"
   * @generated
   */
  Release addCommitter(String id, String name, String email, Date entry);

} // CodeRepository
