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
import org.eclipse.net4j.util.StringUtil;

import java.util.List;

public class CapitalizeAllFunction extends TemplateFunction
{
  public CapitalizeAllFunction()
  {
    super("capitalize-all");
  }

  public String evaluate(String referenceValue, List<String> arguments)
  {
    return StringUtil.capAll(referenceValue);
  }
}
