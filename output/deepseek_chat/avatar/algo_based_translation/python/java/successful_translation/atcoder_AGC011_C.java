
import java.util.*;
import java.io.*;

public class atcoder_AGC011_C {
    static int n, m;
    static int[] vis;
    static int ci, cb, cc;
    static ArrayList<Integer>[] g;
    
    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        boolean flag = true;
        stk.push(new int[]{x, 1});
        
        while (!stk.isEmpty()) {
            int[] current = stk.pop();
            int u = current[0];
            int col = current[1];
            
            if (vis[u] != 0) {
                flag = flag && (vis[u] == col);
                continue;
            }
            
            vis[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        vis = new int[n + 1];
        ci = 0; cb = 0; cc = 0;
        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g[u].add(v);
            g[v].add(u);
        }
        
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].isEmpty()) {
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
        
        long result = (long)ci * ci + 2L * ci * (n - ci) + (long)cc * cc + 2L * cb * cc + 2L * cb * cb;
        System.out.println(result);
    }
}

