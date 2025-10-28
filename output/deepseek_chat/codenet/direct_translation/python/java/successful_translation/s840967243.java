import java.util.*;
import java.math.*;

public class s840967243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = (int)1e9+7;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = {n, m};
        Arrays.sort(arr);
        n = arr[0];
        m = arr[1];
        BigInteger fN = factorial(n);
        BigInteger fM = factorial(m);
        BigInteger result = BigInteger.valueOf(Math.max(2 - m + n, 0)).multiply(fN).multiply(fM).mod(BigInteger.valueOf(MOD));
        System.out.println(result);
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
