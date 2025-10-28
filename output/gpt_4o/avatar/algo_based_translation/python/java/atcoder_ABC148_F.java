
import java.util.*;
import java.io.*;

public class atcoder_ABC148_F {
    static int n, ta, ao;
    static List<List<Integer>> g;
    static Integer[] ta_dist, ao_dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        ta = Integer.parseInt(st.nextToken()) - 1;
        ao = Integer.parseInt(st.nextToken()) - 1;

        g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
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
            if (ta_dist[i] <= ao_dist[i]) {
                res = Math.max(res, ao_dist[i]);
            }
        }

        System.out.println(res - 1);
    }

    private static void ta_dfs(int node) {
        for (int v : g.get(node)) {
            if (ta_dist[v] != null) continue;
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v);
        }
    }

    private static void ao_dfs(int node) {
        for (int v : g.get(node)) {
            if (ao_dist[v] != null) continue;
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v);
        }
    }
}

