
import java.util.Scanner;
import java.math.BigInteger;

public class s790754864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        int R = N - K;
        BigInteger mod = BigInteger.valueOf((long) (Math.pow(10, 9) + 7));

        for (int i = 1; i <= K; i++) {
            BigInteger ans;
            if (N - K + 1 < i) {
                ans = BigInteger.ZERO;
            } else {
                BigInteger factRPlus1I = binomialCoefficient(R + 1, i);
                BigInteger factKMinus1IMinus1 = binomialCoefficient(K - 1, i - 1);
                ans = factRPlus1I.multiply(factKMinus1IMinus1);
            }
            System.out.println(ans.mod(mod));
        }
    }

    public static BigInteger binomialCoefficient(int n, int r) {
        if (r > n - r) {
            r = n - r;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }
}

