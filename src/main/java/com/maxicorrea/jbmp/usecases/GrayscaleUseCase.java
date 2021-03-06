package com.maxicorrea.jbmp.usecases;

import com.maxicorrea.jbmp.domain.Image;
import com.maxicorrea.jbmp.domain.Pixel;

public class GrayscaleUseCase extends AbstractUseCase {

  @Override
  Image applyAlgorithm(Image image) {
    Image result = new Image(image.getSize());
    for (int row = 0; row < result.getSize().getHeight(); ++row) {
      for (int col = 0; col < result.getSize().getWidth(); ++col) {
        Pixel pixel = image.getPixel(row, col);
        result.setPixel(row, col, Pixel.averageOfChannels(pixel));
      }
    }
    return result;
  }
}
