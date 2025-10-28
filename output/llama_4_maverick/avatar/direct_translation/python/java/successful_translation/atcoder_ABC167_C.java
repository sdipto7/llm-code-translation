
import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int x = Integer.parseInt(line[2]);
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            line = sc.nextLine().split(" ");
            for (int j = 0; j <= m; j++) {
                c[i][j] = Integer.parseInt(line[j]);
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            combinations(l, new ArrayList<>(), 0, n, i);
        }
        int ans = 0;
        List<Integer> rem = new ArrayList<>();
        outer:
        for (int i = 1; i <= m; i++) {
            for (int j = l.size() - 1; j >= 0; j--) {
                int ca = 0;
                for (int ii : l.get(j)) {
                    ca += c[ii][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (!rem.isEmpty()) {
                Collections.sort(rem, Collections.reverseOrder());
                for (int j : rem) {
                    l.remove((int)j);
                }
                rem.clear();
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break outer;
            }
        }
        if (!l.isEmpty()) {
            for (List<Integer> list : l) {
                int ca = 0;
                for (int j : list) {
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

    public static void combinations(List<List<Integer>> l, List<Integer> tmp, int start, int n, int k) {
        if (tmp.size() == k) {
            l.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < n; i++) {
            tmp.add(i);
            combinations(l, tmp, i + 1, n, k);
            tmp.remove(tmp.size() - 1);
        }
    }
}

