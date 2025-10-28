import java.util.*;
import java.io.*;

public class atcoder_ABC133_E {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static int mod = 1000000007;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        int ans = dfs(0, -1, K);
        System.out.println(ans);
    }

    static int dfs(int fro, int to, int f) {
        int caseNum = f;
        int colorNum = (f == K) ? K - 1 : K - 2;

        for (int u : graph.getOrDefault(fro, new ArrayList<>())) {
            if (u == to) continue;
            int pat = dfs(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (int) ((1L * caseNum * pat) % mod);
            colorNum--;
        }
        return caseNum;
    }
}
