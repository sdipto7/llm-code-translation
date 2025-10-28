
import java.util.*;

public class atcoder_AGC004_D {
    static int dfs(List<Set<Integer>> links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int[] result = dfs(links, n, k, u, v);
            int hgt = result[0];
            int cut = result[1];
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
            cutCount += cut;
        }
        heightFromLeaf += 1;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount += 1;
        }
        return new int[]{heightFromLeaf, cutCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] aaa = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            aaa[i] = scanner.nextInt() - 1;
        }
        List<Set<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new HashSet<>());
        }
        for (int i = 0; i < aaa.length; i++) {
            int a = aaa[i];
            links.get(a).add(i);
        }
        int[] dfsResult = dfs(links, n, k, 0, 0);
        int ans = dfsResult[1];
        if (aaa[0] != 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}

