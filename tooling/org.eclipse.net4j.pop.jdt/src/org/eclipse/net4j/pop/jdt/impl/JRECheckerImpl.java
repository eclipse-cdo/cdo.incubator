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
 * $Id: JRECheckerImpl.java,v 1.2 2008-08-01 08:14:55 estepper Exp $
 */
package org.eclipse.net4j.pop.jdt.impl;

import org.eclipse.net4j.pop.jdt.JDTPackage;
import org.eclipse.net4j.pop.jdt.JREChecker;
import org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>JRE Checker</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class JRECheckerImpl extends WorkspaceConfiguratorImpl implements JREChecker
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected JRECheckerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JDTPackage.Literals.JRE_CHECKER;
  }

} // JRECheckerImpl
