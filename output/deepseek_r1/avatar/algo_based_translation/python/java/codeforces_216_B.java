
import java.util.*;
import java.io.*;

public class codeforces_216_B {
    private static List<String> lines = new ArrayList<>();
    private static int ptr = 0;

    static class Pair {
        int nodes;
        int edges;
        Pair(int n, int e) { nodes = n; edges = e; }
    }

    private static Pair dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) return new Pair(0, 0);
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            Pair result = dfs(g, seen, j);
            nodes += result.nodes;
            edges += result.edges;
        }
        return new Pair(nodes, edges);
    }

    private static boolean solve() {
        if (ptr >= lines.size()) return false;
        String[] line0 = lines.get(ptr++).split(" ");
        int n = Integer.parseInt(line0[0]);
        int m = Integer.parseInt(line0[1]);
        
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        
        for (int i = 0; i < m; i++) {
            String[] edge = lines.get(ptr++).split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            g.get(a).add(b);
            g.get(b).add(a);
        }
        
        int ans = 0;
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                Pair res = dfs(g, seen, i);
                if (res.nodes > 1 && res.nodes % 2 == 1 && 2 * res.nodes == res.edges) {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line.trim());
        }
        while (solve()) {}
    }
}

