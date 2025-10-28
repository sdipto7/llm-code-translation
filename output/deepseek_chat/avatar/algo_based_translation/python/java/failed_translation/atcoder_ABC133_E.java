
import java.util.*;
import java.io.*;

public class atcoder_ABC133_E {
    static ArrayList<Integer>[] graph;
    static int N, K;
    static final int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        
        long ans = dfs(0, -1, K);
        System.out.println(ans);
    }
    
    static long dfs(int fro, int to, int f) {
        long caseNum = f;
        int colorNum = (f == K) ? K - 1 : K - 2;
        
        for (int u : graph[fro]) {
            if (u == to) continue;
            
            long pat = dfs(u, fro, colorNum);
            
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            
            caseNum = caseNum * pat % mod;
            colorNum--;
        }
        
        return caseNum;
    }
}

