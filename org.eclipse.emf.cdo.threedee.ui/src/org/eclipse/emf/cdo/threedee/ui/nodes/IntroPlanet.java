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
package org.eclipse.emf.cdo.threedee.ui.nodes;

import org.eclipse.emf.cdo.threedee.ui.ThreeDeeUtil;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.ViewingPlatform;

import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingBox;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Font3D;
import javax.media.j3d.FontExtrusion;
import javax.media.j3d.Geometry;
import javax.media.j3d.Group;
import javax.media.j3d.Material;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Shape3D;
import javax.media.j3d.SpotLight;
import javax.media.j3d.Text3D;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TransparencyAttributes;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import java.awt.Font;
import java.net.URL;

/**
 * @author Eike Stepper
 */
public class IntroPlanet extends BranchGroup implements IColors
{
  private static final float RADIUS = 5.0f;

  private static final double Y0 = 9.5;

  private static final double Z0 = 15.0;

  private static final float TWO_PI = (float)(2.0f * Math.PI);

  private ThreeDeeWorld threeDeeWorld;

  private double y;

  private TransformGroup spin;

  private Alpha alpha;

  public IntroPlanet(ThreeDeeWorld threeDeeWorld)
  {
    this.threeDeeWorld = threeDeeWorld;
    setCapability(Group.ALLOW_CHILDREN_EXTEND);
    setCapability(Group.ALLOW_CHILDREN_WRITE);

    SpotLight light = new SpotLight();
    light.setColor(new Color3f(0.7f, 0.8f, 0.8f));
    light.setPosition(new Point3f(0.0f, 0.0f, -RADIUS));
    light.setDirection(new Vector3f(0.0f, 1.5f, 1.0f));
    light.setSpreadAngle((float)(0.5f * Math.PI));

    BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, RADIUS, 0.0), RADIUS);
    light.setInfluencingBounds(bounds);
    addChild(light);

    spin = new TransformGroup();
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    spin.setCapability(Group.ALLOW_CHILDREN_EXTEND);
    spin.setCapability(Group.ALLOW_CHILDREN_WRITE);
    addChild(spin);

    alpha = new Alpha(-1, 40000);

    Transform3D axis = new Transform3D();
    axis.rotZ(-Math.PI / 2);

    RotationInterpolator interpolator = new RotationInterpolator(alpha, spin, axis, 0.0f, TWO_PI);
    interpolator.setSchedulingBounds(new BoundingSphere());
    addChild(interpolator);

    Sphere planet = createPlanet();
    spin.addChild(planet);

    compile();
  }

  public void start()
  {
    // try
    // {
    // System.in.read();
    // ConcurrencyUtil.sleep(5000);
    // }
    // catch (IOException ex)
    // {
    // ex.printStackTrace();
    // }

    new SoundPlayer("zarathustra.wav").start();
    new ChimeIn().start();

    new TextAnimation(0, 33, 500, "Eike Stepper", 1).start();
    new TextAnimation(0, 53, 0, "Martin Flügge", 1).start();
    new TextAnimation(1, 12, 600, "EclipseCon 2011", 1).start();
    new TextAnimation(1, 34, 0, "CDO3D", 2).start();

    new ChimeOut(1, 39, 0).start();
  }

  private Sphere createPlanet()
  {
    Appearance appearance = new Appearance();
    setTexture(appearance, "moon.jpg");

    Material material = new Material(black, gray, darkGray, white, 24.0f);
    appearance.setMaterial(material);

    ColoringAttributes coloringAttributes = new ColoringAttributes(darkGray, ColoringAttributes.NICEST);
    appearance.setColoringAttributes(coloringAttributes);

    return new Sphere(RADIUS, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 64, appearance);
  }

  private TransformGroup createText(String text, int size, double angle, TransparencyAttributes transparencyAttributes)
  {
    Appearance appearance = new Appearance();
    appearance.setTransparencyAttributes(transparencyAttributes);

    // setTexture(appearance, "comet.jpg");

    Material material = new Material(darkGray, black, white, yellow, 128.0f);
    material.setLightingEnable(true);
    appearance.setMaterial(material);

    Font3D font = new Font3D(new Font("Neuropol", Font.PLAIN, size), new FontExtrusion());
    Text3D text3D = new Text3D(font, text, new Point3f(-2.0f, 0.7f, 0.0f));
    text3D.setCapability(Geometry.ALLOW_INTERSECT);

    Shape3D textShape = new Shape3D(text3D, appearance);

    Point3d upper = new Point3d();
    Point3d lower = new Point3d();
    BoundingBox bounds = (BoundingBox)textShape.getBounds();
    bounds.getUpper(upper);
    bounds.getLower(lower);
    double offset = -0.5d * (upper.getX() - lower.getX()) + 2.0d;

    Transform3D rotation = new Transform3D();
    rotation.rotX(angle);
    TransformGroup transformGroup1 = new TransformGroup(rotation);

    Transform3D translation = new Transform3D();
    translation.setTranslation(new Vector3d(offset, RADIUS + 0.2f, 0.0f));
    TransformGroup transformGroup2 = new TransformGroup(translation);

    transformGroup1.addChild(transformGroup2);
    transformGroup2.addChild(textShape);

    return transformGroup1;
  }

  private void setTexture(Appearance appearance, String image)
  {
    Texture texture = ThreeDeeUtil.loadTexture(image, threeDeeWorld.getCanvas());
    texture.setBoundaryModeS(Texture.WRAP);
    texture.setBoundaryModeT(Texture.WRAP);
    appearance.setTexture(texture);

    TextureAttributes textureAttributes = new TextureAttributes();
    textureAttributes.setTextureMode(TextureAttributes.MODULATE);
    appearance.setTextureAttributes(textureAttributes);
  }

  /**
   * @author Eike Stepper
   */
  private final class SoundPlayer extends Thread
  {
    private AudioInputStream in;

    private SourceDataLine line;

    private int frameSize;

    private boolean started;

    private boolean stopped;

    public SoundPlayer(String sound)
    {
      try
      {
        URL url = new URL(OM.BUNDLE.getBaseURL().toString() + "sounds/" + sound);
        in = AudioSystem.getAudioInputStream(url);
        AudioFormat format = in.getFormat();
        checkEncoding(format);

        frameSize = format.getFrameSize();

        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        line = (SourceDataLine)AudioSystem.getLine(info);
        line.open();
      }
      catch (Exception ex)
      {
        throw WrappedException.wrap(ex);
      }
    }

    @Override
    public void run()
    {
      byte[] buffer = new byte[64 * 1024];
      int readPoint = 0;
      int bytesRead = 0;

      try
      {
        while (!stopped)
        {
          if (started)
          {
            bytesRead = in.read(buffer, readPoint, buffer.length - readPoint);
            if (bytesRead == -1)
            {
              break;
            }

            int leftOver = bytesRead % frameSize;
            line.write(buffer, readPoint, bytesRead - leftOver);

            System.arraycopy(buffer, bytesRead, buffer, 0, leftOver);
            readPoint = leftOver;
          }
          else
          {
            ConcurrencyUtil.sleep(10);
          }
        }

        line.drain();
        line.stop();
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }

    @Override
    public synchronized void start()
    {
      started = true;
      stopped = false;
      if (!isAlive())
      {
        super.start();
      }

      line.start();
    }

    private void checkEncoding(AudioFormat format) throws UnsupportedAudioFileException
    {
      AudioFormat.Encoding formatEncoding = format.getEncoding();
      if (!(formatEncoding.equals(AudioFormat.Encoding.PCM_SIGNED) || formatEncoding
          .equals(AudioFormat.Encoding.PCM_UNSIGNED)))
      {
        throw new UnsupportedAudioFileException("Audio is not PCM");
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private abstract class Animation extends Thread
  {
    private long delay;

    private long duration;

    public Animation(long minute, long second, long milli, long duration)
    {
      delay = Math.max(0, (minute * 60 + second) * 1000 + milli - 5000);
      this.duration = duration;
    }

    public Animation(long duration)
    {
      this.duration = duration;
    }

    @Override
    public final void run()
    {
      ConcurrencyUtil.sleep(delay);
      init();

      long start = System.currentTimeMillis();
      long end = start + duration;
      long time = start;

      while (time < end)
      {
        float progress = time - start;
        float alpha = -0.5f * (float)Math.cos(Math.PI * progress / duration) + 0.5f;
        animate(alpha);

        ConcurrencyUtil.sleep(1);
        time = System.currentTimeMillis();
      }

      done();
    }

    protected void init()
    {
    }

    protected abstract void animate(float alpha);

    protected void done()
    {
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class ChimeIn extends Animation
  {
    public ChimeIn()
    {
      super(30000);
    }

    @Override
    protected void animate(float alpha)
    {
      y = Y0 - 5d * alpha;

      Transform3D viewingTransform = new Transform3D();
      viewingTransform.set(new Vector3d(0.0, y, Z0));

      ViewingPlatform viewingPlatform = threeDeeWorld.getUniverse().getViewingPlatform();
      viewingPlatform.getViewPlatformTransform().setTransform(viewingTransform);
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class TextAnimation extends Animation
  {
    private String string;

    private int size;

    private TransparencyAttributes transparencyAttributes;

    private BranchGroup branchGroup;

    public TextAnimation(long minute, long second, long milli, String string, int size)
    {
      super(minute, second, milli, 7000);
      this.string = string;
      this.size = size;
    }

    @Override
    protected void init()
    {
      branchGroup = new BranchGroup();
      branchGroup.setCapability(BranchGroup.ALLOW_DETACH);

      transparencyAttributes = new TransparencyAttributes();
      transparencyAttributes.setCapability(TransparencyAttributes.ALLOW_VALUE_WRITE);
      transparencyAttributes.setTransparencyMode(TransparencyAttributes.NICEST);

      float value = (float)(alpha.value() * 2.0f * Math.PI);
      TransformGroup text = createText(string, size, -value - 0.5f * Math.PI, transparencyAttributes);

      branchGroup.addChild(text);
      branchGroup.compile();
      spin.addChild(branchGroup);

      ConcurrencyUtil.sleep(10000);
    }

    @Override
    protected void animate(float alpha)
    {
      transparencyAttributes.setTransparency(alpha);
    }

    @Override
    protected void done()
    {
      spin.removeChild(branchGroup);
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class ChimeOut extends Animation
  {
    public ChimeOut(long minute, long second, long milli)
    {
      super(minute, second, milli, 20000);
    }

    @Override
    protected void animate(float alpha)
    {
      double z = Z0 - 20d * alpha;

      Transform3D viewingTransform = new Transform3D();
      viewingTransform.set(new Vector3d(0.0, y, z));

      ViewingPlatform viewingPlatform = threeDeeWorld.getUniverse().getViewingPlatform();
      viewingPlatform.getViewPlatformTransform().setTransform(viewingTransform);
    }
  }
}
