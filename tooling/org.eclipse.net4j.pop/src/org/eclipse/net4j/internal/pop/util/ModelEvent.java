package org.eclipse.net4j.internal.pop.util;

import org.eclipse.net4j.util.event.Event;

/**
 * @author Eike Stepper
 */
public class ModelEvent extends Event
{
  private static final long serialVersionUID = 1L;

  private Kind kind;

  public ModelEvent(ModelManager modelManager, Kind kind)
  {
    super(modelManager);
    this.kind = kind;
  }

  public ModelManager getModelManager()
  {
    return (ModelManager)super.getSource();
  }

  public Kind getKind()
  {
    return kind;
  }

  /**
   * @author Eike Stepper
   */
  public static enum Kind
  {
    MODEL_AVAILABLE, MODEL_UNAVAILABLE, MODEL_REFRESHED
  }
}
