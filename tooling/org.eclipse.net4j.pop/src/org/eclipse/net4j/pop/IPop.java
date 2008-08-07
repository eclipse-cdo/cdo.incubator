/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.product.PopProduct;
import org.eclipse.net4j.pop.project.ICheckoutManager;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.util.event.INotifier;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;

/**
 * @author Eike Stepper
 */
public interface IPop extends Comparable<IPop>, IAdaptable, INotifier
{
  public IProject getProject();

  public ResourceSet getResourceSet();

  public PopProject getProjectModel();

  public PopProduct getProductModel();

  public ICheckoutManager getCheckoutManager();
}
