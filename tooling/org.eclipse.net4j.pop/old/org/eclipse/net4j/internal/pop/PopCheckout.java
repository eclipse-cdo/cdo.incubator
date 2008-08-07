/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.api.pop.IPop;
import org.eclipse.net4j.api.pop.IPopCheckout;
import org.eclipse.net4j.api.pop.model.IModelManager;
import org.eclipse.net4j.internal.pop.model.ModelEvent;
import org.eclipse.net4j.internal.pop.model.ModelManager;
import org.eclipse.net4j.pop.product.PopProduct;
import org.eclipse.net4j.pop.project.impl.CheckoutImpl;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

/**
 * @author Eike Stepper
 */
public class PopCheckout extends CheckoutImpl implements IPopCheckout
{
  private IPop pop;

  private ProductModelManager productModelManager;

  public PopCheckout()
  {
  }

  public IPop getPop()
  {
    return pop;
  }

  public IModelManager<PopProduct> getProductModelManager()
  {
    return productModelManager;
  }

  public PopProduct getProductModel()
  {
    return productModelManager.getModel();
  }

  public int compareTo(IPopCheckout o)
  {
    int result = getPop().compareTo(o.getPop());
    if (result == 0)
    {
      result = getId().compareTo(o.getId());
    }

    return result;
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  protected void handleProductModelEvent(ModelEvent.Kind kind)
  {
  }

  /**
   * @author Eike Stepper
   */
  private final class ProductModelManager extends ModelManager<PopProduct>
  {
    public ProductModelManager(IPath modelEntry)
    {
      super(modelEntry, getPop().getResourceSet());
    }

    @Override
    protected void fireModelEvent(ModelEvent.Kind kind)
    {
      super.fireModelEvent(kind);
      handleProductModelEvent(kind);
    }
  }
}
