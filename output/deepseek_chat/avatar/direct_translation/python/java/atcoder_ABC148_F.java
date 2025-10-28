
import java.util.*;

public class atcoder_ABC148_F {
    static int n, ta, ao;
    static List<List<Integer>> g;
    static int[] taDist, aoDist;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ta = sc.nextInt() - 1;
        ao = sc.nextInt() - 1;
        g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        taDist = new int[n];
        aoDist = new int[n];
        Arrays.fill(taDist, -1);
        Arrays.fill(aoDist, -1);
        taDist[ta] = 0;
        aoDist[ao] = 0;
        aoDfs(ao);
        taDfs(ta);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] > aoDist[i]) continue;
            res = Math.max(res, aoDist[i]);
        }
        System.out.println(res - 1);
    }
    
    static void taDfs(int node) {
        for (int v : g.get(node)) {
            if (taDist[v] != -1) continue;
            taDist[v] = taDist[node] + 1;
            taDfs(v);
        }
    }
    
    static void aoDfs(int node) {
        for (int v : g.get(node)) {
            if (aoDist[v] != -1) continue;
            aoDist[v] = aoDist[node] + 1;
            aoDfs(v);
        }
    }
}

