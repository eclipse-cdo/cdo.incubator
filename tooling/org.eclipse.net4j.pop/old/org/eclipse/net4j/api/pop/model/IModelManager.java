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
package org.eclipse.net4j.api.pop.model;

import org.eclipse.net4j.util.event.INotifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.core.runtime.IPath;

/**
 * @author Eike Stepper
 */
public interface IModelManager<MODEL extends EObject> extends INotifier.Introspection
{
  public IPath getPrimaryPath();

  public ResourceSet getResourceSet();

  public MODEL getModel();
}
