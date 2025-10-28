
import java.util.Scanner;
import java.math.BigInteger;

public class s840967243 {
    public static void main(String[] args) {
        int MOD = 1000000007;
        BigInteger f = BigInteger.ONE;
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int n = Math.min(a, b);
        int m = Math.max(a, b);
        
        int maxVal = Math.max(2 - m + n, 0);
        
        BigInteger factorialN = factorial(n);
        BigInteger factorialM = factorial(m);
        
        BigInteger result = BigInteger.valueOf(maxVal).multiply(factorialN).multiply(factorialM).mod(BigInteger.valueOf(MOD));
        
        System.out.println(result);
    }
    
    public static BigInteger factorial(int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

