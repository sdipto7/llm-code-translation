import java.math.BigInteger;
import java.util.Scanner;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        final long MOD = 1000000007;
        BigInteger modBig = BigInteger.valueOf(MOD);
        long sum = 0;
        for (int a : A) {
            BigInteger aBig = BigInteger.valueOf(a);
            BigInteger inverse = aBig.modInverse(modBig);
            sum = (sum + inverse.longValue()) % MOD;
        }
        long ans = lcm.mod(modBig).longValue() * sum % MOD;
        System.out.println(ans);
    }
}
