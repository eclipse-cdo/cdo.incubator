/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakeSwitch.java,v 1.2 2009-01-04 19:26:03 estepper Exp $
 */
package org.eclipse.emf.cdo.common.fake.util;

import java.util.List;

import org.eclipse.emf.cdo.common.fake.CDOClass;
import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOEnumLiteral;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.CDONamedElement;
import org.eclipse.emf.cdo.common.fake.CDOOperation;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.fake.CDORevision;
import org.eclipse.emf.cdo.common.fake.CDOType;
import org.eclipse.emf.cdo.common.fake.CDOTypedElement;
import org.eclipse.emf.cdo.common.fake.FakePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.common.fake.FakePackage
 * @generated
 */
public class FakeSwitch<T> {

	/**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected static FakePackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	public FakeSwitch() {
    if (modelPackage == null)
    {
      modelPackage = FakePackage.eINSTANCE;
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case FakePackage.CDO_REVISION:
      {
        CDORevision cdoRevision = (CDORevision)theEObject;
        T result = caseCDORevision(cdoRevision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_FEATURE:
      {
        CDOFeature cdoFeature = (CDOFeature)theEObject;
        T result = caseCDOFeature(cdoFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_CLASS:
      {
        CDOClass cdoClass = (CDOClass)theEObject;
        T result = caseCDOClass(cdoClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_CLASSIFIER:
      {
        CDOClassifier cdoClassifier = (CDOClassifier)theEObject;
        T result = caseCDOClassifier(cdoClassifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_TYPE:
      {
        CDOType cdoType = (CDOType)theEObject;
        T result = caseCDOType(cdoType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_ENUM_LITERAL:
      {
        CDOEnumLiteral cdoEnumLiteral = (CDOEnumLiteral)theEObject;
        T result = caseCDOEnumLiteral(cdoEnumLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_NAMED_ELEMENT:
      {
        CDONamedElement cdoNamedElement = (CDONamedElement)theEObject;
        T result = caseCDONamedElement(cdoNamedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_OPERATION:
      {
        CDOOperation cdoOperation = (CDOOperation)theEObject;
        T result = caseCDOOperation(cdoOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_PARAMETER:
      {
        CDOParameter cdoParameter = (CDOParameter)theEObject;
        T result = caseCDOParameter(cdoParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FakePackage.CDO_TYPED_ELEMENT:
      {
        CDOTypedElement cdoTypedElement = (CDOTypedElement)theEObject;
        T result = caseCDOTypedElement(cdoTypedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Revision</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Revision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDORevision(CDORevision object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Feature</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOFeature(CDOFeature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Class</em>'.
   * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOClass(CDOClass object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Classifier</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOClassifier(CDOClassifier object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDOType(CDOType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CDO Enum Literal</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Enum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOEnumLiteral(CDOEnumLiteral object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Named Element</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDONamedElement(CDONamedElement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Operation</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOOperation(CDOOperation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Parameter</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOParameter(CDOParameter object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>CDO Typed Element</em>'.
   * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDO Typed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDOTypedElement(CDOTypedElement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	public T defaultCase(EObject object) {
    return null;
  }

} // FakeSwitch
