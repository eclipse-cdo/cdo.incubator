/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakeFactoryImpl.java,v 1.2 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake.impl;

import org.eclipse.emf.cdo.common.fake.CDOClass;
import org.eclipse.emf.cdo.common.fake.CDOEnumLiteral;
import org.eclipse.emf.cdo.common.fake.CDOOperation;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.fake.CDORevision;
import org.eclipse.emf.cdo.common.fake.CDOType;
import org.eclipse.emf.cdo.common.fake.FakeFactory;
import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class FakeFactoryImpl
		extends EFactoryImpl
		implements FakeFactory {

	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	public static FakeFactory init() {
    try
    {
      FakeFactory theFakeFactory = (FakeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ocl/2.0.0/CDO/Fake"); 
      if (theFakeFactory != null)
      {
        return theFakeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FakeFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	public FakeFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case FakePackage.CDO_REVISION: return createCDORevision();
      case FakePackage.CDO_CLASS: return createCDOClass();
      case FakePackage.CDO_TYPE: return createCDOType();
      case FakePackage.CDO_ENUM_LITERAL: return createCDOEnumLiteral();
      case FakePackage.CDO_OPERATION: return createCDOOperation();
      case FakePackage.CDO_PARAMETER: return createCDOParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDORevision createCDORevision() {
    CDORevisionImpl cdoRevision = new CDORevisionImpl();
    return cdoRevision;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOClass createCDOClass() {
    CDOClassImpl cdoClass = new CDOClassImpl();
    return cdoClass;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDOType createCDOType()
  {
    CDOTypeImpl cdoType = new CDOTypeImpl();
    return cdoType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOEnumLiteral createCDOEnumLiteral() {
    CDOEnumLiteralImpl cdoEnumLiteral = new CDOEnumLiteralImpl();
    return cdoEnumLiteral;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOOperation createCDOOperation() {
    CDOOperationImpl cdoOperation = new CDOOperationImpl();
    return cdoOperation;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public CDOParameter createCDOParameter() {
    CDOParameterImpl cdoParameter = new CDOParameterImpl();
    return cdoParameter;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public FakePackage getFakePackage() {
    return (FakePackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static FakePackage getPackage() {
    return FakePackage.eINSTANCE;
  }

} // FakeFactoryImpl
