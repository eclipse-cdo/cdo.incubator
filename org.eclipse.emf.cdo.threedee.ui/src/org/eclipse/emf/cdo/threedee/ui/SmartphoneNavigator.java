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
package org.eclipse.emf.cdo.threedee.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Martin Fluegge
 */
public class SmartphoneNavigator extends Thread
{
  enum Operation
  {
    NONE, ROTATE, TRANSLATE, ZOOM,
  }

  private Operation operation = Operation.NONE;

  private static final int RATIO = 5;

  private final Composite composite;

  private final Display display;

  private int MOUSE_BUTTON_LEFT = 1;

  private int MOUSE_BUTTON_RIGHT = 3;

  private Coordinates canvasPositions = new Coordinates();

  public static final String SERVERIP = "192.168.0.3"; // 'Within' the emulator!

  public static final int SERVERPORT = 4444;

  private Point shellSize;

  public SmartphoneNavigator(Composite composite)
  {
    this.composite = composite;
    Shell shell = composite.getShell();
    shellSize = shell.getSize();
    System.out.println(shellSize);
    display = composite.getDisplay();
    canvasPositions.x = shellSize.x / 2;
    canvasPositions.y = shellSize.y / 2;
  }

  @Override
  public void run()
  {
    try
    {
      System.out.println("Starting SmartphoneNavigator.");
      InetAddress serverAddr = InetAddress.getByName(SERVERIP);
      System.out.println("S: Connecting...");
      DatagramSocket socket = new DatagramSocket(SERVERPORT, serverAddr);
      byte[] buf = new byte[1024];
      DatagramPacket packet = new DatagramPacket(buf, buf.length);
      System.out.println("S: Receiving...");

      while (true)
      {
        try
        {
          synchronized (this)
          {
            socket.receive(packet);
            Coordinates newCoordinates = getMoveEvent(packet);
            System.out.println(newCoordinates);

            int x = newCoordinates.x;

            if (x == 0)
            {
              if (operation == Operation.ROTATE)
              {
                // performMouseUp(MOUSE_BUTTON_LEFT);
              }
              else if (operation == Operation.TRANSLATE)
              {
                // performMouseUp(MOUSE_BUTTON_RIGHT);
              }

              operation = Operation.NONE;
              return;
            }

            if (x == 1)
            {
              performMouseUp(MOUSE_BUTTON_RIGHT);
              performMouseDown(MOUSE_BUTTON_LEFT);
              operation = Operation.ROTATE;
            }
            else if (x == 2)
            {
              performMouseUp(MOUSE_BUTTON_LEFT);
              performMouseDown(MOUSE_BUTTON_RIGHT);
              operation = Operation.TRANSLATE;
            }

            int gz = newCoordinates.gz;
            int gy = newCoordinates.gy;

            int deltaX = 0;
            int deltaY = 0;
            if (gz != 0)
            {
              deltaX = gz / RATIO + 1;
            }
            if (gy != 0)
            {
              deltaY = gy / RATIO + 1;
            }

            clip();

            canvasPositions.x += deltaX;
            canvasPositions.y += deltaY;

            performMouseMove(canvasPositions.x, canvasPositions.y);

            if (isInterrupted())
            {
              System.err.println("Interrupted");
              break;
            }
          }
        }
        catch (java.lang.NumberFormatException e)
        {
          // ignore
        }
      }
    }

    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
    System.out.println("Finished SmartphoneNavigator.");
  }

  private void clip()
  {
    if (canvasPositions.x < 0)
    {
      canvasPositions.x = shellSize.x;
    }
    else if (canvasPositions.x > shellSize.x)
    {
      canvasPositions.x = 0;
    }

    if (canvasPositions.y < 0)
    {
      canvasPositions.y = shellSize.y;
    }
    else if (canvasPositions.y > shellSize.y)
    {
      canvasPositions.y = 0;
    }
  }

  private Coordinates getMoveEvent(DatagramPacket packet)
  {
    String recieved = new String(packet.getData());

    int lastIndexOf = recieved.lastIndexOf("}");
    recieved = recieved.substring(0, lastIndexOf);

    recieved = recieved.replace("{", "").replace("}", "");

    String[] split = recieved.split(",");

    int[] values = new int[6];
    for (int i = 0; i < split.length; i++)
    {
      String[] stringValue = split[i].split(":");
      values[i] = (int)Float.parseFloat(stringValue[1]);
    }

    Coordinates event = new Coordinates();
    event.x = values[0];
    event.y = values[1];
    event.z = values[2];
    event.gx = values[3];
    event.gy = values[4];
    event.gz = values[5];
    return event;
  }

  public void handleRotateWorldEvent(int x, int y)
  {
    performMouseMove(x, y);
  }

  public void handleTranslateWorldEvent(int x, int y)
  {
    performMouseMove(x, y);
  }

  private void performMouseMove(final int x, final int y)
  {
    Display.getDefault().asyncExec(new Runnable()
    {
      public void run()
      {
        Event event = new Event();
        event.type = SWT.MouseMove;

        Point point = composite.toDisplay(x, y);
        event.x = point.x;
        event.y = point.y;

        System.out.println("Move " + event.x + "/" + event.y);

        display.post(event);
      }
    });
  }

  private void performMouseDown(final int button)
  {
    Display.getDefault().asyncExec(new Runnable()
    {
      public void run()
      {
        Event event = new Event();
        event.type = SWT.MouseDown;
        event.button = button;
        display.post(event);
      }
    });
  }

  private void performMouseUp(final int button)
  {
    Display.getDefault().asyncExec(new Runnable()
    {
      public void run()
      {
        Event event = new Event();
        event.type = SWT.MouseUp;
        event.button = button;
        display.post(event);
      }
    });
  }

  public static void main(String[] args)
  {
    Display display = new Display();
    Shell shell = new Shell(display);

    shell.setSize(800, 800);
    shell.open();
    Composite composite = new Composite(shell, SWT.NO_BACKGROUND);

    SmartphoneNavigator smartphoneNavigator = new SmartphoneNavigator(composite);
    smartphoneNavigator.start();
    while (!shell.isDisposed())
    {
      if (!display.readAndDispatch())
      {
        display.sleep();
      }
    }
    display.dispose();
    smartphoneNavigator.interrupt();
  }

  /**
   * @author Martin Fluegge
   */
  private class Coordinates
  {
    public int x;

    public int y;

    public int z;

    public int gx;

    public int gy;

    public int gz;

    @Override
    public String toString()
    {
      return "x: " + x + " y: " + y + " z: " + z + " gx: " + gx + " gy: " + gy + " gz: " + gz;
    }
  }
}
