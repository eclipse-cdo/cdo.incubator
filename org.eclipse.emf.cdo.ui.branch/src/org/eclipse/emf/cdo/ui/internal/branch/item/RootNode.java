/**
 * Copyright (c) 2004 - 2010 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andre Dietisheim - initial API and implementation
 */
package org.eclipse.emf.cdo.ui.internal.branch.item;

import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;

import org.eclipse.draw2d.IFigure;
import org.eclipse.zest.core.widgets.IContainer;

/**
 * The unique root node of a branch tree.
 * 
 * @author Andre Dietisheim
 */
public class RootNode extends AbstractBranchPointNode
{
  public RootNode(CDOBranchPoint branchPoint, IContainer graphModel, int style, IFigure figure)
  {
    super(branchPoint, graphModel, style, figure);
  }
}
