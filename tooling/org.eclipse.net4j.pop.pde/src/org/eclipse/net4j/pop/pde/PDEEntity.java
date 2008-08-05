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
 * $Id: PDEEntity.java,v 1.5 2008-08-05 18:38:57 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.net4j.pop.base.Version;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEEntity#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEEntity#getVersion <em>Version</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEEntity#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEEntity#getProject <em>Project</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEEntity#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEEntity()
 * @model abstract="true"
 * @generated
 */
public interface PDEEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEEntity_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.PDEEntity#getId <em>Id</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(Version)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEEntity_Version()
   * @model dataType="org.eclipse.net4j.pop.base.Version"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.PDEEntity#getVersion <em>Version</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.net4j.pop.pde.Location}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Location</em>' attribute.
   * @see org.eclipse.net4j.pop.pde.Location
   * @see #setLocation(Location)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEEntity_Location()
   * @model required="true"
   * @generated
   */
  Location getLocation();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.PDEEntity#getLocation <em>Location</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Location</em>' attribute.
   * @see org.eclipse.net4j.pop.pde.Location
   * @see #getLocation()
   * @generated
   */
  void setLocation(Location value);

  /**
   * Returns the value of the '<em><b>Project</b></em>' container reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.pde.PDEProject#getEntity <em>Entity</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Project</em>' container reference.
   * @see #setProject(PDEProject)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEEntity_Project()
   * @see org.eclipse.net4j.pop.pde.PDEProject#getEntity
   * @model opposite="entity" volatile="true"
   * @generated
   */
  PDEProject getProject();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.PDEEntity#getProject <em>Project</em>}' container
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Project</em>' container reference.
   * @see #getProject()
   * @generated
   */
  void setProject(PDEProject value);

  /**
   * Returns the value of the '<em><b>Distribution</b></em>' container reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.pde.PDEDistribution#getEntities <em>Entities</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Distribution</em>' container reference.
   * @see #setDistribution(PDEDistribution)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEEntity_Distribution()
   * @see org.eclipse.net4j.pop.pde.PDEDistribution#getEntities
   * @model opposite="entities" transient="false"
   * @generated
   */
  PDEDistribution getDistribution();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.PDEEntity#getDistribution <em>Distribution</em>}' container
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Distribution</em>' container reference.
   * @see #getDistribution()
   * @generated
   */
  void setDistribution(PDEDistribution value);

} // PDEEntity
