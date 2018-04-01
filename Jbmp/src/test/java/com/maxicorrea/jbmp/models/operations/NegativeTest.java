package com.maxicorrea.jbmp.models.operations;

import static org.junit.Assert.*;
import org.junit.Test;
import com.maxicorrea.jbmp.models.core.Image;
import com.maxicorrea.jbmp.models.core.Pixel;
import com.maxicorrea.jbmp.models.core.Size;

public class NegativeTest {

  @Test
  public void shouldNegativePassEachPixelOfTheImage() {
    Image actualImage = new Image( new Size(2,2));
    actualImage.setPixel(0,0, new Pixel(10,56,65));
    actualImage.setPixel(0,1, new Pixel(20,16,5));
    actualImage.setPixel(1,0, new Pixel(30,36,15));
    actualImage.setPixel(1,1, new Pixel(40,56,25));
    Image expectedImage = new Image( new Size(2,2));
    expectedImage.setPixel(0,0, new Pixel(245,199,190));
    expectedImage.setPixel(0,1, new Pixel(235,239,250));
    expectedImage.setPixel(1,0, new Pixel(225,219,240));
    expectedImage.setPixel(1,1, new Pixel(215,199,230));
    assertEquals(expectedImage , new Negative().apply(actualImage));
  }

}
