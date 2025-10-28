
import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            combinations(new ArrayList<>(), l, i, n, 0);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int ii : l.get(j)) {
                    ca += c[ii][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (!rem.isEmpty()) {
                for (int j = rem.size() - 1; j >= 0; j--) {
                    l.remove((int) rem.get(j));
                }
                rem.clear();
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break;
            }
        }
        if (!l.isEmpty()) {
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
    }

    private static void combinations(List<Integer> current, List<List<Integer>> l, int k, int n, int start) {
        if (current.size() == k) {
            l.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < n; i++) {
            current.add(i);
            combinations(current, l, k, n, i + 1);
            current.remove(current.size() - 1);
        }
    }
}

