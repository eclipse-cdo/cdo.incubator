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
 * $Id: PDEEntityImpl.java,v 1.5 2008-08-05 18:38:56 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.net4j.pop.base.Version;
import org.eclipse.net4j.pop.pde.Location;
import org.eclipse.net4j.pop.pde.PDEDistribution;
import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.PDEProject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl#getProject <em>Project</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class PDEEntityImpl extends EObjectImpl implements PDEEntity
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final Version VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final Location LOCATION_EDEFAULT = Location.WORKSPACE;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Location location = LOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PDEEntityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDEPackage.Literals.PDE_ENTITY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.PDE_ENTITY__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Version getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setVersion(Version newVersion)
  {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.PDE_ENTITY__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Location getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setLocation(Location newLocation)
  {
    Location oldLocation = location;
    location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.PDE_ENTITY__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PDEProject getProject()
  {
    // TODO: implement this method to return the 'Project' container reference
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setProject(PDEProject newProject)
  {
    // TODO: implement this method to set the 'Project' container reference
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PDEDistribution getDistribution()
  {
    if (eContainerFeatureID != PDEPackage.PDE_ENTITY__DISTRIBUTION)
      return null;
    return (PDEDistribution)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetDistribution(PDEDistribution newDistribution, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newDistribution, PDEPackage.PDE_ENTITY__DISTRIBUTION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDistribution(PDEDistribution newDistribution)
  {
    if (newDistribution != eInternalContainer()
        || (eContainerFeatureID != PDEPackage.PDE_ENTITY__DISTRIBUTION && newDistribution != null))
    {
      if (EcoreUtil.isAncestor(this, newDistribution))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newDistribution != null)
        msgs = ((InternalEObject)newDistribution).eInverseAdd(this, PDEPackage.PDE_DISTRIBUTION__ENTITIES,
            PDEDistribution.class, msgs);
      msgs = basicSetDistribution(newDistribution, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.PDE_ENTITY__DISTRIBUTION, newDistribution,
          newDistribution));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetDistribution((PDEDistribution)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      return basicSetDistribution(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PDEPackage.PDE_ENTITY__PROJECT:
      return eInternalContainer().eInverseRemove(this, PDEPackage.PDE_PROJECT__ENTITY, PDEProject.class, msgs);
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      return eInternalContainer().eInverseRemove(this, PDEPackage.PDE_DISTRIBUTION__ENTITIES, PDEDistribution.class,
          msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_ENTITY__ID:
      return getId();
    case PDEPackage.PDE_ENTITY__VERSION:
      return getVersion();
    case PDEPackage.PDE_ENTITY__LOCATION:
      return getLocation();
    case PDEPackage.PDE_ENTITY__PROJECT:
      return getProject();
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      return getDistribution();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_ENTITY__ID:
      setId((String)newValue);
      return;
    case PDEPackage.PDE_ENTITY__VERSION:
      setVersion((Version)newValue);
      return;
    case PDEPackage.PDE_ENTITY__LOCATION:
      setLocation((Location)newValue);
      return;
    case PDEPackage.PDE_ENTITY__PROJECT:
      setProject((PDEProject)newValue);
      return;
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      setDistribution((PDEDistribution)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_ENTITY__ID:
      setId(ID_EDEFAULT);
      return;
    case PDEPackage.PDE_ENTITY__VERSION:
      setVersion(VERSION_EDEFAULT);
      return;
    case PDEPackage.PDE_ENTITY__LOCATION:
      setLocation(LOCATION_EDEFAULT);
      return;
    case PDEPackage.PDE_ENTITY__PROJECT:
      setProject((PDEProject)null);
      return;
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      setDistribution((PDEDistribution)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_ENTITY__ID:
      return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    case PDEPackage.PDE_ENTITY__VERSION:
      return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
    case PDEPackage.PDE_ENTITY__LOCATION:
      return location != LOCATION_EDEFAULT;
    case PDEPackage.PDE_ENTITY__PROJECT:
      return getProject() != null;
    case PDEPackage.PDE_ENTITY__DISTRIBUTION:
      return getDistribution() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: "); //$NON-NLS-1$
    result.append(id);
    result.append(", version: "); //$NON-NLS-1$
    result.append(version);
    result.append(", location: "); //$NON-NLS-1$
    result.append(location);
    result.append(')');
    return result.toString();
  }

} // PDEEntityImpl
