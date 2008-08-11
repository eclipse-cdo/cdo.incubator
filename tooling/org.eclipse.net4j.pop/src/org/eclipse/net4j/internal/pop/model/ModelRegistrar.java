package org.eclipse.net4j.internal.pop.model;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.natures.NatureManager;
import org.eclipse.net4j.pop.model.IModelHandler;
import org.eclipse.net4j.pop.model.IModelManager;
import org.eclipse.net4j.pop.model.IModelRegistration;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.core.resources.IProject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public abstract class ModelRegistrar<T extends EObject, INCOMING> extends Lifecycle
{
  private IModelManager modelManager;

  private IModelHandler<T> modelHandler;

  private Map<URI, IModelRegistration<T>> registrations = new HashMap<URI, IModelRegistration<T>>();

  public ModelRegistrar(IModelManager modelManager, IModelHandler<T> modelHandler)
  {
    this.modelManager = modelManager;
    this.modelHandler = modelHandler;
  }

  public IModelManager getModelManager()
  {
    return modelManager;
  }

  public IModelHandler<T> getModelHandler()
  {
    return modelHandler;
  }

  public void addRegistration(INCOMING object)
  {
    try
    {
      URI uri = getResourceURI(object);
      IModelRegistration<T> registration = modelManager.register(uri, modelHandler);
      registrations.put(uri, registration);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }
  }

  public void removeRegistration(INCOMING object)
  {
    try
    {
      URI uri = getResourceURI(object);
      IModelRegistration<T> registration = registrations.get(uri);
      if (registration != null)
      {
        registration.cancel();
      }
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    for (IModelRegistration<T> registration : registrations.values())
    {
      registration.cancel();
    }

    registrations = null;
    super.doDeactivate();
  }

  protected abstract URI getResourceURI(INCOMING object);

  /**
   * @author Eike Stepper
   */
  public static class NatureBased<T extends EObject> extends ModelRegistrar<T, IProject>
  {
    private NatureManager natureManager;

    private String resourcePath;

    public NatureBased(IModelManager modelManager, IModelHandler<T> modelHandler, String natureID, String resourcePath)
    {
      super(modelManager, modelHandler);
      this.resourcePath = resourcePath;
      natureManager = new NatureManager(natureID)
      {
        @Override
        protected void projectAdded(IProject project)
        {
          super.projectAdded(project);
          addRegistration(project);
        }

        @Override
        protected void projectRemoved(IProject project)
        {
          super.projectRemoved(project);
          removeRegistration(project);
        }
      };
    }

    public NatureManager getNatureManager()
    {
      return natureManager;
    }

    public String getResourcePath()
    {
      return resourcePath;
    }

    @Override
    protected void doActivate() throws Exception
    {
      super.doActivate();
      natureManager.activate();
    }

    @Override
    protected void doDeactivate() throws Exception
    {
      natureManager.deactivate();
      super.doDeactivate();
    }

    @Override
    protected URI getResourceURI(IProject project)
    {
      String path = project.getName() + "/" + resourcePath;
      return URI.createPlatformResourceURI(path, false);
    }
  }
}
