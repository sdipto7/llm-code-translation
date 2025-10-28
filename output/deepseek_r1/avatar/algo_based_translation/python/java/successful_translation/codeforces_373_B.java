
import java.math.BigInteger;
import java.util.Scanner;

public class codeforces_373_B {

    private static long sum(long k) {
        long ret = 0;
        long pw = 10;
        int length = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
            ret += (cur - prev + 1) * length;
            if (pw - 1 >= k) break;
            length++;
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
        long hi = (long) 1e18;

        while (hi - lo > 1) {
            long md = (lo + hi) / 2;
            long currentSum = sum(m + md - 1);
            long prevSum = sum(m - 1);
            long c = currentSum - prevSum;
            BigInteger product = BigInteger.valueOf(c).multiply(BigInteger.valueOf(k));
            
            if (product.compareTo(BigInteger.valueOf(w)) <= 0) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }
}

