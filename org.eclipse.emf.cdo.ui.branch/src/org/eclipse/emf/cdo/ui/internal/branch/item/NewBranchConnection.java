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

/**
 * Connects a BranchPoint node to another one. The second node have to be in another (sub-)branch, though.
 * 
 * @author Andre Dietisheim
 * @see SameBranchConnection
 */
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

public class NewBranchConnection extends GraphConnection
{
  public NewBranchConnection(Graph graphModel, int style, GraphNode source, GraphNode destination)
  {
    super(graphModel, style, source, destination);
  }
}
