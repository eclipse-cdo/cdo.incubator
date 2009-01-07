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
 *   Zeligsoft - Bug 256040
 * 
 * </copyright>
 *
 * $Id: OCLPackage.java,v 1.3 2009-01-07 07:21:33 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.utilities.UtilitiesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients. <!--
 *           end-user-doc -->
 * @see org.eclipse.emf.cdo.common.ocl.OCLFactory
 * @model kind="package"
 * @generated
 */
public interface OCLPackage
		extends EPackage {

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "ocl"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/1.1.0/CDO"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "ocl.cdo"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	OCLPackage eINSTANCE = org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl
		.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.AnyTypeImpl <em>Any Type</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.AnyTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionTypeImpl
	 * <em>Collection Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__START_POSITION = FakePackage.CDO_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__END_POSITION = FakePackage.CDO_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__TYPE_START_POSITION = FakePackage.CDO_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__TYPE_END_POSITION = FakePackage.CDO_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ELEMENT_TYPE = FakePackage.CDO_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__KIND = FakePackage.CDO_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Collection Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = FakePackage.CDO_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.BagTypeImpl <em>Bag Type</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.BagTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getBagType()
	 * @generated
	 */
	int BAG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__START_POSITION = COLLECTION_TYPE__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__END_POSITION = COLLECTION_TYPE__END_POSITION;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__TYPE_START_POSITION = COLLECTION_TYPE__TYPE_START_POSITION;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__TYPE_END_POSITION = COLLECTION_TYPE__TYPE_END_POSITION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__KIND = COLLECTION_TYPE__KIND;

	/**
	 * The number of structural features of the '<em>Bag Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.ElementTypeImpl
	 * <em>Element Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.ElementTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.InvalidTypeImpl
	 * <em>Invalid Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.InvalidTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getInvalidType()
	 * @generated
	 */
	int INVALID_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Invalid Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.MessageTypeImpl
	 * <em>Message Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.MessageTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__REFERRED_OPERATION = FakePackage.CDO_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Signal</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__REFERRED_SIGNAL = FakePackage.CDO_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.OrderedSetTypeImpl
	 * <em>Ordered Set Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OrderedSetTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getOrderedSetType()
	 * @generated
	 */
	int ORDERED_SET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__START_POSITION = COLLECTION_TYPE__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__END_POSITION = COLLECTION_TYPE__END_POSITION;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__TYPE_START_POSITION = COLLECTION_TYPE__TYPE_START_POSITION;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__TYPE_END_POSITION = COLLECTION_TYPE__TYPE_END_POSITION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__KIND = COLLECTION_TYPE__KIND;

	/**
	 * The number of structural features of the '<em>Ordered Set Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.PrimitiveTypeImpl
	 * <em>Primitive Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.PrimitiveTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = FakePackage.CDO_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.SequenceTypeImpl
	 * <em>Sequence Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.SequenceTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__START_POSITION = COLLECTION_TYPE__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__END_POSITION = COLLECTION_TYPE__END_POSITION;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TYPE_START_POSITION = COLLECTION_TYPE__TYPE_START_POSITION;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TYPE_END_POSITION = COLLECTION_TYPE__TYPE_END_POSITION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__KIND = COLLECTION_TYPE__KIND;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.SetTypeImpl <em>Set Type</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.SetTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__START_POSITION = COLLECTION_TYPE__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__END_POSITION = COLLECTION_TYPE__END_POSITION;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TYPE_START_POSITION = COLLECTION_TYPE__TYPE_START_POSITION;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TYPE_END_POSITION = COLLECTION_TYPE__TYPE_END_POSITION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__KIND = COLLECTION_TYPE__KIND;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.TupleTypeImpl
	 * <em>Tuple Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.TupleTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.TypeTypeImpl
	 * <em>Type Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.TypeTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Referred Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__REFERRED_TYPE = FakePackage.CDO_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.VoidTypeImpl
	 * <em>Void Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.VoidTypeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 12;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = FakePackage.CDO_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CallOperationActionImpl
	 * <em>Call Operation Action</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CallOperationActionImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCallOperationAction()
	 * @generated
	 */
	int CALL_OPERATION_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Call Operation Action</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.ConstraintImpl
	 * <em>Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.ConstraintImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = FakePackage.CDO_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constrained Elements</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINED_ELEMENTS = FakePackage.CDO_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STEREOTYPE = FakePackage.CDO_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = FakePackage.CDO_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.SendSignalActionImpl
	 * <em>Send Signal Action</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.SendSignalActionImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getSendSignalAction()
	 * @generated
	 */
	int SEND_SIGNAL_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__SIGNAL = 0;

	/**
	 * The number of structural features of the '<em>Send Signal Action</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl
	 * <em>Expression In OCL</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getExpressionInOCL()
	 * @generated
	 */
	int EXPRESSION_IN_OCL = 16;

	/**
	 * The feature id for the '<em><b>Body Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IN_OCL__BODY_EXPRESSION = UtilitiesPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Variable</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IN_OCL__CONTEXT_VARIABLE = UtilitiesPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Result Variable</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IN_OCL__RESULT_VARIABLE = UtilitiesPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Parameter Variable</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IN_OCL__PARAMETER_VARIABLE = UtilitiesPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE;

	/**
	 * The number of structural features of the '<em>Expression In OCL</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IN_OCL_FEATURE_COUNT = UtilitiesPackage.EXPRESSION_IN_OCL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.OCLExpressionImpl
	 * <em>Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLExpressionImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getOCLExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__START_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__END_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CallExpImpl <em>Call Exp</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CallExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCallExp()
	 * @generated
	 */
	int CALL_EXP = 19;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__PROPERTY_START_POSITION = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__PROPERTY_END_POSITION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Exp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.FeatureCallExpImpl
	 * <em>Feature Call Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.FeatureCallExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getFeatureCallExp()
	 * @generated
	 */
	int FEATURE_CALL_EXP = 25;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__START_POSITION = CALL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__END_POSITION = CALL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__PROPERTY_START_POSITION = CALL_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__PROPERTY_END_POSITION = CALL_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__SOURCE = CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Marked Pre</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__MARKED_PRE = CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Call Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP_FEATURE_COUNT = CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.NavigationCallExpImpl
	 * <em>Navigation Call Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.NavigationCallExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getNavigationCallExp()
	 * @generated
	 */
	int NAVIGATION_CALL_EXP = 36;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__START_POSITION = FEATURE_CALL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__END_POSITION = FEATURE_CALL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__PROPERTY_START_POSITION = FEATURE_CALL_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__PROPERTY_END_POSITION = FEATURE_CALL_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__SOURCE = FEATURE_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Marked Pre</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__MARKED_PRE = FEATURE_CALL_EXP__MARKED_PRE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__QUALIFIER = FEATURE_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navigation Source</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__NAVIGATION_SOURCE = FEATURE_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navigation Call Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP_FEATURE_COUNT = FEATURE_CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.AssociationClassCallExpImpl
	 * <em>Association Class Call Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.AssociationClassCallExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getAssociationClassCallExp()
	 * @generated
	 */
	int ASSOCIATION_CLASS_CALL_EXP = 17;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__START_POSITION = NAVIGATION_CALL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__END_POSITION = NAVIGATION_CALL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__PROPERTY_START_POSITION = NAVIGATION_CALL_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__PROPERTY_END_POSITION = NAVIGATION_CALL_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__SOURCE = NAVIGATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Marked Pre</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__MARKED_PRE = NAVIGATION_CALL_EXP__MARKED_PRE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__QUALIFIER = NAVIGATION_CALL_EXP__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Navigation Source</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__NAVIGATION_SOURCE = NAVIGATION_CALL_EXP__NAVIGATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Referred Association Class</b></em>'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS = NAVIGATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Association Class Call Exp</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP_FEATURE_COUNT = NAVIGATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.LiteralExpImpl
	 * <em>Literal Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.LiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getLiteralExp()
	 * @generated
	 */
	int LITERAL_EXP = 33;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The number of structural features of the '<em>Literal Exp</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.PrimitiveLiteralExpImpl
	 * <em>Primitive Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.PrimitiveLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getPrimitiveLiteralExp()
	 * @generated
	 */
	int PRIMITIVE_LITERAL_EXP = 41;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXP__START_POSITION = LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXP__END_POSITION = LITERAL_EXP__END_POSITION;

	/**
	 * The number of structural features of the '<em>Primitive Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.BooleanLiteralExpImpl
	 * <em>Boolean Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.BooleanLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getBooleanLiteralExp()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXP = 18;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__START_POSITION = PRIMITIVE_LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__END_POSITION = PRIMITIVE_LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Boolean Symbol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralPartImpl
	 * <em>Collection Literal Part</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralPartImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionLiteralPart()
	 * @generated
	 */
	int COLLECTION_LITERAL_PART = 22;

	/**
	 * The number of structural features of the '
	 * <em>Collection Literal Part</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_PART_FEATURE_COUNT = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionItemImpl
	 * <em>Collection Item</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionItemImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionItem()
	 * @generated
	 */
	int COLLECTION_ITEM = 20;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__ITEM = COLLECTION_LITERAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Item</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM_FEATURE_COUNT = COLLECTION_LITERAL_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl
	 * <em>Collection Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionLiteralExp()
	 * @generated
	 */
	int COLLECTION_LITERAL_EXP = 21;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP__START_POSITION = LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP__END_POSITION = LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP__KIND = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP__PART = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Range</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP__SIMPLE_RANGE = LITERAL_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collection Literal Exp</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionRangeImpl
	 * <em>Collection Range</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionRangeImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionRange()
	 * @generated
	 */
	int COLLECTION_RANGE = 23;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__FIRST = COLLECTION_LITERAL_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__LAST = COLLECTION_LITERAL_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Range</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_FEATURE_COUNT = COLLECTION_LITERAL_PART_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.EnumLiteralExpImpl
	 * <em>Enum Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.EnumLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getEnumLiteralExp()
	 * @generated
	 */
	int ENUM_LITERAL_EXP = 24;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__START_POSITION = LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__END_POSITION = LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Referred Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.IfExpImpl <em>If Exp</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.IfExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIfExp()
	 * @generated
	 */
	int IF_EXP = 26;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CONDITION = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_EXP__THEN_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_EXP__ELSE_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Exp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.NumericLiteralExpImpl
	 * <em>Numeric Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.NumericLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getNumericLiteralExp()
	 * @generated
	 */
	int NUMERIC_LITERAL_EXP = 38;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__START_POSITION = PRIMITIVE_LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__END_POSITION = PRIMITIVE_LITERAL_EXP__END_POSITION;

	/**
	 * The number of structural features of the '<em>Numeric Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.IntegerLiteralExpImpl
	 * <em>Integer Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.IntegerLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIntegerLiteralExp()
	 * @generated
	 */
	int INTEGER_LITERAL_EXP = 27;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__START_POSITION = NUMERIC_LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__END_POSITION = NUMERIC_LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Integer Symbol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__INTEGER_SYMBOL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.UnlimitedNaturalLiteralExpImpl
	 * <em>Unlimited Natural Literal Exp</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.UnlimitedNaturalLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getUnlimitedNaturalLiteralExp()
	 * @generated
	 */
	int UNLIMITED_NATURAL_LITERAL_EXP = 28;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_LITERAL_EXP__START_POSITION = NUMERIC_LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_LITERAL_EXP__END_POSITION = NUMERIC_LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Integer Symbol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_LITERAL_EXP__INTEGER_SYMBOL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '
	 * <em>Unlimited Natural Literal Exp</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.InvalidLiteralExpImpl
	 * <em>Invalid Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.InvalidLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getInvalidLiteralExp()
	 * @generated
	 */
	int INVALID_LITERAL_EXP = 29;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVALID_LITERAL_EXP__START_POSITION = LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVALID_LITERAL_EXP__END_POSITION = LITERAL_EXP__END_POSITION;

	/**
	 * The number of structural features of the '<em>Invalid Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVALID_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.LoopExpImpl <em>Loop Exp</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.LoopExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getLoopExp()
	 * @generated
	 */
	int LOOP_EXP = 34;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__START_POSITION = CALL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__END_POSITION = CALL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__PROPERTY_START_POSITION = CALL_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__PROPERTY_END_POSITION = CALL_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__SOURCE = CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__BODY = CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__ITERATOR = CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Exp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_FEATURE_COUNT = CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.IterateExpImpl
	 * <em>Iterate Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.IterateExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIterateExp()
	 * @generated
	 */
	int ITERATE_EXP = 30;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__START_POSITION = LOOP_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__END_POSITION = LOOP_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__PROPERTY_START_POSITION = LOOP_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__PROPERTY_END_POSITION = LOOP_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__SOURCE = LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__ITERATOR = LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__RESULT = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterate Exp</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.IteratorExpImpl
	 * <em>Iterator Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.IteratorExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIteratorExp()
	 * @generated
	 */
	int ITERATOR_EXP = 31;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__START_POSITION = LOOP_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__END_POSITION = LOOP_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__PROPERTY_START_POSITION = LOOP_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__PROPERTY_END_POSITION = LOOP_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__SOURCE = LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__ITERATOR = LOOP_EXP__ITERATOR;

	/**
	 * The number of structural features of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.LetExpImpl <em>Let Exp</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.LetExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getLetExp()
	 * @generated
	 */
	int LET_EXP = 32;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LET_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LET_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IN = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LET_EXP__VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Exp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LET_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.MessageExpImpl
	 * <em>Message Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.MessageExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getMessageExp()
	 * @generated
	 */
	int MESSAGE_EXP = 35;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__PROPERTY_START_POSITION = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__PROPERTY_END_POSITION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__TARGET = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__ARGUMENT = OCL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Called Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__CALLED_OPERATION = OCL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sent Signal</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP__SENT_SIGNAL = OCL_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Message Exp</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.NullLiteralExpImpl
	 * <em>Null Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.NullLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getNullLiteralExp()
	 * @generated
	 */
	int NULL_LITERAL_EXP = 37;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_EXP__START_POSITION = LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_EXP__END_POSITION = LITERAL_EXP__END_POSITION;

	/**
	 * The number of structural features of the '<em>Null Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.OperationCallExpImpl
	 * <em>Operation Call Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OperationCallExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getOperationCallExp()
	 * @generated
	 */
	int OPERATION_CALL_EXP = 40;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__START_POSITION = FEATURE_CALL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__END_POSITION = FEATURE_CALL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__PROPERTY_START_POSITION = FEATURE_CALL_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__PROPERTY_END_POSITION = FEATURE_CALL_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__SOURCE = FEATURE_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Marked Pre</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__MARKED_PRE = FEATURE_CALL_EXP__MARKED_PRE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__ARGUMENT = FEATURE_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__REFERRED_OPERATION = FEATURE_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__OPERATION_CODE = FEATURE_CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Call Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_FEATURE_COUNT = FEATURE_CALL_EXP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.PropertyCallExpImpl
	 * <em>Property Call Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.PropertyCallExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getPropertyCallExp()
	 * @generated
	 */
	int PROPERTY_CALL_EXP = 42;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__START_POSITION = NAVIGATION_CALL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__END_POSITION = NAVIGATION_CALL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Property Start Position</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__PROPERTY_START_POSITION = NAVIGATION_CALL_EXP__PROPERTY_START_POSITION;

	/**
	 * The feature id for the '<em><b>Property End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__PROPERTY_END_POSITION = NAVIGATION_CALL_EXP__PROPERTY_END_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__SOURCE = NAVIGATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Marked Pre</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__MARKED_PRE = NAVIGATION_CALL_EXP__MARKED_PRE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__QUALIFIER = NAVIGATION_CALL_EXP__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Navigation Source</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__NAVIGATION_SOURCE = NAVIGATION_CALL_EXP__NAVIGATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__REFERRED_PROPERTY = NAVIGATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Call Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_FEATURE_COUNT = NAVIGATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.RealLiteralExpImpl
	 * <em>Real Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.RealLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getRealLiteralExp()
	 * @generated
	 */
	int REAL_LITERAL_EXP = 43;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP__START_POSITION = NUMERIC_LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP__END_POSITION = NUMERIC_LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Real Symbol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP__REAL_SYMBOL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.StateExpImpl
	 * <em>State Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.StateExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getStateExp()
	 * @generated
	 */
	int STATE_EXP = 44;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATE_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATE_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Referred State</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATE_EXP__REFERRED_STATE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Exp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.StringLiteralExpImpl
	 * <em>String Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.StringLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getStringLiteralExp()
	 * @generated
	 */
	int STRING_LITERAL_EXP = 45;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__START_POSITION = PRIMITIVE_LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__END_POSITION = PRIMITIVE_LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>String Symbol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__STRING_SYMBOL = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralExpImpl
	 * <em>Tuple Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTupleLiteralExp()
	 * @generated
	 */
	int TUPLE_LITERAL_EXP = 46;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP__START_POSITION = LITERAL_EXP__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP__END_POSITION = LITERAL_EXP__END_POSITION;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP__PART = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Literal Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralPartImpl
	 * <em>Tuple Literal Part</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralPartImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTupleLiteralPart()
	 * @generated
	 */
	int TUPLE_LITERAL_PART = 47;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART__START_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART__END_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART__TYPE_START_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART__TYPE_END_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART__VALUE = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART__ATTRIBUTE = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tuple Literal Part</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_PART_FEATURE_COUNT = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.TypeExpImpl <em>Type Exp</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.TypeExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTypeExp()
	 * @generated
	 */
	int TYPE_EXP = 48;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Referred Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__REFERRED_TYPE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Exp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.UnspecifiedValueExpImpl
	 * <em>Unspecified Value Exp</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.UnspecifiedValueExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getUnspecifiedValueExp()
	 * @generated
	 */
	int UNSPECIFIED_VALUE_EXP = 49;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNSPECIFIED_VALUE_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNSPECIFIED_VALUE_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNSPECIFIED_VALUE_EXP__TYPE_START_POSITION = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNSPECIFIED_VALUE_EXP__TYPE_END_POSITION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unspecified Value Exp</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNSPECIFIED_VALUE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.VariableImpl
	 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.VariableImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 50;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__START_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__END_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Start Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_START_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type End Position</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_END_POSITION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INIT_EXPRESSION = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Represented Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REPRESENTED_PARAMETER = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Variable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = FakePackage.CDO_TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.ocl.impl.VariableExpImpl
	 * <em>Variable Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.ocl.impl.VariableExpImpl
	 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getVariableExp()
	 * @generated
	 */
	int VARIABLE_EXP = 51;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__START_POSITION = OCL_EXPRESSION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__END_POSITION = OCL_EXPRESSION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__REFERRED_VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.AnyType <em>Any Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.BagType <em>Bag Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.BagType
	 * @generated
	 */
	EClass getBagType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CollectionType
	 * <em>Collection Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.ElementType <em>Element Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.InvalidType <em>Invalid Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Invalid Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.InvalidType
	 * @generated
	 */
	EClass getInvalidType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.MessageType <em>Message Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.OrderedSetType
	 * <em>Ordered Set Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ordered Set Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.OrderedSetType
	 * @generated
	 */
	EClass getOrderedSetType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.PrimitiveType
	 * <em>Primitive Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.SequenceType
	 * <em>Sequence Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.SetType <em>Set Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.TypeType <em>Type Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.TypeType
	 * @generated
	 */
	EClass getTypeType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.VoidType <em>Void Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CallOperationAction
	 * <em>Call Operation Action</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Call Operation Action</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CallOperationAction
	 * @generated
	 */
	EClass getCallOperationAction();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.cdo.common.ocl.CallOperationAction#getOperation
	 * <em>Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CallOperationAction#getOperation()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_Operation();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.emf.cdo.common.ocl.Constraint#getSpecification
	 * <em>Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Specification</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.Constraint#getSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Specification();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.cdo.common.ocl.Constraint#getConstrainedElements
	 * <em>Constrained Elements</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference list '
	 *         <em>Constrained Elements</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.Constraint#getConstrainedElements()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainedElements();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.cdo.common.ocl.Constraint#getStereotype
	 * <em>Stereotype</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.Constraint#getStereotype()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Stereotype();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.SendSignalAction
	 * <em>Send Signal Action</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Send Signal Action</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.SendSignalAction
	 * @generated
	 */
	EClass getSendSignalAction();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.cdo.common.ocl.SendSignalAction#getSignal
	 * <em>Signal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.SendSignalAction#getSignal()
	 * @see #getSendSignalAction()
	 * @generated
	 */
	EReference getSendSignalAction_Signal();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.ExpressionInOCL
	 * <em>Expression In OCL</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Expression In OCL</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.ExpressionInOCL
	 * @generated
	 */
	EClass getExpressionInOCL();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp
	 * <em>Association Class Call Exp</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Class Call Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp
	 * @generated
	 */
	EClass getAssociationClassCallExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.BooleanLiteralExp
	 * <em>Boolean Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Boolean Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.BooleanLiteralExp
	 * @generated
	 */
	EClass getBooleanLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CallExp <em>Call Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Call Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CallExp
	 * @generated
	 */
	EClass getCallExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CollectionItem
	 * <em>Collection Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Collection Item</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionItem
	 * @generated
	 */
	EClass getCollectionItem();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp
	 * <em>Collection Literal Exp</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Collection Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp
	 * @generated
	 */
	EClass getCollectionLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CollectionLiteralPart
	 * <em>Collection Literal Part</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Collection Literal Part</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionLiteralPart
	 * @generated
	 */
	EClass getCollectionLiteralPart();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.CollectionRange
	 * <em>Collection Range</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Collection Range</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionRange
	 * @generated
	 */
	EClass getCollectionRange();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.EnumLiteralExp
	 * <em>Enum Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Enum Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.EnumLiteralExp
	 * @generated
	 */
	EClass getEnumLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.FeatureCallExp
	 * <em>Feature Call Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Feature Call Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.FeatureCallExp
	 * @generated
	 */
	EClass getFeatureCallExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.IfExp <em>If Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>If Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.IfExp
	 * @generated
	 */
	EClass getIfExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp
	 * <em>Integer Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Integer Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp
	 * @generated
	 */
	EClass getIntegerLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.UnlimitedNaturalLiteralExp
	 * <em>Unlimited Natural Literal Exp</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unlimited Natural Literal Exp</em>
	 *         '.
	 * @see org.eclipse.emf.cdo.common.ocl.UnlimitedNaturalLiteralExp
	 * @generated
	 */
	EClass getUnlimitedNaturalLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp
	 * <em>Invalid Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Invalid Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp
	 * @generated
	 */
	EClass getInvalidLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Iterate Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.IterateExp
	 * @generated
	 */
	EClass getIterateExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.IteratorExp <em>Iterator Exp</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Iterator Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.IteratorExp
	 * @generated
	 */
	EClass getIteratorExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.LetExp <em>Let Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Let Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.LetExp
	 * @generated
	 */
	EClass getLetExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.LiteralExp
	 * @generated
	 */
	EClass getLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.LoopExp <em>Loop Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.LoopExp
	 * @generated
	 */
	EClass getLoopExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.MessageExp <em>Message Exp</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.MessageExp
	 * @generated
	 */
	EClass getMessageExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.NavigationCallExp
	 * <em>Navigation Call Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Navigation Call Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.NavigationCallExp
	 * @generated
	 */
	EClass getNavigationCallExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.NullLiteralExp
	 * <em>Null Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Null Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.NullLiteralExp
	 * @generated
	 */
	EClass getNullLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.NumericLiteralExp
	 * <em>Numeric Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Numeric Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.NumericLiteralExp
	 * @generated
	 */
	EClass getNumericLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.OCLExpression <em>Expression</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.OCLExpression
	 * @generated
	 */
	EClass getOCLExpression();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.OperationCallExp
	 * <em>Operation Call Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Operation Call Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.OperationCallExp
	 * @generated
	 */
	EClass getOperationCallExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.PrimitiveLiteralExp
	 * <em>Primitive Literal Exp</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Primitive Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.PrimitiveLiteralExp
	 * @generated
	 */
	EClass getPrimitiveLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.PropertyCallExp
	 * <em>Property Call Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Property Call Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.PropertyCallExp
	 * @generated
	 */
	EClass getPropertyCallExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.RealLiteralExp
	 * <em>Real Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Real Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.RealLiteralExp
	 * @generated
	 */
	EClass getRealLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.StateExp <em>State Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>State Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.StateExp
	 * @generated
	 */
	EClass getStateExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.StringLiteralExp
	 * <em>String Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>String Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.StringLiteralExp
	 * @generated
	 */
	EClass getStringLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.TupleLiteralExp
	 * <em>Tuple Literal Exp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Tuple Literal Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.TupleLiteralExp
	 * @generated
	 */
	EClass getTupleLiteralExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.TupleLiteralPart
	 * <em>Tuple Literal Part</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Tuple Literal Part</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.TupleLiteralPart
	 * @generated
	 */
	EClass getTupleLiteralPart();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.TypeExp <em>Type Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.TypeExp
	 * @generated
	 */
	EClass getTypeExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.UnspecifiedValueExp
	 * <em>Unspecified Value Exp</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unspecified Value Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.UnspecifiedValueExp
	 * @generated
	 */
	EClass getUnspecifiedValueExp();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.Variable <em>Variable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.ocl.VariableExp <em>Variable Exp</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable Exp</em>'.
	 * @see org.eclipse.emf.cdo.common.ocl.VariableExp
	 * @generated
	 */
	EClass getVariableExp();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OCLFactory getOCLFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
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
	interface Literals {

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.AnyTypeImpl
		 * <em>Any Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.AnyTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.BagTypeImpl
		 * <em>Bag Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.BagTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getBagType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBagType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionTypeImpl
		 * <em>Collection Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.ElementTypeImpl
		 * <em>Element Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.ElementTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.InvalidTypeImpl
		 * <em>Invalid Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.InvalidTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getInvalidType()
		 * @generated
		 */
		EClass INVALID_TYPE = eINSTANCE.getInvalidType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.MessageTypeImpl
		 * <em>Message Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.MessageTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.OrderedSetTypeImpl
		 * <em>Ordered Set Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OrderedSetTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getOrderedSetType()
		 * @generated
		 */
		EClass ORDERED_SET_TYPE = eINSTANCE.getOrderedSetType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.PrimitiveTypeImpl
		 * <em>Primitive Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.PrimitiveTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.SequenceTypeImpl
		 * <em>Sequence Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.SequenceTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.SetTypeImpl
		 * <em>Set Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.SetTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.TupleTypeImpl
		 * <em>Tuple Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.TupleTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.TypeTypeImpl
		 * <em>Type Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.TypeTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTypeType()
		 * @generated
		 */
		EClass TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.VoidTypeImpl
		 * <em>Void Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.VoidTypeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CallOperationActionImpl
		 * <em>Call Operation Action</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CallOperationActionImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCallOperationAction()
		 * @generated
		 */
		EClass CALL_OPERATION_ACTION = eINSTANCE.getCallOperationAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALL_OPERATION_ACTION__OPERATION = eINSTANCE
			.getCallOperationAction_Operation();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.ConstraintImpl
		 * <em>Constraint</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.ConstraintImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONSTRAINT__SPECIFICATION = eINSTANCE
			.getConstraint_Specification();

		/**
		 * The meta object literal for the '<em><b>Constrained Elements</b></em>
		 * ' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINED_ELEMENTS = eINSTANCE
			.getConstraint_ConstrainedElements();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT__STEREOTYPE = eINSTANCE
			.getConstraint_Stereotype();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.SendSignalActionImpl
		 * <em>Send Signal Action</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.SendSignalActionImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getSendSignalAction()
		 * @generated
		 */
		EClass SEND_SIGNAL_ACTION = eINSTANCE.getSendSignalAction();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SEND_SIGNAL_ACTION__SIGNAL = eINSTANCE
			.getSendSignalAction_Signal();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl
		 * <em>Expression In OCL</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.ExpressionInOCLImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getExpressionInOCL()
		 * @generated
		 */
		EClass EXPRESSION_IN_OCL = eINSTANCE.getExpressionInOCL();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.AssociationClassCallExpImpl
		 * <em>Association Class Call Exp</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.AssociationClassCallExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getAssociationClassCallExp()
		 * @generated
		 */
		EClass ASSOCIATION_CLASS_CALL_EXP = eINSTANCE
			.getAssociationClassCallExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.BooleanLiteralExpImpl
		 * <em>Boolean Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.BooleanLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getBooleanLiteralExp()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXP = eINSTANCE.getBooleanLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CallExpImpl
		 * <em>Call Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CallExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCallExp()
		 * @generated
		 */
		EClass CALL_EXP = eINSTANCE.getCallExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionItemImpl
		 * <em>Collection Item</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionItemImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionItem()
		 * @generated
		 */
		EClass COLLECTION_ITEM = eINSTANCE.getCollectionItem();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl
		 * <em>Collection Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionLiteralExp()
		 * @generated
		 */
		EClass COLLECTION_LITERAL_EXP = eINSTANCE.getCollectionLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralPartImpl
		 * <em>Collection Literal Part</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionLiteralPartImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionLiteralPart()
		 * @generated
		 */
		EClass COLLECTION_LITERAL_PART = eINSTANCE.getCollectionLiteralPart();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.CollectionRangeImpl
		 * <em>Collection Range</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.CollectionRangeImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getCollectionRange()
		 * @generated
		 */
		EClass COLLECTION_RANGE = eINSTANCE.getCollectionRange();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.EnumLiteralExpImpl
		 * <em>Enum Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.EnumLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getEnumLiteralExp()
		 * @generated
		 */
		EClass ENUM_LITERAL_EXP = eINSTANCE.getEnumLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.FeatureCallExpImpl
		 * <em>Feature Call Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.FeatureCallExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getFeatureCallExp()
		 * @generated
		 */
		EClass FEATURE_CALL_EXP = eINSTANCE.getFeatureCallExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.IfExpImpl <em>If Exp</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.IfExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIfExp()
		 * @generated
		 */
		EClass IF_EXP = eINSTANCE.getIfExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.IntegerLiteralExpImpl
		 * <em>Integer Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.IntegerLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIntegerLiteralExp()
		 * @generated
		 */
		EClass INTEGER_LITERAL_EXP = eINSTANCE.getIntegerLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.UnlimitedNaturalLiteralExpImpl
		 * <em>Unlimited Natural Literal Exp</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.UnlimitedNaturalLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getUnlimitedNaturalLiteralExp()
		 * @generated
		 */
		EClass UNLIMITED_NATURAL_LITERAL_EXP = eINSTANCE
			.getUnlimitedNaturalLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.InvalidLiteralExpImpl
		 * <em>Invalid Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.InvalidLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getInvalidLiteralExp()
		 * @generated
		 */
		EClass INVALID_LITERAL_EXP = eINSTANCE.getInvalidLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.IterateExpImpl
		 * <em>Iterate Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.IterateExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIterateExp()
		 * @generated
		 */
		EClass ITERATE_EXP = eINSTANCE.getIterateExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.IteratorExpImpl
		 * <em>Iterator Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.IteratorExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getIteratorExp()
		 * @generated
		 */
		EClass ITERATOR_EXP = eINSTANCE.getIteratorExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.LetExpImpl
		 * <em>Let Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.LetExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getLetExp()
		 * @generated
		 */
		EClass LET_EXP = eINSTANCE.getLetExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.LiteralExpImpl
		 * <em>Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.LiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getLiteralExp()
		 * @generated
		 */
		EClass LITERAL_EXP = eINSTANCE.getLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.LoopExpImpl
		 * <em>Loop Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.LoopExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getLoopExp()
		 * @generated
		 */
		EClass LOOP_EXP = eINSTANCE.getLoopExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.MessageExpImpl
		 * <em>Message Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.MessageExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getMessageExp()
		 * @generated
		 */
		EClass MESSAGE_EXP = eINSTANCE.getMessageExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.NavigationCallExpImpl
		 * <em>Navigation Call Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.NavigationCallExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getNavigationCallExp()
		 * @generated
		 */
		EClass NAVIGATION_CALL_EXP = eINSTANCE.getNavigationCallExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.NullLiteralExpImpl
		 * <em>Null Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.NullLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getNullLiteralExp()
		 * @generated
		 */
		EClass NULL_LITERAL_EXP = eINSTANCE.getNullLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.NumericLiteralExpImpl
		 * <em>Numeric Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.NumericLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getNumericLiteralExp()
		 * @generated
		 */
		EClass NUMERIC_LITERAL_EXP = eINSTANCE.getNumericLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.OCLExpressionImpl
		 * <em>Expression</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLExpressionImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getOCLExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOCLExpression();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.OperationCallExpImpl
		 * <em>Operation Call Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OperationCallExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getOperationCallExp()
		 * @generated
		 */
		EClass OPERATION_CALL_EXP = eINSTANCE.getOperationCallExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.PrimitiveLiteralExpImpl
		 * <em>Primitive Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.PrimitiveLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getPrimitiveLiteralExp()
		 * @generated
		 */
		EClass PRIMITIVE_LITERAL_EXP = eINSTANCE.getPrimitiveLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.PropertyCallExpImpl
		 * <em>Property Call Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.PropertyCallExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getPropertyCallExp()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.RealLiteralExpImpl
		 * <em>Real Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.RealLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getRealLiteralExp()
		 * @generated
		 */
		EClass REAL_LITERAL_EXP = eINSTANCE.getRealLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.StateExpImpl
		 * <em>State Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.StateExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getStateExp()
		 * @generated
		 */
		EClass STATE_EXP = eINSTANCE.getStateExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.StringLiteralExpImpl
		 * <em>String Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.StringLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getStringLiteralExp()
		 * @generated
		 */
		EClass STRING_LITERAL_EXP = eINSTANCE.getStringLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralExpImpl
		 * <em>Tuple Literal Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTupleLiteralExp()
		 * @generated
		 */
		EClass TUPLE_LITERAL_EXP = eINSTANCE.getTupleLiteralExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralPartImpl
		 * <em>Tuple Literal Part</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.TupleLiteralPartImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTupleLiteralPart()
		 * @generated
		 */
		EClass TUPLE_LITERAL_PART = eINSTANCE.getTupleLiteralPart();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.TypeExpImpl
		 * <em>Type Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.TypeExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getTypeExp()
		 * @generated
		 */
		EClass TYPE_EXP = eINSTANCE.getTypeExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.UnspecifiedValueExpImpl
		 * <em>Unspecified Value Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.UnspecifiedValueExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getUnspecifiedValueExp()
		 * @generated
		 */
		EClass UNSPECIFIED_VALUE_EXP = eINSTANCE.getUnspecifiedValueExp();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.VariableImpl
		 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.VariableImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.ocl.impl.VariableExpImpl
		 * <em>Variable Exp</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.emf.cdo.common.ocl.impl.VariableExpImpl
		 * @see org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl#getVariableExp()
		 * @generated
		 */
		EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

	}

} // OCLPackage
