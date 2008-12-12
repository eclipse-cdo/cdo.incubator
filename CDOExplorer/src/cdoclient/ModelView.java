package cdoclient;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


/**
 * @author Eike Stepper
 */
public class ModelView extends ViewPart
{
  public static final String ID = "CDOClient.view";

  private TreeViewer viewer;

  /**
   * @author Eike Stepper
   */
  class ViewContentProvider implements ITreeContentProvider
  {
    Model root = new Model("root", null);

    public ViewContentProvider()
    {
      addRepository("tcp://repos.foo.org/repo1");
      addRepository("tcp://repos.foo.org/repo2");
      addRepository("jvm://filesystem/C:/Data/Repo");
    }

    void addRepository(String name)
    {
      Model repo = root.add(name, "repository");

      Model packages = repo.add("Packages", "packages");
      addPackage(packages, "http://www.foo.org/base/1.0");
      addPackage(packages, "http://www.foo.org/base/1.1");
      addPackage(packages, "http://www.foo.org/base/1.2");
      addPackage(packages, "http://www.foo.org/billing/1.0");
      addPackage(packages, "http://www.foo.org/billing/2.0");

      Model resources = repo.add("Resources", "resources");
      addBilling(resources.add("internal", "resource"), "Foo");

      Model clients = resources.add("clients", "folder");
      addBilling(clients.add("Client 3024", "resource"), "Eclipse Foundation");
      addBilling(clients.add("Client 8745", "resource"), "Apache Foundation");
      addBilling(clients.add("Client 9276", "resource"), "Mozilla Foundation");
      addBilling(clients.add("Client 9339", "resource"), "Another Foundation");
    }

    void addPackage(Model packages, String name)
    {
      Model p = packages.add(name, "package");
      {
        Model c = p.add("Company", "EClass");
        c.add("name : String", "EAttribute");
        c.add("owner : String", "EAttribute");
        c.add("partners : Company*", "EReference");
      }
      {
        Model c = p.add("Customer", "EClass");
        c.add("CDOMapping", "EAnnotation");
        c.add("name : String", "EAttribute");
      }
      {
        Model c = p.add("Order", "EClass");
        c.add("id : int", "EAttribute");
        c.add("state _ OrderState", "EAttribute");
        c.add("customer : Customer", "EReference");
        c.add("details : OrderDetail*", "EReference");
      }
      {
        Model c = p.add("OrderState", "EEnum");
        c.add("ORDERED", "EEnumLiteral");
        c.add("DELIVERED", "EEnumLiteral");
        c.add("BILLED", "EEnumLiteral");
        c.add("PAYED", "EEnumLiteral");
      }
    }

    void addBilling(Model model, String name)
    {
      Model company = model.add(name, "company");

      Model products = company.add("Products", "products");
      products.add("Apple", "product");
      products.add("Pear", "product");
      products.add("Orange", "product");
      products.add("Pineapple", "product");

      Model customers = company.add("Customers", "customers");
      customers.add("Mr. Smith", "customer");
      customers.add("Mrs. Marple", "customer");
      customers.add("Mr. Stepper", "customer");

      Model order100 = company.add("100 - Mr. Smith", "order");
      order100.add("Apple (5x)", "orderdetail");
      order100.add("Pear (10x)", "orderdetail");
      Model order101 = company.add("101 - Mr. Smith", "order");
      order101.add("Pineapple (1x)", "orderdetail");
      order101.add("Pear (10x)", "orderdetail");
      Model order102 = company.add("102 - Mr. Stepper", "order");
      order102.add("Orange (5x)", "orderdetail");
      order102.add("Pineapple (2x)", "orderdetail");
      Model order103 = company.add("103 - Mr. Smith", "order");
      order103.add("Apple (5x)", "orderdetail");
      order103.add("Orange (10x)", "orderdetail");
    }

    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
    }

    public void dispose()
    {
    }

    public Object[] getElements(Object parent)
    {
      return getChildren(parent);
    }

    public Object[] getChildren(Object parentElement)
    {
      Model model = null;
      if (parentElement instanceof Model)
      {
        model = (Model)parentElement;
      }
      else if (parentElement == getViewSite())
      {
        model = root;
      }

      if (model != null)
      {
        return model.children.toArray(new Model[model.children.size()]);
      }

      return new Object[0];
    }

    public Object getParent(Object element)
    {
      if (element instanceof Model)
      {
        Model model = (Model)element;
        return model.parent;
      }

      return null;
    }

    public boolean hasChildren(Object element)
    {
      return getChildren(element).length != 0;
    }
  }

  /**
   * @author Eike Stepper
   */
  class ViewLabelProvider extends LabelProvider implements ITableLabelProvider
  {
    ImageRegistry images = new ImageRegistry();

    public ViewLabelProvider()
    {
    }

    public String getColumnText(Object obj, int index)
    {
      return getText(obj);
    }

    public Image getColumnImage(Object obj, int index)
    {
      return getImage(obj);
    }

    @Override
    public Image getImage(Object obj)
    {
      try
      {
        return ((Model)obj).getImage();
      }
      catch (Exception ignore)
      {
      }

      return null;
    }
  }

  /**
   * This is a callback that will allow us to create the viewer and initialize it.
   */
  @Override
  public void createPartControl(Composite parent)
  {
    viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new ViewLabelProvider());
    viewer.setInput(getViewSite());
    viewer.addDoubleClickListener(new IDoubleClickListener()
    {
      public void doubleClick(DoubleClickEvent event)
      {
        IStructuredSelection s = (IStructuredSelection)event.getSelection();
        Model element = (Model)s.getFirstElement();
        ModelEditor.open(getViewSite().getPage(), element);
      }
    });
  }

  /**
   * Passing the focus request to the viewer's control.
   */
  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }
}
