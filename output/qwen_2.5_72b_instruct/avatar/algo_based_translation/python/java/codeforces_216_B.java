
import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        while (solve()) ;
    }

    public static Map<Integer, Integer> readInts() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<Integer, Integer> result = new HashMap<>();
        for (String s : input) {
            result.put(Integer.parseInt(s), 0);
        }
        return result;
    }

    public static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new int[]{0, 0};
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            int[] xy = dfs(g, seen, j);
            nodes += xy[0];
            edges += xy[1];
        }
        return new int[]{nodes, edges};
    }

    public static boolean solve() {
        List<Integer> line0 = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                line0.add(Integer.parseInt(s));
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        int n = line0.get(0);
        int m = line0.get(1);
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int[] ne = dfs(g, seen, i);
                int nodes = ne[0];
                int edges = ne[1];
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
}

