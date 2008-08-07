/**
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *
 * $Id: CheckoutState.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Checkout State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.pop.PopPackage#getCheckoutState()
 * @model
 * @generated
 */
public enum CheckoutState implements Enumerator
{
  /**
   * The '<em><b>Initial</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIAL_VALUE
   * @generated
   * @ordered
   */
  INITIAL(0, "Initial", "Initial"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>Specified</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECIFIED_VALUE
   * @generated
   * @ordered
   */
  SPECIFIED(1, "Specified", "Specified"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>Available</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVAILABLE_VALUE
   * @generated
   * @ordered
   */
  AVAILABLE(2, "Available", "Available"); //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>Initial</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Initial</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INITIAL
   * @model name="Initial"
   * @generated
   * @ordered
   */
  public static final int INITIAL_VALUE = 0;

  /**
   * The '<em><b>Specified</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Specified</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPECIFIED
   * @model name="Specified"
   * @generated
   * @ordered
   */
  public static final int SPECIFIED_VALUE = 1;

  /**
   * The '<em><b>Available</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Available</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVAILABLE
   * @model name="Available"
   * @generated
   * @ordered
   */
  public static final int AVAILABLE_VALUE = 2;

  /**
   * An array of all the '<em><b>Checkout State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CheckoutState[] VALUES_ARRAY = new CheckoutState[] { INITIAL, SPECIFIED, AVAILABLE, };

  /**
   * A public read-only list of all the '<em><b>Checkout State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CheckoutState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Checkout State</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CheckoutState get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CheckoutState result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Checkout State</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CheckoutState getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CheckoutState result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Checkout State</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CheckoutState get(int value)
  {
    switch (value)
    {
    case INITIAL_VALUE:
      return INITIAL;
    case SPECIFIED_VALUE:
      return SPECIFIED;
    case AVAILABLE_VALUE:
      return AVAILABLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private CheckoutState(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }

} //CheckoutState
