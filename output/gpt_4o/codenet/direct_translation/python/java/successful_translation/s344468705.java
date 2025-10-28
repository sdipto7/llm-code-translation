
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s344468705 {
    static final long INF = 1000000000000000000L;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        solve();
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static void solve() throws IOException {
        int n = nextInt();
        long[] dp = new long[n + 1];
        dp[0] = -INF;
        int length = 0;
        for (int i = 0; i < n; i++) {
            long num = nextInt();
            num = -num;
            if (num >= dp[length]) {
                dp[++length] = num;
            } else {
                int idx = bisectRight(dp, num, 0, length);
                dp[idx] = num;
            }
        }
        System.out.println(length);
    }

    static int bisectRight(long[] dp, long num, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (dp[mid] > num) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

