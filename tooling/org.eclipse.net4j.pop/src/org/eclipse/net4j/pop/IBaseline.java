package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.code.ITag;
import org.eclipse.net4j.pop.util.IElement;

/**
 * @author Eike Stepper
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IBaseline extends IElement
{
  public IStream getStream();

  public ITag getTag();
}
