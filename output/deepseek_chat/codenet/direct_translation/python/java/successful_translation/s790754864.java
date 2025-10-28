import java.util.Scanner;
import java.math.BigInteger;

public class s790754864 {
    static final BigInteger MOD = BigInteger.valueOf(1000000007);

    static BigInteger fact(int n, int r) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(n - r).multiply(factorial(r));
        return numerator.divide(denominator);
    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = N - K;

        for (int i = 1; i <= K; i++) {
            BigInteger ans;
            if (N - K + 1 < i) {
                ans = BigInteger.ZERO;
            } else {
                ans = fact(R + 1, i).multiply(fact(K - 1, i - 1));
            }
            System.out.println(ans.mod(MOD));
        }
    }
}
