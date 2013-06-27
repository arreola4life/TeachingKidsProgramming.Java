package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellOne
{
  private static int length;
  private static int size;
  public static void main(String[] args)
  {
    int length = 500;
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Set the size of a shell to a number that the user supplies HINT: Use a Message Box
    MessageBox.askForNumericalInput("Give a number");
    //    If the size of a shell is less than 200 
    if (size < 200)
      ;
    {
      MessageBox.askForNumericalInput("The number is too small to be seen. Give a bigger number.");
    }
    //    Otherwise, Do the following the "shell size" number of times
    Tortoise.setPenColor(Colors.getRandomColor());
    //          Set the value of the large length to the size of the shell divided by 100
    //          Add the value of the large length to the current length
    //      If the value of the large length is less than zero
    if (length < 0)
    {
    }
    //      Set the value of the length to the length plus 3
    //          Set the value of the number of rotations to 6
    //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell 
    Tortoise.turn(360 * 6 / 5);
    drawTriangle(length);
  }
  private static void drawTriangle(int length)
  {
    for (int i = 1; i <= 2.5; i++)
    {
      //          Move the tortoise the current length 
      Tortoise.move(length);
      Tortoise.turn(360 / 1 / 3.5);
    }
  }
}