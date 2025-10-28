
import java.util.Scanner;
import java.math.BigInteger;

public class s790754864 {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;

        for (int i = 1; i <= K; i++) {
            BigInteger ans;
            if (R + 1 < i) {
                ans = BigInteger.ZERO;
            } else {
                BigInteger comb1 = combination(R + 1, i);
                BigInteger comb2 = combination(K - 1, i - 1);
                ans = comb1.multiply(comb2);
            }
            ans = ans.mod(MOD);
            System.out.println(ans);
        }
    }

    private static BigInteger combination(int n, int r) {
        if (r < 0 || r > n) return BigInteger.ZERO;
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(n - r).multiply(factorial(r));
        return numerator.divide(denominator);
    }

    private static BigInteger factorial(int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

