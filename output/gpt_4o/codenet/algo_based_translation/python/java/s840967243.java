
import java.util.Scanner;
import java.math.BigInteger;

public class s840967243 {

    static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated integers from input
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Calculate the result using the calculateValue method
        BigInteger result = calculateValue(n, m);

        // Print the result
        System.out.println(result);

        scanner.close();
    }

    public static BigInteger calculateValue(int n, int m) {
        // Ensure n <= m by sorting
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        // Calculate factorials
        BigInteger factorialN = factorial(n);
        BigInteger factorialM = factorial(m);

        // Calculate the expression `max(2 - m + n, 0) * f(n) * f(m) % MOD`
        int maxValue = Math.max(2 - m + n, 0);
        BigInteger result = BigInteger.valueOf(maxValue)
                                       .multiply(factorialN)
                                       .multiply(factorialM)
                                       .mod(MOD);

        return result;
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

