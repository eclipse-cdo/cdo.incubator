package org.eclipse.net4j.pop;

import java.util.Date;

/**
 * @author Eike Stepper
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IDateBaseline extends IBaseline
{
  public Date getDate();
}
