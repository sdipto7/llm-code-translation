
import java.util.*;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<List<Integer>> g = new ArrayList<>(n + 1);

        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g.get(i).isEmpty()) {
                    ci++;
                } else {
                    if (dfs(i, g, vis)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }

        int result = ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb;
        System.out.println(result);
    }

    private static boolean dfs(int x, List<List<Integer>> g, int[] vis) {
        Deque<int[]> stk = new ArrayDeque<>();
        boolean flag = true;
        stk.push(new int[]{x, 1});

        while (!stk.isEmpty()) {
            int[] current = stk.pop();
            int u = current[0];
            int col = current[1];

            if (vis[u] != 0) {
                flag &= (vis[u] == col);
                continue;
            }

            vis[u] = col;
            for (int i : g.get(u)) {
                stk.push(new int[]{i, 3 - col});
            }
        }

        return flag;
    }
}

