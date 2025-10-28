
import java.math.BigInteger;
import java.util.Scanner;

public class atcoder_ABC152_E {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        String[] inputValues = scanner.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputValues[i]);
        }

        BigInteger lcm = BigInteger.ONE;
        for (int num : A) {
            BigInteger current = BigInteger.valueOf(num);
            BigInteger gcd = lcm.gcd(current);
            lcm = lcm.multiply(current).divide(gcd);
        }

        long sumInverses = 0;
        for (int num : A) {
            BigInteger inverse = BigInteger.valueOf(num)
                .modPow(BigInteger.valueOf(MOD - 2), BigInteger.valueOf(MOD));
            sumInverses = (sumInverses + inverse.longValue()) % MOD;
        }

        BigInteger lcmMod = lcm.mod(BigInteger.valueOf(MOD));
        long result = (lcmMod.longValue() * sumInverses) % MOD;
        System.out.println(result);
    }
}

