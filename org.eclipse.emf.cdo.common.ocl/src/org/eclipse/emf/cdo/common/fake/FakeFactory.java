/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakeFactory.java,v 1.1 2009-01-04 17:56:37 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.cdo.common.fake.FakePackage
 * @generated
 */
public interface FakeFactory
		extends EFactory {

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	FakeFactory eINSTANCE = org.eclipse.emf.cdo.common.fake.impl.FakeFactoryImpl
		.init();

	/**
	 * Returns a new object of class '<em>CDO Revision</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>CDO Revision</em>'.
	 * @generated
	 */
	CDORevision createCDORevision();

	/**
	 * Returns a new object of class '<em>CDO Class</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>CDO Class</em>'.
	 * @generated
	 */
	CDOClass createCDOClass();

	/**
	 * Returns a new object of class '<em>CDO Data Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>CDO Data Type</em>'.
	 * @generated
	 */
	CDODataType createCDODataType();

	/**
	 * Returns a new object of class '<em>CDO Enum Literal</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>CDO Enum Literal</em>'.
	 * @generated
	 */
	CDOEnumLiteral createCDOEnumLiteral();

	/**
	 * Returns a new object of class '<em>CDO Operation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>CDO Operation</em>'.
	 * @generated
	 */
	CDOOperation createCDOOperation();

	/**
	 * Returns a new object of class '<em>CDO Parameter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>CDO Parameter</em>'.
	 * @generated
	 */
	CDOParameter createCDOParameter();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	FakePackage getFakePackage();

} // FakeFactory
