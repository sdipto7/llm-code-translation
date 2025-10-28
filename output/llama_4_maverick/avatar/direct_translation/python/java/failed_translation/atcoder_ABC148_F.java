
import java.util.*;

public class atcoder_ABC148_F {
    static final int MOD = (int)1e9 + 7;
    static final long INF = (long)1e18;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ta = sc.nextInt(), ao = sc.nextInt();
        ta--; ao--;
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            g[a].add(b); g[b].add(a);
        }
        int[] taDist = new int[n], aoDist = new int[n];
        Arrays.fill(taDist, -1); taDist[ta] = 0;
        Arrays.fill(aoDist, -1); aoDist[ao] = 0;
        taDfs(ta, g, taDist);
        aoDfs(ao, g, aoDist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] > aoDist[i]) continue;
            res = Math.max(res, aoDist[i]);
        }
        System.out.println(res - 1);
    }

    static void taDfs(int node, List<Integer>[] g, int[] taDist) {
        for (int v : g[node]) {
            if (taDist[v] != -1) continue;
            taDist[v] = taDist[node] + 1;
            taDfs(v, g, taDist);
        }
    }

    static void aoDfs(int node, List<Integer>[] g, int[] aoDist) {
        for (int v : g[node]) {
            if (aoDist[v] != -1) continue;
            aoDist[v] = aoDist[node] + 1;
            aoDfs(v, g, aoDist);
        }
    }
}

