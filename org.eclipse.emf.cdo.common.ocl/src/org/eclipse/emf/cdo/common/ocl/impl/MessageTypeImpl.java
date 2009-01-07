/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 248869
 * 
 * </copyright>
 *
 * $Id: MessageTypeImpl.java,v 1.4 2009-01-07 07:21:29 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.cdo.common.model.CDOClass;
import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOFeature;
import org.eclipse.emf.cdo.common.model.CDOOperation;
import org.eclipse.emf.cdo.common.model.CDOTypedElement;
import org.eclipse.emf.cdo.common.ocl.MessageType;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.internal.OCLStandardLibraryImpl;
import org.eclipse.emf.cdo.internal.common.model.CDOClassImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.types.TypesPackage;
import org.eclipse.ocl.types.operations.MessageTypeOperations;
import org.eclipse.ocl.util.TypeUtil;
import org.eclipse.ocl.utilities.PredefinedType;
import org.eclipse.ocl.utilities.UMLReflection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.MessageTypeImpl#getReferredOperation
 * <em>Referred Operation</em>}</li>
 * <li>
 * {@link org.eclipse.emf.cdo.common.ocl.impl.MessageTypeImpl#getReferredSignal
 * <em>Referred Signal</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MessageTypeImpl
		extends CDOClassImpl
		implements MessageType {

	/**
	 * The cached value of the '{@link #getReferredOperation()
	 * <em>Referred Operation</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReferredOperation()
	 * @generated
	 * @ordered
	 */
	protected CDOOperation referredOperation;

	/**
	 * The cached value of the '{@link #getReferredSignal()
	 * <em>Referred Signal</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReferredSignal()
	 * @generated
	 * @ordered
	 */
	protected CDOClassifier referredSignal;

	private EList<CDOOperation> operations;

	private EList<CDOFeature> properties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLPackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDOOperation getReferredOperation() {
		if (referredOperation != null
			&& ((EObject) referredOperation).eIsProxy()) {
			InternalEObject oldReferredOperation = (InternalEObject) referredOperation;
			referredOperation = (CDOOperation) eResolveProxy(oldReferredOperation);
			if (referredOperation != oldReferredOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION,
						oldReferredOperation, referredOperation));
			}
		}
		return referredOperation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDOOperation basicGetReferredOperation() {
		return referredOperation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReferredOperation(CDOOperation newReferredOperation) {
		CDOOperation oldReferredOperation = referredOperation;
		referredOperation = newReferredOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION,
				oldReferredOperation, referredOperation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDOClassifier getReferredSignal() {
		if (referredSignal != null && ((EObject) referredSignal).eIsProxy()) {
			InternalEObject oldReferredSignal = (InternalEObject) referredSignal;
			referredSignal = (CDOClassifier) eResolveProxy(oldReferredSignal);
			if (referredSignal != oldReferredSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL,
						oldReferredSignal, referredSignal));
			}
		}
		return referredSignal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDOClassifier basicGetReferredSignal() {
		return referredSignal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReferredSignal(CDOClassifier newReferredSignal) {
		CDOClassifier oldReferredSignal = referredSignal;
		referredSignal = newReferredSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL, oldReferredSignal,
				referredSignal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkExclusiveSignature(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MessageTypeOperations.checkExclusiveSignature(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkOperationParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MessageTypeOperations.checkOperationParameters(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkSignalAttributes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MessageTypeOperations.checkSignalAttributes(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return SINGLETON_NAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CDOOperation> oclOperations() {
		if (operations == null) {
			MessageType prototype = (MessageType) OCLStandardLibraryImpl.INSTANCE
				.getOclMessage();

			if (prototype == this) {
				// I *am* the standard library type!
				operations = OCLStandardLibraryImpl.getExistingOperations(this);
			} else {
				// the prototype defines my operations for me
				operations = prototype.oclOperations();
			}
		}

		return operations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CDOFeature> oclProperties() {
		if (properties == null) {
			properties = new DelegatingEList<CDOFeature>() {

				private static final long serialVersionUID = 1304482875445208763L;

				@Override
				protected List<CDOFeature> delegateList() {
					return getEStructuralFeatures();
				}
			};

			EList<CDOFeature> features = getEStructuralFeatures();

			if (features.isEmpty()) {
				// don't do this computation if we already have structural
				// features, which would be the case if we were deserialized
				// from some resource
				Environment<?, CDOClassifier, CDOOperation, CDOFeature, ?, ?, ?, ?, ?, ?, ?, ?> env = Environment.Registry.INSTANCE
					.getEnvironmentFor(this);
				UMLReflection<?, CDOClassifier, CDOOperation, CDOFeature, ?, ?, ?, ?, ?, ?> uml = env
					.getUMLReflection();

				EList<? extends CDOTypedElement> typedElements;
				if (getReferredOperation() != null) {
					typedElements = getReferredOperation().getEParameters();
				} else if (getReferredSignal() != null) {
					typedElements = ((CDOClass) getReferredSignal())
						.getEAllStructuralFeatures();
				} else {
					typedElements = ECollections.emptyEList();
				}

				for (CDOTypedElement next : typedElements) {
					features.add(uml.createProperty(next.getName(), TypeUtil
						.resolveType(env, uml.getOCLType(next))));
				}
			}
		}

		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION :
				if (resolve)
					return getReferredOperation();
				return basicGetReferredOperation();
			case OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL :
				if (resolve)
					return getReferredSignal();
				return basicGetReferredSignal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION :
				setReferredOperation((CDOOperation) newValue);
				return;
			case OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL :
				setReferredSignal((CDOClassifier) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION :
				setReferredOperation((CDOOperation) null);
				return;
			case OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL :
				setReferredSignal((CDOClassifier) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION :
				return referredOperation != null;
			case OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL :
				return referredSignal != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PredefinedType.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == org.eclipse.ocl.types.MessageType.class) {
			switch (derivedFeatureID) {
				case OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION :
					return TypesPackage.MESSAGE_TYPE__REFERRED_OPERATION;
				case OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL :
					return TypesPackage.MESSAGE_TYPE__REFERRED_SIGNAL;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PredefinedType.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == org.eclipse.ocl.types.MessageType.class) {
			switch (baseFeatureID) {
				case TypesPackage.MESSAGE_TYPE__REFERRED_OPERATION :
					return OCLPackage.MESSAGE_TYPE__REFERRED_OPERATION;
				case TypesPackage.MESSAGE_TYPE__REFERRED_SIGNAL :
					return OCLPackage.MESSAGE_TYPE__REFERRED_SIGNAL;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // MessageTypeImpl
