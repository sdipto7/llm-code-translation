
import java.util.*;
import java.util.stream.IntStream;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m+1];
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
            for (int[] combination : combinations(pre, i)) {
                List<Integer> combList = new ArrayList<>();
                for (int num : combination) {
                    combList.add(num);
                }
                l.add(combList);
            }
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

    private static List<int[]> combinations(int[] arr, int k) {
        List<int[]> result = new ArrayList<>();
        combine(arr, k, 0, new int[k], result);
        return result;
    }

    private static void combine(int[] arr, int k, int start, int[] current, List<int[]> result) {
        if (k == 0) {
            result.add(current.clone());
            return;
        }
        for (int i = start; i <= arr.length - k; i++) {
            current[current.length - k] = arr[i];
            combine(arr, k - 1, i + 1, current, result);
        }
    }
}

