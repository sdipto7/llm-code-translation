import java.util.*;
import java.io.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= m; j++) {
                c[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            combinations(pre, i, 0, new ArrayList<>(), l);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                List<Integer> k = l.get(j);
                int ca = 0;
                for (int ii : k) {
                    ca += c[ii][i];
                }
                if (ca < x) {
                    rem.add(0, j);
                }
            }
            if (!rem.isEmpty()) {
                for (int j : rem) {
                    l.remove(j);
                }
                rem.clear();
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> i : l) {
            int ca = 0;
            for (int j : i) {
                ca += c[j][0];
            }
            if (ans == 0) {
                ans = ca;
            } else {
                ans = Math.min(ans, ca);
            }
        }
        System.out.println(ans);
    }

    private static void combinations(int[] pre, int len, int start, List<Integer> current, List<List<Integer>> l) {
        if (current.size() == len) {
            l.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < pre.length; i++) {
            current.add(pre[i]);
            combinations(pre, len, i + 1, current, l);
            current.remove(current.size() - 1);
        }
    }
}
