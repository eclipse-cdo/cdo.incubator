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

import org.eclipse.net4j.util.event.IEvent;

/**
 * @author Eike Stepper
 */
public interface IModelEvent extends IEvent
{
  public IModelManager<?> getModelManager();

  public Kind getKind();

  /**
   * @author Eike Stepper
   */
  public static enum Kind
  {
    MODEL_AVAILABLE, MODEL_UNAVAILABLE, MODEL_REFRESHED
  }
}
