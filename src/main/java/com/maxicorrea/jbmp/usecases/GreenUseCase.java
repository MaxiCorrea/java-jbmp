package com.maxicorrea.jbmp.usecases;

import com.maxicorrea.jbmp.domain.Image;
import com.maxicorrea.jbmp.domain.Pixel;

public class GreenUseCase extends AbstractUseCase {

  @Override
  Image applyAlgorithm(Image image) {
    Image result = new Image(image.getSize());
    for (int row = 0; row < result.getSize().getHeight(); ++row) {
      for (int col = 0; col < result.getSize().getWidth(); ++col) {
        Pixel pixel = image.getPixel(row, col);
        Pixel newPixel = new Pixel(0, pixel.getGreen(), 0);
        result.setPixel(row, col, newPixel);
      }
    }
    return result;
  }

}