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
package org.eclipse.emf.cdo.ui.internal.branch.figure;

import org.eclipse.emf.cdo.ui.internal.branch.item.RootNode;

import org.eclipse.draw2d.RectangleFigure;

/**
 * The Figure used to visualize the (single) root node of a BranchTree.
 * 
 * @author Andre Dietisheim
 * @see RootNode
 */
public class TreeRootFigure extends RectangleFigure
{
  public TreeRootFigure()
  {
    setSize(30, 30);
    setVisible(false);
  }
}
