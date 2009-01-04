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
 * $Id: EcoreAdapterFactory.java,v 1.1 2009-01-04 15:49:08 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.util;

import org.eclipse.emf.cdo.common.ocl.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.ocl.utilities.ASTNode;
import org.eclipse.ocl.utilities.CallingASTNode;
import org.eclipse.ocl.utilities.PredefinedType;
import org.eclipse.ocl.utilities.TypedASTNode;
import org.eclipse.ocl.utilities.TypedElement;
import org.eclipse.ocl.utilities.Visitable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.common.ocl.EcorePackage
 * @generated
 */
public class EcoreAdapterFactory
		extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreSwitch<Adapter> modelSwitch = new EcoreSwitch<Adapter>() {

		@Override
		public Adapter caseAnyType(AnyType object) {
			return createAnyTypeAdapter();
		}

		@Override
		public Adapter caseBagType(BagType object) {
			return createBagTypeAdapter();
		}

		@Override
		public Adapter caseCollectionType(CollectionType object) {
			return createCollectionTypeAdapter();
		}

		@Override
		public Adapter caseElementType(ElementType object) {
			return createElementTypeAdapter();
		}

		@Override
		public Adapter caseInvalidType(InvalidType object) {
			return createInvalidTypeAdapter();
		}

		@Override
		public Adapter caseMessageType(MessageType object) {
			return createMessageTypeAdapter();
		}

		@Override
		public Adapter caseOrderedSetType(OrderedSetType object) {
			return createOrderedSetTypeAdapter();
		}

		@Override
		public Adapter casePrimitiveType(PrimitiveType object) {
			return createPrimitiveTypeAdapter();
		}

		@Override
		public Adapter caseSequenceType(SequenceType object) {
			return createSequenceTypeAdapter();
		}

		@Override
		public Adapter caseSetType(SetType object) {
			return createSetTypeAdapter();
		}

		@Override
		public Adapter caseTupleType(TupleType object) {
			return createTupleTypeAdapter();
		}

		@Override
		public Adapter caseTypeType(TypeType object) {
			return createTypeTypeAdapter();
		}

		@Override
		public Adapter caseVoidType(VoidType object) {
			return createVoidTypeAdapter();
		}

		@Override
		public Adapter caseCallOperationAction(CallOperationAction object) {
			return createCallOperationActionAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseSendSignalAction(SendSignalAction object) {
			return createSendSignalActionAdapter();
		}

		@Override
		public Adapter caseExpressionInOCL(ExpressionInOCL object) {
			return createExpressionInOCLAdapter();
		}

		@Override
		public Adapter caseAssociationClassCallExp(
				AssociationClassCallExp object) {
			return createAssociationClassCallExpAdapter();
		}

		@Override
		public Adapter caseBooleanLiteralExp(BooleanLiteralExp object) {
			return createBooleanLiteralExpAdapter();
		}

		@Override
		public Adapter caseCallExp(CallExp object) {
			return createCallExpAdapter();
		}

		@Override
		public Adapter caseCollectionItem(CollectionItem object) {
			return createCollectionItemAdapter();
		}

		@Override
		public Adapter caseCollectionLiteralExp(CollectionLiteralExp object) {
			return createCollectionLiteralExpAdapter();
		}

		@Override
		public Adapter caseCollectionLiteralPart(CollectionLiteralPart object) {
			return createCollectionLiteralPartAdapter();
		}

		@Override
		public Adapter caseCollectionRange(CollectionRange object) {
			return createCollectionRangeAdapter();
		}

		@Override
		public Adapter caseEnumLiteralExp(EnumLiteralExp object) {
			return createEnumLiteralExpAdapter();
		}

		@Override
		public Adapter caseFeatureCallExp(FeatureCallExp object) {
			return createFeatureCallExpAdapter();
		}

		@Override
		public Adapter caseIfExp(IfExp object) {
			return createIfExpAdapter();
		}

		@Override
		public Adapter caseIntegerLiteralExp(IntegerLiteralExp object) {
			return createIntegerLiteralExpAdapter();
		}

		@Override
		public Adapter caseUnlimitedNaturalLiteralExp(
				UnlimitedNaturalLiteralExp object) {
			return createUnlimitedNaturalLiteralExpAdapter();
		}

		@Override
		public Adapter caseInvalidLiteralExp(InvalidLiteralExp object) {
			return createInvalidLiteralExpAdapter();
		}

		@Override
		public Adapter caseIterateExp(IterateExp object) {
			return createIterateExpAdapter();
		}

		@Override
		public Adapter caseIteratorExp(IteratorExp object) {
			return createIteratorExpAdapter();
		}

		@Override
		public Adapter caseLetExp(LetExp object) {
			return createLetExpAdapter();
		}

		@Override
		public Adapter caseLiteralExp(LiteralExp object) {
			return createLiteralExpAdapter();
		}

		@Override
		public Adapter caseLoopExp(LoopExp object) {
			return createLoopExpAdapter();
		}

		@Override
		public Adapter caseMessageExp(MessageExp object) {
			return createMessageExpAdapter();
		}

		@Override
		public Adapter caseNavigationCallExp(NavigationCallExp object) {
			return createNavigationCallExpAdapter();
		}

		@Override
		public Adapter caseNullLiteralExp(NullLiteralExp object) {
			return createNullLiteralExpAdapter();
		}

		@Override
		public Adapter caseNumericLiteralExp(NumericLiteralExp object) {
			return createNumericLiteralExpAdapter();
		}

		@Override
		public Adapter caseOCLExpression(OCLExpression object) {
			return createOCLExpressionAdapter();
		}

		@Override
		public Adapter caseOperationCallExp(OperationCallExp object) {
			return createOperationCallExpAdapter();
		}

		@Override
		public Adapter casePrimitiveLiteralExp(PrimitiveLiteralExp object) {
			return createPrimitiveLiteralExpAdapter();
		}

		@Override
		public Adapter casePropertyCallExp(PropertyCallExp object) {
			return createPropertyCallExpAdapter();
		}

		@Override
		public Adapter caseRealLiteralExp(RealLiteralExp object) {
			return createRealLiteralExpAdapter();
		}

		@Override
		public Adapter caseStateExp(StateExp object) {
			return createStateExpAdapter();
		}

		@Override
		public Adapter caseStringLiteralExp(StringLiteralExp object) {
			return createStringLiteralExpAdapter();
		}

		@Override
		public Adapter caseTupleLiteralExp(TupleLiteralExp object) {
			return createTupleLiteralExpAdapter();
		}

		@Override
		public Adapter caseTupleLiteralPart(TupleLiteralPart object) {
			return createTupleLiteralPartAdapter();
		}

		@Override
		public Adapter caseTypeExp(TypeExp object) {
			return createTypeExpAdapter();
		}

		@Override
		public Adapter caseUnspecifiedValueExp(UnspecifiedValueExp object) {
			return createUnspecifiedValueExpAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseVariableExp(VariableExp object) {
			return createVariableExpAdapter();
		}

		@Override
		public Adapter caseEModelElement(EModelElement object) {
			return createEModelElementAdapter();
		}

		@Override
		public Adapter caseENamedElement(ENamedElement object) {
			return createENamedElementAdapter();
		}

		@Override
		public Adapter caseEClassifier(EClassifier object) {
			return createEClassifierAdapter();
		}

		@Override
		public <O> Adapter casePredefinedType(PredefinedType<O> object) {
			return createPredefinedTypeAdapter();
		}

		@Override
		public <O> Adapter caseAnyType_1(org.eclipse.ocl.types.AnyType<O> object) {
			return createAnyType_1Adapter();
		}

		@Override
		public Adapter caseEDataType(EDataType object) {
			return createEDataTypeAdapter();
		}

		@Override
		public Adapter caseASTNode(ASTNode object) {
			return createASTNodeAdapter();
		}

		@Override
		public Adapter caseTypedASTNode(TypedASTNode object) {
			return createTypedASTNodeAdapter();
		}

		@Override
		public <C, O> Adapter caseCollectionType_1(
				org.eclipse.ocl.types.CollectionType<C, O> object) {
			return createCollectionType_1Adapter();
		}

		@Override
		public <C, O> Adapter caseBagType_1(
				org.eclipse.ocl.types.BagType<C, O> object) {
			return createBagType_1Adapter();
		}

		@Override
		public Adapter caseEClass(EClass object) {
			return createEClassAdapter();
		}

		@Override
		public Adapter caseElementType_1(
				org.eclipse.ocl.types.ElementType object) {
			return createElementType_1Adapter();
		}

		@Override
		public <O> Adapter caseInvalidType_1(
				org.eclipse.ocl.types.InvalidType<O> object) {
			return createInvalidType_1Adapter();
		}

		@Override
		public <C, O, P> Adapter caseMessageType_1(
				org.eclipse.ocl.types.MessageType<C, O, P> object) {
			return createMessageType_1Adapter();
		}

		@Override
		public <C, O> Adapter caseOrderedSetType_1(
				org.eclipse.ocl.types.OrderedSetType<C, O> object) {
			return createOrderedSetType_1Adapter();
		}

		@Override
		public <O> Adapter casePrimitiveType_1(
				org.eclipse.ocl.types.PrimitiveType<O> object) {
			return createPrimitiveType_1Adapter();
		}

		@Override
		public <C, O> Adapter caseSequenceType_1(
				org.eclipse.ocl.types.SequenceType<C, O> object) {
			return createSequenceType_1Adapter();
		}

		@Override
		public <C, O> Adapter caseSetType_1(
				org.eclipse.ocl.types.SetType<C, O> object) {
			return createSetType_1Adapter();
		}

		@Override
		public <O, P> Adapter caseTupleType_1(
				org.eclipse.ocl.types.TupleType<O, P> object) {
			return createTupleType_1Adapter();
		}

		@Override
		public <C, O> Adapter caseTypeType_1(
				org.eclipse.ocl.types.TypeType<C, O> object) {
			return createTypeType_1Adapter();
		}

		@Override
		public <O> Adapter caseVoidType_1(
				org.eclipse.ocl.types.VoidType<O> object) {
			return createVoidType_1Adapter();
		}

		@Override
		public Adapter caseVisitable(Visitable object) {
			return createVisitableAdapter();
		}

		@Override
		public <C, PM> Adapter caseExpressionInOCL_1(
				org.eclipse.ocl.utilities.ExpressionInOCL<C, PM> object) {
			return createExpressionInOCL_1Adapter();
		}

		@Override
		public Adapter caseETypedElement(ETypedElement object) {
			return createETypedElementAdapter();
		}

		@Override
		public <C> Adapter caseTypedElement(TypedElement<C> object) {
			return createTypedElementAdapter();
		}

		@Override
		public <C> Adapter caseOCLExpression_1(
				org.eclipse.ocl.expressions.OCLExpression<C> object) {
			return createOCLExpression_1Adapter();
		}

		@Override
		public Adapter caseCallingASTNode(CallingASTNode object) {
			return createCallingASTNodeAdapter();
		}

		@Override
		public <C> Adapter caseCallExp_1(
				org.eclipse.ocl.expressions.CallExp<C> object) {
			return createCallExp_1Adapter();
		}

		@Override
		public <C> Adapter caseFeatureCallExp_1(
				org.eclipse.ocl.expressions.FeatureCallExp<C> object) {
			return createFeatureCallExp_1Adapter();
		}

		@Override
		public <C, P> Adapter caseNavigationCallExp_1(
				org.eclipse.ocl.expressions.NavigationCallExp<C, P> object) {
			return createNavigationCallExp_1Adapter();
		}

		@Override
		public <C, P> Adapter caseAssociationClassCallExp_1(
				org.eclipse.ocl.expressions.AssociationClassCallExp<C, P> object) {
			return createAssociationClassCallExp_1Adapter();
		}

		@Override
		public <C> Adapter caseLiteralExp_1(
				org.eclipse.ocl.expressions.LiteralExp<C> object) {
			return createLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter casePrimitiveLiteralExp_1(
				org.eclipse.ocl.expressions.PrimitiveLiteralExp<C> object) {
			return createPrimitiveLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseBooleanLiteralExp_1(
				org.eclipse.ocl.expressions.BooleanLiteralExp<C> object) {
			return createBooleanLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseCollectionLiteralPart_1(
				org.eclipse.ocl.expressions.CollectionLiteralPart<C> object) {
			return createCollectionLiteralPart_1Adapter();
		}

		@Override
		public <C> Adapter caseCollectionItem_1(
				org.eclipse.ocl.expressions.CollectionItem<C> object) {
			return createCollectionItem_1Adapter();
		}

		@Override
		public <C> Adapter caseCollectionLiteralExp_1(
				org.eclipse.ocl.expressions.CollectionLiteralExp<C> object) {
			return createCollectionLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseCollectionRange_1(
				org.eclipse.ocl.expressions.CollectionRange<C> object) {
			return createCollectionRange_1Adapter();
		}

		@Override
		public <C, EL> Adapter caseEnumLiteralExp_1(
				org.eclipse.ocl.expressions.EnumLiteralExp<C, EL> object) {
			return createEnumLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseIfExp_1(
				org.eclipse.ocl.expressions.IfExp<C> object) {
			return createIfExp_1Adapter();
		}

		@Override
		public <C> Adapter caseNumericLiteralExp_1(
				org.eclipse.ocl.expressions.NumericLiteralExp<C> object) {
			return createNumericLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseIntegerLiteralExp_1(
				org.eclipse.ocl.expressions.IntegerLiteralExp<C> object) {
			return createIntegerLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseUnlimitedNaturalLiteralExp_1(
				org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp<C> object) {
			return createUnlimitedNaturalLiteralExp_1Adapter();
		}

		@Override
		public <C> Adapter caseInvalidLiteralExp_1(
				org.eclipse.ocl.expressions.InvalidLiteralExp<C> object) {
			return createInvalidLiteralExp_1Adapter();
		}

		@Override
		public <C, PM> Adapter caseLoopExp_1(
				org.eclipse.ocl.expressions.LoopExp<C, PM> object) {
			return createLoopExp_1Adapter();
		}

		@Override
		public <C, PM> Adapter caseIterateExp_1(
				org.eclipse.ocl.expressions.IterateExp<C, PM> object) {
			return createIterateExp_1Adapter();
		}

		@Override
		public <C, PM> Adapter caseIteratorExp_1(
				org.eclipse.ocl.expressions.IteratorExp<C, PM> object) {
			return createIteratorExp_1Adapter();
		}

		@Override
		public <C, PM> Adapter caseLetExp_1(
				org.eclipse.ocl.expressions.LetExp<C, PM> object) {
			return createLetExp_1Adapter();
		}

		@Override
		public <C, COA, SSA> Adapter caseMessageExp_1(
				org.eclipse.ocl.expressions.MessageExp<C, COA, SSA> object) {
			return createMessageExp_1Adapter();
		}

		@Override
		public <C> Adapter caseNullLiteralExp_1(
				org.eclipse.ocl.expressions.NullLiteralExp<C> object) {
			return createNullLiteralExp_1Adapter();
		}

		@Override
		public <C, O> Adapter caseOperationCallExp_1(
				org.eclipse.ocl.expressions.OperationCallExp<C, O> object) {
			return createOperationCallExp_1Adapter();
		}

		@Override
		public <C, P> Adapter casePropertyCallExp_1(
				org.eclipse.ocl.expressions.PropertyCallExp<C, P> object) {
			return createPropertyCallExp_1Adapter();
		}

		@Override
		public <C> Adapter caseRealLiteralExp_1(
				org.eclipse.ocl.expressions.RealLiteralExp<C> object) {
			return createRealLiteralExp_1Adapter();
		}

		@Override
		public <C, S> Adapter caseStateExp_1(
				org.eclipse.ocl.expressions.StateExp<C, S> object) {
			return createStateExp_1Adapter();
		}

		@Override
		public <C> Adapter caseStringLiteralExp_1(
				org.eclipse.ocl.expressions.StringLiteralExp<C> object) {
			return createStringLiteralExp_1Adapter();
		}

		@Override
		public <C, P> Adapter caseTupleLiteralExp_1(
				org.eclipse.ocl.expressions.TupleLiteralExp<C, P> object) {
			return createTupleLiteralExp_1Adapter();
		}

		@Override
		public <C, P> Adapter caseTupleLiteralPart_1(
				org.eclipse.ocl.expressions.TupleLiteralPart<C, P> object) {
			return createTupleLiteralPart_1Adapter();
		}

		@Override
		public <C> Adapter caseTypeExp_1(
				org.eclipse.ocl.expressions.TypeExp<C> object) {
			return createTypeExp_1Adapter();
		}

		@Override
		public <C> Adapter caseUnspecifiedValueExp_1(
				org.eclipse.ocl.expressions.UnspecifiedValueExp<C> object) {
			return createUnspecifiedValueExp_1Adapter();
		}

		@Override
		public <C, PM> Adapter caseVariable_1(
				org.eclipse.ocl.expressions.Variable<C, PM> object) {
			return createVariable_1Adapter();
		}

		@Override
		public <C, PM> Adapter caseVariableExp_1(
				org.eclipse.ocl.expressions.VariableExp<C, PM> object) {
			return createVariableExp_1Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.AnyType
	 * @generated
	 */
	public Adapter createAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.InvalidType
	 * @generated
	 */
	public Adapter createInvalidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.OrderedSetType
	 * @generated
	 */
	public Adapter createOrderedSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.TupleType
	 * @generated
	 */
	public Adapter createTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.TypeType
	 * @generated
	 */
	public Adapter createTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CallOperationAction
	 * @generated
	 */
	public Adapter createCallOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.SendSignalAction
	 * @generated
	 */
	public Adapter createSendSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.ExpressionInOCL <em>Expression In OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.ExpressionInOCL
	 * @generated
	 */
	public Adapter createExpressionInOCLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp <em>Association Class Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.AssociationClassCallExp
	 * @generated
	 */
	public Adapter createAssociationClassCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.BooleanLiteralExp
	 * @generated
	 */
	public Adapter createBooleanLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CallExp
	 * @generated
	 */
	public Adapter createCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionItem
	 * @generated
	 */
	public Adapter createCollectionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp <em>Collection Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionLiteralExp
	 * @generated
	 */
	public Adapter createCollectionLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CollectionLiteralPart <em>Collection Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionLiteralPart
	 * @generated
	 */
	public Adapter createCollectionLiteralPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.CollectionRange <em>Collection Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.CollectionRange
	 * @generated
	 */
	public Adapter createCollectionRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.EnumLiteralExp
	 * @generated
	 */
	public Adapter createEnumLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.FeatureCallExp <em>Feature Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.FeatureCallExp
	 * @generated
	 */
	public Adapter createFeatureCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.IfExp
	 * @generated
	 */
	public Adapter createIfExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.IntegerLiteralExp
	 * @generated
	 */
	public Adapter createIntegerLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.UnlimitedNaturalLiteralExp <em>Unlimited Natural Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.UnlimitedNaturalLiteralExp
	 * @generated
	 */
	public Adapter createUnlimitedNaturalLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp <em>Invalid Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.InvalidLiteralExp
	 * @generated
	 */
	public Adapter createInvalidLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.IterateExp
	 * @generated
	 */
	public Adapter createIterateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.IteratorExp
	 * @generated
	 */
	public Adapter createIteratorExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.LetExp
	 * @generated
	 */
	public Adapter createLetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.LiteralExp
	 * @generated
	 */
	public Adapter createLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.MessageExp <em>Message Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.MessageExp
	 * @generated
	 */
	public Adapter createMessageExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.NavigationCallExp <em>Navigation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.NavigationCallExp
	 * @generated
	 */
	public Adapter createNavigationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.NullLiteralExp <em>Null Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.NullLiteralExp
	 * @generated
	 */
	public Adapter createNullLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.NumericLiteralExp
	 * @generated
	 */
	public Adapter createNumericLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.OCLExpression <em>OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.OCLExpression
	 * @generated
	 */
	public Adapter createOCLExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.PrimitiveLiteralExp <em>Primitive Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.PrimitiveLiteralExp
	 * @generated
	 */
	public Adapter createPrimitiveLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.PropertyCallExp
	 * @generated
	 */
	public Adapter createPropertyCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.RealLiteralExp <em>Real Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.RealLiteralExp
	 * @generated
	 */
	public Adapter createRealLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.StateExp <em>State Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.StateExp
	 * @generated
	 */
	public Adapter createStateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.StringLiteralExp
	 * @generated
	 */
	public Adapter createStringLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.TupleLiteralExp <em>Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.TupleLiteralExp
	 * @generated
	 */
	public Adapter createTupleLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.TupleLiteralPart <em>Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.TupleLiteralPart
	 * @generated
	 */
	public Adapter createTupleLiteralPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.TypeExp <em>Type Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.TypeExp
	 * @generated
	 */
	public Adapter createTypeExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.UnspecifiedValueExp <em>Unspecified Value Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.UnspecifiedValueExp
	 * @generated
	 */
	public Adapter createUnspecifiedValueExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.cdo.common.ocl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.ocl.VariableExp
	 * @generated
	 */
	public Adapter createVariableExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EClassifier
	 * @generated
	 */
	public Adapter createEClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.PredefinedType
	 * @generated
	 */
	public Adapter createPredefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.AnyType
	 * @generated
	 */
	public Adapter createAnyType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EDataType
	 * @generated
	 */
	public Adapter createEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.ASTNode <em>AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.ASTNode
	 * @generated
	 */
	public Adapter createASTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.TypedASTNode <em>Typed AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.TypedASTNode
	 * @generated
	 */
	public Adapter createTypedASTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.CollectionType
	 * @generated
	 */
	public Adapter createCollectionType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.BagType
	 * @generated
	 */
	public Adapter createBagType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EClass
	 * @generated
	 */
	public Adapter createEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.ElementType
	 * @generated
	 */
	public Adapter createElementType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.InvalidType
	 * @generated
	 */
	public Adapter createInvalidType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.MessageType
	 * @generated
	 */
	public Adapter createMessageType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.OrderedSetType
	 * @generated
	 */
	public Adapter createOrderedSetType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.SequenceType
	 * @generated
	 */
	public Adapter createSequenceType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.SetType
	 * @generated
	 */
	public Adapter createSetType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.TupleType
	 * @generated
	 */
	public Adapter createTupleType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.TypeType
	 * @generated
	 */
	public Adapter createTypeType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.types.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.types.VoidType
	 * @generated
	 */
	public Adapter createVoidType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.Visitable <em>Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.Visitable
	 * @generated
	 */
	public Adapter createVisitableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.ExpressionInOCL <em>Expression In OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.ExpressionInOCL
	 * @generated
	 */
	public Adapter createExpressionInOCL_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ETypedElement
	 * @generated
	 */
	public Adapter createETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.OCLExpression <em>OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.OCLExpression
	 * @generated
	 */
	public Adapter createOCLExpression_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.CallingASTNode <em>Calling AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.utilities.CallingASTNode
	 * @generated
	 */
	public Adapter createCallingASTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.CallExp
	 * @generated
	 */
	public Adapter createCallExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.FeatureCallExp <em>Feature Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.FeatureCallExp
	 * @generated
	 */
	public Adapter createFeatureCallExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.NavigationCallExp <em>Navigation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.NavigationCallExp
	 * @generated
	 */
	public Adapter createNavigationCallExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.AssociationClassCallExp <em>Association Class Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.AssociationClassCallExp
	 * @generated
	 */
	public Adapter createAssociationClassCallExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.LiteralExp
	 * @generated
	 */
	public Adapter createLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.PrimitiveLiteralExp <em>Primitive Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.PrimitiveLiteralExp
	 * @generated
	 */
	public Adapter createPrimitiveLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.BooleanLiteralExp
	 * @generated
	 */
	public Adapter createBooleanLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.CollectionLiteralPart <em>Collection Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.CollectionLiteralPart
	 * @generated
	 */
	public Adapter createCollectionLiteralPart_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.CollectionItem
	 * @generated
	 */
	public Adapter createCollectionItem_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.CollectionLiteralExp <em>Collection Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.CollectionLiteralExp
	 * @generated
	 */
	public Adapter createCollectionLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.CollectionRange <em>Collection Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.CollectionRange
	 * @generated
	 */
	public Adapter createCollectionRange_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.EnumLiteralExp
	 * @generated
	 */
	public Adapter createEnumLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.IfExp
	 * @generated
	 */
	public Adapter createIfExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.NumericLiteralExp
	 * @generated
	 */
	public Adapter createNumericLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.IntegerLiteralExp
	 * @generated
	 */
	public Adapter createIntegerLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp <em>Unlimited Natural Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp
	 * @generated
	 */
	public Adapter createUnlimitedNaturalLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.InvalidLiteralExp <em>Invalid Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.InvalidLiteralExp
	 * @generated
	 */
	public Adapter createInvalidLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.LoopExp
	 * @generated
	 */
	public Adapter createLoopExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.IterateExp
	 * @generated
	 */
	public Adapter createIterateExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.IteratorExp
	 * @generated
	 */
	public Adapter createIteratorExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.LetExp
	 * @generated
	 */
	public Adapter createLetExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.MessageExp <em>Message Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.MessageExp
	 * @generated
	 */
	public Adapter createMessageExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.NullLiteralExp <em>Null Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.NullLiteralExp
	 * @generated
	 */
	public Adapter createNullLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.PropertyCallExp
	 * @generated
	 */
	public Adapter createPropertyCallExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.RealLiteralExp <em>Real Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.RealLiteralExp
	 * @generated
	 */
	public Adapter createRealLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.StateExp <em>State Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.StateExp
	 * @generated
	 */
	public Adapter createStateExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.StringLiteralExp
	 * @generated
	 */
	public Adapter createStringLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.TupleLiteralExp <em>Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.TupleLiteralExp
	 * @generated
	 */
	public Adapter createTupleLiteralExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.TupleLiteralPart <em>Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.TupleLiteralPart
	 * @generated
	 */
	public Adapter createTupleLiteralPart_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.TypeExp <em>Type Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.TypeExp
	 * @generated
	 */
	public Adapter createTypeExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.UnspecifiedValueExp <em>Unspecified Value Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.UnspecifiedValueExp
	 * @generated
	 */
	public Adapter createUnspecifiedValueExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.Variable
	 * @generated
	 */
	public Adapter createVariable_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.expressions.VariableExp
	 * @generated
	 */
	public Adapter createVariableExp_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcoreAdapterFactory
