
import java.util.*;

public class atcoder_AGC011_C {
    static int n, m;
    static int[] vis;
    static int ci = 0, cb = 0, cc = 0;
    static List<List<Integer>> g;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        vis = new int[n + 1];
        g = new ArrayList<>();
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
                    if (dfs(i)) {
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

    static boolean dfs(int x) {
        Deque<int[]> stack = new ArrayDeque<>();
        boolean flag = true;
        stack.push(new int[]{x, 1});

        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            int u = top[0], col = top[1];
            if (vis[u] != 0) {
                flag &= (vis[u] == col);
                continue;
            }
            vis[u] = col;
            for (int i : g.get(u)) {
                stack.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }
}

