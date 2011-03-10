package org.eclipse.emf.cdo.threedee.ui.examples;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;
import org.eclipse.emf.cdo.threedee.ui.nodes.ElementGroup;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PickExample extends MouseAdapter
{
  private PickCanvas pickCanvas;

  public PickExample()
  {
    Frame frame = new Frame("Box and Sphere");
    GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
    Canvas3D canvas = new Canvas3D(config);
    canvas.setSize(400, 400);
    SimpleUniverse universe = new SimpleUniverse(canvas);
    BranchGroup group = new BranchGroup();

    // create a color cube
    Vector3f vector = new Vector3f(-0.3f, 0.0f, 0.0f);
    Transform3D transform = new Transform3D();
    transform.setTranslation(vector);
    TransformGroup transformGroup = new TransformGroup(transform);
    ColorCube cube = new ColorCube(0.3);
    transformGroup.addChild(cube);
    group.addChild(transformGroup);

    Element element = new TestingElementProvider().createElement(new TCPConnectorDescriptor());
    ElementGroup elementGroup = new ElementGroup(element, null);
    group.addChild(elementGroup);
    //

    universe.addBranchGraph(group);

    universe.getViewingPlatform().setNominalViewingTransform();

    frame.addWindowListener(new WindowAdapter()
    {
      @Override
      public void windowClosing(WindowEvent winEvent)
      {
        System.exit(0);
      }
    });

    frame.add(canvas);

    pickCanvas = new PickCanvas(canvas, group);
    pickCanvas.setMode(PickCanvas.BOUNDS);
    canvas.addMouseListener(this);

    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void mouseClicked(MouseEvent e)
  {
    pickCanvas.setShapeLocation(e);
    PickResult result = pickCanvas.pickClosest();
    if (result == null)
    {
      System.out.println("Nothing picked");
    }
    else
    {
      Primitive p = (Primitive)result.getNode(PickResult.PRIMITIVE);
      Shape3D s = (Shape3D)result.getNode(PickResult.SHAPE3D);
      if (p != null)
      {
        System.out.println(p.getClass().getName());
      }
      else if (s != null)
      {
        System.out.println(s.getClass().getName());
      }
      else
      {
        System.out.println("null");
      }
    }
  }

  public static void main(String[] args)
  {
    new PickExample();
  }
} // end of class Pick
