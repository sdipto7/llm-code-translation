
import java.util.*;
import java.io.*;

public class atcoder_ABC148_F {
    static int mod = 1000000007;
    static int INF = Integer.MAX_VALUE;
    static int n, ta, ao;
    static List<List<Integer>> g = new ArrayList<>();
    static Integer[] ta_dist;
    static Integer[] ao_dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        ta = Integer.parseInt(line[1]) - 1;
        ao = Integer.parseInt(line[2]) - 1;
        
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n - 1; i++) {
            line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]) - 1;
            int b = Integer.parseInt(line[1]) - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        
        ta_dist = new Integer[n];
        ao_dist = new Integer[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;

        ao_dfs(ao);
        ta_dfs(ta);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    static void ta_dfs(int node) {
        for (int v : g.get(node)) {
            if (ta_dist[v] != null) continue;
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v);
        }
    }

    static void ao_dfs(int node) {
        for (int v : g.get(node)) {
            if (ao_dist[v] != null) continue;
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v);
        }
    }
}

