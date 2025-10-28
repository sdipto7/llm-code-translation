
import java.util.*;

public class atcoder_ABC133_E {
    private static final long MOD = (long)1e9 + 7;
    private static List<List<Integer>> graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N == 1) {
            System.out.println(K % MOD);
            return;
        }
        if (K == 1 && N > 1) {
            System.out.println(0);
            return;
        }

        graph = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        long ans = dfs(0, -1, K);
        System.out.println(ans % MOD);
    }

    private static long dfs(int fro, int to, int f) {
        long caseNum = f;
        int colorNum = (f == graph.size()) ? (f - 1) : (f - 2);

        for (int u : graph.get(fro)) {
            if (u == to) continue;
            if (colorNum <= 0) {
                caseNum = 0;
                break;
            }
            long pat = dfs(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % MOD;
            colorNum--;
        }
        return caseNum;
    }
}

