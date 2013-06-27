package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    //If i/15 has a remainder of 0, give FizzBuzz
    if (i % 15 == 0)
    {
      return "FizzBuzz";
    }
    //If i/3 has a remainder of 0, give Fizz
    else if (i % 3 == 0)
    {
      return "Fizz";
    }
    //And if i/5 has a remainder of 0, give Buzz
    else if (i % 5 == 0)
    {
      return "Buzz";
    }
    //If not, change i to string
    else
    {
      return "" + i;
    }
  }
}
