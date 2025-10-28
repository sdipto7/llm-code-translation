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
            BigInteger ans;
            if (N - K + 1 < i) {
                ans = BigInteger.ZERO;
            } else {
                ans = fact(R + 1, i).multiply(fact(K - 1, i - 1));
            }
            System.out.println(ans.mod(BigInteger.valueOf(mod)));
        }
    }

    public static BigInteger fact(int n, int r) {
        return factorial(n).divide(factorial(n - r).multiply(factorial(r)));
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
