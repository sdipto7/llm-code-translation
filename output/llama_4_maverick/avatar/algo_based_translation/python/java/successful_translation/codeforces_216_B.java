
import java.util.*;
import java.io.*;

public class codeforces_216_B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] readInts() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(st.nextToken());
        }
        return res;
    }

    static class Pair {
        int nodes, edges;

        Pair(int nodes, int edges) {
            this.nodes = nodes;
            this.edges = edges;
        }
    }

    static Pair dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new Pair(0, 0);
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            Pair p = dfs(g, seen, j);
            nodes += p.nodes;
            edges += p.edges;
        }
        return new Pair(nodes, edges);
    }

    static boolean solve() throws IOException {
        try {
            int[] line0 = readInts();
            int n = line0[0];
            int m = line0[1];
            Map<Integer, Set<Integer>> g = new HashMap<>();
            Set<Integer> seen = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                g.put(i, new HashSet<>());
            }
            for (int i = 0; i < m; i++) {
                int[] ab = readInts();
                int a = ab[0];
                int b = ab[1];
                g.get(a).add(b);
                g.get(b).add(a);
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (!seen.contains(i)) {
                    Pair p = dfs(g, seen, i);
                    if (p.nodes > 1 && p.nodes % 2 == 1 && 2 * p.nodes == p.edges) {
                        ans++;
                    }
                }
            }
            if ((n - ans) % 2 == 1) {
                ans++;
            }
            System.out.println(ans);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        while (solve()) {}
    }
}

