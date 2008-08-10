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
 * $Id: PopResourceImpl.java,v 1.4 2008-08-10 07:29:51 estepper Exp $
 */
package org.eclipse.net4j.pop.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.util.PopResourceFactoryImpl
 * @generated
 */
public class PopResourceImpl extends XMIResourceImpl
{
  /**
   * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param uri
   *          the URI of the new resource.
   * @generated
   */
  public PopResourceImpl(URI uri)
  {
    super(uri);
  }

  /**
   * @ADDED
   */
  @Override
  protected boolean useUUIDs()
  {
    return true;
  }
} // PopResourceImpl
