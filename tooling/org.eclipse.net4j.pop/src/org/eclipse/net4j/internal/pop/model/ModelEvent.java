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
package org.eclipse.net4j.internal.pop.model;

import org.eclipse.net4j.pop.model.IModelEvent;
import org.eclipse.net4j.util.event.Event;

/**
 * @author Eike Stepper
 */
public class ModelEvent extends Event implements IModelEvent
{
  private static final long serialVersionUID = 1L;

  private Kind kind;

  public ModelEvent(ModelManager<?> modelManager, Kind kind)
  {
    super(modelManager);
    this.kind = kind;
  }

  public ModelManager<?> getModelManager()
  {
    return (ModelManager<?>)super.getSource();
  }

  public Kind getKind()
  {
    return kind;
  }
}
