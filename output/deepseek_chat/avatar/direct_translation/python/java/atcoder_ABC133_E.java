狼import java.util.*;
import java.io.*;
public class atcoder_ABC133_E {
    static int N, K;
    static List<Integer>[] graph;
    static final int MOD = (int)1e9 + 7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new List[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a - 1].add(b - 1);
            graph[b - 1].add(a - 1);
        }
        System.out.println(dfs(0, -1, K));
    }
    static long dfs(int from, int to, int f) {
        long caseNum = f;
        int colorNum = K - 1;
        if (f == K) colorNum = K - 1;
        else colorNum = K - 2;
        for (int u : graph[from]) {
            if (u == to) continue;
            long pat = dfs(u, from, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = caseNum * pat % MOD;
            colorNum--;
        }
        return caseNum;
    }
}
