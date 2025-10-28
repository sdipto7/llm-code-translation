
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        
        int gcdValue = BigInteger.valueOf(360).gcd(BigInteger.valueOf(x)).intValue();
        int result = 360 / gcdValue;
        
        System.out.println(result);
    }
}

