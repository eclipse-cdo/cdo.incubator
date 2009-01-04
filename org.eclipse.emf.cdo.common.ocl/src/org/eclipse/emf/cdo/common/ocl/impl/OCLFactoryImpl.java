/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id: OCLFactoryImpl.java,v 1.1 2009-01-04 17:56:36 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import org.eclipse.emf.cdo.common.ocl.AnyType;
import org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp;
import org.eclipse.emf.cdo.common.ocl.BagType;
import org.eclipse.emf.cdo.common.ocl.BooleanLiteralExp;
import org.eclipse.emf.cdo.common.ocl.CallOperationAction;
import org.eclipse.emf.cdo.common.ocl.CollectionItem;
import org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp;
import org.eclipse.emf.cdo.common.ocl.CollectionRange;
import org.eclipse.emf.cdo.common.ocl.CollectionType;
import org.eclipse.emf.cdo.common.ocl.Constraint;
import org.eclipse.emf.cdo.common.ocl.ElementType;
import org.eclipse.emf.cdo.common.ocl.EnumLiteralExp;
import org.eclipse.emf.cdo.common.ocl.ExpressionInOCL;
import org.eclipse.emf.cdo.common.ocl.IfExp;
import org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp;
import org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp;
import org.eclipse.emf.cdo.common.ocl.InvalidType;
import org.eclipse.emf.cdo.common.ocl.IterateExp;
import org.eclipse.emf.cdo.common.ocl.IteratorExp;
import org.eclipse.emf.cdo.common.ocl.LetExp;
import org.eclipse.emf.cdo.common.ocl.MessageExp;
import org.eclipse.emf.cdo.common.ocl.MessageType;
import org.eclipse.emf.cdo.common.ocl.NullLiteralExp;
import org.eclipse.emf.cdo.common.ocl.OCLFactory;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.OperationCallExp;
import org.eclipse.emf.cdo.common.ocl.OrderedSetType;
import org.eclipse.emf.cdo.common.ocl.PrimitiveType;
import org.eclipse.emf.cdo.common.ocl.PropertyCallExp;
import org.eclipse.emf.cdo.common.ocl.RealLiteralExp;
import org.eclipse.emf.cdo.common.ocl.SendSignalAction;
import org.eclipse.emf.cdo.common.ocl.SequenceType;
import org.eclipse.emf.cdo.common.ocl.SetType;
import org.eclipse.emf.cdo.common.ocl.StateExp;
import org.eclipse.emf.cdo.common.ocl.StringLiteralExp;
import org.eclipse.emf.cdo.common.ocl.TupleLiteralExp;
import org.eclipse.emf.cdo.common.ocl.TupleLiteralPart;
import org.eclipse.emf.cdo.common.ocl.TupleType;
import org.eclipse.emf.cdo.common.ocl.TypeExp;
import org.eclipse.emf.cdo.common.ocl.TypeType;
import org.eclipse.emf.cdo.common.ocl.UnlimitedNaturalLiteralExp;
import org.eclipse.emf.cdo.common.ocl.UnspecifiedValueExp;
import org.eclipse.emf.cdo.common.ocl.Variable;
import org.eclipse.emf.cdo.common.ocl.VariableExp;
import org.eclipse.emf.cdo.common.ocl.VoidType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

//import org.eclipse.emf.cdo.common.ocl.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class OCLFactoryImpl
		extends EFactoryImpl
		implements OCLFactory {

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static OCLFactory init() {
		try {
			OCLFactory theOCLFactory = (OCLFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://www.eclipse.org/ocl/1.1.0/CDO");
			if (theOCLFactory != null) {
				return theOCLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OCLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OCLPackage.ANY_TYPE :
				return createAnyType();
			case OCLPackage.BAG_TYPE :
				return createBagType();
			case OCLPackage.COLLECTION_TYPE :
				return createCollectionType();
			case OCLPackage.ELEMENT_TYPE :
				return createElementType();
			case OCLPackage.INVALID_TYPE :
				return createInvalidType();
			case OCLPackage.MESSAGE_TYPE :
				return createMessageType();
			case OCLPackage.ORDERED_SET_TYPE :
				return createOrderedSetType();
			case OCLPackage.PRIMITIVE_TYPE :
				return createPrimitiveType();
			case OCLPackage.SEQUENCE_TYPE :
				return createSequenceType();
			case OCLPackage.SET_TYPE :
				return createSetType();
			case OCLPackage.TUPLE_TYPE :
				return createTupleType();
			case OCLPackage.TYPE_TYPE :
				return createTypeType();
			case OCLPackage.VOID_TYPE :
				return createVoidType();
			case OCLPackage.CALL_OPERATION_ACTION :
				return createCallOperationAction();
			case OCLPackage.CONSTRAINT :
				return createConstraint();
			case OCLPackage.SEND_SIGNAL_ACTION :
				return createSendSignalAction();
			case OCLPackage.EXPRESSION_IN_OCL :
				return createExpressionInOCL();
			case OCLPackage.ASSOCIATION_CLASS_CALL_EXP :
				return createAssociationClassCallExp();
			case OCLPackage.BOOLEAN_LITERAL_EXP :
				return createBooleanLiteralExp();
			case OCLPackage.COLLECTION_ITEM :
				return createCollectionItem();
			case OCLPackage.COLLECTION_LITERAL_EXP :
				return createCollectionLiteralExp();
			case OCLPackage.COLLECTION_RANGE :
				return createCollectionRange();
			case OCLPackage.ENUM_LITERAL_EXP :
				return createEnumLiteralExp();
			case OCLPackage.IF_EXP :
				return createIfExp();
			case OCLPackage.INTEGER_LITERAL_EXP :
				return createIntegerLiteralExp();
			case OCLPackage.UNLIMITED_NATURAL_LITERAL_EXP :
				return createUnlimitedNaturalLiteralExp();
			case OCLPackage.INVALID_LITERAL_EXP :
				return createInvalidLiteralExp();
			case OCLPackage.ITERATE_EXP :
				return createIterateExp();
			case OCLPackage.ITERATOR_EXP :
				return createIteratorExp();
			case OCLPackage.LET_EXP :
				return createLetExp();
			case OCLPackage.MESSAGE_EXP :
				return createMessageExp();
			case OCLPackage.NULL_LITERAL_EXP :
				return createNullLiteralExp();
			case OCLPackage.OPERATION_CALL_EXP :
				return createOperationCallExp();
			case OCLPackage.PROPERTY_CALL_EXP :
				return createPropertyCallExp();
			case OCLPackage.REAL_LITERAL_EXP :
				return createRealLiteralExp();
			case OCLPackage.STATE_EXP :
				return createStateExp();
			case OCLPackage.STRING_LITERAL_EXP :
				return createStringLiteralExp();
			case OCLPackage.TUPLE_LITERAL_EXP :
				return createTupleLiteralExp();
			case OCLPackage.TUPLE_LITERAL_PART :
				return createTupleLiteralPart();
			case OCLPackage.TYPE_EXP :
				return createTypeExp();
			case OCLPackage.UNSPECIFIED_VALUE_EXP :
				return createUnspecifiedValueExp();
			case OCLPackage.VARIABLE :
				return createVariable();
			case OCLPackage.VARIABLE_EXP :
				return createVariableExp();
			default :
				throw new IllegalArgumentException("The class '"
					+ eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnyType createAnyType() {
		AnyTypeImpl anyType = new AnyTypeImpl();
		return anyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InvalidType createInvalidType() {
		InvalidTypeImpl invalidType = new InvalidTypeImpl();
		return invalidType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrderedSetType createOrderedSetType() {
		OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
		return orderedSetType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeType createTypeType() {
		TypeTypeImpl typeType = new TypeTypeImpl();
		return typeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionInOCL createExpressionInOCL() {
		ExpressionInOCLImpl expressionInOCL = new ExpressionInOCLImpl();
		return expressionInOCL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationClassCallExp createAssociationClassCallExp() {
		AssociationClassCallExpImpl associationClassCallExp = new AssociationClassCallExpImpl();
		return associationClassCallExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BooleanLiteralExp createBooleanLiteralExp() {
		BooleanLiteralExpImpl booleanLiteralExp = new BooleanLiteralExpImpl();
		return booleanLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionItem createCollectionItem() {
		CollectionItemImpl collectionItem = new CollectionItemImpl();
		return collectionItem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionLiteralExp createCollectionLiteralExp() {
		CollectionLiteralExpImpl collectionLiteralExp = new CollectionLiteralExpImpl();
		return collectionLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionRange createCollectionRange() {
		CollectionRangeImpl collectionRange = new CollectionRangeImpl();
		return collectionRange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IfExp createIfExp() {
		IfExpImpl ifExp = new IfExpImpl();
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegerLiteralExp createIntegerLiteralExp() {
		IntegerLiteralExpImpl integerLiteralExp = new IntegerLiteralExpImpl();
		return integerLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnlimitedNaturalLiteralExp createUnlimitedNaturalLiteralExp() {
		UnlimitedNaturalLiteralExpImpl unlimitedNaturalLiteralExp = new UnlimitedNaturalLiteralExpImpl();
		return unlimitedNaturalLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InvalidLiteralExp createInvalidLiteralExp() {
		InvalidLiteralExpImpl invalidLiteralExp = new InvalidLiteralExpImpl();
		return invalidLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IterateExp createIterateExp() {
		IterateExpImpl iterateExp = new IterateExpImpl();
		return iterateExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IteratorExp createIteratorExp() {
		IteratorExpImpl iteratorExp = new IteratorExpImpl();
		return iteratorExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LetExp createLetExp() {
		LetExpImpl letExp = new LetExpImpl();
		return letExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageExp createMessageExp() {
		MessageExpImpl messageExp = new MessageExpImpl();
		return messageExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NullLiteralExp createNullLiteralExp() {
		NullLiteralExpImpl nullLiteralExp = new NullLiteralExpImpl();
		return nullLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationCallExp createOperationCallExp() {
		OperationCallExpImpl operationCallExp = new OperationCallExpImpl();
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyCallExp createPropertyCallExp() {
		PropertyCallExpImpl propertyCallExp = new PropertyCallExpImpl();
		return propertyCallExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RealLiteralExp createRealLiteralExp() {
		RealLiteralExpImpl realLiteralExp = new RealLiteralExpImpl();
		return realLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StateExp createStateExp() {
		StateExpImpl stateExp = new StateExpImpl();
		return stateExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StringLiteralExp createStringLiteralExp() {
		StringLiteralExpImpl stringLiteralExp = new StringLiteralExpImpl();
		return stringLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TupleLiteralExp createTupleLiteralExp() {
		TupleLiteralExpImpl tupleLiteralExp = new TupleLiteralExpImpl();
		return tupleLiteralExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TupleLiteralPart createTupleLiteralPart() {
		TupleLiteralPartImpl tupleLiteralPart = new TupleLiteralPartImpl();
		return tupleLiteralPart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeExp createTypeExp() {
		TypeExpImpl typeExp = new TypeExpImpl();
		return typeExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnspecifiedValueExp createUnspecifiedValueExp() {
		UnspecifiedValueExpImpl unspecifiedValueExp = new UnspecifiedValueExpImpl();
		return unspecifiedValueExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLPackage getOCLPackage() {
		return (OCLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OCLPackage getPackage() {
		return OCLPackage.eINSTANCE;
	}

} // OCLFactoryImpl
