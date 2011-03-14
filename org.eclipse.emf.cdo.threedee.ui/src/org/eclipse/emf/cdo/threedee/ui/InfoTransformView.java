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

import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld.InfoPanel;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;

/**
 * @author Eike Stepper
 */
public class InfoTransformView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ui.InfoTransformView";

  public InfoTransformView()
  {
  }

  @Override
  public void createPartControl(Composite parent)
  {
    Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(2, false));

    try
    {
      IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      if (page == null)
      {
        return;
      }

      ThreeDeeView view = (ThreeDeeView)page.findView(ThreeDeeView.ID);
      InfoPanel infoPanel = view.getWorld().getInfoPanel();

      Transform3D transform = new Transform3D();

      final TransformGroup translationGroup = infoPanel.getTranslationGroup();
      translationGroup.getTransform(transform);
      Vector3f translation = new Vector3f();
      transform.get(translation);

      final TransformGroup scaleGroup = infoPanel.getScaleGroup();
      scaleGroup.getTransform(transform);
      double scale = transform.getScale();

      final Transformer xTransformer = new Transformer(composite, "x", -1f, 0f, translation.getX());
      final Transformer yTransformer = new Transformer(composite, "y", 0f, 1f, translation.getY());
      final Transformer zTransformer = new Transformer(composite, "z", -2f, 2f, translation.getZ());

      SelectionAdapter translationListener = new SelectionAdapter()
      {
        @Override
        public void widgetSelected(SelectionEvent e)
        {
          float x = (float)xTransformer.getValue();
          float y = (float)yTransformer.getValue();
          float z = (float)zTransformer.getValue();

          Transform3D transform = new Transform3D();
          transform.set(new Vector3f(x, y, z));
          translationGroup.setTransform(transform);
        }
      };

      xTransformer.addSelectionListener(translationListener);
      yTransformer.addSelectionListener(translationListener);
      zTransformer.addSelectionListener(translationListener);

      final Transformer scaleTransformer = new Transformer(composite, "scale", 0.005f, 0.1f, scale);
      scaleTransformer.addSelectionListener(new SelectionAdapter()
      {
        @Override
        public void widgetSelected(SelectionEvent e)
        {
          Transform3D transform = new Transform3D();
          transform.setScale(scaleTransformer.getValue());
          scaleGroup.setTransform(transform);
        }
      });
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }
  }

  @Override
  public void dispose()
  {
    super.dispose();
  }

  @Override
  public void setFocus()
  {
  }

  /**
   * @author Eike Stepper
   */
  private static class Transformer
  {
    private static final int MAX = 1000;

    private double min;

    private double range;

    private Slider slider;

    public Transformer(Composite parent, String text, float min, float max, double initial)
    {
      this.min = min;
      range = max - min;

      Label label = new Label(parent, SWT.NONE);
      label.setText(text + ":");
      label.setLayoutData(new GridData());

      slider = new Slider(parent, SWT.HORIZONTAL);
      slider.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
      slider.setMinimum(0);
      slider.setMaximum(MAX);
      setValue(initial);
    }

    public void addSelectionListener(SelectionListener listener)
    {
      slider.addSelectionListener(listener);
    }

    public double getValue()
    {
      return slider.getSelection() * range / MAX + min;
    }

    public void setValue(double value)
    {
      slider.setSelection((int)((value - min) * MAX / range));
    }
  }
}
