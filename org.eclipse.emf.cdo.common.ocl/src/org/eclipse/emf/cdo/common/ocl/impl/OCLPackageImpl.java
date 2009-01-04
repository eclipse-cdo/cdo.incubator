/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation and others.
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
 * $Id: OCLPackageImpl.java,v 1.2 2009-01-04 19:26:02 estepper Exp $
 */
package org.eclipse.emf.cdo.common.ocl.impl;

import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl;
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
import org.eclipse.emf.cdo.common.ocl.OCLFactory;
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
import org.eclipse.emf.cdo.common.ocl.util.OCLValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.impl.ExpressionsPackageImpl;
import org.eclipse.ocl.types.TypesPackage;
import org.eclipse.ocl.utilities.UtilitiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OCLPackageImpl
		extends EPackageImpl
		implements OCLPackage {

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass anyTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass bagTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass collectionTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass elementTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass invalidTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass messageTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass orderedSetTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass primitiveTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass sequenceTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass setTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass tupleTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass typeTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass voidTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass callOperationActionEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass constraintEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass sendSignalActionEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass expressionInOCLEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass associationClassCallExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass booleanLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass callExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass collectionItemEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass collectionLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass collectionLiteralPartEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass collectionRangeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass enumLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass featureCallExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass ifExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass integerLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass unlimitedNaturalLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass invalidLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass iterateExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass iteratorExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass letExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass literalExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass loopExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass messageExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass navigationCallExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass nullLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass numericLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass oclExpressionEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass operationCallExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass primitiveLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass propertyCallExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass realLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass stateExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass stringLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass tupleLiteralExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass tupleLiteralPartEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass typeExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass unspecifiedValueExpEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass variableEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass variableExpEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.cdo.common.ocl.OCLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OCLPackageImpl() {
    super(eNS_URI, OCLFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static OCLPackage init() {
    if (isInited) return (OCLPackage)EPackage.Registry.INSTANCE.getEPackage(OCLPackage.eNS_URI);

    // Obtain or create and register package
    OCLPackageImpl theOCLPackage = (OCLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OCLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OCLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();
    UtilitiesPackage.eINSTANCE.eClass();
    ExpressionsPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    FakePackageImpl theFakePackage = (FakePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FakePackage.eNS_URI) instanceof FakePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FakePackage.eNS_URI) : FakePackage.eINSTANCE);

    // Create package meta-data objects
    theOCLPackage.createPackageContents();
    theFakePackage.createPackageContents();

    // Initialize created meta-data
    theOCLPackage.initializePackageContents();
    theFakePackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theOCLPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return OCLValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theOCLPackage.freeze();

    return theOCLPackage;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnyType() {
    return anyTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getBagType() {
    return bagTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectionType() {
    return collectionTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getElementType() {
    return elementTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getInvalidType() {
    return invalidTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getMessageType() {
    return messageTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getOrderedSetType() {
    return orderedSetTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getPrimitiveType() {
    return primitiveTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getSequenceType() {
    return sequenceTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getSetType() {
    return setTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getTupleType() {
    return tupleTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getTypeType() {
    return typeTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getVoidType() {
    return voidTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCallOperationAction() {
    return callOperationActionEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference getCallOperationAction_Operation() {
    return (EReference)callOperationActionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getConstraint() {
    return constraintEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference getConstraint_Specification() {
    return (EReference)constraintEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference getConstraint_ConstrainedElements() {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getConstraint_Stereotype() {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getSendSignalAction() {
    return sendSignalActionEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference getSendSignalAction_Signal() {
    return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getExpressionInOCL() {
    return expressionInOCLEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getAssociationClassCallExp() {
    return associationClassCallExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getBooleanLiteralExp() {
    return booleanLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCallExp() {
    return callExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectionItem() {
    return collectionItemEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectionLiteralExp() {
    return collectionLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectionLiteralPart() {
    return collectionLiteralPartEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectionRange() {
    return collectionRangeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getEnumLiteralExp() {
    return enumLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getFeatureCallExp() {
    return featureCallExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getIfExp() {
    return ifExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getIntegerLiteralExp() {
    return integerLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getUnlimitedNaturalLiteralExp() {
    return unlimitedNaturalLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getInvalidLiteralExp() {
    return invalidLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getIterateExp() {
    return iterateExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getIteratorExp() {
    return iteratorExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getLetExp() {
    return letExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getLiteralExp() {
    return literalExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getLoopExp() {
    return loopExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getMessageExp() {
    return messageExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getNavigationCallExp() {
    return navigationCallExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getNullLiteralExp() {
    return nullLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getNumericLiteralExp() {
    return numericLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getOCLExpression() {
    return oclExpressionEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getOperationCallExp() {
    return operationCallExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getPrimitiveLiteralExp() {
    return primitiveLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getPropertyCallExp() {
    return propertyCallExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getRealLiteralExp() {
    return realLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getStateExp() {
    return stateExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getStringLiteralExp() {
    return stringLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getTupleLiteralExp() {
    return tupleLiteralExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getTupleLiteralPart() {
    return tupleLiteralPartEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getTypeExp() {
    return typeExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getUnspecifiedValueExp() {
    return unspecifiedValueExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getVariable() {
    return variableEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass getVariableExp() {
    return variableExpEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public OCLFactory getOCLFactory() {
    return (OCLFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    anyTypeEClass = createEClass(ANY_TYPE);

    bagTypeEClass = createEClass(BAG_TYPE);

    collectionTypeEClass = createEClass(COLLECTION_TYPE);

    elementTypeEClass = createEClass(ELEMENT_TYPE);

    invalidTypeEClass = createEClass(INVALID_TYPE);

    messageTypeEClass = createEClass(MESSAGE_TYPE);

    orderedSetTypeEClass = createEClass(ORDERED_SET_TYPE);

    primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

    sequenceTypeEClass = createEClass(SEQUENCE_TYPE);

    setTypeEClass = createEClass(SET_TYPE);

    tupleTypeEClass = createEClass(TUPLE_TYPE);

    typeTypeEClass = createEClass(TYPE_TYPE);

    voidTypeEClass = createEClass(VOID_TYPE);

    callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);
    createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__OPERATION);

    constraintEClass = createEClass(CONSTRAINT);
    createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);
    createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_ELEMENTS);
    createEAttribute(constraintEClass, CONSTRAINT__STEREOTYPE);

    sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
    createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);

    expressionInOCLEClass = createEClass(EXPRESSION_IN_OCL);

    associationClassCallExpEClass = createEClass(ASSOCIATION_CLASS_CALL_EXP);

    booleanLiteralExpEClass = createEClass(BOOLEAN_LITERAL_EXP);

    callExpEClass = createEClass(CALL_EXP);

    collectionItemEClass = createEClass(COLLECTION_ITEM);

    collectionLiteralExpEClass = createEClass(COLLECTION_LITERAL_EXP);

    collectionLiteralPartEClass = createEClass(COLLECTION_LITERAL_PART);

    collectionRangeEClass = createEClass(COLLECTION_RANGE);

    enumLiteralExpEClass = createEClass(ENUM_LITERAL_EXP);

    featureCallExpEClass = createEClass(FEATURE_CALL_EXP);

    ifExpEClass = createEClass(IF_EXP);

    integerLiteralExpEClass = createEClass(INTEGER_LITERAL_EXP);

    unlimitedNaturalLiteralExpEClass = createEClass(UNLIMITED_NATURAL_LITERAL_EXP);

    invalidLiteralExpEClass = createEClass(INVALID_LITERAL_EXP);

    iterateExpEClass = createEClass(ITERATE_EXP);

    iteratorExpEClass = createEClass(ITERATOR_EXP);

    letExpEClass = createEClass(LET_EXP);

    literalExpEClass = createEClass(LITERAL_EXP);

    loopExpEClass = createEClass(LOOP_EXP);

    messageExpEClass = createEClass(MESSAGE_EXP);

    navigationCallExpEClass = createEClass(NAVIGATION_CALL_EXP);

    nullLiteralExpEClass = createEClass(NULL_LITERAL_EXP);

    numericLiteralExpEClass = createEClass(NUMERIC_LITERAL_EXP);

    oclExpressionEClass = createEClass(OCL_EXPRESSION);

    operationCallExpEClass = createEClass(OPERATION_CALL_EXP);

    primitiveLiteralExpEClass = createEClass(PRIMITIVE_LITERAL_EXP);

    propertyCallExpEClass = createEClass(PROPERTY_CALL_EXP);

    realLiteralExpEClass = createEClass(REAL_LITERAL_EXP);

    stateExpEClass = createEClass(STATE_EXP);

    stringLiteralExpEClass = createEClass(STRING_LITERAL_EXP);

    tupleLiteralExpEClass = createEClass(TUPLE_LITERAL_EXP);

    tupleLiteralPartEClass = createEClass(TUPLE_LITERAL_PART);

    typeExpEClass = createEClass(TYPE_EXP);

    unspecifiedValueExpEClass = createEClass(UNSPECIFIED_VALUE_EXP);

    variableEClass = createEClass(VARIABLE);

    variableExpEClass = createEClass(VARIABLE_EXP);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <p>
	 * The generated implementation is extended by adding me as a child of the
	 * empty root <tt>OCL</tt> package.
	 * </p>
	 */
	public void initializePackageContents() {
		if (!isInitialized) {
			// create my own resource first, before adding me to my parent
			// package. Otherwise, I will already be in a resource when
			// createResource() is called, and it will not create a new one
			initializePackageContentsGen();

			ExpressionsPackageImpl.OCL_ROOT_PACKAGE.getESubpackages().add(this);
		}
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContentsGen() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    FakePackage theFakePackage = (FakePackage)EPackage.Registry.INSTANCE.getEPackage(FakePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    UtilitiesPackage theUtilitiesPackage = (UtilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(UtilitiesPackage.eNS_URI);
    ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    EGenericType g1 = createEGenericType(theFakePackage.getCDOClassifier());
    anyTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getAnyType());
    EGenericType g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    anyTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollectionType());
    bagTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getBagType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    bagTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOType());
    collectionTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getCollectionType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    collectionTypeEClass.getEGenericSuperTypes().add(g1);
    elementTypeEClass.getESuperTypes().add(theFakePackage.getCDOClass());
    elementTypeEClass.getESuperTypes().add(theTypesPackage.getElementType());
    g1 = createEGenericType(theFakePackage.getCDOClassifier());
    invalidTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getInvalidType());
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    invalidTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOClass());
    messageTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getMessageType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    messageTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollectionType());
    orderedSetTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getOrderedSetType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    orderedSetTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOType());
    primitiveTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getPrimitiveType());
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    primitiveTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollectionType());
    sequenceTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getSequenceType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    sequenceTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollectionType());
    setTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getSetType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    setTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOClass());
    tupleTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOType());
    tupleTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getTupleType());
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    tupleTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOClassifier());
    typeTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getTypeType());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    typeTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOClassifier());
    voidTypeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theTypesPackage.getVoidType());
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    voidTypeEClass.getEGenericSuperTypes().add(g1);
    constraintEClass.getESuperTypes().add(theFakePackage.getCDONamedElement());
    g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    expressionInOCLEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getNavigationCallExp());
    associationClassCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getAssociationClassCallExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    associationClassCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getPrimitiveLiteralExp());
    booleanLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getBooleanLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    booleanLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    callExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getCallExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    callExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollectionLiteralPart());
    collectionItemEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getCollectionItem());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    collectionItemEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLiteralExp());
    collectionLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getCollectionLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    collectionLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOTypedElement());
    collectionLiteralPartEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getCollectionLiteralPart());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    collectionLiteralPartEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollectionLiteralPart());
    collectionRangeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getCollectionRange());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    collectionRangeEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLiteralExp());
    enumLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getEnumLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOEnumLiteral());
    g1.getETypeArguments().add(g2);
    enumLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCallExp());
    featureCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getFeatureCallExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    featureCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    ifExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getIfExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    ifExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getNumericLiteralExp());
    integerLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getIntegerLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    integerLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getNumericLiteralExp());
    unlimitedNaturalLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getUnlimitedNaturalLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    unlimitedNaturalLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLiteralExp());
    invalidLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getInvalidLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    invalidLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLoopExp());
    iterateExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getIterateExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    iterateExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLoopExp());
    iteratorExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getIteratorExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    iteratorExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    letExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getLetExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    letExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    literalExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    literalExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCallExp());
    loopExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getLoopExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    loopExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    messageExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getMessageExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(this.getCallOperationAction());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(this.getSendSignalAction());
    g1.getETypeArguments().add(g2);
    messageExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getFeatureCallExp());
    navigationCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getNavigationCallExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    navigationCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLiteralExp());
    nullLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getNullLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    nullLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getPrimitiveLiteralExp());
    numericLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getNumericLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    numericLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOTypedElement());
    oclExpressionEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getOCLExpression());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    oclExpressionEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getFeatureCallExp());
    operationCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getOperationCallExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOOperation());
    g1.getETypeArguments().add(g2);
    operationCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLiteralExp());
    primitiveLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getPrimitiveLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    primitiveLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getNavigationCallExp());
    propertyCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getPropertyCallExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    propertyCallExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getNumericLiteralExp());
    realLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getRealLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    realLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    stateExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getStateExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDORevision());
    g1.getETypeArguments().add(g2);
    stateExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getPrimitiveLiteralExp());
    stringLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getStringLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    stringLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getLiteralExp());
    tupleLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getTupleLiteralExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    tupleLiteralExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOTypedElement());
    tupleLiteralPartEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getTupleLiteralPart());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOFeature());
    g1.getETypeArguments().add(g2);
    tupleLiteralPartEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    typeExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getTypeExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    typeExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    unspecifiedValueExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getUnspecifiedValueExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    unspecifiedValueExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theFakePackage.getCDOTypedElement());
    variableEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getVariable());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    variableEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOCLExpression());
    variableExpEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(theExpressionsPackage.getVariableExp());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    variableExpEClass.getEGenericSuperTypes().add(g1);

    // Initialize classes and features; add operations and parameters
    initEClass(anyTypeEClass, AnyType.class, "AnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bagTypeEClass, BagType.class, "BagType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(invalidTypeEClass, InvalidType.class, "InvalidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orderedSetTypeEClass, OrderedSetType.class, "OrderedSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeTypeEClass, TypeType.class, "TypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallOperationAction_Operation(), theFakePackage.getCDOOperation(), null, "operation", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
    g2 = createEGenericType(theFakePackage.getCDOClassifier());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(theFakePackage.getCDOParameter());
    g1.getETypeArguments().add(g2);
    initEReference(getConstraint_Specification(), g1, null, "specification", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_ConstrainedElements(), theFakePackage.getCDONamedElement(), null, "constrainedElements", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_Stereotype(), ecorePackage.getEString(), "stereotype", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSendSignalAction_Signal(), theFakePackage.getCDOClass(), null, "signal", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionInOCLEClass, ExpressionInOCL.class, "ExpressionInOCL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(associationClassCallExpEClass, AssociationClassCallExp.class, "AssociationClassCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanLiteralExpEClass, BooleanLiteralExp.class, "BooleanLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callExpEClass, CallExp.class, "CallExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionItemEClass, CollectionItem.class, "CollectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionLiteralExpEClass, CollectionLiteralExp.class, "CollectionLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionLiteralPartEClass, CollectionLiteralPart.class, "CollectionLiteralPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionRangeEClass, CollectionRange.class, "CollectionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumLiteralExpEClass, EnumLiteralExp.class, "EnumLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureCallExpEClass, FeatureCallExp.class, "FeatureCallExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifExpEClass, IfExp.class, "IfExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerLiteralExpEClass, IntegerLiteralExp.class, "IntegerLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unlimitedNaturalLiteralExpEClass, UnlimitedNaturalLiteralExp.class, "UnlimitedNaturalLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(invalidLiteralExpEClass, InvalidLiteralExp.class, "InvalidLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iterateExpEClass, IterateExp.class, "IterateExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iteratorExpEClass, IteratorExp.class, "IteratorExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(letExpEClass, LetExp.class, "LetExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalExpEClass, LiteralExp.class, "LiteralExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loopExpEClass, LoopExp.class, "LoopExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(messageExpEClass, MessageExp.class, "MessageExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(navigationCallExpEClass, NavigationCallExp.class, "NavigationCallExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullLiteralExpEClass, NullLiteralExp.class, "NullLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericLiteralExpEClass, NumericLiteralExp.class, "NumericLiteralExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclExpressionEClass, OCLExpression.class, "OCLExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationCallExpEClass, OperationCallExp.class, "OperationCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveLiteralExpEClass, PrimitiveLiteralExp.class, "PrimitiveLiteralExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyCallExpEClass, PropertyCallExp.class, "PropertyCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(realLiteralExpEClass, RealLiteralExp.class, "RealLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateExpEClass, StateExp.class, "StateExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLiteralExpEClass, StringLiteralExp.class, "StringLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tupleLiteralExpEClass, TupleLiteralExp.class, "TupleLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tupleLiteralPartEClass, TupleLiteralPart.class, "TupleLiteralPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeExpEClass, TypeExp.class, "TypeExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unspecifiedValueExpEClass, UnspecifiedValueExp.class, "UnspecifiedValueExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableExpEClass, VariableExp.class, "VariableExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

	/**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEcoreAnnotations() {
    String source = "http://www.eclipse.org/emf/2002/Ecore";		
    addAnnotation
      (anyTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (collectionTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (elementTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (invalidTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (messageTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (primitiveTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (tupleTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (typeTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (voidTypeEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName WellFormedInstanceTypeName"
       });		
    addAnnotation
      (constraintEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName"
       });			
    addAnnotation
      (collectionLiteralPartEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName"
       });			
    addAnnotation
      (oclExpressionEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName"
       });		
    addAnnotation
      (tupleLiteralPartEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName"
       });		
    addAnnotation
      (variableEClass, 
       source, 
       new String[] 
       {
       "constraints", "WellFormedName"
       });
  }

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";												
    addAnnotation
      (expressionInOCLEClass, 
       source, 
       new String[] 
       {
       "name", "ExpressionInOcl"
       });			
    addAnnotation
      (oclExpressionEClass, 
       source, 
       new String[] 
       {
       "name", "OclExpression"
       });			
  }

} // OCLPackageImpl
