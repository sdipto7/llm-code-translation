import java.util.*;

public class atcoder_AGC011_C {
    static int n, m;
    static int[] vis;
    static int ci, cb, cc;
    static List<Integer>[] g;

    public static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        boolean flag = true;
        stk.push(new int[]{x, 1});
        while (!stk.isEmpty()) {
            int[] pair = stk.pop();
            int u = pair[0];
            int col = pair[1];
            if (vis[u] != 0) {
                flag &= (vis[u] == col);
                continue;
            }
            vis[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        vis = new int[n + 1];
        ci = 0;
        cb = 0;
        cc = 0;
        g = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}
