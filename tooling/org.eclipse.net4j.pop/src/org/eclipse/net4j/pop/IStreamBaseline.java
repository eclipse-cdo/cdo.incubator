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

import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.util.IElement;

/**
 * @author Eike Stepper
 */
public interface IStreamBaseline extends IElement
{
  public IStream getStream();

  public ITag getTag();
}