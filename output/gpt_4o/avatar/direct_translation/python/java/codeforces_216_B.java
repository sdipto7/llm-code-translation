
import java.util.*;

public class codeforces_216_B {
    static Map<Integer, Set<Integer>> g;
    static Set<Integer> seen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (solve(sc)) ;
    }

    static boolean solve(Scanner sc) {
        if (!sc.hasNext()) return false;
        int n = sc.nextInt();
        int m = sc.nextInt();
        g = new HashMap<>();
        seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int[] res = dfs(i);
                int nodes = res[0];
                int edges = res[1];
                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans++;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
        return true;
    }

    static int[] dfs(int i) {
        if (seen.contains(i)) return new int[]{0, 0};
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            int[] res = dfs(j);
            nodes += res[0];
            edges += res[1];
        }
        return new int[]{nodes, edges};
    }
}

