import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class PrimeFactorizationTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void thereIsNoPrimeFactorizationOf0() {
    thrown.expect(IllegalArgumentException.class);
    PrimeFactorization.ofInteger(0);
  }

  @Test
  public void thePrimeFactorizationOf1IsAnEmptySet() {
    int[] expected = {};
    int[] actual = PrimeFactorization.ofInteger(1);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf2Is2() {
    int[] expected = {2};
    int[] actual = PrimeFactorization.ofInteger(2);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf3Is3() {
    int[] expected = {3};
    int[] actual = PrimeFactorization.ofInteger(3);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf5Is5() {
    int[] expected = {5};
    int[] actual = PrimeFactorization.ofInteger(5);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf30Is2And3And5() {
    int[] expected = {2, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(30);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf60Is2And2And3And5() {
    int[] expected = {2, 2, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(60);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf90Is2And3And3And5() {
    int[] expected = {2, 3, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(90);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf150Is2And3And5And5() {
    int[] expected = {2, 3, 5, 5};
    int[] actual = PrimeFactorization.ofInteger(150);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void thePrimeFactorizationOf3030Is2And3And5And101() {
    int[] expected = {2, 3, 5, 101};
    int[] actual = PrimeFactorization.ofInteger(3030);
    assertArrayEquals(expected, actual);
  }
}
