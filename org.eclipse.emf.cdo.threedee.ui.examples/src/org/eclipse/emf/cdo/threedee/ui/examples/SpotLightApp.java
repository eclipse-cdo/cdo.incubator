package org.eclipse.emf.cdo.threedee.ui.examples;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.Appearance;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.Bounds;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.IndexedQuadArray;
import javax.media.j3d.Material;
import javax.media.j3d.QuadArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.SpotLight;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

import java.applet.Applet;
import java.awt.BorderLayout;

/**
 * SpotLightApp creates
 */
public class SpotLightApp extends Applet
{
  private static final long serialVersionUID = 1L;

  Appearance createMatAppear(Color3f dColor, Color3f sColor, float shine)
  {

    Appearance appear = new Appearance();
    Material material = new Material();
    material.setDiffuseColor(dColor);
    material.setSpecularColor(sColor);
    material.setShininess(shine);
    appear.setMaterial(material);

    return appear;
  }

  SpotLight newSpotLight(Bounds bounds, Point3f pos, float spread, float concentration)
  {
    SpotLight sl = new SpotLight();
    sl.setInfluencingBounds(bounds);
    sl.setPosition(pos);
    sl.setSpreadAngle(spread);
    sl.setConcentration(concentration);
    return sl;
  }

  @SuppressWarnings("unused")
  public SpotLightApp()
  {
    BoundingSphere bound1 = new BoundingSphere(new Point3d(0.0, 0.9, 0.0), 0.5);
    BoundingSphere bound2 = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 0.5);
    BoundingSphere bound3 = new BoundingSphere(new Point3d(0.0, -0.9, 0.0), 0.5);

    Vector3f direction = new Vector3f(0.0f, 0.0f, -1.0f);

    Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
    Color3f red = new Color3f(1.0f, 0.0f, 0.0f);
    Color3f green = new Color3f(0.0f, 1.0f, 0.0f);
    Color3f blue = new Color3f(0.0f, 0.0f, 1.0f);

    BranchGroup scene = new BranchGroup();

    final int X = 101, Y = 102;
    final float dx = 0.01f, dy = -0.01f;
    final float epx = dx / 2.0f, epy = dy / 2.0f;
    final float top = 0.5f, left = -0.5f;
    final float right = left + dx * (X - 1);
    final float bottom = top + dy * (Y - 1);

    IndexedQuadArray qa = new IndexedQuadArray(X * Y, QuadArray.COORDINATES | QuadArray.NORMALS, (X - 1) * (Y - 1) * 4);

    float x, y;
    int i = 0;
    System.out.print("set " + X * Y + " coordiantes.....  ");
    for (y = top; y >= bottom - epx; y += dy)
    {
      for (x = left; x <= right + epx; x += dx)
      {
        qa.setCoordinate(i++, new Point3f(x, y, 0.0f));
      }
    }

    System.out.println(i + " coordiantes done");
    int row, col;
    i = 0;
    Vector3f n = new Vector3f(0.0f, 0.0f, 1.0f);

    System.out.print("set " + (X - 1) * (Y - 1) * 4 + " coordinate indices.....  ");
    for (row = 0; row < Y - 1; row++)
    {
      for (col = 0; col < X - 1; col++)
      {
        qa.setNormal(row * X + col, n);
        qa.setCoordinateIndex(i++, row * X + col);
        qa.setCoordinateIndex(i++, (row + 1) * X + col);
        qa.setCoordinateIndex(i++, (row + 1) * X + col + 1);
        qa.setCoordinateIndex(i++, row * X + col + 1);
      }
      qa.setNormal(row * X + col + 1, n);
    }
    System.out.println(i + " coordinate indices done");

    for (col = 0; col < X - 1; col++)
    {
      qa.setNormal(X * (Y - 1) + 1 + col, n);
    }
    System.out.println("coordinate normals done");

    Appearance qAppear = createMatAppear(blue, white, 5.0f);
    Shape3D plane = new Shape3D(qa, qAppear);

    Transform3D translate = new Transform3D();
    translate.set(new Vector3f(-0.5f, 0.5f, 0.0f));
    TransformGroup tg1 = new TransformGroup(translate);
    scene.addChild(tg1);
    Shape3D plane1 = new Shape3D(qa, qAppear);
    plane1.setBounds(bound1);
    tg1.addChild(plane1);

    translate.set(new Vector3f(0.5f, 0.5f, 0.0f));
    TransformGroup tg2 = new TransformGroup(translate);
    scene.addChild(tg2);
    Shape3D plane2 = new Shape3D(qa, qAppear);
    plane2.setBounds(bound1);
    tg2.addChild(plane2);

    translate.set(new Vector3f(-0.5f, -0.5f, 0.0f));
    TransformGroup tg3 = new TransformGroup(translate);
    scene.addChild(tg3);
    Shape3D plane3 = new Shape3D(qa, qAppear);
    plane3.setBounds(bound3);
    tg3.addChild(plane3);

    translate.set(new Vector3f(0.5f, -0.5f, 0.0f));
    TransformGroup tg4 = new TransformGroup(translate);
    scene.addChild(tg4);
    Shape3D plane4 = new Shape3D(qa, qAppear);
    plane4.setBounds(bound3);
    tg4.addChild(plane4);

    AmbientLight lightA = new AmbientLight();
    lightA.setInfluencingBounds(new BoundingSphere());
    scene.addChild(lightA);

    scene.addChild(newSpotLight(bound1, new Point3f(-0.7f, 0.7f, 0.5f), 0.1f, 5.0f));
    scene.addChild(newSpotLight(bound1, new Point3f(0.0f, 0.7f, 0.5f), 0.1f, 50.0f));
    scene.addChild(newSpotLight(bound1, new Point3f(0.7f, 0.7f, 0.5f), 0.1f, 100.0f));
    scene.addChild(newSpotLight(bound2, new Point3f(-0.7f, 0.0f, 0.5f), 0.3f, 5.0f));
    scene.addChild(newSpotLight(bound2, new Point3f(0.0f, 0.0f, 0.5f), 0.3f, 50.0f));
    scene.addChild(newSpotLight(bound2, new Point3f(0.7f, 0.0f, 0.5f), 0.3f, 100.0f));
    scene.addChild(newSpotLight(bound3, new Point3f(-0.7f, -0.7f, 0.5f), 0.5f, 5.0f));
    scene.addChild(newSpotLight(bound3, new Point3f(0.0f, -0.7f, 0.5f), 0.5f, 50.0f));
    scene.addChild(newSpotLight(bound3, new Point3f(0.7f, -0.7f, 0.5f), 0.5f, 100.0f));

    Background background = new Background();
    background.setApplicationBounds(new BoundingSphere());
    background.setColor(1.0f, 1.0f, 1.0f);
    scene.addChild(background);

    scene.compile();

    setLayout(new BorderLayout());
    Canvas3D c = new Canvas3D(null);
    add("Center", c);

    SimpleUniverse u = new SimpleUniverse(c);

    // This will move the ViewPlatform back a bit so the
    // objects in the scene can be viewed.
    u.getViewingPlatform().setNominalViewingTransform();

    u.addBranchGraph(scene);
  }

  public static void main(String argv[])
  {
    System.out.println("SpotLightApp");
    System.out.println("illustrates the differences between spot light paramters");
    System.out.println("depending on your system.... this may take a few minutes");
    new MainFrame(new SpotLightApp(), 256, 256);
  }
}
