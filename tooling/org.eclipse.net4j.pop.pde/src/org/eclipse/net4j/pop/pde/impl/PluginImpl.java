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
 * $Id: PluginImpl.java,v 1.3 2008-08-05 14:47:44 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.Plugin;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Plugin</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PluginImpl extends PluginEntityImpl implements Plugin
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PluginImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDEPackage.Literals.PLUGIN;
  }

} // PluginImpl
