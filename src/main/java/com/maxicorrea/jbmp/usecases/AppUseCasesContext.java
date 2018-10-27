package com.maxicorrea.jbmp.usecases;

public class AppUseCasesContext {

  public static UseCase applyBlurUseCase;

  public static UseCase applyEdgesUseCase;

  public static UseCase applyGrayscaleUseCase;

  public static UseCase applyHorizontalUseCase;

  public static UseCase applyLeftUseCase;

  public static UseCase applyNegativeUseCase;

  public static UseCase applyResetUseCase;

  public static UseCase applyRightUseCase;

  public static UseCase applySepiaUseCase;

  public static UseCase applyVerticalUseCase;

  public static UseCase openImageUseCase;

  public static UseCase saveImageUseCase;

  public AppUseCasesContext() {
    applyBlurUseCase = new BlurUseCase();
    applyEdgesUseCase = new EdgesUseCase();
    applyGrayscaleUseCase = new GrayscaleUseCase();
    applyHorizontalUseCase = new HorizontalUseCase();
    applyLeftUseCase = new LeftUseCase();
    applyNegativeUseCase = new NegativeUseCase();
    applyResetUseCase = new ResetUseCase();
    applyRightUseCase = new RightUseCase();
    applySepiaUseCase = new SepiaUseCase();
    applyVerticalUseCase = new VerticalUseCase();
    openImageUseCase = new OpenImageUseCase();
    saveImageUseCase = new SaveUseCase();
  }

}
