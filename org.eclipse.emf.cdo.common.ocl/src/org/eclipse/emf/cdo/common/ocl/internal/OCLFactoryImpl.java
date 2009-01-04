/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
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
 * $Id: OCLFactoryImpl.java,v 1.2 2009-01-04 17:56:36 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.internal;

import java.util.List;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.CDOOperation;
import org.eclipse.emf.cdo.common.ocl.BagType;
import org.eclipse.emf.cdo.common.ocl.CollectionType;
import org.eclipse.emf.cdo.common.ocl.MessageType;
import org.eclipse.emf.cdo.common.ocl.OCLFactory;
import org.eclipse.emf.cdo.common.ocl.OrderedSetType;
import org.eclipse.emf.cdo.common.ocl.SequenceType;
import org.eclipse.emf.cdo.common.ocl.SetType;
import org.eclipse.emf.cdo.common.ocl.TupleType;
import org.eclipse.emf.cdo.common.ocl.impl.TypeTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.IterateExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.MessageExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.RealLiteralExp;
import org.eclipse.ocl.expressions.StateExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.utilities.TypedElement;
import org.eclipse.ocl.utilities.UMLReflection;

/**
 * Implementation of the {@link OCLFactory} API for the Ecore binding.
 * 
 * @author Christian W. Damus (cdamus)
 */
@SuppressWarnings("unchecked")
public class OCLFactoryImpl
		implements OCLFactory {

	public static OCLFactory INSTANCE = new OCLFactoryImpl();

	private OCLFactoryImpl() {
		super();
	}

	public <C, O> org.eclipse.ocl.types.BagType<C, O> createBagType(
			C elementType) {
		BagType result = OCLFactory.eINSTANCE.createBagType();
		result.setElementType((CDOClassifier) elementType);

		return (org.eclipse.ocl.types.BagType<C, O>) result;
	}

	public <C, O> org.eclipse.ocl.types.OrderedSetType<C, O> createOrderedSetType(
			C elementType) {
		OrderedSetType result = OCLFactory.eINSTANCE.createOrderedSetType();
		result.setElementType((CDOClassifier) elementType);

		return (org.eclipse.ocl.types.OrderedSetType<C, O>) result;
	}

	public <C, O> org.eclipse.ocl.types.SequenceType<C, O> createSequenceType(
			C elementType) {
		SequenceType result = OCLFactory.eINSTANCE.createSequenceType();
		result.setElementType((CDOClassifier) elementType);

		return (org.eclipse.ocl.types.SequenceType<C, O>) result;
	}

	public <C, O> org.eclipse.ocl.types.SetType<C, O> createSetType(
			C elementType) {
		SetType result = OCLFactory.eINSTANCE.createSetType();
		result.setElementType((CDOClassifier) elementType);

		return (org.eclipse.ocl.types.SetType<C, O>) result;
	}

	public <C, O> org.eclipse.ocl.types.CollectionType<C, O> createCollectionType(
			C elementType) {
		CollectionType result = OCLFactory.eINSTANCE.createCollectionType();
		result.setElementType((CDOClassifier) elementType);

		return (org.eclipse.ocl.types.CollectionType<C, O>) result;
	}

	public <C, O> org.eclipse.ocl.types.CollectionType<C, O> createCollectionType(
			CollectionKind kind, C elementType) {
		switch (kind) {
			case BAG_LITERAL :
				return createBagType(elementType);
			case SET_LITERAL :
				return createSetType(elementType);
			case SEQUENCE_LITERAL :
				return createSequenceType(elementType);
			case ORDERED_SET_LITERAL :
				return createOrderedSetType(elementType);
			default :
				return createCollectionType(elementType);
		}
	}

	public <C, O, P> org.eclipse.ocl.types.MessageType<C, O, P> createOperationMessageType(
			O operation) {
		MessageType result = OCLFactory.eINSTANCE.createMessageType();
		result.setReferredOperation((CDOOperation) operation);
		result.oclProperties(); // ensure that the structural features are
								// created
		return (org.eclipse.ocl.types.MessageType<C, O, P>) result;
	}

	public <C, O, P> org.eclipse.ocl.types.MessageType<C, O, P> createSignalMessageType(
			C signal) {
		MessageType result = OCLFactory.eINSTANCE.createMessageType();
		result.setReferredSignal((CDOClassifier) signal);
		result.oclProperties(); // ensure that the structural features are
								// created
		return (org.eclipse.ocl.types.MessageType<C, O, P>) result;
	}

	public <C, O, P> org.eclipse.ocl.types.TupleType<O, P> createTupleType(
			List<? extends TypedElement<C>> parts) {
		TupleType result = OCLFactory.eINSTANCE.createTupleType();

		if (!parts.isEmpty()) {
			Environment<?, C, O, P, ?, ?, ?, ?, ?, ?, ?, ?> env = Environment.Registry.INSTANCE
				.getEnvironmentFor(parts.get(0));
			UMLReflection<?, C, O, P, ?, ?, ?, ?, ?, ?> uml = env
				.getUMLReflection();

			EList<CDOFeature> properties = result.oclProperties();

			for (TypedElement<C> part : parts) {
				properties.add((CDOFeature) uml.createProperty(part.getName(),
					part.getType()));
			}
		}

		return (org.eclipse.ocl.types.TupleType<O, P>) result;
	}

	public <C, O> org.eclipse.ocl.types.TypeType<C, O> createTypeType(C type) {
		return (org.eclipse.ocl.types.TypeType<C, O>) TypeTypeImpl
			.createTypeType((CDOClassifier) type);
	}

	public <C, P> AssociationClassCallExp<C, P> createAssociationClassCallExp() {
		return (AssociationClassCallExp<C, P>) OCLFactory.eINSTANCE
			.createAssociationClassCallExp();
	}

	public <C> BooleanLiteralExp<C> createBooleanLiteralExp() {
		return (BooleanLiteralExp<C>) OCLFactory.eINSTANCE
			.createBooleanLiteralExp();
	}

	public <C> CollectionItem<C> createCollectionItem() {
		return (CollectionItem<C>) OCLFactory.eINSTANCE.createCollectionItem();
	}

	public <C> CollectionLiteralExp<C> createCollectionLiteralExp() {
		return (CollectionLiteralExp<C>) OCLFactory.eINSTANCE
			.createCollectionLiteralExp();
	}

	public <C> CollectionRange<C> createCollectionRange() {
		return (CollectionRange<C>) OCLFactory.eINSTANCE
			.createCollectionRange();
	}

	public <C, EL> EnumLiteralExp<C, EL> createEnumLiteralExp() {
		return (EnumLiteralExp<C, EL>) OCLFactory.eINSTANCE
			.createEnumLiteralExp();
	}

	public <C> IfExp<C> createIfExp() {
		return (IfExp<C>) OCLFactory.eINSTANCE.createIfExp();
	}

	public <C> IntegerLiteralExp<C> createIntegerLiteralExp() {
		return (IntegerLiteralExp<C>) OCLFactory.eINSTANCE
			.createIntegerLiteralExp();
	}

	public <C> InvalidLiteralExp<C> createInvalidLiteralExp() {
		return (InvalidLiteralExp<C>) OCLFactory.eINSTANCE
			.createInvalidLiteralExp();
	}

	public <C, PM> IterateExp<C, PM> createIterateExp() {
		return (IterateExp<C, PM>) OCLFactory.eINSTANCE.createIterateExp();
	}

	public <C, PM> IteratorExp<C, PM> createIteratorExp() {
		return (IteratorExp<C, PM>) OCLFactory.eINSTANCE.createIteratorExp();
	}

	public <C, PM> LetExp<C, PM> createLetExp() {
		return (LetExp<C, PM>) OCLFactory.eINSTANCE.createLetExp();
	}

	public <C, COA, SSA> MessageExp<C, COA, SSA> createMessageExp() {
		return (MessageExp<C, COA, SSA>) OCLFactory.eINSTANCE
			.createMessageExp();
	}

	public <C> NullLiteralExp<C> createNullLiteralExp() {
		return (NullLiteralExp<C>) OCLFactory.eINSTANCE.createNullLiteralExp();
	}

	public <C, O> OperationCallExp<C, O> createOperationCallExp() {
		return (OperationCallExp<C, O>) OCLFactory.eINSTANCE
			.createOperationCallExp();
	}

	public <C, P> PropertyCallExp<C, P> createPropertyCallExp() {
		return (PropertyCallExp<C, P>) OCLFactory.eINSTANCE
			.createPropertyCallExp();
	}

	public <C> RealLiteralExp<C> createRealLiteralExp() {
		return (RealLiteralExp<C>) OCLFactory.eINSTANCE.createRealLiteralExp();
	}

	public <C, S> StateExp<C, S> createStateExp() {
		return (StateExp<C, S>) OCLFactory.eINSTANCE.createStateExp();
	}

	public <C> StringLiteralExp<C> createStringLiteralExp() {
		return (StringLiteralExp<C>) OCLFactory.eINSTANCE
			.createStringLiteralExp();
	}

	public <C, P> TupleLiteralExp<C, P> createTupleLiteralExp() {
		return (TupleLiteralExp<C, P>) OCLFactory.eINSTANCE
			.createTupleLiteralExp();
	}

	public <C, P> TupleLiteralPart<C, P> createTupleLiteralPart() {
		return (TupleLiteralPart<C, P>) OCLFactory.eINSTANCE
			.createTupleLiteralPart();
	}

	public <C> TypeExp<C> createTypeExp() {
		return (TypeExp<C>) OCLFactory.eINSTANCE.createTypeExp();
	}

	public <C> UnlimitedNaturalLiteralExp<C> createUnlimitedNaturalLiteralExp() {
		return (UnlimitedNaturalLiteralExp<C>) OCLFactory.eINSTANCE
			.createUnlimitedNaturalLiteralExp();
	}

	public <C> UnspecifiedValueExp<C> createUnspecifiedValueExp() {
		return (UnspecifiedValueExp<C>) OCLFactory.eINSTANCE
			.createUnspecifiedValueExp();
	}

	public <C, PM> Variable<C, PM> createVariable() {
		return (Variable<C, PM>) OCLFactory.eINSTANCE.createVariable();
	}

	public <C, PM> VariableExp<C, PM> createVariableExp() {
		return (VariableExp<C, PM>) OCLFactory.eINSTANCE.createVariableExp();
	}
}
