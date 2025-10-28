
import java.util.*;
import java.io.*;

public class atcoder_ABC148_F {
    static final long mod = 1000000007;
    static final double INF = Double.POSITIVE_INFINITY;
    static int n;
    static List<List<Integer>> g;
    static Integer[] taDist;
    static Integer[] aoDist;
    
    static int inp() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static int[] inpl() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static void taDfs(int node) {
        for (int v : g.get(node)) {
            if (taDist[v] != null) continue;
            taDist[v] = taDist[node] + 1;
            taDfs(v);
        }
    }
    
    static void aoDfs(int node) {
        for (int v : g.get(node)) {
            if (aoDist[v] != null) continue;
            aoDist[v] = aoDist[node] + 1;
            aoDfs(v);
        }
    }
    
    public static void main(String[] args) throws IOException {
        int[] input = inpl();
        n = input[0];
        int ta = input[1] - 1;
        int ao = input[2] - 1;
        
        g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n - 1; i++) {
            int[] edge = inpl();
            int a = edge[0] - 1;
            int b = edge[1] - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        
        taDist = new Integer[n];
        Arrays.fill(taDist, null);
        taDist[ta] = 0;
        
        aoDist = new Integer[n];
        Arrays.fill(aoDist, null);
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
}

