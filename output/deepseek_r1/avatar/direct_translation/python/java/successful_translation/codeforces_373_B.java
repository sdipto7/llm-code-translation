
import java.util.Scanner;

public class codeforces_373_B {
    public static long sum(long k) {
        long ret = 0;
        long pw = 10;
        long len = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (cur == k) {
                break;
            }
            len++;
            if (pw > Long.MAX_VALUE / 10) {
                long remaining = k - pw + 1;
                if (remaining > 0) {
                    ret += remaining * len;
                }
                break;
            }
            pw *= 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        long lo = 0;
        long hi = 1000000000000000000L;
        while (hi - lo > 1) {
            long mid = (lo + hi) >>> 1;
            long c = sum(m + mid - 1) - sum(m - 1);
            if (c <= w / k) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        System.out.println(lo);
    }
}

