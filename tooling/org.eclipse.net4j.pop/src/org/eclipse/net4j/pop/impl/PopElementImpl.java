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
 * $Id: PopElementImpl.java,v 1.4 2008-08-11 07:21:04 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Displayable;
import org.eclipse.net4j.pop.PopElement;
import org.eclipse.net4j.pop.PopPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopElementImpl#getDisplayString <em>Display String</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopElementImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PopElementImpl extends EObjectImpl implements PopElement
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The default value of the '{@link #getDisplayString() <em>Display String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayString()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_STRING_EDEFAULT = null;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PopElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PopPackage.Literals.POP_ELEMENT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public String getId()
  {
    Resource resource = eResource();
    if (resource instanceof XMLResource)
    {
      XMLResource xmlResource = (XMLResource)resource;
      return xmlResource.getID(this);
    }

    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public String getDisplayString()
  {
    for (Adapter adapter : eAdapters())
    {
      if (adapter instanceof ItemProviderAdapter)
      {
        ItemProviderAdapter itemProviderAdapter = (ItemProviderAdapter)adapter;
        String translated = itemProviderAdapter.getText(this);
        if (translated != null)
        {
          return translated;
        }
      }
    }

    return getId();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public String getClass_()
  {
    String name = eClass().getName();
    for (Adapter adapter : eAdapters())
    {
      if (adapter instanceof ItemProviderAdapter)
      {
        ItemProviderAdapter itemProviderAdapter = (ItemProviderAdapter)adapter;
        String translated = itemProviderAdapter.getString("_UI_" + name + "_type");
        if (translated != null)
        {
          return translated;
        }
      }
    }

    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case PopPackage.POP_ELEMENT__ID:
      return getId();
    case PopPackage.POP_ELEMENT__DISPLAY_STRING:
      return getDisplayString();
    case PopPackage.POP_ELEMENT__CLASS:
      return getClass_();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case PopPackage.POP_ELEMENT__ID:
      return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
    case PopPackage.POP_ELEMENT__DISPLAY_STRING:
      return DISPLAY_STRING_EDEFAULT == null ? getDisplayString() != null : !DISPLAY_STRING_EDEFAULT
          .equals(getDisplayString());
    case PopPackage.POP_ELEMENT__CLASS:
      return CLASS_EDEFAULT == null ? getClass_() != null : !CLASS_EDEFAULT.equals(getClass_());
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Displayable.class)
    {
      switch (derivedFeatureID)
      {
      case PopPackage.POP_ELEMENT__DISPLAY_STRING:
        return PopPackage.DISPLAYABLE__DISPLAY_STRING;
      default:
        return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Displayable.class)
    {
      switch (baseFeatureID)
      {
      case PopPackage.DISPLAYABLE__DISPLAY_STRING:
        return PopPackage.POP_ELEMENT__DISPLAY_STRING;
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} // PopElementImpl
