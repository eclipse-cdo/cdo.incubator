/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.common.descriptors;

import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;

import org.eclipse.net4j.util.factory.ProductCreationException;

import java.util.Map;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class BranchDescriptor extends ElementDescriptor
{
  public BranchDescriptor()
  {
    super("Branch");
  }

  @Override
  public void initElement(Object object, Map<String, String> attributes, final Set<Element> references,
      final ElementProvider provider)
  {
    CDOBranch branch = (CDOBranch)object;
    attributes.put("name", branch.getPathName());

    CDOBranch parent = branch.getBase().getBranch();
    if (parent != null)
    {
      Element element = provider.getElement(parent);
      if (element != null)
      {
        references.add(element);
      }
    }

    for (CDOBranch child : branch.getBranches())
    {
      Element element = provider.getElement(child);
      if (element != null)
      {
        references.add(element);
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Factory extends DescriptorFactory
  {
    public Factory()
    {
      super("org.eclipse.emf.cdo.internal.common.branch.CDOBranchImpl");
    }

    public Object create(String description) throws ProductCreationException
    {
      return new BranchDescriptor();
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class MainFactory extends DescriptorFactory
  {
    public MainFactory()
    {
      super("org.eclipse.emf.cdo.internal.common.branch.CDOBranchImpl$Main");
    }

    public Object create(String description) throws ProductCreationException
    {
      return new BranchDescriptor();
    }
  }
}
