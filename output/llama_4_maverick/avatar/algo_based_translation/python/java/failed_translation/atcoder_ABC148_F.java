
import java.util.*;

public class atcoder_ABC148_F {
    static final int mod = (int)1e9 + 7;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;

        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }

        Integer[] taDist = new Integer[n];
        Integer[] aoDist = new Integer[n];
        taDist[ta] = 0;
        aoDist[ao] = 0;

        dfs(g, taDist, ta);
        dfs(g, aoDist, ao);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] > aoDist[i]) continue;
            res = Math.max(res, aoDist[i]);
        }
        System.out.println(res - 1);
    }

    static void dfs(List<List<Integer>> g, Integer[] dist, int node) {
        for (int v : g.get(node)) {
            if (dist[v] != null) continue;
            dist[v] = dist[node] + 1;
            dfs(g, dist, v);
        }
    }
}

