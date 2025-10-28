
import java.util.*;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g.get(i).size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2L * ci * (n - ci) + cc * cc + 2L * cb * cc + 2L * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, List<List<Integer>> g) {
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
            for (int i : g.get(u)) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }
}

