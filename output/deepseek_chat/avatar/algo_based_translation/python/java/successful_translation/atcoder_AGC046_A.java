import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        BigInteger gcdValue = BigInteger.valueOf(360).gcd(BigInteger.valueOf(x));
        int result = 360 / gcdValue.intValue();
        System.out.println(result);
    }
}
