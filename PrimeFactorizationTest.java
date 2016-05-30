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
    assertArrayEquals(
      new int[] {},
      PrimeFactorization.ofInteger(1)
    );
  }

  @Test
  public void thePrimeFactorizationOf2Is2() {
    assertArrayEquals(
      new int[] {2},
      PrimeFactorization.ofInteger(2)
    );
  }

  @Test
  public void thePrimeFactorizationOf3Is3() {
    assertArrayEquals(
      new int[] {3},
      PrimeFactorization.ofInteger(3)
    );
  }

  @Test
  public void thePrimeFactorizationOf5Is5() {
    assertArrayEquals(
      new int[] {5},
      PrimeFactorization.ofInteger(5)
    );
  }

  @Test
  public void thePrimeFactorizationOf30Is2And3And5() {
    assertArrayEquals(
      new int[] {2, 3, 5},
      PrimeFactorization.ofInteger(30)
    );
  }

  @Test
  public void thePrimeFactorizationOf60Is2And2And3And5() {
    assertArrayEquals(
      new int[] {2, 2, 3, 5},
      PrimeFactorization.ofInteger(60)
    );
  }

  @Test
  public void thePrimeFactorizationOf90Is2And3And3And5() {
    assertArrayEquals(
      new int[] {2, 3, 3, 5},
      PrimeFactorization.ofInteger(90)
    );
  }

  @Test
  public void thePrimeFactorizationOf150Is2And3And5And5() {
    assertArrayEquals(
      new int[] {2, 3, 5, 5},
      PrimeFactorization.ofInteger(150)
    );
  }

  @Test
  public void thePrimeFactorizationOf3030Is2And3And5And101() {
    assertArrayEquals(
      new int[] {2, 3, 5, 101},
      PrimeFactorization.ofInteger(3030)
    );
  }
}
