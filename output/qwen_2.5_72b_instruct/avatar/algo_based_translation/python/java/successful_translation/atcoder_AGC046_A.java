
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 360 / gcd(360, x);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);
        return bigA.gcd(bigB).intValue();
    }
}

