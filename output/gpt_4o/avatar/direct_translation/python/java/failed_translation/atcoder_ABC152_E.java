
import java.util.Scanner;

public class atcoder_ABC152_E {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }

    public static long modInverse(int a, int mod) {
        return pow(a, mod - 2, mod);
    }

    public static long pow(int base, int exp, int mod) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * b % mod;
            }
            b = b * b % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        final int MOD = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long _lcm = 1;
        for (int a : A) {
            _lcm = lcm((int) _lcm, a);
        }
        long sum = 0;
        for (int s : A) {
            sum = (sum + modInverse(s, MOD)) % MOD;
        }
        long ans = _lcm % MOD * sum % MOD;
        System.out.println(ans % MOD);
    }
}

