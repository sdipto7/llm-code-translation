import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MOD = 1000000007;
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        BigInteger lcm = BigInteger.ONE;
        for (int a : A) {
            BigInteger current = BigInteger.valueOf(a);
            BigInteger gcd = lcm.gcd(current);
            lcm = lcm.multiply(current).divide(gcd);
        }
        
        BigInteger sum = BigInteger.ZERO;
        for (int s : A) {
            BigInteger modInverse = BigInteger.valueOf(s).modInverse(BigInteger.valueOf(MOD));
            sum = sum.add(modInverse);
        }
        
        BigInteger ans = lcm.multiply(sum).mod(BigInteger.valueOf(MOD));
        System.out.println(ans.intValue());
    }
}
