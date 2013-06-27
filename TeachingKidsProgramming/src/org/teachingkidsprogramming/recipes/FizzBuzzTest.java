package org.teachingkidsprogramming.recipes;

import junit.framework.Assert;

import org.junit.Test;

public class FizzBuzzTest
{
  //1 produces 1
  @Test
  public void test1Produces1()
  {
    Assert.assertEquals("1", FizzBuzz.convert(1));
  }
  //2 produces 2
  @Test
  public void test2Produces2()
  {
    Assert.assertEquals("2", FizzBuzz.convert(2));
  }
  //3 makes Fizz
  @Test
  public void test3ProducesFizz()
  {
    Assert.assertEquals("Fizz", FizzBuzz.convert(3));
  }
  //4 makes 4
  @Test
  public void test4Produces4()
  {
    Assert.assertEquals("4", FizzBuzz.convert(4));
  }
  //5 makes Buzz
  @Test
  public void testMultiplesOf5ProduceBuzz()
  {
    Assert.assertEquals("Buzz", FizzBuzz.convert(5));
  }
  //6 makes Fizz
  @Test
  public void testMulitplesOf3ProduceFizz()
  {
    Assert.assertEquals("Fizz", FizzBuzz.convert(6));
  }
  //6 makes Fizz
  @Test
  public void testMulitplesOf3and5ProduceFizzBuzz()
  {
    Assert.assertEquals("FizzBuzz", FizzBuzz.convert(15));
  }
}
