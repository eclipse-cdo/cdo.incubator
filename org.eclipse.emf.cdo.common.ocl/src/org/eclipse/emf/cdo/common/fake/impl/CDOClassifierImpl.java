/**
 * <copyright>
 * </copyright>
 *
 * $Id: CDOClassifierImpl.java,v 1.2 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake.impl;

import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>CDO Classifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CDOClassifierImpl
		extends EObjectImpl
		implements CDOClassifier {

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected CDOClassifierImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return FakePackage.Literals.CDO_CLASSIFIER;
  }

} // CDOClassifierImpl
