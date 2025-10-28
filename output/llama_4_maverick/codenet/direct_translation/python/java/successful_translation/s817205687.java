
import java.util.*;

public class s817205687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong() / 2;
        }

        Integer countDiv2 = null;
        for (long a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
                countDiv2 = cnt;
            } else if (cnt != countDiv2) {
                System.out.println(0);
                return;
            }
        }

        long myLcm = lcmList(A);
        if (myLcm > M) {
            System.out.println(0);
            return;
        }

        long tmp = M / myLcm;
        long ans = (tmp + 1) / 2;
        System.out.println(ans);
    }

    public static long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    public static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    public static long lcmList(long[] numbers) {
        long lcm = 1;
        for (long num : numbers) {
            lcm = lcm(num, lcm);
        }
        return lcm;
    }
}

