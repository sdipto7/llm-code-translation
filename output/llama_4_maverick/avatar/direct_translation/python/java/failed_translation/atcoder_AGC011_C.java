
import java.util.*;

public class atcoder_AGC011_C {
    static int n, m, vis[], ci, cb, cc;
    static List<Integer>[] g;

    public static boolean dfs(int x) {
        Deque<int[]> stk = new ArrayDeque<>();
        boolean flag = true;
        stk.push(new int[]{x, 1});
        while (!stk.isEmpty()) {
            int[] arr = stk.pop();
            int u = arr[0], col = arr[1];
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
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        vis = new int[n + 1];
        ci = cb = cc = 0;
        g = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
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
        System.out.println(ci * ci + 2L * ci * (n - ci) + cc * cc + 2L * cb * cc + 2L * cb * cb);
    }
}

