
import java.util.*;

public class atcoder_ABC133_E {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static int N, K;
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }
        long ans = dfs(0, -1, K);
        System.out.println(ans);
    }

    static long dfs(int from, int to, int f) {
        long caseNum = f;
        int colorNum = (f == K) ? K - 1 : K - 2;
        for (int u : graph.getOrDefault(from, Collections.emptyList())) {
            if (u == to) {
                continue;
            }
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

