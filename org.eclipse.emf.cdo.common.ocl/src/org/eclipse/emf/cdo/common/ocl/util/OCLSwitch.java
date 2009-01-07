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
 *   Zeligsoft - Bug 241426
 * 
 * </copyright>
 *
 * $Id: OCLSwitch.java,v 1.3 2009-01-07 07:21:35 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.util;

import java.util.List;

import org.eclipse.emf.cdo.common.model.CDOClass;
import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDONamedElement;
import org.eclipse.emf.cdo.common.model.CDOType;
import org.eclipse.emf.cdo.common.model.CDOTypedElement;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.utilities.ASTNode;
import org.eclipse.ocl.utilities.CallingASTNode;
import org.eclipse.ocl.utilities.PredefinedType;
import org.eclipse.ocl.utilities.TypedASTNode;
import org.eclipse.ocl.utilities.TypedElement;
import org.eclipse.ocl.utilities.Visitable;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage
 * @generated
 */
public class OCLSwitch<T> {

	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static OCLPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public OCLSwitch() {
		if (modelPackage == null) {
			modelPackage = OCLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
				? defaultCase(theEObject)
				: doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OCLPackage.ANY_TYPE : {
				AnyType anyType = (AnyType) theEObject;
				T result = caseAnyType(anyType);
				if (result == null)
					result = caseCDOClassifier(anyType);
				if (result == null)
					result = caseTypes_AnyType(anyType);
				if (result == null)
					result = casePredefinedType(anyType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.BAG_TYPE : {
				BagType bagType = (BagType) theEObject;
				T result = caseBagType(bagType);
				if (result == null)
					result = caseCollectionType(bagType);
				if (result == null)
					result = caseTypes_BagType(bagType);
				if (result == null)
					result = caseCDOType(bagType);
				if (result == null)
					result = caseTypes_CollectionType(bagType);
				if (result == null)
					result = casePredefinedType(bagType);
				if (result == null)
					result = caseTypedASTNode(bagType);
				if (result == null)
					result = caseASTNode(bagType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_TYPE : {
				CollectionType collectionType = (CollectionType) theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null)
					result = caseCDOType(collectionType);
				if (result == null)
					result = caseTypes_CollectionType(collectionType);
				if (result == null)
					result = casePredefinedType(collectionType);
				if (result == null)
					result = caseTypedASTNode(collectionType);
				if (result == null)
					result = caseASTNode(collectionType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ELEMENT_TYPE : {
				ElementType elementType = (ElementType) theEObject;
				T result = caseElementType(elementType);
				if (result == null)
					result = caseCDOClass(elementType);
				if (result == null)
					result = caseTypes_ElementType(elementType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.INVALID_TYPE : {
				InvalidType invalidType = (InvalidType) theEObject;
				T result = caseInvalidType(invalidType);
				if (result == null)
					result = caseCDOClassifier(invalidType);
				if (result == null)
					result = caseTypes_InvalidType(invalidType);
				if (result == null)
					result = casePredefinedType(invalidType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.MESSAGE_TYPE : {
				MessageType messageType = (MessageType) theEObject;
				T result = caseMessageType(messageType);
				if (result == null)
					result = caseCDOClass(messageType);
				if (result == null)
					result = caseTypes_MessageType(messageType);
				if (result == null)
					result = casePredefinedType(messageType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ORDERED_SET_TYPE : {
				OrderedSetType orderedSetType = (OrderedSetType) theEObject;
				T result = caseOrderedSetType(orderedSetType);
				if (result == null)
					result = caseCollectionType(orderedSetType);
				if (result == null)
					result = caseTypes_OrderedSetType(orderedSetType);
				if (result == null)
					result = caseCDOType(orderedSetType);
				if (result == null)
					result = caseTypes_CollectionType(orderedSetType);
				if (result == null)
					result = casePredefinedType(orderedSetType);
				if (result == null)
					result = caseTypedASTNode(orderedSetType);
				if (result == null)
					result = caseASTNode(orderedSetType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PRIMITIVE_TYPE : {
				PrimitiveType primitiveType = (PrimitiveType) theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null)
					result = caseCDOType(primitiveType);
				if (result == null)
					result = caseTypes_PrimitiveType(primitiveType);
				if (result == null)
					result = casePredefinedType(primitiveType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SEQUENCE_TYPE : {
				SequenceType sequenceType = (SequenceType) theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null)
					result = caseCollectionType(sequenceType);
				if (result == null)
					result = caseTypes_SequenceType(sequenceType);
				if (result == null)
					result = caseCDOType(sequenceType);
				if (result == null)
					result = caseTypes_CollectionType(sequenceType);
				if (result == null)
					result = casePredefinedType(sequenceType);
				if (result == null)
					result = caseTypedASTNode(sequenceType);
				if (result == null)
					result = caseASTNode(sequenceType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SET_TYPE : {
				SetType setType = (SetType) theEObject;
				T result = caseSetType(setType);
				if (result == null)
					result = caseCollectionType(setType);
				if (result == null)
					result = caseTypes_SetType(setType);
				if (result == null)
					result = caseCDOType(setType);
				if (result == null)
					result = caseTypes_CollectionType(setType);
				if (result == null)
					result = casePredefinedType(setType);
				if (result == null)
					result = caseTypedASTNode(setType);
				if (result == null)
					result = caseASTNode(setType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_TYPE : {
				TupleType tupleType = (TupleType) theEObject;
				T result = caseTupleType(tupleType);
				if (result == null)
					result = caseCDOClass(tupleType);
				if (result == null)
					result = caseCDOType(tupleType);
				if (result == null)
					result = caseTypes_TupleType(tupleType);
				if (result == null)
					result = casePredefinedType(tupleType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TYPE_TYPE : {
				TypeType typeType = (TypeType) theEObject;
				T result = caseTypeType(typeType);
				if (result == null)
					result = caseCDOClassifier(typeType);
				if (result == null)
					result = caseTypes_TypeType(typeType);
				if (result == null)
					result = casePredefinedType(typeType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.VOID_TYPE : {
				VoidType voidType = (VoidType) theEObject;
				T result = caseVoidType(voidType);
				if (result == null)
					result = caseCDOClassifier(voidType);
				if (result == null)
					result = caseTypes_VoidType(voidType);
				if (result == null)
					result = casePredefinedType(voidType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.CALL_OPERATION_ACTION : {
				CallOperationAction callOperationAction = (CallOperationAction) theEObject;
				T result = caseCallOperationAction(callOperationAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.CONSTRAINT : {
				Constraint constraint = (Constraint) theEObject;
				T result = caseConstraint(constraint);
				if (result == null)
					result = caseCDONamedElement(constraint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SEND_SIGNAL_ACTION : {
				SendSignalAction sendSignalAction = (SendSignalAction) theEObject;
				T result = caseSendSignalAction(sendSignalAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.EXPRESSION_IN_OCL : {
				ExpressionInOCL expressionInOCL = (ExpressionInOCL) theEObject;
				T result = caseExpressionInOCL(expressionInOCL);
				if (result == null)
					result = caseUtilities_ExpressionInOCL(expressionInOCL);
				if (result == null)
					result = caseVisitable(expressionInOCL);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ASSOCIATION_CLASS_CALL_EXP : {
				AssociationClassCallExp associationClassCallExp = (AssociationClassCallExp) theEObject;
				T result = caseAssociationClassCallExp(associationClassCallExp);
				if (result == null)
					result = caseNavigationCallExp(associationClassCallExp);
				if (result == null)
					result = caseExpressions_AssociationClassCallExp(associationClassCallExp);
				if (result == null)
					result = caseFeatureCallExp(associationClassCallExp);
				if (result == null)
					result = caseExpressions_NavigationCallExp(associationClassCallExp);
				if (result == null)
					result = caseCallExp(associationClassCallExp);
				if (result == null)
					result = caseExpressions_FeatureCallExp(associationClassCallExp);
				if (result == null)
					result = caseOCLExpression(associationClassCallExp);
				if (result == null)
					result = caseExpressions_CallExp(associationClassCallExp);
				if (result == null)
					result = caseCDOTypedElement(associationClassCallExp);
				if (result == null)
					result = caseExpressions_OCLExpression(associationClassCallExp);
				if (result == null)
					result = caseCallingASTNode(associationClassCallExp);
				if (result == null)
					result = caseTypedElement(associationClassCallExp);
				if (result == null)
					result = caseVisitable(associationClassCallExp);
				if (result == null)
					result = caseASTNode(associationClassCallExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.BOOLEAN_LITERAL_EXP : {
				BooleanLiteralExp booleanLiteralExp = (BooleanLiteralExp) theEObject;
				T result = caseBooleanLiteralExp(booleanLiteralExp);
				if (result == null)
					result = casePrimitiveLiteralExp(booleanLiteralExp);
				if (result == null)
					result = caseExpressions_BooleanLiteralExp(booleanLiteralExp);
				if (result == null)
					result = caseLiteralExp(booleanLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(booleanLiteralExp);
				if (result == null)
					result = caseOCLExpression(booleanLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(booleanLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(booleanLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(booleanLiteralExp);
				if (result == null)
					result = caseTypedElement(booleanLiteralExp);
				if (result == null)
					result = caseVisitable(booleanLiteralExp);
				if (result == null)
					result = caseASTNode(booleanLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.CALL_EXP : {
				CallExp callExp = (CallExp) theEObject;
				T result = caseCallExp(callExp);
				if (result == null)
					result = caseOCLExpression(callExp);
				if (result == null)
					result = caseExpressions_CallExp(callExp);
				if (result == null)
					result = caseCDOTypedElement(callExp);
				if (result == null)
					result = caseExpressions_OCLExpression(callExp);
				if (result == null)
					result = caseCallingASTNode(callExp);
				if (result == null)
					result = caseTypedElement(callExp);
				if (result == null)
					result = caseVisitable(callExp);
				if (result == null)
					result = caseASTNode(callExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_ITEM : {
				CollectionItem collectionItem = (CollectionItem) theEObject;
				T result = caseCollectionItem(collectionItem);
				if (result == null)
					result = caseCollectionLiteralPart(collectionItem);
				if (result == null)
					result = caseExpressions_CollectionItem(collectionItem);
				if (result == null)
					result = caseCDOTypedElement(collectionItem);
				if (result == null)
					result = caseExpressions_CollectionLiteralPart(collectionItem);
				if (result == null)
					result = caseTypedElement(collectionItem);
				if (result == null)
					result = caseVisitable(collectionItem);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_LITERAL_EXP : {
				CollectionLiteralExp collectionLiteralExp = (CollectionLiteralExp) theEObject;
				T result = caseCollectionLiteralExp(collectionLiteralExp);
				if (result == null)
					result = caseLiteralExp(collectionLiteralExp);
				if (result == null)
					result = caseExpressions_CollectionLiteralExp(collectionLiteralExp);
				if (result == null)
					result = caseOCLExpression(collectionLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(collectionLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(collectionLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(collectionLiteralExp);
				if (result == null)
					result = caseTypedElement(collectionLiteralExp);
				if (result == null)
					result = caseVisitable(collectionLiteralExp);
				if (result == null)
					result = caseASTNode(collectionLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_LITERAL_PART : {
				CollectionLiteralPart collectionLiteralPart = (CollectionLiteralPart) theEObject;
				T result = caseCollectionLiteralPart(collectionLiteralPart);
				if (result == null)
					result = caseCDOTypedElement(collectionLiteralPart);
				if (result == null)
					result = caseExpressions_CollectionLiteralPart(collectionLiteralPart);
				if (result == null)
					result = caseTypedElement(collectionLiteralPart);
				if (result == null)
					result = caseVisitable(collectionLiteralPart);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_RANGE : {
				CollectionRange collectionRange = (CollectionRange) theEObject;
				T result = caseCollectionRange(collectionRange);
				if (result == null)
					result = caseCollectionLiteralPart(collectionRange);
				if (result == null)
					result = caseExpressions_CollectionRange(collectionRange);
				if (result == null)
					result = caseCDOTypedElement(collectionRange);
				if (result == null)
					result = caseExpressions_CollectionLiteralPart(collectionRange);
				if (result == null)
					result = caseTypedElement(collectionRange);
				if (result == null)
					result = caseVisitable(collectionRange);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ENUM_LITERAL_EXP : {
				EnumLiteralExp enumLiteralExp = (EnumLiteralExp) theEObject;
				T result = caseEnumLiteralExp(enumLiteralExp);
				if (result == null)
					result = caseLiteralExp(enumLiteralExp);
				if (result == null)
					result = caseExpressions_EnumLiteralExp(enumLiteralExp);
				if (result == null)
					result = caseOCLExpression(enumLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(enumLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(enumLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(enumLiteralExp);
				if (result == null)
					result = caseTypedElement(enumLiteralExp);
				if (result == null)
					result = caseVisitable(enumLiteralExp);
				if (result == null)
					result = caseASTNode(enumLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.FEATURE_CALL_EXP : {
				FeatureCallExp featureCallExp = (FeatureCallExp) theEObject;
				T result = caseFeatureCallExp(featureCallExp);
				if (result == null)
					result = caseCallExp(featureCallExp);
				if (result == null)
					result = caseExpressions_FeatureCallExp(featureCallExp);
				if (result == null)
					result = caseOCLExpression(featureCallExp);
				if (result == null)
					result = caseExpressions_CallExp(featureCallExp);
				if (result == null)
					result = caseCDOTypedElement(featureCallExp);
				if (result == null)
					result = caseExpressions_OCLExpression(featureCallExp);
				if (result == null)
					result = caseCallingASTNode(featureCallExp);
				if (result == null)
					result = caseTypedElement(featureCallExp);
				if (result == null)
					result = caseVisitable(featureCallExp);
				if (result == null)
					result = caseASTNode(featureCallExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.IF_EXP : {
				IfExp ifExp = (IfExp) theEObject;
				T result = caseIfExp(ifExp);
				if (result == null)
					result = caseOCLExpression(ifExp);
				if (result == null)
					result = caseExpressions_IfExp(ifExp);
				if (result == null)
					result = caseCDOTypedElement(ifExp);
				if (result == null)
					result = caseExpressions_OCLExpression(ifExp);
				if (result == null)
					result = caseTypedElement(ifExp);
				if (result == null)
					result = caseVisitable(ifExp);
				if (result == null)
					result = caseASTNode(ifExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.INTEGER_LITERAL_EXP : {
				IntegerLiteralExp integerLiteralExp = (IntegerLiteralExp) theEObject;
				T result = caseIntegerLiteralExp(integerLiteralExp);
				if (result == null)
					result = caseNumericLiteralExp(integerLiteralExp);
				if (result == null)
					result = caseExpressions_IntegerLiteralExp(integerLiteralExp);
				if (result == null)
					result = casePrimitiveLiteralExp(integerLiteralExp);
				if (result == null)
					result = caseExpressions_NumericLiteralExp(integerLiteralExp);
				if (result == null)
					result = caseLiteralExp(integerLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(integerLiteralExp);
				if (result == null)
					result = caseOCLExpression(integerLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(integerLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(integerLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(integerLiteralExp);
				if (result == null)
					result = caseTypedElement(integerLiteralExp);
				if (result == null)
					result = caseVisitable(integerLiteralExp);
				if (result == null)
					result = caseASTNode(integerLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.UNLIMITED_NATURAL_LITERAL_EXP : {
				UnlimitedNaturalLiteralExp unlimitedNaturalLiteralExp = (UnlimitedNaturalLiteralExp) theEObject;
				T result = caseUnlimitedNaturalLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseNumericLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseExpressions_UnlimitedNaturalLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = casePrimitiveLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseExpressions_NumericLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseOCLExpression(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseTypedElement(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseVisitable(unlimitedNaturalLiteralExp);
				if (result == null)
					result = caseASTNode(unlimitedNaturalLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.INVALID_LITERAL_EXP : {
				InvalidLiteralExp invalidLiteralExp = (InvalidLiteralExp) theEObject;
				T result = caseInvalidLiteralExp(invalidLiteralExp);
				if (result == null)
					result = caseLiteralExp(invalidLiteralExp);
				if (result == null)
					result = caseExpressions_InvalidLiteralExp(invalidLiteralExp);
				if (result == null)
					result = caseOCLExpression(invalidLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(invalidLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(invalidLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(invalidLiteralExp);
				if (result == null)
					result = caseTypedElement(invalidLiteralExp);
				if (result == null)
					result = caseVisitable(invalidLiteralExp);
				if (result == null)
					result = caseASTNode(invalidLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ITERATE_EXP : {
				IterateExp iterateExp = (IterateExp) theEObject;
				T result = caseIterateExp(iterateExp);
				if (result == null)
					result = caseLoopExp(iterateExp);
				if (result == null)
					result = caseExpressions_IterateExp(iterateExp);
				if (result == null)
					result = caseCallExp(iterateExp);
				if (result == null)
					result = caseExpressions_LoopExp(iterateExp);
				if (result == null)
					result = caseOCLExpression(iterateExp);
				if (result == null)
					result = caseExpressions_CallExp(iterateExp);
				if (result == null)
					result = caseCDOTypedElement(iterateExp);
				if (result == null)
					result = caseExpressions_OCLExpression(iterateExp);
				if (result == null)
					result = caseCallingASTNode(iterateExp);
				if (result == null)
					result = caseTypedElement(iterateExp);
				if (result == null)
					result = caseVisitable(iterateExp);
				if (result == null)
					result = caseASTNode(iterateExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ITERATOR_EXP : {
				IteratorExp iteratorExp = (IteratorExp) theEObject;
				T result = caseIteratorExp(iteratorExp);
				if (result == null)
					result = caseLoopExp(iteratorExp);
				if (result == null)
					result = caseExpressions_IteratorExp(iteratorExp);
				if (result == null)
					result = caseCallExp(iteratorExp);
				if (result == null)
					result = caseExpressions_LoopExp(iteratorExp);
				if (result == null)
					result = caseOCLExpression(iteratorExp);
				if (result == null)
					result = caseExpressions_CallExp(iteratorExp);
				if (result == null)
					result = caseCDOTypedElement(iteratorExp);
				if (result == null)
					result = caseExpressions_OCLExpression(iteratorExp);
				if (result == null)
					result = caseCallingASTNode(iteratorExp);
				if (result == null)
					result = caseTypedElement(iteratorExp);
				if (result == null)
					result = caseVisitable(iteratorExp);
				if (result == null)
					result = caseASTNode(iteratorExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.LET_EXP : {
				LetExp letExp = (LetExp) theEObject;
				T result = caseLetExp(letExp);
				if (result == null)
					result = caseOCLExpression(letExp);
				if (result == null)
					result = caseExpressions_LetExp(letExp);
				if (result == null)
					result = caseCDOTypedElement(letExp);
				if (result == null)
					result = caseExpressions_OCLExpression(letExp);
				if (result == null)
					result = caseTypedElement(letExp);
				if (result == null)
					result = caseVisitable(letExp);
				if (result == null)
					result = caseASTNode(letExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.LITERAL_EXP : {
				LiteralExp literalExp = (LiteralExp) theEObject;
				T result = caseLiteralExp(literalExp);
				if (result == null)
					result = caseOCLExpression(literalExp);
				if (result == null)
					result = caseExpressions_LiteralExp(literalExp);
				if (result == null)
					result = caseCDOTypedElement(literalExp);
				if (result == null)
					result = caseExpressions_OCLExpression(literalExp);
				if (result == null)
					result = caseTypedElement(literalExp);
				if (result == null)
					result = caseVisitable(literalExp);
				if (result == null)
					result = caseASTNode(literalExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.LOOP_EXP : {
				LoopExp loopExp = (LoopExp) theEObject;
				T result = caseLoopExp(loopExp);
				if (result == null)
					result = caseCallExp(loopExp);
				if (result == null)
					result = caseExpressions_LoopExp(loopExp);
				if (result == null)
					result = caseOCLExpression(loopExp);
				if (result == null)
					result = caseExpressions_CallExp(loopExp);
				if (result == null)
					result = caseCDOTypedElement(loopExp);
				if (result == null)
					result = caseExpressions_OCLExpression(loopExp);
				if (result == null)
					result = caseCallingASTNode(loopExp);
				if (result == null)
					result = caseTypedElement(loopExp);
				if (result == null)
					result = caseVisitable(loopExp);
				if (result == null)
					result = caseASTNode(loopExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.MESSAGE_EXP : {
				MessageExp messageExp = (MessageExp) theEObject;
				T result = caseMessageExp(messageExp);
				if (result == null)
					result = caseOCLExpression(messageExp);
				if (result == null)
					result = caseExpressions_MessageExp(messageExp);
				if (result == null)
					result = caseCDOTypedElement(messageExp);
				if (result == null)
					result = caseExpressions_OCLExpression(messageExp);
				if (result == null)
					result = caseCallingASTNode(messageExp);
				if (result == null)
					result = caseTypedElement(messageExp);
				if (result == null)
					result = caseVisitable(messageExp);
				if (result == null)
					result = caseASTNode(messageExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.NAVIGATION_CALL_EXP : {
				NavigationCallExp navigationCallExp = (NavigationCallExp) theEObject;
				T result = caseNavigationCallExp(navigationCallExp);
				if (result == null)
					result = caseFeatureCallExp(navigationCallExp);
				if (result == null)
					result = caseExpressions_NavigationCallExp(navigationCallExp);
				if (result == null)
					result = caseCallExp(navigationCallExp);
				if (result == null)
					result = caseExpressions_FeatureCallExp(navigationCallExp);
				if (result == null)
					result = caseOCLExpression(navigationCallExp);
				if (result == null)
					result = caseExpressions_CallExp(navigationCallExp);
				if (result == null)
					result = caseCDOTypedElement(navigationCallExp);
				if (result == null)
					result = caseExpressions_OCLExpression(navigationCallExp);
				if (result == null)
					result = caseCallingASTNode(navigationCallExp);
				if (result == null)
					result = caseTypedElement(navigationCallExp);
				if (result == null)
					result = caseVisitable(navigationCallExp);
				if (result == null)
					result = caseASTNode(navigationCallExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.NULL_LITERAL_EXP : {
				NullLiteralExp nullLiteralExp = (NullLiteralExp) theEObject;
				T result = caseNullLiteralExp(nullLiteralExp);
				if (result == null)
					result = caseLiteralExp(nullLiteralExp);
				if (result == null)
					result = caseExpressions_NullLiteralExp(nullLiteralExp);
				if (result == null)
					result = caseOCLExpression(nullLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(nullLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(nullLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(nullLiteralExp);
				if (result == null)
					result = caseTypedElement(nullLiteralExp);
				if (result == null)
					result = caseVisitable(nullLiteralExp);
				if (result == null)
					result = caseASTNode(nullLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.NUMERIC_LITERAL_EXP : {
				NumericLiteralExp numericLiteralExp = (NumericLiteralExp) theEObject;
				T result = caseNumericLiteralExp(numericLiteralExp);
				if (result == null)
					result = casePrimitiveLiteralExp(numericLiteralExp);
				if (result == null)
					result = caseExpressions_NumericLiteralExp(numericLiteralExp);
				if (result == null)
					result = caseLiteralExp(numericLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(numericLiteralExp);
				if (result == null)
					result = caseOCLExpression(numericLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(numericLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(numericLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(numericLiteralExp);
				if (result == null)
					result = caseTypedElement(numericLiteralExp);
				if (result == null)
					result = caseVisitable(numericLiteralExp);
				if (result == null)
					result = caseASTNode(numericLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_EXPRESSION : {
				OCLExpression oclExpression = (OCLExpression) theEObject;
				T result = caseOCLExpression(oclExpression);
				if (result == null)
					result = caseCDOTypedElement(oclExpression);
				if (result == null)
					result = caseExpressions_OCLExpression(oclExpression);
				if (result == null)
					result = caseTypedElement(oclExpression);
				if (result == null)
					result = caseVisitable(oclExpression);
				if (result == null)
					result = caseASTNode(oclExpression);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OPERATION_CALL_EXP : {
				OperationCallExp operationCallExp = (OperationCallExp) theEObject;
				T result = caseOperationCallExp(operationCallExp);
				if (result == null)
					result = caseFeatureCallExp(operationCallExp);
				if (result == null)
					result = caseExpressions_OperationCallExp(operationCallExp);
				if (result == null)
					result = caseCallExp(operationCallExp);
				if (result == null)
					result = caseExpressions_FeatureCallExp(operationCallExp);
				if (result == null)
					result = caseOCLExpression(operationCallExp);
				if (result == null)
					result = caseExpressions_CallExp(operationCallExp);
				if (result == null)
					result = caseCDOTypedElement(operationCallExp);
				if (result == null)
					result = caseExpressions_OCLExpression(operationCallExp);
				if (result == null)
					result = caseCallingASTNode(operationCallExp);
				if (result == null)
					result = caseTypedElement(operationCallExp);
				if (result == null)
					result = caseVisitable(operationCallExp);
				if (result == null)
					result = caseASTNode(operationCallExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PRIMITIVE_LITERAL_EXP : {
				PrimitiveLiteralExp primitiveLiteralExp = (PrimitiveLiteralExp) theEObject;
				T result = casePrimitiveLiteralExp(primitiveLiteralExp);
				if (result == null)
					result = caseLiteralExp(primitiveLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(primitiveLiteralExp);
				if (result == null)
					result = caseOCLExpression(primitiveLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(primitiveLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(primitiveLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(primitiveLiteralExp);
				if (result == null)
					result = caseTypedElement(primitiveLiteralExp);
				if (result == null)
					result = caseVisitable(primitiveLiteralExp);
				if (result == null)
					result = caseASTNode(primitiveLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PROPERTY_CALL_EXP : {
				PropertyCallExp propertyCallExp = (PropertyCallExp) theEObject;
				T result = casePropertyCallExp(propertyCallExp);
				if (result == null)
					result = caseNavigationCallExp(propertyCallExp);
				if (result == null)
					result = caseExpressions_PropertyCallExp(propertyCallExp);
				if (result == null)
					result = caseFeatureCallExp(propertyCallExp);
				if (result == null)
					result = caseExpressions_NavigationCallExp(propertyCallExp);
				if (result == null)
					result = caseCallExp(propertyCallExp);
				if (result == null)
					result = caseExpressions_FeatureCallExp(propertyCallExp);
				if (result == null)
					result = caseOCLExpression(propertyCallExp);
				if (result == null)
					result = caseExpressions_CallExp(propertyCallExp);
				if (result == null)
					result = caseCDOTypedElement(propertyCallExp);
				if (result == null)
					result = caseExpressions_OCLExpression(propertyCallExp);
				if (result == null)
					result = caseCallingASTNode(propertyCallExp);
				if (result == null)
					result = caseTypedElement(propertyCallExp);
				if (result == null)
					result = caseVisitable(propertyCallExp);
				if (result == null)
					result = caseASTNode(propertyCallExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.REAL_LITERAL_EXP : {
				RealLiteralExp realLiteralExp = (RealLiteralExp) theEObject;
				T result = caseRealLiteralExp(realLiteralExp);
				if (result == null)
					result = caseNumericLiteralExp(realLiteralExp);
				if (result == null)
					result = caseExpressions_RealLiteralExp(realLiteralExp);
				if (result == null)
					result = casePrimitiveLiteralExp(realLiteralExp);
				if (result == null)
					result = caseExpressions_NumericLiteralExp(realLiteralExp);
				if (result == null)
					result = caseLiteralExp(realLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(realLiteralExp);
				if (result == null)
					result = caseOCLExpression(realLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(realLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(realLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(realLiteralExp);
				if (result == null)
					result = caseTypedElement(realLiteralExp);
				if (result == null)
					result = caseVisitable(realLiteralExp);
				if (result == null)
					result = caseASTNode(realLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.STATE_EXP : {
				StateExp stateExp = (StateExp) theEObject;
				T result = caseStateExp(stateExp);
				if (result == null)
					result = caseOCLExpression(stateExp);
				if (result == null)
					result = caseExpressions_StateExp(stateExp);
				if (result == null)
					result = caseCDOTypedElement(stateExp);
				if (result == null)
					result = caseExpressions_OCLExpression(stateExp);
				if (result == null)
					result = caseTypedElement(stateExp);
				if (result == null)
					result = caseVisitable(stateExp);
				if (result == null)
					result = caseASTNode(stateExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.STRING_LITERAL_EXP : {
				StringLiteralExp stringLiteralExp = (StringLiteralExp) theEObject;
				T result = caseStringLiteralExp(stringLiteralExp);
				if (result == null)
					result = casePrimitiveLiteralExp(stringLiteralExp);
				if (result == null)
					result = caseExpressions_StringLiteralExp(stringLiteralExp);
				if (result == null)
					result = caseLiteralExp(stringLiteralExp);
				if (result == null)
					result = caseExpressions_PrimitiveLiteralExp(stringLiteralExp);
				if (result == null)
					result = caseOCLExpression(stringLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(stringLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(stringLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(stringLiteralExp);
				if (result == null)
					result = caseTypedElement(stringLiteralExp);
				if (result == null)
					result = caseVisitable(stringLiteralExp);
				if (result == null)
					result = caseASTNode(stringLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_LITERAL_EXP : {
				TupleLiteralExp tupleLiteralExp = (TupleLiteralExp) theEObject;
				T result = caseTupleLiteralExp(tupleLiteralExp);
				if (result == null)
					result = caseLiteralExp(tupleLiteralExp);
				if (result == null)
					result = caseExpressions_TupleLiteralExp(tupleLiteralExp);
				if (result == null)
					result = caseOCLExpression(tupleLiteralExp);
				if (result == null)
					result = caseExpressions_LiteralExp(tupleLiteralExp);
				if (result == null)
					result = caseCDOTypedElement(tupleLiteralExp);
				if (result == null)
					result = caseExpressions_OCLExpression(tupleLiteralExp);
				if (result == null)
					result = caseTypedElement(tupleLiteralExp);
				if (result == null)
					result = caseVisitable(tupleLiteralExp);
				if (result == null)
					result = caseASTNode(tupleLiteralExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_LITERAL_PART : {
				TupleLiteralPart tupleLiteralPart = (TupleLiteralPart) theEObject;
				T result = caseTupleLiteralPart(tupleLiteralPart);
				if (result == null)
					result = caseCDOTypedElement(tupleLiteralPart);
				if (result == null)
					result = caseExpressions_TupleLiteralPart(tupleLiteralPart);
				if (result == null)
					result = caseTypedElement(tupleLiteralPart);
				if (result == null)
					result = caseVisitable(tupleLiteralPart);
				if (result == null)
					result = caseTypedASTNode(tupleLiteralPart);
				if (result == null)
					result = caseASTNode(tupleLiteralPart);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TYPE_EXP : {
				TypeExp typeExp = (TypeExp) theEObject;
				T result = caseTypeExp(typeExp);
				if (result == null)
					result = caseOCLExpression(typeExp);
				if (result == null)
					result = caseExpressions_TypeExp(typeExp);
				if (result == null)
					result = caseCDOTypedElement(typeExp);
				if (result == null)
					result = caseExpressions_OCLExpression(typeExp);
				if (result == null)
					result = caseTypedElement(typeExp);
				if (result == null)
					result = caseVisitable(typeExp);
				if (result == null)
					result = caseASTNode(typeExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.UNSPECIFIED_VALUE_EXP : {
				UnspecifiedValueExp unspecifiedValueExp = (UnspecifiedValueExp) theEObject;
				T result = caseUnspecifiedValueExp(unspecifiedValueExp);
				if (result == null)
					result = caseOCLExpression(unspecifiedValueExp);
				if (result == null)
					result = caseExpressions_UnspecifiedValueExp(unspecifiedValueExp);
				if (result == null)
					result = caseCDOTypedElement(unspecifiedValueExp);
				if (result == null)
					result = caseExpressions_OCLExpression(unspecifiedValueExp);
				if (result == null)
					result = caseTypedASTNode(unspecifiedValueExp);
				if (result == null)
					result = caseTypedElement(unspecifiedValueExp);
				if (result == null)
					result = caseVisitable(unspecifiedValueExp);
				if (result == null)
					result = caseASTNode(unspecifiedValueExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.VARIABLE : {
				Variable variable = (Variable) theEObject;
				T result = caseVariable(variable);
				if (result == null)
					result = caseCDOTypedElement(variable);
				if (result == null)
					result = caseExpressions_Variable(variable);
				if (result == null)
					result = caseTypedElement(variable);
				if (result == null)
					result = caseVisitable(variable);
				if (result == null)
					result = caseTypedASTNode(variable);
				if (result == null)
					result = caseASTNode(variable);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.VARIABLE_EXP : {
				VariableExp variableExp = (VariableExp) theEObject;
				T result = caseVariableExp(variableExp);
				if (result == null)
					result = caseOCLExpression(variableExp);
				if (result == null)
					result = caseExpressions_VariableExp(variableExp);
				if (result == null)
					result = caseCDOTypedElement(variableExp);
				if (result == null)
					result = caseExpressions_OCLExpression(variableExp);
				if (result == null)
					result = caseTypedElement(variableExp);
				if (result == null)
					result = caseVisitable(variableExp);
				if (result == null)
					result = caseASTNode(variableExp);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default :
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Any Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyType(AnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Bag Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagType(BagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Element Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Invalid Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Invalid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidType(InvalidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Message Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Ordered Set Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Ordered Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedSetType(OrderedSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Primitive Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Sequence Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Set Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Tuple Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleType(TupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType(TypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Void Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Call Operation Action</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Constraint</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Send Signal Action</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Expression In OCL</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Expression In OCL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionInOCL(ExpressionInOCL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Association Class Call Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Association Class Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClassCallExp(AssociationClassCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Boolean Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Boolean Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralExp(BooleanLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Call Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExp(CallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Item</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionItem(CollectionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionLiteralExp(CollectionLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Literal Part</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Literal Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionLiteralPart(CollectionLiteralPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Range</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionRange(CollectionRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Enum Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Enum Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralExp(EnumLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Feature Call Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Feature Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCallExp(FeatureCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>If Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>If Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExp(IfExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Integer Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Integer Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteralExp(IntegerLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Unlimited Natural Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Unlimited Natural Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Invalid Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Invalid Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidLiteralExp(InvalidLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Iterate Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Iterate Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterateExp(IterateExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Iterator Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Iterator Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorExp(IteratorExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Let Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Let Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExp(LetExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExp(LiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Loop Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Loop Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopExp(LoopExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Message Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Message Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageExp(MessageExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Navigation Call Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Navigation Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationCallExp(NavigationCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Null Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Null Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteralExp(NullLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Numeric Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Numeric Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericLiteralExp(NumericLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Expression</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLExpression(OCLExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Operation Call Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Operation Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallExp(OperationCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Primitive Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Primitive Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveLiteralExp(PrimitiveLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Property Call Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Property Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCallExp(PropertyCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Real Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Real Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteralExp(RealLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>State Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>State Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateExp(StateExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>String Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>String Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteralExp(StringLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Tuple Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Tuple Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleLiteralExp(TupleLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Tuple Literal Part</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Tuple Literal Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleLiteralPart(TupleLiteralPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeExp(TypeExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Unspecified Value Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Unspecified Value Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnspecifiedValueExp(UnspecifiedValueExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableExp(VariableExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>CDO Classifier</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>CDO Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDOClassifier(CDOClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Predefined Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Predefined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O> T casePredefinedType(PredefinedType<O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Any Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O> T caseTypes_AnyType(org.eclipse.ocl.types.AnyType<O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>CDO Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>CDO Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDOType(CDOType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>AST Node</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode(ASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Typed AST Node</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Typed AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedASTNode(TypedASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseTypes_CollectionType(
			org.eclipse.ocl.types.CollectionType<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Bag Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseTypes_BagType(org.eclipse.ocl.types.BagType<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>CDO Class</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>CDO Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDOClass(CDOClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Element Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes_ElementType(org.eclipse.ocl.types.ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Invalid Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Invalid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O> T caseTypes_InvalidType(
			org.eclipse.ocl.types.InvalidType<O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Message Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O, P> T caseTypes_MessageType(
			org.eclipse.ocl.types.MessageType<C, O, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Ordered Set Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Ordered Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseTypes_OrderedSetType(
			org.eclipse.ocl.types.OrderedSetType<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Primitive Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O> T caseTypes_PrimitiveType(
			org.eclipse.ocl.types.PrimitiveType<O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Sequence Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseTypes_SequenceType(
			org.eclipse.ocl.types.SequenceType<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Set Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseTypes_SetType(org.eclipse.ocl.types.SetType<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Tuple Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O, P> T caseTypes_TupleType(
			org.eclipse.ocl.types.TupleType<O, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseTypes_TypeType(
			org.eclipse.ocl.types.TypeType<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Void Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O> T caseTypes_VoidType(org.eclipse.ocl.types.VoidType<O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>CDO Named Element</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>CDO Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDONamedElement(CDONamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Visitable</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitable(Visitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Expression In OCL</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Expression In OCL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseUtilities_ExpressionInOCL(
			org.eclipse.ocl.utilities.ExpressionInOCL<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>CDO Typed Element</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>CDO Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDOTypedElement(CDOTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Typed Element</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseTypedElement(TypedElement<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>OCL Expression</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>OCL Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_OCLExpression(
			org.eclipse.ocl.expressions.OCLExpression<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Calling AST Node</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Calling AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallingASTNode(CallingASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Call Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_CallExp(
			org.eclipse.ocl.expressions.CallExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Feature Call Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Feature Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_FeatureCallExp(
			org.eclipse.ocl.expressions.FeatureCallExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Navigation Call Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Navigation Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, P> T caseExpressions_NavigationCallExp(
			org.eclipse.ocl.expressions.NavigationCallExp<C, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Association Class Call Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Association Class Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, P> T caseExpressions_AssociationClassCallExp(
			org.eclipse.ocl.expressions.AssociationClassCallExp<C, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_LiteralExp(
			org.eclipse.ocl.expressions.LiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Primitive Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Primitive Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_PrimitiveLiteralExp(
			org.eclipse.ocl.expressions.PrimitiveLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Boolean Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Boolean Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_BooleanLiteralExp(
			org.eclipse.ocl.expressions.BooleanLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Literal Part</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Literal Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_CollectionLiteralPart(
			org.eclipse.ocl.expressions.CollectionLiteralPart<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Item</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_CollectionItem(
			org.eclipse.ocl.expressions.CollectionItem<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_CollectionLiteralExp(
			org.eclipse.ocl.expressions.CollectionLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Collection Range</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Collection Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_CollectionRange(
			org.eclipse.ocl.expressions.CollectionRange<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Enum Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Enum Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, EL> T caseExpressions_EnumLiteralExp(
			org.eclipse.ocl.expressions.EnumLiteralExp<C, EL> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>If Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>If Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_IfExp(
			org.eclipse.ocl.expressions.IfExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Numeric Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Numeric Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_NumericLiteralExp(
			org.eclipse.ocl.expressions.NumericLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Integer Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Integer Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_IntegerLiteralExp(
			org.eclipse.ocl.expressions.IntegerLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Unlimited Natural Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Unlimited Natural Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_UnlimitedNaturalLiteralExp(
			org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Invalid Literal Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Invalid Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_InvalidLiteralExp(
			org.eclipse.ocl.expressions.InvalidLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Loop Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Loop Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseExpressions_LoopExp(
			org.eclipse.ocl.expressions.LoopExp<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Iterate Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Iterate Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseExpressions_IterateExp(
			org.eclipse.ocl.expressions.IterateExp<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Iterator Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Iterator Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseExpressions_IteratorExp(
			org.eclipse.ocl.expressions.IteratorExp<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Let Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Let Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseExpressions_LetExp(
			org.eclipse.ocl.expressions.LetExp<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Message Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Message Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, COA, SSA> T caseExpressions_MessageExp(
			org.eclipse.ocl.expressions.MessageExp<C, COA, SSA> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Null Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Null Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_NullLiteralExp(
			org.eclipse.ocl.expressions.NullLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Operation Call Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Operation Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, O> T caseExpressions_OperationCallExp(
			org.eclipse.ocl.expressions.OperationCallExp<C, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Property Call Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Property Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, P> T caseExpressions_PropertyCallExp(
			org.eclipse.ocl.expressions.PropertyCallExp<C, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Real Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Real Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_RealLiteralExp(
			org.eclipse.ocl.expressions.RealLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>State Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>State Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, S> T caseExpressions_StateExp(
			org.eclipse.ocl.expressions.StateExp<C, S> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>String Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>String Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_StringLiteralExp(
			org.eclipse.ocl.expressions.StringLiteralExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Tuple Literal Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Tuple Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, P> T caseExpressions_TupleLiteralExp(
			org.eclipse.ocl.expressions.TupleLiteralExp<C, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Tuple Literal Part</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Tuple Literal Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, P> T caseExpressions_TupleLiteralPart(
			org.eclipse.ocl.expressions.TupleLiteralPart<C, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type Exp</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_TypeExp(
			org.eclipse.ocl.expressions.TypeExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Unspecified Value Exp</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Unspecified Value Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseExpressions_UnspecifiedValueExp(
			org.eclipse.ocl.expressions.UnspecifiedValueExp<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseExpressions_Variable(
			org.eclipse.ocl.expressions.Variable<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Exp</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C, PM> T caseExpressions_VariableExp(
			org.eclipse.ocl.expressions.VariableExp<C, PM> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // OCLSwitch
