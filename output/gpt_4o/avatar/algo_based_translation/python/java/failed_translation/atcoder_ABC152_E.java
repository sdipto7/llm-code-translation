
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC152_E {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static long modInverse(long a, long m) {
        return BigInteger.valueOf(a).modInverse(BigInteger.valueOf(m)).longValue();
    }

    public static void main(String[] args) {
        final long MOD = 1_000_000_007;
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        long _lcm = 1;
        for (long a : A) {
            _lcm = lcm(_lcm, a);
        }

        long inverseSum = 0;
        for (long s : A) {
            inverseSum = (inverseSum + modInverse(s, MOD)) % MOD;
        }

        long ans = (_lcm % MOD) * (inverseSum % MOD) % MOD;

        System.out.println(ans);
    }
}

