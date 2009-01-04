/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakePackage.java,v 1.2 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.common.fake.FakeFactory
 * @model kind="package"
 * @generated
 */
public interface FakePackage
		extends EPackage {

	/**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "fake";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.eclipse.org/ocl/2.0.0/CDO/Fake";

	/**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "ocl.cdo.fake";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	FakePackage eINSTANCE = org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.fake.impl.CDORevisionImpl
	 * <em>CDO Revision</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.fake.impl.CDORevisionImpl
	 * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDORevision()
	 * @generated
	 */
	int CDO_REVISION = 0;

	/**
   * The number of structural features of the '<em>CDO Revision</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_REVISION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.fake.impl.CDOFeatureImpl
	 * <em>CDO Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.fake.impl.CDOFeatureImpl
	 * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOFeature()
	 * @generated
	 */
	int CDO_FEATURE = 1;

	/**
   * The number of structural features of the '<em>CDO Feature</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_FEATURE_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOClassImpl <em>CDO Class</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.common.fake.impl.CDOClassImpl
   * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOClass()
   * @generated
   */
	int CDO_CLASS = 2;

	/**
	 * The number of structural features of the '<em>CDO Class</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDO_CLASS_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOClassifierImpl <em>CDO Classifier</em>}' class.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see org.eclipse.emf.cdo.common.fake.impl.CDOClassifierImpl
   * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOClassifier()
   * @generated
   */
	int CDO_CLASSIFIER = 3;

	/**
   * The number of structural features of the '<em>CDO Classifier</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_CLASSIFIER_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOTypeImpl <em>CDO Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.common.fake.impl.CDOTypeImpl
   * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOType()
   * @generated
   */
  int CDO_TYPE = 4;

  /**
   * The number of structural features of the '<em>CDO Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDO_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOEnumLiteralImpl <em>CDO Enum Literal</em>}' class.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see org.eclipse.emf.cdo.common.fake.impl.CDOEnumLiteralImpl
   * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOEnumLiteral()
   * @generated
   */
	int CDO_ENUM_LITERAL = 5;

	/**
   * The number of structural features of the '<em>CDO Enum Literal</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_ENUM_LITERAL_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDONamedElementImpl <em>CDO Named Element</em>}' class.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see org.eclipse.emf.cdo.common.fake.impl.CDONamedElementImpl
   * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDONamedElement()
   * @generated
   */
	int CDO_NAMED_ELEMENT = 6;

	/**
   * The number of structural features of the '<em>CDO Named Element</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.fake.impl.CDOOperationImpl
	 * <em>CDO Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.fake.impl.CDOOperationImpl
	 * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOOperation()
	 * @generated
	 */
	int CDO_OPERATION = 7;

	/**
   * The number of structural features of the '<em>CDO Operation</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.cdo.common.fake.impl.CDOParameterImpl
	 * <em>CDO Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.cdo.common.fake.impl.CDOParameterImpl
	 * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOParameter()
	 * @generated
	 */
	int CDO_PARAMETER = 8;

	/**
   * The number of structural features of the '<em>CDO Parameter</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_PARAMETER_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOTypedElementImpl <em>CDO Typed Element</em>}' class.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see org.eclipse.emf.cdo.common.fake.impl.CDOTypedElementImpl
   * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOTypedElement()
   * @generated
   */
	int CDO_TYPED_ELEMENT = 9;

	/**
   * The number of structural features of the '<em>CDO Typed Element</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CDO_TYPED_ELEMENT_FEATURE_COUNT = 0;

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDORevision <em>CDO Revision</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Revision</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDORevision
   * @generated
   */
	EClass getCDORevision();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDOFeature <em>CDO Feature</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Feature</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDOFeature
   * @generated
   */
	EClass getCDOFeature();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDOClass <em>CDO Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Class</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDOClass
   * @generated
   */
	EClass getCDOClass();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDOClassifier <em>CDO Classifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Classifier</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDOClassifier
   * @generated
   */
	EClass getCDOClassifier();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDOType <em>CDO Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Type</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDOType
   * @generated
   */
  EClass getCDOType();

  /**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOEnumLiteral
	 * <em>CDO Enum Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>CDO Enum Literal</em>'.
	 * @see org.eclipse.emf.cdo.common.fake.CDOEnumLiteral
	 * @generated
	 */
	EClass getCDOEnumLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDONamedElement
	 * <em>CDO Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>CDO Named Element</em>'.
	 * @see org.eclipse.emf.cdo.common.fake.CDONamedElement
	 * @generated
	 */
	EClass getCDONamedElement();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDOOperation <em>CDO Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Operation</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDOOperation
   * @generated
   */
	EClass getCDOOperation();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.common.fake.CDOParameter <em>CDO Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CDO Parameter</em>'.
   * @see org.eclipse.emf.cdo.common.fake.CDOParameter
   * @generated
   */
	EClass getCDOParameter();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOTypedElement
	 * <em>CDO Typed Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>CDO Typed Element</em>'.
	 * @see org.eclipse.emf.cdo.common.fake.CDOTypedElement
	 * @generated
	 */
	EClass getCDOTypedElement();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FakeFactory getFakeFactory();

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
   * @generated
   */
	interface Literals {

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDORevisionImpl <em>CDO Revision</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDORevisionImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDORevision()
     * @generated
     */
		EClass CDO_REVISION = eINSTANCE.getCDORevision();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOFeatureImpl <em>CDO Feature</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOFeatureImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOFeature()
     * @generated
     */
		EClass CDO_FEATURE = eINSTANCE.getCDOFeature();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.cdo.common.fake.impl.CDOClassImpl
		 * <em>CDO Class</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.emf.cdo.common.fake.impl.CDOClassImpl
		 * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOClass()
		 * @generated
		 */
		EClass CDO_CLASS = eINSTANCE.getCDOClass();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOClassifierImpl <em>CDO Classifier</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOClassifierImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOClassifier()
     * @generated
     */
		EClass CDO_CLASSIFIER = eINSTANCE.getCDOClassifier();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOTypeImpl <em>CDO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOTypeImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOType()
     * @generated
     */
    EClass CDO_TYPE = eINSTANCE.getCDOType();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOEnumLiteralImpl <em>CDO Enum Literal</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOEnumLiteralImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOEnumLiteral()
     * @generated
     */
		EClass CDO_ENUM_LITERAL = eINSTANCE.getCDOEnumLiteral();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDONamedElementImpl <em>CDO Named Element</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDONamedElementImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDONamedElement()
     * @generated
     */
		EClass CDO_NAMED_ELEMENT = eINSTANCE.getCDONamedElement();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOOperationImpl <em>CDO Operation</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOOperationImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOOperation()
     * @generated
     */
		EClass CDO_OPERATION = eINSTANCE.getCDOOperation();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOParameterImpl <em>CDO Parameter</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOParameterImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOParameter()
     * @generated
     */
		EClass CDO_PARAMETER = eINSTANCE.getCDOParameter();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.common.fake.impl.CDOTypedElementImpl <em>CDO Typed Element</em>}' class.
     * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
     * @see org.eclipse.emf.cdo.common.fake.impl.CDOTypedElementImpl
     * @see org.eclipse.emf.cdo.common.fake.impl.FakePackageImpl#getCDOTypedElement()
     * @generated
     */
		EClass CDO_TYPED_ELEMENT = eINSTANCE.getCDOTypedElement();

	}

} // FakePackage
