import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        BigInteger _lcm = BigInteger.ONE;
        for (int a : A) {
            _lcm = _lcm.multiply(BigInteger.valueOf(a)).divide(_lcm.gcd(BigInteger.valueOf(a)));
        }
        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger sum = BigInteger.ZERO;
        for (int s : A) {
            sum = sum.add(BigInteger.valueOf(s).modInverse(MOD));
        }
        BigInteger ans = _lcm.multiply(sum).mod(MOD);
        System.out.println(ans);
    }
}
