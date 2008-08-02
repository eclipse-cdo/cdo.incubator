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
 * $Id: ProductPackage.java,v 1.4 2008-08-01 08:34:34 estepper Exp $
 */
package org.eclipse.net4j.pop.product;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage
{
  /**
   * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNAME = "product"; //$NON-NLS-1$

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/pop/product/1.0.0"; //$NON-NLS-1$

  /**
   * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNS_PREFIX = "pop.product"; //$NON-NLS-1$

  /**
   * The package content type ID. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eCONTENT_TYPE = "pop.product"; //$NON-NLS-1$

  /**
   * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ProductPackage eINSTANCE = org.eclipse.net4j.pop.product.impl.ProductPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.PopProductImpl <em>Pop Product</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.PopProductImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getPopProduct()
   * @generated
   */
  int POP_PRODUCT = 0;

  /**
   * The feature id for the '<em><b>Pop Project</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_PRODUCT__POP_PROJECT = 0;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_PRODUCT__PROJECTS = 1;

  /**
   * The feature id for the '<em><b>Working Sets</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_PRODUCT__WORKING_SETS = 2;

  /**
   * The feature id for the '<em><b>Configurators</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_PRODUCT__CONFIGURATORS = 3;

  /**
   * The number of structural features of the '<em>Pop Product</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int POP_PRODUCT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.WorkingSetImpl <em>Working Set</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.WorkingSetImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getWorkingSet()
   * @generated
   */
  int WORKING_SET = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKING_SET__NAME = 0;

  /**
   * The feature id for the '<em><b>Projects</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKING_SET__PROJECTS = 1;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKING_SET__WORKSPACE_SPEC = 2;

  /**
   * The number of structural features of the '<em>Working Set</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int WORKING_SET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl
   * <em>Workspace Project</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getWorkspaceProject()
   * @generated
   */
  int WORKSPACE_PROJECT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Working Sets</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__WORKING_SETS = 1;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__WORKSPACE_SPEC = 2;

  /**
   * The feature id for the '<em><b>Code Root</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__CODE_ROOT = 3;

  /**
   * The feature id for the '<em><b>Code Path</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__CODE_PATH = 4;

  /**
   * The number of structural features of the '<em>Workspace Project</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl
   * <em>Workspace Configurator</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getWorkspaceConfigurator()
   * @generated
   */
  int WORKSPACE_CONFIGURATOR = 3;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC = 0;

  /**
   * The number of structural features of the '<em>Workspace Configurator</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int WORKSPACE_CONFIGURATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.ArtifactImpl <em>Artifact</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.ArtifactImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 4;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARTIFACT__PARENT = 0;

  /**
   * The number of structural features of the '<em>Artifact</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.FileImpl <em>File</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.FileImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getFile()
   * @generated
   */
  int FILE = 5;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FILE__PARENT = ARTIFACT__PARENT;

  /**
   * The number of structural features of the '<em>File</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.FolderImpl <em>Folder</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.FolderImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getFolder()
   * @generated
   */
  int FOLDER = 6;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FOLDER__PARENT = ARTIFACT__PARENT;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FOLDER__MEMBERS = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Folder</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FOLDER_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.ArchiveImpl <em>Archive</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.ArchiveImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getArchive()
   * @generated
   */
  int ARCHIVE = 7;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE__PARENT = FILE__PARENT;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE__CONTENT = FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Archive</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.product.impl.ArchiveContentImpl <em>Archive Content</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.product.impl.ArchiveContentImpl
   * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getArchiveContent()
   * @generated
   */
  int ARCHIVE_CONTENT = 8;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE_CONTENT__PARENT = FOLDER__PARENT;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE_CONTENT__MEMBERS = FOLDER__MEMBERS;

  /**
   * The feature id for the '<em><b>Archive</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE_CONTENT__ARCHIVE = FOLDER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Archive Content</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ARCHIVE_CONTENT_FEATURE_COUNT = FOLDER_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.PopProduct <em>Pop Product</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Pop Product</em>'.
   * @see org.eclipse.net4j.pop.product.PopProduct
   * @generated
   */
  EClass getPopProduct();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.product.PopProduct#getPopProject
   * <em>Pop Project</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Pop Project</em>'.
   * @see org.eclipse.net4j.pop.product.PopProduct#getPopProject()
   * @see #getPopProduct()
   * @generated
   */
  EReference getPopProduct_PopProject();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.net4j.pop.product.PopProduct#getProjects <em>Projects</em>}'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see org.eclipse.net4j.pop.product.PopProduct#getProjects()
   * @see #getPopProduct()
   * @generated
   */
  EReference getPopProduct_Projects();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.net4j.pop.product.PopProduct#getWorkingSets <em>Working Sets</em>}'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Working Sets</em>'.
   * @see org.eclipse.net4j.pop.product.PopProduct#getWorkingSets()
   * @see #getPopProduct()
   * @generated
   */
  EReference getPopProduct_WorkingSets();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.net4j.pop.product.PopProduct#getConfigurators <em>Configurators</em>}'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Configurators</em>'.
   * @see org.eclipse.net4j.pop.product.PopProduct#getConfigurators()
   * @see #getPopProduct()
   * @generated
   */
  EReference getPopProduct_Configurators();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.WorkingSet <em>Working Set</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Working Set</em>'.
   * @see org.eclipse.net4j.pop.product.WorkingSet
   * @generated
   */
  EClass getWorkingSet();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.product.WorkingSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.product.WorkingSet#getName()
   * @see #getWorkingSet()
   * @generated
   */
  EAttribute getWorkingSet_Name();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.product.WorkingSet#getProjects
   * <em>Projects</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference list '<em>Projects</em>'.
   * @see org.eclipse.net4j.pop.product.WorkingSet#getProjects()
   * @see #getWorkingSet()
   * @generated
   */
  EReference getWorkingSet_Projects();

  /**
   * Returns the meta object for the container reference '
   * {@link org.eclipse.net4j.pop.product.WorkingSet#getWorkspaceSpec <em>Workspace Spec</em>}'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Workspace Spec</em>'.
   * @see org.eclipse.net4j.pop.product.WorkingSet#getWorkspaceSpec()
   * @see #getWorkingSet()
   * @generated
   */
  EReference getWorkingSet_WorkspaceSpec();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.WorkspaceProject
   * <em>Workspace Project</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Workspace Project</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject
   * @generated
   */
  EClass getWorkspaceProject();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getName
   * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject#getName()
   * @see #getWorkspaceProject()
   * @generated
   */
  EAttribute getWorkspaceProject_Name();

  /**
   * Returns the meta object for the reference list '
   * {@link org.eclipse.net4j.pop.product.WorkspaceProject#getWorkingSets <em>Working Sets</em>}'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference list '<em>Working Sets</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject#getWorkingSets()
   * @see #getWorkspaceProject()
   * @generated
   */
  EReference getWorkspaceProject_WorkingSets();

  /**
   * Returns the meta object for the container reference '
   * {@link org.eclipse.net4j.pop.product.WorkspaceProject#getWorkspaceSpec <em>Workspace Spec</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Workspace Spec</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject#getWorkspaceSpec()
   * @see #getWorkspaceProject()
   * @generated
   */
  EReference getWorkspaceProject_WorkspaceSpec();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getCodeRoot
   * <em>Code Root</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Code Root</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject#getCodeRoot()
   * @see #getWorkspaceProject()
   * @generated
   */
  EReference getWorkspaceProject_CodeRoot();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getCodePath
   * <em>Code Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Code Path</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject#getCodePath()
   * @see #getWorkspaceProject()
   * @generated
   */
  EAttribute getWorkspaceProject_CodePath();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.WorkspaceConfigurator
   * <em>Workspace Configurator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Workspace Configurator</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceConfigurator
   * @generated
   */
  EClass getWorkspaceConfigurator();

  /**
   * Returns the meta object for the container reference '
   * {@link org.eclipse.net4j.pop.product.WorkspaceConfigurator#getWorkspaceSpec <em>Workspace Spec</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Workspace Spec</em>'.
   * @see org.eclipse.net4j.pop.product.WorkspaceConfigurator#getWorkspaceSpec()
   * @see #getWorkspaceConfigurator()
   * @generated
   */
  EReference getWorkspaceConfigurator_WorkspaceSpec();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.Artifact <em>Artifact</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Artifact</em>'.
   * @see org.eclipse.net4j.pop.product.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.product.Artifact#getParent
   * <em>Parent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.product.Artifact#getParent()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_Parent();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.File <em>File</em>}'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>File</em>'.
   * @see org.eclipse.net4j.pop.product.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.Folder <em>Folder</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Folder</em>'.
   * @see org.eclipse.net4j.pop.product.Folder
   * @generated
   */
  EClass getFolder();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.product.Folder#getMembers
   * <em>Members</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.eclipse.net4j.pop.product.Folder#getMembers()
   * @see #getFolder()
   * @generated
   */
  EReference getFolder_Members();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.Archive <em>Archive</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Archive</em>'.
   * @see org.eclipse.net4j.pop.product.Archive
   * @generated
   */
  EClass getArchive();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.product.Archive#getContent
   * <em>Content</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.eclipse.net4j.pop.product.Archive#getContent()
   * @see #getArchive()
   * @generated
   */
  EReference getArchive_Content();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.product.ArchiveContent <em>Archive Content</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Archive Content</em>'.
   * @see org.eclipse.net4j.pop.product.ArchiveContent
   * @generated
   */
  EClass getArchiveContent();

  /**
   * Returns the meta object for the container reference '
   * {@link org.eclipse.net4j.pop.product.ArchiveContent#getArchive <em>Archive</em>}'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Archive</em>'.
   * @see org.eclipse.net4j.pop.product.ArchiveContent#getArchive()
   * @see #getArchiveContent()
   * @generated
   */
  EReference getArchiveContent_Archive();

  /**
   * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProductFactory getProductFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.PopProductImpl <em>Pop Product</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.PopProductImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getPopProduct()
     * @generated
     */
    EClass POP_PRODUCT = eINSTANCE.getPopProduct();

    /**
     * The meta object literal for the '<em><b>Pop Project</b></em>' reference feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference POP_PRODUCT__POP_PROJECT = eINSTANCE.getPopProduct_PopProject();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference POP_PRODUCT__PROJECTS = eINSTANCE.getPopProduct_Projects();

    /**
     * The meta object literal for the '<em><b>Working Sets</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference POP_PRODUCT__WORKING_SETS = eINSTANCE.getPopProduct_WorkingSets();

    /**
     * The meta object literal for the '<em><b>Configurators</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference POP_PRODUCT__CONFIGURATORS = eINSTANCE.getPopProduct_Configurators();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.WorkingSetImpl <em>Working Set</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.WorkingSetImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getWorkingSet()
     * @generated
     */
    EClass WORKING_SET = eINSTANCE.getWorkingSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute WORKING_SET__NAME = eINSTANCE.getWorkingSet_Name();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' reference list feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference WORKING_SET__PROJECTS = eINSTANCE.getWorkingSet_Projects();

    /**
     * The meta object literal for the '<em><b>Workspace Spec</b></em>' container reference feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference WORKING_SET__WORKSPACE_SPEC = eINSTANCE.getWorkingSet_WorkspaceSpec();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl
     * <em>Workspace Project</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getWorkspaceProject()
     * @generated
     */
    EClass WORKSPACE_PROJECT = eINSTANCE.getWorkspaceProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute WORKSPACE_PROJECT__NAME = eINSTANCE.getWorkspaceProject_Name();

    /**
     * The meta object literal for the '<em><b>Working Sets</b></em>' reference list feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference WORKSPACE_PROJECT__WORKING_SETS = eINSTANCE.getWorkspaceProject_WorkingSets();

    /**
     * The meta object literal for the '<em><b>Workspace Spec</b></em>' container reference feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference WORKSPACE_PROJECT__WORKSPACE_SPEC = eINSTANCE.getWorkspaceProject_WorkspaceSpec();

    /**
     * The meta object literal for the '<em><b>Code Root</b></em>' reference feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference WORKSPACE_PROJECT__CODE_ROOT = eINSTANCE.getWorkspaceProject_CodeRoot();

    /**
     * The meta object literal for the '<em><b>Code Path</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute WORKSPACE_PROJECT__CODE_PATH = eINSTANCE.getWorkspaceProject_CodePath();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl
     * <em>Workspace Configurator</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getWorkspaceConfigurator()
     * @generated
     */
    EClass WORKSPACE_CONFIGURATOR = eINSTANCE.getWorkspaceConfigurator();

    /**
     * The meta object literal for the '<em><b>Workspace Spec</b></em>' container reference feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC = eINSTANCE.getWorkspaceConfigurator_WorkspaceSpec();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.ArtifactImpl <em>Artifact</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.ArtifactImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ARTIFACT__PARENT = eINSTANCE.getArtifact_Parent();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.FileImpl <em>File</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.FileImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.FolderImpl <em>Folder</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.FolderImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getFolder()
     * @generated
     */
    EClass FOLDER = eINSTANCE.getFolder();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FOLDER__MEMBERS = eINSTANCE.getFolder_Members();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.ArchiveImpl <em>Archive</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.ArchiveImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getArchive()
     * @generated
     */
    EClass ARCHIVE = eINSTANCE.getArchive();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ARCHIVE__CONTENT = eINSTANCE.getArchive_Content();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.product.impl.ArchiveContentImpl
     * <em>Archive Content</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.product.impl.ArchiveContentImpl
     * @see org.eclipse.net4j.pop.product.impl.ProductPackageImpl#getArchiveContent()
     * @generated
     */
    EClass ARCHIVE_CONTENT = eINSTANCE.getArchiveContent();

    /**
     * The meta object literal for the '<em><b>Archive</b></em>' container reference feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ARCHIVE_CONTENT__ARCHIVE = eINSTANCE.getArchiveContent_Archive();

  }

} // ProductPackage