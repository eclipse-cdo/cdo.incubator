package org.eclipse.net4j.pop.code;

import org.eclipse.net4j.pop.util.IElement;

/**
 * @author Eike Stepper
 */
public interface IBranchContainer extends IElement
{
  public int getBranchCount();

  public IBranch getBranch(int index);

  public IBranch[] getBranchs();
}
