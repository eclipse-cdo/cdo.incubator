/**
 * <copyright>
 * </copyright>
 *
 * $Id: CDOFeatureImpl.java,v 1.2 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake.impl;

import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>CDO Feature</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CDOFeatureImpl
		extends EObjectImpl
		implements CDOFeature {

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected CDOFeatureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return FakePackage.Literals.CDO_FEATURE;
  }

} // CDOFeatureImpl
