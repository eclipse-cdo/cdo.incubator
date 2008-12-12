package cdoclient;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class ModelEditor extends EditorPart
{
  private Label label;

  public ModelEditor()
  {
  }

  public Model getElement()
  {
    return ((ModelEditorInput)getEditorInput()).getElement();
  }

  @Override
  public void init(IEditorSite site, IEditorInput input) throws PartInitException
  {
    setSite(site);
    setInput(input);
  }

  @Override
  public void createPartControl(Composite parent)
  {
    setPartName(getElement().text);
    setTitleImage(getElement().getImage());
    setTitleToolTip(getElement().getPath());

    final Shell shell = getSite().getShell();
    final Display display = shell.getDisplay();

    label = new Label(parent, SWT.NONE);
    label.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
    label.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseDoubleClick(MouseEvent e)
      {
        FileDialog fileDialog = new FileDialog(shell);
        final String path = fileDialog.open();
        if (path != null)
        {
          ImageLoader imageLoader = new ImageLoader();
          ImageData[] data = imageLoader.load(path);
          label.setImage(new Image(display, data[0]));
        }
      }
    });
  }

  @Override
  public void setFocus()
  {
  }

  @Override
  public void doSave(IProgressMonitor monitor)
  {
  }

  @Override
  public void doSaveAs()
  {
  }

  @Override
  public boolean isDirty()
  {
    return false;
  }

  @Override
  public boolean isSaveAsAllowed()
  {
    return true;
  }

  public static void open(IWorkbenchPage page, Model element)
  {
    try
    {
      page.openEditor(new ModelEditorInput(element), "cdoclient.editors.ModelEditor");
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class ModelEditorInput implements IEditorInput
  {
    private Model element;

    public ModelEditorInput(Model element)
    {
      this.element = element;
    }

    public Model getElement()
    {
      return element;
    }

    public boolean exists()
    {
      return true;
    }

    public ImageDescriptor getImageDescriptor()
    {
      return element.getImageDescriptor();
    }

    public String getName()
    {
      return element.text;
    }

    public IPersistableElement getPersistable()
    {
      return null;
    }

    public String getToolTipText()
    {
      return element.getPath();
    }

    @SuppressWarnings("unchecked")
    public Object getAdapter(Class adapter)
    {
      return null;
    }
  }
}
