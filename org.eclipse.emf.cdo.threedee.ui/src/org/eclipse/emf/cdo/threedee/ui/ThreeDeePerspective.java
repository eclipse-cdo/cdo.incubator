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
package org.eclipse.emf.cdo.threedee.ui;

import org.eclipse.emf.cdo.threedee.DescriptorView;
import org.eclipse.emf.cdo.threedee.ElementView;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author Eike Stepper
 */
public class ThreeDeePerspective implements IPerspectiveFactory
{
  public void createInitialLayout(IPageLayout layout)
  {
    String editorArea = layout.getEditorArea();
    layout.setEditorAreaVisible(false);

    layout.addView(ElementView.ID, IPageLayout.LEFT, 0.15f, editorArea);
    layout.addView(DescriptorView.ID, IPageLayout.BOTTOM, 0.75f, ElementView.ID);
    // layout.addView(ThreeDeeView.ID, IPageLayout.LEFT, 1.0f, editorArea);
    layout.addStandaloneView(ThreeDeeView.ID, false, IPageLayout.LEFT, 1.0f, editorArea);
  }
}
