
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MOD = 1000000007;
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long _lcm = 1;
        for (int a : A) {
            _lcm = lcm(_lcm, a);
        }
        long sum = 0;
        for (int s : A) {
            sum = (sum + modInverse(s, MOD)) % MOD;
        }
        long ans = (_lcm * sum) % MOD;
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static long modInverse(long a, long m) {
        return new BigInteger(Long.toString(a)).modInverse(BigInteger.valueOf(m)).longValue();
    }
}

