
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long MOD = (long) (1e9 + 7);
        long _lcm = 1;
        for (long a : A) {
            _lcm = lcm(_lcm, a);
        }
        long sum = 0;
        for (long s : A) {
            sum = (sum + modInverse(s, MOD)) % MOD;
        }
        long ans = (_lcm * sum) % MOD;
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;
        if (m == 1) return 0;
        while (a > 1) {
            long q = a / m;
            long t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0) x += m0;
        return x;
    }
}

