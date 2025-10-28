
import java.util.*;

public class atcoder_ABC148_F {
    static int n, ta, ao;
    static List<Integer>[] g;
    static Integer[] taDist, aoDist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ta = sc.nextInt() - 1;
        ao = sc.nextInt() - 1;
        g = new ArrayList[n];
        taDist = new Integer[n];
        aoDist = new Integer[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        taDist[ta] = 0;
        aoDist[ao] = 0;
        aoDfs(ao);
        taDfs(ta);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] != null && aoDist[i] != null && taDist[i] <= aoDist[i]) {
                res = Math.max(res, aoDist[i]);
            }
        }
        System.out.println(res - 1);
    }

    static void taDfs(int node) {
        for (int v : g[node]) {
            if (taDist[v] != null) continue;
            taDist[v] = taDist[node] + 1;
            taDfs(v);
        }
    }

    static void aoDfs(int node) {
        for (int v : g[node]) {
            if (aoDist[v] != null) continue;
            aoDist[v] = aoDist[node] + 1;
            aoDfs(v);
        }
    }
}

