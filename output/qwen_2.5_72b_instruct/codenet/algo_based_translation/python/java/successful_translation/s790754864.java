import java.math.BigInteger;
import java.util.Scanner;

public class s790754864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;
        int mod = 1000000007;

        for (int i = 1; i <= K; i++) {
            long ans;
            if (N - K + 1 < i) {
                ans = 0;
            } else {
                ans = fact(R + 1, i) * fact(K - 1, i - 1);
            }
            System.out.println(ans % mod);
        }
    }

    public static long fact(int n, int r) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(n - r).multiply(factorial(r));
        return numerator.divide(denominator).longValue();
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
