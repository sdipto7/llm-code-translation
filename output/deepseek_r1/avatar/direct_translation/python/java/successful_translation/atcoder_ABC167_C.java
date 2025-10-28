import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> subsets = new ArrayList<>();
        for (int mask = 1; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int bit = 0; bit < n; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    subset.add(bit);
                }
            }
            subsets.add(subset);
        }
        for (int param = 1; param <= m; param++) {
            List<List<Integer>> filtered = new ArrayList<>();
            for (List<Integer> subset : subsets) {
                int sum = 0;
                for (int idx : subset) {
                    sum += c[idx][param];
                }
                if (sum >= x) {
                    filtered.add(subset);
                }
            }
            subsets = filtered;
            if (subsets.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        int minCost = Integer.MAX_VALUE;
        for (List<Integer> subset : subsets) {
            int cost = 0;
            for (int idx : subset) {
                cost += c[idx][0];
            }
            if (cost < minCost) {
                minCost = cost;
            }
        }
        System.out.println(minCost);
    }
}
