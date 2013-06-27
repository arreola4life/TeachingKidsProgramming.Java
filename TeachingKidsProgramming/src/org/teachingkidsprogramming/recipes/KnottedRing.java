package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //      createColorPalette (recipe below) --#6
    //      ------------- Recipe for createColorPalette --#6
    createColorPalette();
    //      ------------- End of createColorPalette recipe --#6
    //      Do the following 30 times --#10
    for (int i = 1; i <= 30; i++)
    {
      //              Change the color of the line the tortoise draws to a random color from the color wheel --#5
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      //              ------------- Recipe for drawOctagonWithOverlap --#7
      drawOctagonWithOverlap();
      //              ------------- End of drawOctagonWithOverlap recipe --#7
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
      //       Repeat 
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Pinks.HotPink);
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Pinks.Fuchsia);
    ColorWheel.addColor(Colors.Oranges.OrangeRed);
    ColorWheel.addColor(Colors.Pinks.DeepPink);
    ColorWheel.addColor(Colors.Reds.MediumVioletRed);
    ColorWheel.addColor(Colors.Reds.Crimson);
    ColorWheel.addColor(Colors.Reds.Tomato);
  }
  private static void drawOctagonWithOverlap()
  {
    for (int i = 1; i <= 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
}
