
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class atcoder_AGC011_C {
    private static int[] vis;
    private static ArrayList<Integer>[] g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        vis = new int[n + 1];
        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }

        int ci = 0, cb = 0, cc = 0;

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].isEmpty()) {
                    ci++;
                } else {
                    boolean isBipartite = dfs(i);
                    if (isBipartite) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }

        long result = (long) ci * ci + 2L * ci * (n - ci) + (long) cc * cc + 2L * cb * cc + 2L * cb * cb;
        System.out.println(result);
    }

    private static boolean dfs(int x) {
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{x, 1});
        boolean flag = true;

        while (!stack.isEmpty()) {
            int[] node = stack.pop();
            int u = node[0];
            int col = node[1];

            if (vis[u] != 0) {
                flag &= (vis[u] == col);
                continue;
            }

            vis[u] = col;
            for (int v : g[u]) {
                stack.push(new int[]{v, 3 - col});
            }
        }

        return flag;
    }
}

