/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakeAdapterFactory.java,v 1.1 2009-01-04 17:56:37 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake.util;

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
import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.eclipse.emf.cdo.common.fake.FakePackage
 * @generated
 */
public class FakeAdapterFactory
		extends AdapterFactoryImpl {

	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static FakePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public FakeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FakePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
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
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FakeSwitch<Adapter> modelSwitch = new FakeSwitch<Adapter>() {

		@Override
		public Adapter caseCDORevision(CDORevision object) {
			return createCDORevisionAdapter();
		}

		@Override
		public Adapter caseCDOFeature(CDOFeature object) {
			return createCDOFeatureAdapter();
		}

		@Override
		public Adapter caseCDOClass(CDOClass object) {
			return createCDOClassAdapter();
		}

		@Override
		public Adapter caseCDOClassifier(CDOClassifier object) {
			return createCDOClassifierAdapter();
		}

		@Override
		public Adapter caseCDODataType(CDODataType object) {
			return createCDODataTypeAdapter();
		}

		@Override
		public Adapter caseCDOEnumLiteral(CDOEnumLiteral object) {
			return createCDOEnumLiteralAdapter();
		}

		@Override
		public Adapter caseCDONamedElement(CDONamedElement object) {
			return createCDONamedElementAdapter();
		}

		@Override
		public Adapter caseCDOOperation(CDOOperation object) {
			return createCDOOperationAdapter();
		}

		@Override
		public Adapter caseCDOParameter(CDOParameter object) {
			return createCDOParameterAdapter();
		}

		@Override
		public Adapter caseCDOTypedElement(CDOTypedElement object) {
			return createCDOTypedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDORevision <em>CDO Revision</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDORevision
	 * @generated
	 */
	public Adapter createCDORevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOFeature <em>CDO Feature</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOFeature
	 * @generated
	 */
	public Adapter createCDOFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOClass <em>CDO Class</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOClass
	 * @generated
	 */
	public Adapter createCDOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOClassifier
	 * <em>CDO Classifier</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOClassifier
	 * @generated
	 */
	public Adapter createCDOClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDODataType
	 * <em>CDO Data Type</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDODataType
	 * @generated
	 */
	public Adapter createCDODataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOEnumLiteral
	 * <em>CDO Enum Literal</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOEnumLiteral
	 * @generated
	 */
	public Adapter createCDOEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDONamedElement
	 * <em>CDO Named Element</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDONamedElement
	 * @generated
	 */
	public Adapter createCDONamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOOperation
	 * <em>CDO Operation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOOperation
	 * @generated
	 */
	public Adapter createCDOOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOParameter
	 * <em>CDO Parameter</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOParameter
	 * @generated
	 */
	public Adapter createCDOParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.emf.cdo.common.fake.CDOTypedElement
	 * <em>CDO Typed Element</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.emf.cdo.common.fake.CDOTypedElement
	 * @generated
	 */
	public Adapter createCDOTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // FakeAdapterFactory
