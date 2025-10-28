
import java.util.Scanner;
import java.math.BigInteger;

public class s840967243 {
    private static final BigInteger MOD = BigInteger.valueOf((long) (1e9 + 7));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        BigInteger n = BigInteger.valueOf(Long.parseLong(inputs[0]));
        BigInteger m = BigInteger.valueOf(Long.parseLong(inputs[1]));

        if (n.compareTo(m) > 0) {
            BigInteger temp = n;
            n = m;
            m = temp;
        }

        BigInteger maxValue = BigInteger.valueOf(2).subtract(m).add(n).max(BigInteger.ZERO);
        BigInteger factorialN = factorial(n);
        BigInteger factorialM = factorial(m);

        BigInteger result = maxValue.multiply(factorialN).multiply(factorialM).mod(MOD);
        System.out.println(result);
    }

    private static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }
}

