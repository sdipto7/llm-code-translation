
import java.util.Scanner;
import java.math.BigInteger;

public class s790754864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;
        BigInteger mod = BigInteger.valueOf(1000000007);
        
        for (int i = 1; i <= K; i++) {
            BigInteger ans;
            if (N - K + 1 < i) {
                ans = BigInteger.ZERO;
            } else {
                BigInteger term1 = fact(R + 1, i);
                BigInteger term2 = fact(K - 1, i - 1);
                ans = term1.multiply(term2);
            }
            BigInteger result = ans.mod(mod);
            System.out.println(result);
        }
    }
    
    private static BigInteger fact(int n, int r) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(n - r).multiply(factorial(r));
        return numerator.divide(denominator);
    }
    
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

