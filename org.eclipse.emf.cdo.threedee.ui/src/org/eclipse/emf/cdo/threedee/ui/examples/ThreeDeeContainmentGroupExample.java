/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.examples;

import org.eclipse.emf.cdo.threedee.ui.nodes.ContainmentGroup;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseWheelZoom;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeContainmentGroupExample
{
  public static void main(String[] args)
  {
    SimpleUniverse universe = new SimpleUniverse();

    BranchGroup group = new BranchGroup();
    addMouseNavigation(group, universe.getViewingPlatform().getViewPlatformTransform());

    setLight(group);

    universe.getViewingPlatform().setNominalViewingTransform();

    ColorCube root = new ColorCube(0.1f);
    ColorCube child1 = new ColorCube(0.1f);
    ColorCube child2 = new ColorCube(0.1f);

    ContainmentGroup child1ContainmentGroup = new ContainmentGroup();
    Transform3D transform3d = new Transform3D();
    transform3d.set(new Vector3f(0f, 0.3f, 0.1f));
    child1ContainmentGroup.setTransform(transform3d);
    child1ContainmentGroup.setShape(child1);

    ContainmentGroup child2ContainmentGroup = new ContainmentGroup();
    transform3d = new Transform3D();
    transform3d.set(new Vector3f(0.3f, 0.3f, 0.0f));
    child2ContainmentGroup.setTransform(transform3d);
    child2ContainmentGroup.setShape(child2);

    ContainmentGroup rootContainmentGroup = new ContainmentGroup();
    rootContainmentGroup.setShape(root);
    rootContainmentGroup.addChild(child1ContainmentGroup);
    rootContainmentGroup.addChild(child2ContainmentGroup);

    group.addChild(rootContainmentGroup);

    // add the group of objects to the Universe
    universe.addBranchGraph(group);
  }

  private static void setLight(BranchGroup group)
  {
    Color3f light1Color = new Color3f(1.8f, 0.1f, 0.1f);
    BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);

    DirectionalLight light1 = new DirectionalLight(light1Color, light1Direction);
    light1.setInfluencingBounds(bounds);
    group.addChild(light1);
  }

  private static void addMouseNavigation(BranchGroup branchGroup, TransformGroup viewTransformGroup)
  {
    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), Float.MAX_VALUE);

    MouseTranslate mouseTranslate = new MouseTranslate(MouseTranslate.INVERT_INPUT);
    mouseTranslate.setTransformGroup(viewTransformGroup);
    mouseTranslate.setSchedulingBounds(mouseZone);
    branchGroup.addChild(mouseTranslate);

    MouseWheelZoom mouseZoom = new MouseWheelZoom();
    mouseZoom.setTransformGroup(viewTransformGroup);
    mouseZoom.setSchedulingBounds(mouseZone);
    branchGroup.addChild(mouseZoom);

    MouseRotate mouseRotate = new MouseRotate(MouseTranslate.INVERT_INPUT);
    mouseRotate.setTransformGroup(viewTransformGroup);
    mouseRotate.setSchedulingBounds(mouseZone);
    branchGroup.addChild(mouseRotate);
  }
}
