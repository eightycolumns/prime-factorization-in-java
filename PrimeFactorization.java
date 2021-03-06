import java.util.Arrays;

class PrimeFactorization {
  private PrimeFactorization() {}

  public static int[] ofInteger(int d) {
    if (d < 1) {
      throw new IllegalArgumentException(
        "PrimeFactorization.ofInteger() expects positive integer."
      );
    }

    int[] a = {};

    for (int i = 2; i <= d; i += 1) {
      while (d % i == 0) {
        a = push(i, a);
        d /= i;
      }
    }

    return a;
  }

  private static int[] push(int d, int[] a) {
    a = Arrays.copyOf(a, a.length + 1);
    a[a.length - 1] = d;

    return a;
  }
}
