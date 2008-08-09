package org.eclipse.net4j.pop.model;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.natures.NatureManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.core.resources.IProject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public abstract class ModelRegistrar<T extends EObject> extends NatureManager
{
  private IModelManager modelManager;

  private IModelHandler<T> modelHandler;

  private String resourcePath;

  private Map<URI, IModelRegistration<T>> registrations = new HashMap<URI, IModelRegistration<T>>();

  public ModelRegistrar(IModelManager modelManager, IModelHandler<T> modelHandler, String natureID, String resourcePath)
  {
    super(natureID);
    this.modelManager = modelManager;
    this.modelHandler = modelHandler;
    this.resourcePath = resourcePath;
  }

  public IModelManager getModelManager()
  {
    return modelManager;
  }

  public IModelHandler<T> getModelHandler()
  {
    return modelHandler;
  }

  public String getResourcePath()
  {
    return resourcePath;
  }

  @Override
  protected void projectAdded(IProject project)
  {
    try
    {
      super.projectAdded(project);
      URI uri = getResourceURI(project);
      IModelRegistration<T> registration = modelManager.register(uri, modelHandler);
      registrations.put(uri, registration);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }
  }

  @Override
  protected void projectRemoved(IProject project)
  {
    try
    {
      super.projectRemoved(project);
      URI uri = getResourceURI(project);
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

  private URI getResourceURI(IProject project)
  {
    String path = project.getName() + "/" + resourcePath;
    return URI.createPlatformResourceURI(path, false);
  }
}
