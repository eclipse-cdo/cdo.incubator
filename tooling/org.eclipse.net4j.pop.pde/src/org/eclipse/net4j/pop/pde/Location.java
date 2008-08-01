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
 * $Id: Location.java,v 1.2 2008-08-01 08:15:04 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Location</b></em>', and utility
 * methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getLocation()
 * @model
 * @generated
 */
public enum Location implements Enumerator
{
  /**
   * The '<em><b>WORKSPACE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #WORKSPACE_VALUE
   * @generated
   * @ordered
   */
  WORKSPACE(0, "WORKSPACE", "WORKSPACE"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>EXTERNAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #EXTERNAL_VALUE
   * @generated
   * @ordered
   */
  EXTERNAL(1, "EXTERNAL", "EXTERNAL"); //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>WORKSPACE</b></em>' literal value. <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WORKSPACE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @see #WORKSPACE
   * @model
   * @generated
   * @ordered
   */
  public static final int WORKSPACE_VALUE = 0;

  /**
   * The '<em><b>EXTERNAL</b></em>' literal value. <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXTERNAL</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @see #EXTERNAL
   * @model
   * @generated
   * @ordered
   */
  public static final int EXTERNAL_VALUE = 1;

  /**
   * An array of all the '<em><b>Location</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final Location[] VALUES_ARRAY = new Location[] { WORKSPACE, EXTERNAL, };

  /**
   * A public read-only list of all the '<em><b>Location</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<Location> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Location</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static Location get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Location result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Location</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  public static Location getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Location result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Location</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static Location get(int value)
  {
    switch (value)
    {
    case WORKSPACE_VALUE:
      return WORKSPACE;
    case EXTERNAL_VALUE:
      return EXTERNAL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Location(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }

} // Location
