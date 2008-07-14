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
package org.eclipse.net4j.internal.template.functions;

import org.eclipse.net4j.internal.template.TemplateFunction;

import java.util.List;

public class ReplaceFunction extends TemplateFunction
{
  public ReplaceFunction()
  {
    super("replace");
  }

  public String evaluate(String referenceValue, List<String> arguments)
  {
    CharSequence target = arguments.get(0);
    CharSequence replacement = arguments.get(1);
    return referenceValue.replace(target, replacement);
  }
}
