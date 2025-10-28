import java.util.*;
import java.math.BigInteger;

public class s840967243 {
    public static void main(String[] args) {
        final BigInteger MOD = BigInteger.valueOf(1000000007);
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] sorted = new int[]{n, m};
        Arrays.sort(sorted);
        n = sorted[0];
        m = sorted[1];
        
        BigInteger factN = factorial(n);
        BigInteger factM = factorial(m);
        int coefficient = Math.max(2 - m + n, 0);
        
        BigInteger result = BigInteger.valueOf(coefficient)
            .multiply(factN)
            .multiply(factM)
            .mod(MOD);
            
        System.out.println(result);
    }
    
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
