import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrimeFactorizationTest {
  @Test
  public void testPrimeFactorizationOf1() {
    int[] expected = {};
    int[] actual = PrimeFactorization.ofInteger(1);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf2() {
    int[] expected = {2};
    int[] actual = PrimeFactorization.ofInteger(2);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf3() {
    int[] expected = {3};
    int[] actual = PrimeFactorization.ofInteger(3);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf5() {
    int[] expected = {5};
    int[] actual = PrimeFactorization.ofInteger(5);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf30() {
    int[] expected = {2, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(30);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf60() {
    int[] expected = {2, 2, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(60);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf90() {
    int[] expected = {2, 3, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(90);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf150() {
    int[] expected = {2, 3, 5, 5};
    int[] actual = PrimeFactorization.ofInteger(150);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testPrimeFactorizationOf3030() {
    int[] expected = {2, 3, 5, 101};
    int[] actual = PrimeFactorization.ofInteger(3030);
    assertArrayEquals(expected, actual);
  }
}
