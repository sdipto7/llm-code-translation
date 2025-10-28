
import java.util.*;
import java.math.BigInteger;

public class s817205687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long a = scanner.nextLong();
            A.add(a / 2);
        }

        Integer countDiv2 = null;
        for (long a : A) {
            long current = a;
            int cnt = 0;
            while (current % 2 == 0) {
                current /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
                countDiv2 = cnt;
            } else if (cnt != countDiv2) {
                System.out.println(0);
                return;
            }
        }

        BigInteger myLCM = BigInteger.ONE;
        for (long num : A) {
            BigInteger bigNum = BigInteger.valueOf(num);
            myLCM = lcm(myLCM, bigNum);
        }

        if (myLCM.compareTo(BigInteger.valueOf(M)) > 0) {
            System.out.println(0);
            return;
        }

        long tmp = M / myLCM.longValue();
        int ans = (int) ((tmp + 1) / 2);
        System.out.println(ans);
    }

    private static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(a.gcd(b));
    }
}

