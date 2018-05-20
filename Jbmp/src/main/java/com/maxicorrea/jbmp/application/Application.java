package com.maxicorrea.jbmp.application;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import com.maxicorrea.jbmp.controllers.EssentialsController;
import com.maxicorrea.jbmp.controllers.OperationController;
import com.maxicorrea.jbmp.models.core.Editor;
import com.maxicorrea.jbmp.views.EditorView;
import com.maxicorrea.jbmp.views.ImageView;

public class Application {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      try {
        UIManager.setLookAndFeel(new NimbusLookAndFeel()); 
      } catch (UnsupportedLookAndFeelException e) {
        System.err.println(e);
      }
      EditorView view = new EditorView(new ImageView());
      initializeApp(new Editor(), view);
      view.show();
    });
  }

  static void initializeApp(Editor model, EditorView view) {
    model.addObserver(view.getImageView());
    new OperationController(view, model);
    new EssentialsController(view, model);
  }

}
