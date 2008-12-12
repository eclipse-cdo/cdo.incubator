package cdoclient;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class Model
{
  public String text;

  public String icon;

  public Model parent;

  public List<Model> children = new ArrayList<Model>();

  public Model(String text, String icon)
  {
    this.text = text;
    this.icon = icon;
  }

  public String getPath()
  {
    if (parent == null || parent.icon == null)
    {
      return text;
    }

    return parent.getPath() + "/" + text;
  }

  public ImageDescriptor getImageDescriptor()
  {
    return Activator.getImageDescriptor("icons/" + icon + ".gif");
  }

  public Image getImage()
  {
    return getImageDescriptor().createImage();
  }

  public Model add(String text, String icon)
  {
    Model child = new Model(text, icon);
    children.add(child);
    child.parent = this;
    return child;
  }

  @Override
  public String toString()
  {
    return text;
  }
}
