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
package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.bundle.OM;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.Event;
import org.eclipse.net4j.util.event.EventUtil;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.event.INotifier;
import org.eclipse.net4j.util.ui.actions.SafeAction;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public abstract class AbstractView<CONTENT> extends ViewPart
{
  private Notifier notifier = new Notifier();

  private PageSelectionListener pageSelectionListener = new PageSelectionListener();

  private ICheckStateListener checkStateListener = new CheckStateListener();

  private IListener frontendListener = new FrontendListener();

  private boolean subTreeChecking = true;

  private CheckboxTreeViewer viewer;

  public AbstractView()
  {
  }

  public INotifier getNotifier()
  {
    return notifier;
  }

  public CheckboxTreeViewer getViewer()
  {
    return viewer;
  }

  public boolean isSubTreeChecking()
  {
    return subTreeChecking;
  }

  public void setSubTreeChecking(boolean subTreeChecking)
  {
    this.subTreeChecking = subTreeChecking;
  }

  public Set<CONTENT> getAllChecked()
  {
    return getAllChecked(true);
  }

  public Set<CONTENT> getAllChecked(boolean checked)
  {
    Set<CONTENT> result = new HashSet<CONTENT>();
    for (CONTENT object : getContents())
    {
      if (viewer.getChecked(object) == checked)
      {
        result.add(object);
      }
    }

    return result;
  }

  public void setAllChecked(boolean checked)
  {
    try
    {
      viewer.removeCheckStateListener(checkStateListener);
      for (CONTENT object : getContents())
      {
        viewer.setChecked(object, checked);
      }
    }
    finally
    {
      viewer.addCheckStateListener(checkStateListener);
    }

    notifier.fireCheckStateChangedEvent();
  }

  @Override
  public void createPartControl(Composite parent)
  {
    synchronized (Frontend.INSTANCE)
    {
      ViewContentProvider contentProvider = new ViewContentProvider();

      viewer = new CheckboxTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
      viewer.setContentProvider(contentProvider);
      viewer.setLabelProvider(createLabelProvider(viewer.getControl().getDisplay()));
      viewer.setSorter(createSorter());
      viewer.setInput(getInput());
      viewer.addCheckStateListener(checkStateListener);

      setAllChecked(true);

      Tree tree = viewer.getTree();
      tree.addSelectionListener(new SubTreeSelectionAdapter(contentProvider, tree));

      getSite().setSelectionProvider(viewer);

      contributeToActionBars();
      hookDoubleClick();

      setInstance(this);
      Frontend.INSTANCE.addListener(frontendListener);
    }
  }

  protected void contributeToActionBars()
  {
    IActionBars bars = getViewSite().getActionBars();
    fillLocalPullDown(bars.getMenuManager());
    fillLocalToolBar(bars.getToolBarManager());
  }

  protected void fillLocalPullDown(IMenuManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    manager.add(new LinkAction());
    manager.add(new SubTreeCheckingAction());
  }

  protected void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    manager.add(new CollapseAllAction());
  }

  protected void hookDoubleClick()
  {
    viewer.addDoubleClickListener(new IDoubleClickListener()
    {
      public void doubleClick(DoubleClickEvent event)
      {
        ITreeSelection selection = (ITreeSelection)viewer.getSelection();
        Object object = selection.getFirstElement();
        doubleClicked(object);
      }
    });
  }

  protected void doubleClicked(Object object)
  {
    if (viewer.getExpandedState(object))
    {
      viewer.collapseToLevel(object, TreeViewer.ALL_LEVELS);
    }
    else
    {
      viewer.expandToLevel(object, TreeViewer.ALL_LEVELS);
    }
  }

  protected ViewerSorter createSorter()
  {
    return new NameSorter();
  }

  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }

  @Override
  public void dispose()
  {
    setInstance(null);
    getSite().getPage().removeSelectionListener(pageSelectionListener);
    Frontend.INSTANCE.removeListener(frontendListener);
    super.dispose();
  }

  public abstract Collection<CONTENT> getContents();

  public abstract Object getInput();

  public abstract Object[] getChildren(Object object);

  public abstract Object getParent(Object object);

  protected abstract IBaseLabelProvider createLabelProvider(Display display);

  protected abstract void handlePageSelectionObject(Object pageSelectionObject, Collection<CONTENT> contents,
      Set<Object> result);

  protected abstract void setInstance(AbstractView<CONTENT> view);

  /**
   * @author Eike Stepper
   */
  public static final class CheckStateEvent extends Event
  {
    private static final long serialVersionUID = 1L;

    public CheckStateEvent(INotifier notifier)
    {
      super(notifier);
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class CheckStateListener implements ICheckStateListener
  {
    public void checkStateChanged(CheckStateChangedEvent event)
    {
      if (subTreeChecking)
      {
        try
        {
          viewer.removeCheckStateListener(checkStateListener);
          viewer.setSubtreeChecked(event.getElement(), event.getChecked());
        }
        finally
        {
          viewer.addCheckStateListener(checkStateListener);
        }
      }

      notifier.fireCheckStateChangedEvent();
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class PageSelectionListener implements ISelectionListener
  {
    public void selectionChanged(IWorkbenchPart part, final ISelection selection)
    {
      if (selection instanceof IStructuredSelection)
      {
        IStructuredSelection ssel = (IStructuredSelection)selection;

        final Set<Object> result = new HashSet<Object>();
        Collection<CONTENT> contents = getContents();
        for (Iterator<?> it = ssel.iterator(); it.hasNext();)
        {
          Object object = it.next();
          handlePageSelectionObject(object, contents, result);
        }

        if (!result.isEmpty())
        {
          Display.getDefault().syncExec(new Runnable()
          {
            public void run()
            {
              @SuppressWarnings("unchecked")
              List<Object> list = ((StructuredSelection)viewer.getSelection()).toList();
              Set<Object> old = new HashSet<Object>(list);
              if (!ObjectUtil.equals(old, result))
              {
                viewer.setSelection(new StructuredSelection(result.toArray()), true);
              }
            }
          });
        }
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class SubTreeSelectionAdapter extends SelectionAdapter
  {
    private ITreeContentProvider contentProvider;

    private Tree tree;

    private SubTreeSelectionAdapter(ITreeContentProvider contentProvider, Tree tree)
    {
      this.contentProvider = contentProvider;
      this.tree = tree;
    }

    @Override
    public void widgetSelected(SelectionEvent e)
    {
      if ((e.stateMask & SWT.ALT) == SWT.ALT)
      {
        tree.removeSelectionListener(this);

        try
        {
          Object object = e.item.getData();
          List<Object> objects = new ArrayList<Object>();
          objects.add(object);

          addChildren(object, objects);
          viewer.setSelection(new StructuredSelection(objects), true);
        }
        finally
        {
          tree.addSelectionListener(this);
        }
      }
    }

    private void addChildren(Object object, List<Object> objects)
    {
      Object[] children = contentProvider.getChildren(object);
      for (Object child : children)
      {
        objects.add(child);
        addChildren(child, objects);
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class ViewContentProvider implements ITreeContentProvider
  {
    public ViewContentProvider()
    {
    }

    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
    }

    public void dispose()
    {
    }

    public Object[] getElements(Object object)
    {
      return getChildren(object);
    }

    public Object[] getChildren(Object object)
    {
      return AbstractView.this.getChildren(object);
    }

    public Object getParent(Object object)
    {
      return AbstractView.this.getParent(object);
    }

    public boolean hasChildren(Object object)
    {
      Object[] children = getChildren(object);
      return children != null && children.length != 0;
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class Notifier extends org.eclipse.net4j.util.event.Notifier
  {
    public void fireCheckStateChangedEvent()
    {
      fireEvent(new CheckStateEvent(this));
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class FrontendListener extends ContainerEventAdapter<Object>
  {
    @Override
    protected void onAdded(IContainer<Object> container, Object object)
    {
      addElement(object);
      refreshViewer();
    }

    @Override
    protected void onRemoved(IContainer<Object> container, Object object)
    {
      removeElement(object);
      refreshViewer();
    }

    private void refreshViewer()
    {
      try
      {
        viewer.getControl().getDisplay().asyncExec(new Runnable()
        {
          public void run()
          {
            try
            {
              viewer.refresh();
            }
            catch (Exception ignore)
            {
            }
          }
        });
      }
      catch (Exception ignore)
      {
      }
    }

    private void addElement(Object object)
    {
      for (Object child : getChildren(object))
      {
        addElement(child);
      }

      EventUtil.addListener(object, this);
    }

    private void removeElement(Object object)
    {
      EventUtil.removeListener(object, this);
      for (Object child : getChildren(object))
      {
        removeElement(child);
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class NameSorter extends ViewerSorter
  {
    public NameSorter()
    {
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class LinkAction extends SafeAction
  {
    private LinkAction()
    {
      super("Link With Page Selection", SWT.TOGGLE);
      setImageDescriptor(OM.Activator.INSTANCE.loadImageDescriptor("icons/synced.gif"));
    }

    @Override
    protected void safeRun() throws Exception
    {
      if (isChecked())
      {
        getSite().getPage().addSelectionListener(pageSelectionListener);
      }
      else
      {
        getSite().getPage().removeSelectionListener(pageSelectionListener);
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class SubTreeCheckingAction extends SafeAction
  {
    private SubTreeCheckingAction()
    {
      super("Sub Tree Checking", SWT.TOGGLE);
      setImageDescriptor(OM.Activator.INSTANCE.loadImageDescriptor("icons/subtree.gif"));
      setChecked(subTreeChecking);
    }

    @Override
    protected void safeRun() throws Exception
    {
      setSubTreeChecking(isChecked());
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class CollapseAllAction extends SafeAction
  {
    private CollapseAllAction()
    {
      super("Collapse All", SWT.TOGGLE);
      setImageDescriptor(OM.Activator.INSTANCE.loadImageDescriptor("icons/collapseall.gif"));
    }

    @Override
    protected void safeRun() throws Exception
    {
      viewer.collapseAll();
    }
  }
}
