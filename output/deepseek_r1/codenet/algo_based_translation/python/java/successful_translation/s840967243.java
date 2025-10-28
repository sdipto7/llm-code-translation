
import java.math.BigInteger;
import java.util.Scanner;

public class s840967243 {
    public static void main(String[] args) {
        final BigInteger MOD = BigInteger.valueOf(1000000007);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = Math.min(a, b);
        int m = Math.max(a, b);
        int coefficient = Math.max(2 - (m - n), 0);
        BigInteger factN = factorial(n);
        BigInteger factM = factorial(m);
        BigInteger result = factN.multiply(factM).multiply(BigInteger.valueOf(coefficient)).mod(MOD);
        System.out.println(result);
    }

    private static BigInteger factorial(int x) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}

