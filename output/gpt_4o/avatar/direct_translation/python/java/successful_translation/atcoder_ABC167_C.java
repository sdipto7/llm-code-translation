
import java.util.*;
import java.util.stream.IntStream;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int[] pre = IntStream.range(0, n).toArray();
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            combinations(pre, i, l);
        }
        outerLoop:
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
            if (rem.size() > 0) {
                for (int j : rem) {
                    l.remove(j);
                }
                rem.clear();
            }
            if (l.size() == 0) {
                System.out.println(-1);
                break outerLoop;
            }
        }
        if (l.size() > 0) {
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

    private static void combinations(int[] arr, int len, List<List<Integer>> l) {
        int n = arr.length;
        int[] result = new int[len];
        combinationUtil(arr, n, len, 0, result, 0, l);
    }

    private static void combinationUtil(int[] arr, int n, int len, int index, int[] result, int i, List<List<Integer>> l) {
        if (index == len) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                combination.add(result[j]);
            }
            l.add(combination);
            return;
        }
        if (i >= n) return;
        result[index] = arr[i];
        combinationUtil(arr, n, len, index + 1, result, i + 1, l);
        combinationUtil(arr, n, len, index, result, i + 1, l);
    }
}

