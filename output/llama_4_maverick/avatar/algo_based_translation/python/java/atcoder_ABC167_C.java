
import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            c[i][0] = sc.nextInt();
            for (int j = 1; j <= m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        Integer[] pre = new Integer[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            generateCombinations(pre, i, 0, new ArrayList<>(), l);
        }
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            List<Integer> rem = new ArrayList<>();
            for (int j = l.size() - 1; j >= 0; j--) {
                List<Integer> k = l.get(j);
                int ca = 0;
                for (Integer ii : k) {
                    ca += c[ii][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (!rem.isEmpty()) {
                Collections.sort(rem, Collections.reverseOrder());
                for (Integer j : rem) {
                    l.remove((int) j);
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
            for (Integer j : i) {
                ca += c[j][0];
            }
            if (ans == 0 || ca < ans) {
                ans = ca;
            }
        }
        System.out.println(ans);
    }

    public static void generateCombinations(Integer[] pre, int r, int start, List<Integer> current, List<List<Integer>> l) {
        if (current.size() == r) {
            l.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < pre.length; i++) {
            current.add(pre[i]);
            generateCombinations(pre, r, i + 1, current, l);
            current.remove(current.size() - 1);
        }
    }
}

