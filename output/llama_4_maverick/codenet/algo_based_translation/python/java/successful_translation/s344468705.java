
import java.util.Scanner;
import java.util.Arrays;

public class s344468705 {
    static final long INF = (long) 1e20;
    static final int MOD = 1000000007;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length == 0) {
            solve();
        } else {
            int n = getN();
            for (int i = 0; i < n; i++) {
                solve();
            }
        }
    }

    static void solve() {
        int n = getN();
        long[] dp = new long[1];
        dp[0] = -INF;
        for (int i = 0; i < n; i++) {
            long num = -getN();
            if (num >= dp[dp.length - 1]) {
                dp = Arrays.copyOf(dp, dp.length + 1);
                dp[dp.length - 1] = num;
            } else {
                int idx = binarySearchRight(dp, num);
                dp[idx] = num;
            }
        }
        System.out.println(dp.length - 1);
    }

    static int getN() {
        return scanner.nextInt();
    }

    static int binarySearchRight(long[] arr, long target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

