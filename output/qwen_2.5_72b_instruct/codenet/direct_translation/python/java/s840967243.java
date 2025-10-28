import java.math.BigInteger;
import java.util.Scanner;

public class s840967243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        BigInteger MOD = new BigInteger("1000000007");
        BigInteger f_n = factorial(n);
        BigInteger f_m = factorial(m);
        BigInteger result = BigInteger.valueOf(Math.max(2 - m + n, 0)).multiply(f_n).multiply(f_m).mod(MOD);
        System.out.println(result);
    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}
