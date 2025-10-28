
import java.util.Scanner;
import java.math.BigInteger;

public class s840967243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long MOD = 1000000007;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        BigInteger factorialN = factorial(n);
        BigInteger factorialM = factorial(m);
        BigInteger result = BigInteger.valueOf(Math.max(2 - m + n, 0))
                                .multiply(factorialN)
                                .multiply(factorialM)
                                .mod(BigInteger.valueOf(MOD));
        System.out.println(result);
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

