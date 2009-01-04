/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakePackageImpl.java,v 1.1 2009-01-04 17:56:37 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake.impl;

import org.eclipse.emf.cdo.common.fake.CDOClass;
import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDODataType;
import org.eclipse.emf.cdo.common.fake.CDOEnumLiteral;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.CDONamedElement;
import org.eclipse.emf.cdo.common.fake.CDOOperation;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.fake.CDORevision;
import org.eclipse.emf.cdo.common.fake.CDOTypedElement;
import org.eclipse.emf.cdo.common.fake.FakeFactory;
import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.cdo.common.ocl.OCLPackage;
import org.eclipse.emf.cdo.common.ocl.impl.OCLPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.types.TypesPackage;
import org.eclipse.ocl.utilities.UtilitiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class FakePackageImpl
		extends EPackageImpl
		implements FakePackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoRevisionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoFeatureEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoClassEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoClassifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoOperationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdoTypedElementEClass = null;

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
	 * @see org.eclipse.emf.cdo.common.fake.FakePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FakePackageImpl() {
		super(eNS_URI, FakeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends. Simple dependencies are
	 * satisfied by calling this method on all dependent packages before doing
	 * anything else. This method drives initialization for interdependent
	 * packages directly, in parallel with this package, itself.
	 * <p>
	 * Of this package and its interdependencies, all packages which have not
	 * yet been registered by their URI values are first created and registered.
	 * The packages are then initialized in two steps: meta-model objects for
	 * all of the packages are created before any are initialized, since one
	 * package's meta-model objects may refer to those of another.
	 * <p>
	 * Invocation of this method will not affect any packages that have already
	 * been initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FakePackage init() {
		if (isInited)
			return (FakePackage) EPackage.Registry.INSTANCE
				.getEPackage(FakePackage.eNS_URI);

		// Obtain or create and register package
		FakePackageImpl theFakePackage = (FakePackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(eNS_URI) instanceof FakePackageImpl
			? EPackage.Registry.INSTANCE.getEPackage(eNS_URI)
			: new FakePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();
		UtilitiesPackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OCLPackageImpl theOCLPackage = (OCLPackageImpl) (EPackage.Registry.INSTANCE
			.getEPackage(OCLPackage.eNS_URI) instanceof OCLPackageImpl
			? EPackage.Registry.INSTANCE.getEPackage(OCLPackage.eNS_URI)
			: OCLPackage.eINSTANCE);

		// Create package meta-data objects
		theFakePackage.createPackageContents();
		theOCLPackage.createPackageContents();

		// Initialize created meta-data
		theFakePackage.initializePackageContents();
		theOCLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFakePackage.freeze();

		return theFakePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDORevision() {
		return cdoRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOFeature() {
		return cdoFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOClass() {
		return cdoClassEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOClassifier() {
		return cdoClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDODataType() {
		return cdoDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOEnumLiteral() {
		return cdoEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDONamedElement() {
		return cdoNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOOperation() {
		return cdoOperationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOParameter() {
		return cdoParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDOTypedElement() {
		return cdoTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FakeFactory getFakeFactory() {
		return (FakeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cdoRevisionEClass = createEClass(CDO_REVISION);

		cdoFeatureEClass = createEClass(CDO_FEATURE);

		cdoClassEClass = createEClass(CDO_CLASS);

		cdoClassifierEClass = createEClass(CDO_CLASSIFIER);

		cdoDataTypeEClass = createEClass(CDO_DATA_TYPE);

		cdoEnumLiteralEClass = createEClass(CDO_ENUM_LITERAL);

		cdoNamedElementEClass = createEClass(CDO_NAMED_ELEMENT);

		cdoOperationEClass = createEClass(CDO_OPERATION);

		cdoParameterEClass = createEClass(CDO_PARAMETER);

		cdoTypedElementEClass = createEClass(CDO_TYPED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cdoRevisionEClass, CDORevision.class, "CDORevision",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoFeatureEClass, CDOFeature.class, "CDOFeature",
			IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoClassEClass, CDOClass.class, "CDOClass", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoClassifierEClass, CDOClassifier.class, "CDOClassifier",
			IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoDataTypeEClass, CDODataType.class, "CDODataType",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoEnumLiteralEClass, CDOEnumLiteral.class,
			"CDOEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoNamedElementEClass, CDONamedElement.class,
			"CDONamedElement", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoOperationEClass, CDOOperation.class, "CDOOperation",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoParameterEClass, CDOParameter.class, "CDOParameter",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoTypedElementEClass, CDOTypedElement.class,
			"CDOTypedElement", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // FakePackageImpl
