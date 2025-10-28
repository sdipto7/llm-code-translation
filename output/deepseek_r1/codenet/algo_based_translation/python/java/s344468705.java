
import java.io.*;
import java.util.*;

public class s344468705 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    private static int bisectRight(List<Long> list, long x) {
        int low = 0;
        int high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (x < list.get(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        solve(in);
    }

    public static void solve(FastReader in) {
        int n = in.nextInt();
        List<Long> dp = new ArrayList<>();
        dp.add(Long.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            long negated = -num;
            if (negated >= dp.get(dp.size() - 1)) {
                dp.add(negated);
            } else {
                int idx = bisectRight(dp, negated);
                dp.set(idx, negated);
            }
        }

        System.out.println(dp.size() - 1);
    }
}

