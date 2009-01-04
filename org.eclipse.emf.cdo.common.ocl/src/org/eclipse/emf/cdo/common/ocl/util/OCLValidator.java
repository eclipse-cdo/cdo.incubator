/**
 * <copyright>
 * 
 * Copyright (c) 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 241426, 248869
 * 
 * </copyright>
 *
 * $Id: OCLValidator.java,v 1.2 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.util;

import java.util.Map;

import org.eclipse.emf.cdo.common.ocl.AnyType;
import org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp;
import org.eclipse.emf.cdo.common.ocl.BagType;
import org.eclipse.emf.cdo.common.ocl.BooleanLiteralExp;
import org.eclipse.emf.cdo.common.ocl.CallExp;
import org.eclipse.emf.cdo.common.ocl.CallOperationAction;
import org.eclipse.emf.cdo.common.ocl.CollectionItem;
import org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp;
import org.eclipse.emf.cdo.common.ocl.CollectionLiteralPart;
import org.eclipse.emf.cdo.common.ocl.CollectionRange;
import org.eclipse.emf.cdo.common.ocl.CollectionType;
import org.eclipse.emf.cdo.common.ocl.Constraint;
import org.eclipse.emf.cdo.common.ocl.ElementType;
import org.eclipse.emf.cdo.common.ocl.EnumLiteralExp;
import org.eclipse.emf.cdo.common.ocl.ExpressionInOCL;
import org.eclipse.emf.cdo.common.ocl.FeatureCallExp;
import org.eclipse.emf.cdo.common.ocl.IfExp;
import org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp;
import org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp;
import org.eclipse.emf.cdo.common.ocl.InvalidType;
import org.eclipse.emf.cdo.common.ocl.IterateExp;
import org.eclipse.emf.cdo.common.ocl.IteratorExp;
import org.eclipse.emf.cdo.common.ocl.LetExp;
import org.eclipse.emf.cdo.common.ocl.LiteralExp;
import org.eclipse.emf.cdo.common.ocl.LoopExp;
import org.eclipse.emf.cdo.common.ocl.MessageExp;
import org.eclipse.emf.cdo.common.ocl.MessageType;
import org.eclipse.emf.cdo.common.ocl.NavigationCallExp;
import org.eclipse.emf.cdo.common.ocl.NullLiteralExp;
import org.eclipse.emf.cdo.common.ocl.NumericLiteralExp;
import org.eclipse.emf.cdo.common.ocl.OCLExpression;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.OperationCallExp;
import org.eclipse.emf.cdo.common.ocl.OrderedSetType;
import org.eclipse.emf.cdo.common.ocl.PrimitiveLiteralExp;
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
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.expressions.util.ExpressionsValidator;
import org.eclipse.ocl.types.util.TypesValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage
 * @generated
 */
public class OCLValidator
		extends EObjectValidator {

	/**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public static final OCLValidator INSTANCE = new OCLValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.cdo.common.ocl"; //$NON-NLS-1$

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @generated
   */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
   * The cached base package validator.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	protected TypesValidator typesValidator;

	/**
   * The cached base package validator.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	protected ExpressionsValidator expressionsValidator;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	public OCLValidator() {
    super();
    typesValidator = TypesValidator.INSTANCE;
    expressionsValidator = ExpressionsValidator.INSTANCE;
  }

	/**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EPackage getEPackage() {
    return OCLPackage.eINSTANCE;
  }

	/**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID)
    {
      case OCLPackage.ANY_TYPE:
        return validateAnyType((AnyType)value, diagnostics, context);
      case OCLPackage.BAG_TYPE:
        return validateBagType((BagType)value, diagnostics, context);
      case OCLPackage.COLLECTION_TYPE:
        return validateCollectionType((CollectionType)value, diagnostics, context);
      case OCLPackage.ELEMENT_TYPE:
        return validateElementType((ElementType)value, diagnostics, context);
      case OCLPackage.INVALID_TYPE:
        return validateInvalidType((InvalidType)value, diagnostics, context);
      case OCLPackage.MESSAGE_TYPE:
        return validateMessageType((MessageType)value, diagnostics, context);
      case OCLPackage.ORDERED_SET_TYPE:
        return validateOrderedSetType((OrderedSetType)value, diagnostics, context);
      case OCLPackage.PRIMITIVE_TYPE:
        return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
      case OCLPackage.SEQUENCE_TYPE:
        return validateSequenceType((SequenceType)value, diagnostics, context);
      case OCLPackage.SET_TYPE:
        return validateSetType((SetType)value, diagnostics, context);
      case OCLPackage.TUPLE_TYPE:
        return validateTupleType((TupleType)value, diagnostics, context);
      case OCLPackage.TYPE_TYPE:
        return validateTypeType((TypeType)value, diagnostics, context);
      case OCLPackage.VOID_TYPE:
        return validateVoidType((VoidType)value, diagnostics, context);
      case OCLPackage.CALL_OPERATION_ACTION:
        return validateCallOperationAction((CallOperationAction)value, diagnostics, context);
      case OCLPackage.CONSTRAINT:
        return validateConstraint((Constraint)value, diagnostics, context);
      case OCLPackage.SEND_SIGNAL_ACTION:
        return validateSendSignalAction((SendSignalAction)value, diagnostics, context);
      case OCLPackage.EXPRESSION_IN_OCL:
        return validateExpressionInOCL((ExpressionInOCL)value, diagnostics, context);
      case OCLPackage.ASSOCIATION_CLASS_CALL_EXP:
        return validateAssociationClassCallExp((AssociationClassCallExp)value, diagnostics, context);
      case OCLPackage.BOOLEAN_LITERAL_EXP:
        return validateBooleanLiteralExp((BooleanLiteralExp)value, diagnostics, context);
      case OCLPackage.CALL_EXP:
        return validateCallExp((CallExp)value, diagnostics, context);
      case OCLPackage.COLLECTION_ITEM:
        return validateCollectionItem((CollectionItem)value, diagnostics, context);
      case OCLPackage.COLLECTION_LITERAL_EXP:
        return validateCollectionLiteralExp((CollectionLiteralExp)value, diagnostics, context);
      case OCLPackage.COLLECTION_LITERAL_PART:
        return validateCollectionLiteralPart((CollectionLiteralPart)value, diagnostics, context);
      case OCLPackage.COLLECTION_RANGE:
        return validateCollectionRange((CollectionRange)value, diagnostics, context);
      case OCLPackage.ENUM_LITERAL_EXP:
        return validateEnumLiteralExp((EnumLiteralExp)value, diagnostics, context);
      case OCLPackage.FEATURE_CALL_EXP:
        return validateFeatureCallExp((FeatureCallExp)value, diagnostics, context);
      case OCLPackage.IF_EXP:
        return validateIfExp((IfExp)value, diagnostics, context);
      case OCLPackage.INTEGER_LITERAL_EXP:
        return validateIntegerLiteralExp((IntegerLiteralExp)value, diagnostics, context);
      case OCLPackage.UNLIMITED_NATURAL_LITERAL_EXP:
        return validateUnlimitedNaturalLiteralExp((UnlimitedNaturalLiteralExp)value, diagnostics, context);
      case OCLPackage.INVALID_LITERAL_EXP:
        return validateInvalidLiteralExp((InvalidLiteralExp)value, diagnostics, context);
      case OCLPackage.ITERATE_EXP:
        return validateIterateExp((IterateExp)value, diagnostics, context);
      case OCLPackage.ITERATOR_EXP:
        return validateIteratorExp((IteratorExp)value, diagnostics, context);
      case OCLPackage.LET_EXP:
        return validateLetExp((LetExp)value, diagnostics, context);
      case OCLPackage.LITERAL_EXP:
        return validateLiteralExp((LiteralExp)value, diagnostics, context);
      case OCLPackage.LOOP_EXP:
        return validateLoopExp((LoopExp)value, diagnostics, context);
      case OCLPackage.MESSAGE_EXP:
        return validateMessageExp((MessageExp)value, diagnostics, context);
      case OCLPackage.NAVIGATION_CALL_EXP:
        return validateNavigationCallExp((NavigationCallExp)value, diagnostics, context);
      case OCLPackage.NULL_LITERAL_EXP:
        return validateNullLiteralExp((NullLiteralExp)value, diagnostics, context);
      case OCLPackage.NUMERIC_LITERAL_EXP:
        return validateNumericLiteralExp((NumericLiteralExp)value, diagnostics, context);
      case OCLPackage.OCL_EXPRESSION:
        return validateOCLExpression((OCLExpression)value, diagnostics, context);
      case OCLPackage.OPERATION_CALL_EXP:
        return validateOperationCallExp((OperationCallExp)value, diagnostics, context);
      case OCLPackage.PRIMITIVE_LITERAL_EXP:
        return validatePrimitiveLiteralExp((PrimitiveLiteralExp)value, diagnostics, context);
      case OCLPackage.PROPERTY_CALL_EXP:
        return validatePropertyCallExp((PropertyCallExp)value, diagnostics, context);
      case OCLPackage.REAL_LITERAL_EXP:
        return validateRealLiteralExp((RealLiteralExp)value, diagnostics, context);
      case OCLPackage.STATE_EXP:
        return validateStateExp((StateExp)value, diagnostics, context);
      case OCLPackage.STRING_LITERAL_EXP:
        return validateStringLiteralExp((StringLiteralExp)value, diagnostics, context);
      case OCLPackage.TUPLE_LITERAL_EXP:
        return validateTupleLiteralExp((TupleLiteralExp)value, diagnostics, context);
      case OCLPackage.TUPLE_LITERAL_PART:
        return validateTupleLiteralPart((TupleLiteralPart)value, diagnostics, context);
      case OCLPackage.TYPE_EXP:
        return validateTypeExp((TypeExp)value, diagnostics, context);
      case OCLPackage.UNSPECIFIED_VALUE_EXP:
        return validateUnspecifiedValueExp((UnspecifiedValueExp)value, diagnostics, context);
      case OCLPackage.VARIABLE:
        return validateVariable((Variable)value, diagnostics, context);
      case OCLPackage.VARIABLE_EXP:
        return validateVariableExp((VariableExp)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnyType(AnyType anyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validateAnyType_WellFormedName(anyType, diagnostics, context);
    if (result || diagnostics != null) result &= validateAnyType_WellFormedInstanceTypeName(anyType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Any Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateAnyType_WellFormedName(AnyType anyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '<em>Any Type</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateAnyType_WellFormedInstanceTypeName(AnyType anyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBagType(BagType bagType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkCollectionTypeName(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkNoInvalidValues(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedName(bagType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedInstanceTypeName(bagType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCollectionType(CollectionType collectionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkCollectionTypeName(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkNoInvalidValues(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedName(collectionType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedInstanceTypeName(collectionType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateCollectionType_WellFormedName(
			CollectionType collectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Collection Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateCollectionType_WellFormedInstanceTypeName(
			CollectionType collectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateElementType(ElementType elementType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validateElementType_WellFormedName(elementType, diagnostics, context);
    if (result || diagnostics != null) result &= validateElementType_WellFormedInstanceTypeName(elementType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Element Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateElementType_WellFormedName(ElementType elementType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Element Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateElementType_WellFormedInstanceTypeName(
			ElementType elementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInvalidType(InvalidType invalidType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validateInvalidType_WellFormedName(invalidType, diagnostics, context);
    if (result || diagnostics != null) result &= validateInvalidType_WellFormedInstanceTypeName(invalidType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Invalid Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateInvalidType_WellFormedName(InvalidType invalidType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Invalid Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateInvalidType_WellFormedInstanceTypeName(
			InvalidType invalidType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMessageType(MessageType messageType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateMessageType_checkExclusiveSignature(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateMessageType_checkOperationParameters(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateMessageType_checkSignalAttributes(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validateMessageType_WellFormedName(messageType, diagnostics, context);
    if (result || diagnostics != null) result &= validateMessageType_WellFormedInstanceTypeName(messageType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Message Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateMessageType_WellFormedName(MessageType messageType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Message Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateMessageType_WellFormedInstanceTypeName(
			MessageType messageType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOrderedSetType(OrderedSetType orderedSetType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkCollectionTypeName(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkNoInvalidValues(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedName(orderedSetType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedInstanceTypeName(orderedSetType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePrimitiveType(PrimitiveType primitiveType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrimitiveType_WellFormedName(primitiveType, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrimitiveType_WellFormedInstanceTypeName(primitiveType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePrimitiveType_WellFormedName(
			PrimitiveType primitiveType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Primitive Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validatePrimitiveType_WellFormedInstanceTypeName(
			PrimitiveType primitiveType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSequenceType(SequenceType sequenceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkCollectionTypeName(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkNoInvalidValues(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedName(sequenceType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedInstanceTypeName(sequenceType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSetType(SetType setType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkCollectionTypeName(setType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateCollectionType_checkNoInvalidValues(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedName(setType, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionType_WellFormedInstanceTypeName(setType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTupleType(TupleType tupleType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateTupleType_checkTupleTypeName(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateTupleType_checkPartNamesUnique(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= typesValidator.validateTupleType_checkFeaturesOnlyProperties(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validateTupleType_WellFormedName(tupleType, diagnostics, context);
    if (result || diagnostics != null) result &= validateTupleType_WellFormedInstanceTypeName(tupleType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Tuple Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateTupleType_WellFormedName(TupleType tupleType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Tuple Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateTupleType_WellFormedInstanceTypeName(
			TupleType tupleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTypeType(TypeType typeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validateTypeType_WellFormedName(typeType, diagnostics, context);
    if (result || diagnostics != null) result &= validateTypeType_WellFormedInstanceTypeName(typeType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Type Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateTypeType_WellFormedName(TypeType typeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Type Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateTypeType_WellFormedInstanceTypeName(
			TypeType typeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVoidType(VoidType voidType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validateVoidType_WellFormedName(voidType, diagnostics, context);
    if (result || diagnostics != null) result &= validateVoidType_WellFormedInstanceTypeName(voidType, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Void Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVoidType_WellFormedName(VoidType voidType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '
	 * <em>Void Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @since 1.3
	 */
	public boolean validateVoidType_WellFormedInstanceTypeName(
			VoidType voidType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCallOperationAction(
			CallOperationAction callOperationAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(callOperationAction, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConstraint(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraint, diagnostics, context);
    if (result || diagnostics != null) result &= validateConstraint_WellFormedName(constraint, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Constraint</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateConstraint_WellFormedName(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSendSignalAction(SendSignalAction sendSignalAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sendSignalAction, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateExpressionInOCL(ExpressionInOCL expressionInOCL,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(expressionInOCL, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssociationClassCallExp(
			AssociationClassCallExp associationClassCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationClassCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(associationClassCallExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBooleanLiteralExp(
			BooleanLiteralExp booleanLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(booleanLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateBooleanLiteralExp_checkBooleanType(booleanLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCallExp(CallExp callExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(callExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCollectionItem(CollectionItem collectionItem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionLiteralPart_WellFormedName(collectionItem, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionItem_checkItemType(collectionItem, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCollectionLiteralExp(
			CollectionLiteralExp collectionLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionLiteralExp_checkNoCollectionInstances(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionLiteralExp_checkSetKind(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionLiteralExp_checkSequenceKind(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionLiteralExp_checkBagKind(collectionLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionLiteralExp_checkElementType(collectionLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCollectionLiteralPart(
			CollectionLiteralPart collectionLiteralPart,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionLiteralPart_WellFormedName(collectionLiteralPart, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '
	 * <em>Collection Literal Part</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateCollectionLiteralPart_WellFormedName(
			CollectionLiteralPart collectionLiteralPart,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCollectionRange(CollectionRange collectionRange,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= validateCollectionLiteralPart_WellFormedName(collectionRange, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateCollectionRange_checkRangeType(collectionRange, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEnumLiteralExp(EnumLiteralExp enumLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(enumLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateEnumLiteralExp_checkEnumType(enumLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFeatureCallExp(FeatureCallExp featureCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(featureCallExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIfExp(IfExp ifExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIfExp_checkBooleanCondition(ifExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIfExp_checkIfType(ifExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIntegerLiteralExp(
			IntegerLiteralExp integerLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(integerLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIntegerLiteralExp_checkIntegerType(integerLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnlimitedNaturalLiteralExp(
			UnlimitedNaturalLiteralExp unlimitedNaturalLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(unlimitedNaturalLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateUnlimitedNaturalLiteralExp_checkNaturalType(unlimitedNaturalLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInvalidLiteralExp(
			InvalidLiteralExp invalidLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invalidLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(invalidLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIterateExp(IterateExp iterateExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkSourceCollection(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkLoopVariableInit(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkLoopVariableType(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIterateExp_checkIterateType(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIterateExp_checkBodyType(iterateExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIterateExp_checkResultInit(iterateExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIteratorExp(IteratorExp iteratorExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkSourceCollection(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkLoopVariableInit(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkLoopVariableType(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIteratorExp_checkBooleanType(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIteratorExp_checkCollectType(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIteratorExp_checkSelectRejectType(iteratorExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateIteratorExp_checkBooleanBodyType(iteratorExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLetExp(LetExp letExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(letExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLetExp_checkLetType(letExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLiteralExp(LiteralExp literalExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(literalExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLoopExp(LoopExp loopExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkSourceCollection(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkLoopVariableInit(loopExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateLoopExp_checkLoopVariableType(loopExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMessageExp(MessageExp messageExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateMessageExp_checkOperationArguments(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateMessageExp_checkSignalArguments(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateMessageExp_checkTargetDefinesOperation(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateMessageExp_checkHasOperationOrSignal(messageExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateMessageExp_checkTargetNotCollection(messageExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNavigationCallExp(
			NavigationCallExp navigationCallExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(navigationCallExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNullLiteralExp(NullLiteralExp nullLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nullLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(nullLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericLiteralExp(
			NumericLiteralExp numericLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numericLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(numericLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOCLExpression(OCLExpression oclExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclExpression, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(oclExpression, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>OCL Expression</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateOCLExpression_WellFormedName(
			OCLExpression oclExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// undefine the inherited constraint, which does not apply to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOperationCallExp(OperationCallExp operationCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateOperationCallExp_checkArgumentsConform(operationCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateOperationCallExp_checkArgumentCount(operationCallExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePrimitiveLiteralExp(
			PrimitiveLiteralExp primitiveLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(primitiveLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePropertyCallExp(PropertyCallExp propertyCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(propertyCallExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validatePropertyCallExp_checkPropertyType(propertyCallExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRealLiteralExp(RealLiteralExp realLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(realLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateRealLiteralExp_checkRealType(realLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStateExp(StateExp stateExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(stateExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStringLiteralExp(StringLiteralExp stringLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(stringLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateStringLiteralExp_checkStringType(stringLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTupleLiteralExp(TupleLiteralExp tupleLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateTupleLiteralExp_checkTupleType(tupleLiteralExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateTupleLiteralExp_checkPartsUnique(tupleLiteralExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTupleLiteralPart(TupleLiteralPart tupleLiteralPart,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateTupleLiteralPart_checkValueType(tupleLiteralPart, diagnostics, context);
    if (result || diagnostics != null) result &= validateTupleLiteralPart_WellFormedName(tupleLiteralPart, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Tuple Literal Part</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateTupleLiteralPart_WellFormedName(
			TupleLiteralPart tupleLiteralPart, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTypeExp(TypeExp typeExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typeExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(typeExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnspecifiedValueExp(
			UnspecifiedValueExp unspecifiedValueExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unspecifiedValueExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(unspecifiedValueExp, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVariable(Variable variable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateVariable_checkInitType(variable, diagnostics, context);
    if (result || diagnostics != null) result &= validateVariable_WellFormedName(variable, diagnostics, context);
    return result;
  }

	/**
	 * Validates the WellFormedName constraint of '<em>Variable</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariable_WellFormedName(Variable variable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// The Ecore constraint is not applicable to OCL
		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVariableExp(VariableExp variableExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validate_EveryMultiplicityConforms(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= validateOCLExpression_WellFormedName(variableExp, diagnostics, context);
    if (result || diagnostics != null) result &= expressionsValidator.validateVariableExp_checkVarType(variableExp, diagnostics, context);
    return result;
  }

	/**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} // OCLValidator
