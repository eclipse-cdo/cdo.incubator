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
 * $Id: TagImpl.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Branch;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Tag;
import org.eclipse.net4j.pop.TaggedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Tag</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.TagImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TagImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TagImpl#getTaggedElement <em>Tagged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends CheckoutDiscriminatorImpl implements Tag
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTaggedElement() <em>Tagged Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaggedElement()
   * @generated
   * @ordered
   */
  protected TaggedElement taggedElement;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TagImpl()
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
    return PopPackage.Literals.TAG;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Branch getBranch()
  {
    if (eContainerFeatureID != PopPackage.TAG__BRANCH)
      return null;
    return (Branch)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Branch basicGetBranch()
  {
    if (eContainerFeatureID != PopPackage.TAG__BRANCH)
      return null;
    return (Branch)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBranch(Branch newBranch, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newBranch, PopPackage.TAG__BRANCH, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setBranch(Branch newBranch)
  {
    if (newBranch != eInternalContainer() || (eContainerFeatureID != PopPackage.TAG__BRANCH && newBranch != null))
    {
      if (EcoreUtil.isAncestor(this, newBranch))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBranch != null)
        msgs = ((InternalEObject)newBranch).eInverseAdd(this, PopPackage.BRANCH__TAGS, Branch.class, msgs);
      msgs = basicSetBranch(newBranch, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TAG__BRANCH, newBranch, newBranch));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TAG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TaggedElement getTaggedElement()
  {
    if (taggedElement != null && taggedElement.eIsProxy())
    {
      InternalEObject oldTaggedElement = (InternalEObject)taggedElement;
      taggedElement = (TaggedElement)eResolveProxy(oldTaggedElement);
      if (taggedElement != oldTaggedElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.TAG__TAGGED_ELEMENT, oldTaggedElement,
              taggedElement));
      }
    }
    return taggedElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TaggedElement basicGetTaggedElement()
  {
    return taggedElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaggedElement(TaggedElement newTaggedElement, NotificationChain msgs)
  {
    TaggedElement oldTaggedElement = taggedElement;
    taggedElement = newTaggedElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.TAG__TAGGED_ELEMENT,
          oldTaggedElement, newTaggedElement);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTaggedElement(TaggedElement newTaggedElement)
  {
    if (newTaggedElement != taggedElement)
    {
      NotificationChain msgs = null;
      if (taggedElement != null)
        msgs = ((InternalEObject)taggedElement).eInverseRemove(this, PopPackage.TAGGED_ELEMENT__TAG,
            TaggedElement.class, msgs);
      if (newTaggedElement != null)
        msgs = ((InternalEObject)newTaggedElement).eInverseAdd(this, PopPackage.TAGGED_ELEMENT__TAG,
            TaggedElement.class, msgs);
      msgs = basicSetTaggedElement(newTaggedElement, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TAG__TAGGED_ELEMENT, newTaggedElement,
          newTaggedElement));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.TAG__BRANCH:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetBranch((Branch)otherEnd, msgs);
    case PopPackage.TAG__TAGGED_ELEMENT:
      if (taggedElement != null)
        msgs = ((InternalEObject)taggedElement).eInverseRemove(this, PopPackage.TAGGED_ELEMENT__TAG,
            TaggedElement.class, msgs);
      return basicSetTaggedElement((TaggedElement)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.TAG__BRANCH:
      return basicSetBranch(null, msgs);
    case PopPackage.TAG__TAGGED_ELEMENT:
      return basicSetTaggedElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PopPackage.TAG__BRANCH:
      return eInternalContainer().eInverseRemove(this, PopPackage.BRANCH__TAGS, Branch.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
    case PopPackage.TAG__BRANCH:
      if (resolve)
        return getBranch();
      return basicGetBranch();
    case PopPackage.TAG__NAME:
      return getName();
    case PopPackage.TAG__TAGGED_ELEMENT:
      if (resolve)
        return getTaggedElement();
      return basicGetTaggedElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PopPackage.TAG__BRANCH:
      setBranch((Branch)newValue);
      return;
    case PopPackage.TAG__NAME:
      setName((String)newValue);
      return;
    case PopPackage.TAG__TAGGED_ELEMENT:
      setTaggedElement((TaggedElement)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case PopPackage.TAG__BRANCH:
      setBranch((Branch)null);
      return;
    case PopPackage.TAG__NAME:
      setName(NAME_EDEFAULT);
      return;
    case PopPackage.TAG__TAGGED_ELEMENT:
      setTaggedElement((TaggedElement)null);
      return;
    }
    super.eUnset(featureID);
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
    case PopPackage.TAG__BRANCH:
      return basicGetBranch() != null;
    case PopPackage.TAG__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case PopPackage.TAG__TAGGED_ELEMENT:
      return taggedElement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} // TagImpl
