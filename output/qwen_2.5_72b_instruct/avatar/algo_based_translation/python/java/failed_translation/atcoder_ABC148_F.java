
import java.util.*;

public class atcoder_ABC148_F {
    static int mod = 1000000007;
    static double INF = Double.POSITIVE_INFINITY;
    static int n, ta, ao;
    static List<List<Integer>> g;
    static Integer[] ta_dist;
    static Integer[] ao_dist;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ta = scanner.nextInt() - 1;
        ao = scanner.nextInt() - 1;
        g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        ta_dist = new Integer[n];
        Arrays.fill(ta_dist, null);
        ta_dist[ta] = 0;
        ao_dist = new Integer[n];
        Arrays.fill(ao_dist, null);
        ao_dist[ao] = 0;
        ao_dfs(ao);
        ta_dfs(ta);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] != null && ta_dist[i] > ao_dist[i]) continue;
            if (ao_dist[i] != null) res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
        scanner.close();
    }

    static void ta_dfs(int node) {
        for (int v : g.get(node)) {
            if (ta_dist[v] != null) continue;
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v);
        }
    }

    static void ao_dfs(int node) {
        for (int v : g.get(node)) {
            if (ao_dist[v] != null) continue;
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v);
        }
    }
}

