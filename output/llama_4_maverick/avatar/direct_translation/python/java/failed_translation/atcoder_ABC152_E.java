
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
        long lcm = 1;
        for (long a : A) {
            lcm = lcm * a / gcd(lcm, a);
        }
        long ans = lcm * sum(A, MOD) % MOD;
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long sum(long[] A, long MOD) {
        long sum = 0;
        for (long s : A) {
            sum = (sum + modInverse(s, MOD)) % MOD;
        }
        return sum;
    }

    public static long modInverse(long a, long m) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger m1 = BigInteger.valueOf(m);
        return b1.modInverse(m1).longValue();
    }
}

