package org.eclipse.net4j.pop.internal.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Snippet
{
  public static void main(String[] args)
  {
    final Display display = new Display();
    Shell shell = new Shell(display);
    shell.setLayout(new GridLayout());
    final CTabFolder folder = new CTabFolder(shell, SWT.BORDER);
    folder.setLayoutData(new GridData(GridData.FILL_BOTH));
    for (int i = 0; i < 10; i++)
    {
      CTabItem item = new CTabItem(folder, SWT.NONE);
      item.setText("item " + i);
      Text text = new Text(folder, SWT.BORDER | SWT.MULTI | SWT.VERTICAL);
      text.setText("Text control for " + i);
      item.setControl(text);
    }
    Listener listener = new Listener()
    {
      boolean drag = false;

      boolean exitDrag = false;

      CTabItem dragItem;

      public void handleEvent(Event e)
      {
        Point p = new Point(e.x, e.y);
        if (e.type == SWT.DragDetect)
        {
          p = folder.toControl(display.getCursorLocation()); // see bug 43251
        }
        switch (e.type)
        {
        case SWT.DragDetect:
        {
          CTabItem item = folder.getItem(p);
          if (item == null)
          {
            return;
          }
          drag = true;
          exitDrag = false;
          dragItem = item;
          break;
        }
        case SWT.MouseEnter:
          if (exitDrag)
          {
            exitDrag = false;
            drag = e.button != 0;
          }
          break;
        case SWT.MouseExit:
          if (drag)
          {
            folder.setInsertMark(null, false);
            exitDrag = true;
            drag = false;
          }
          break;
        case SWT.MouseUp:
        {
          if (!drag)
          {
            return;
          }
          folder.setInsertMark(null, false);
          CTabItem item = folder.getItem(new Point(p.x, 1));
          if (item != null)
          {
            Rectangle rect = item.getBounds();
            boolean after = p.x > rect.x + rect.width / 2;
            int index = folder.indexOf(item);
            index = after ? index + 1 : index - 1;
            index = Math.max(0, index);
            CTabItem newItem = new CTabItem(folder, SWT.NONE, index);
            newItem.setText("new tab item");
            Control c = dragItem.getControl();
            dragItem.setControl(null);
            newItem.setControl(c);
            dragItem.dispose();
            folder.setSelection(newItem);
          }
          drag = false;
          exitDrag = false;
          dragItem = null;
          break;
        }
        case SWT.MouseMove:
        {
          if (!drag)
          {
            return;
          }
          CTabItem item = folder.getItem(new Point(p.x, 2));
          if (item == null)
          {
            folder.setInsertMark(null, false);
            return;
          }
          Rectangle rect = item.getBounds();
          boolean after = p.x > rect.x + rect.width / 2;
          folder.setInsertMark(item, after);
          break;
        }
        }
      }
    };
    folder.addListener(SWT.DragDetect, listener);
    folder.addListener(SWT.MouseUp, listener);
    folder.addListener(SWT.MouseMove, listener);
    folder.addListener(SWT.MouseExit, listener);
    folder.addListener(SWT.MouseEnter, listener);
    shell.open();
    while (!shell.isDisposed())
    {
      if (!display.readAndDispatch())
      {
        display.sleep();
      }
    }
    display.dispose();
  }
}
