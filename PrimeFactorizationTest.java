import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrimeFactorizationTest {
  @Test
  public void testPrimeFactorizationOf30() {
    int[] expected = {2, 3, 5};
    int[] actual = PrimeFactorization.ofInteger(30);
    assertArrayEquals(expected, actual);
  }
}
