package cdoclient;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory
{

  public void createInitialLayout(IPageLayout layout)
  {
    String editorArea = layout.getEditorArea();
    layout.setEditorAreaVisible(true);
    // layout.setFixed(true);

    layout.addStandaloneView(ModelView.ID, false, IPageLayout.LEFT, 0.3f, editorArea);
  }

}
