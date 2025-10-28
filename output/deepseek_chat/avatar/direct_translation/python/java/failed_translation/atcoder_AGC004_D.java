
import java.util.*;

public class atcoder_AGC004_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] aaa = new int[n];
        for (int i = 0; i < n; i++) {
            aaa[i] = sc.nextInt();
        }
        List<Set<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new HashSet<>());
        }
        for (int i = 0; i < n; i++) {
            int a = aaa[i] - 1;
            links.get(a).add(i);
        }
        int[] result = dfs(links, n, k, 0, 0);
        int ans = result[1];
        if (aaa[0] != 1) {
            ans += 1;
        }
        System.out.println(ans);
    }

    private static int[] dfs(List<Set<Integer>> links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int[] res = dfs(links, n, k, u, v);
            heightFromLeaf = Math.max(heightFromLeaf, res[0]);
            cutCount += res[1];
        }
        heightFromLeaf += 1;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount += 1;
        }
        return new int[]{heightFromLeaf, cutCount};
    }
}

