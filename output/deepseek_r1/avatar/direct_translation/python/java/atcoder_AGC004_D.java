
import java.util.*;
import java.io.*;

public class atcoder_AGC004_D {
    static class Pair {
        int height;
        int cutCount;
        Pair(int h, int c) { height = h; cutCount = c; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] aaa = new int[n];
        for (int i = 0; i < n; i++) {
            if (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            aaa[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer>[] links = new Set[n];
        for (int i = 0; i < n; i++) links[i] = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = aaa[i] - 1;
            links[a].add(i);
        }

        Pair result = dfs(links, n, k, 0, 0);
        int ans = result.cutCount;
        if (aaa[0] != 1) ans++;
        System.out.println(ans);
    }

    private static Pair dfs(Set<Integer>[] links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links[v]) {
            if (u == 0) continue;
            Pair child = dfs(links, n, k, u, v);
            heightFromLeaf = Math.max(heightFromLeaf, child.height);
            cutCount += child.cutCount;
        }
        heightFromLeaf++;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount++;
        }
        return new Pair(heightFromLeaf, cutCount);
    }
}

