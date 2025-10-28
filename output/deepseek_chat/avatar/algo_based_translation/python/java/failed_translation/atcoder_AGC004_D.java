
import java.util.*;
import java.io.*;

public class atcoder_AGC004_D {
    static class Result {
        int height;
        int cuts;
        Result(int h, int c) {
            height = h;
            cuts = c;
        }
    }
    
    static Result dfs(List<Set<Integer>> links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        
        for (int u : links.get(v)) {
            if (u == 0) continue;
            Result res = dfs(links, n, k, u, v);
            heightFromLeaf = Math.max(heightFromLeaf, res.height);
            cutCount += res.cuts;
        }
        
        heightFromLeaf++;
        
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount++;
        }
        
        return new Result(heightFromLeaf, cutCount);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        int[] aaa = new int[tokens.length - 2];
        for (int i = 2; i < tokens.length; i++) {
            aaa[i - 2] = Integer.parseInt(tokens[i]);
        }
        
        List<Set<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new HashSet<>());
        }
        
        for (int i = 0; i < aaa.length; i++) {
            int a = aaa[i] - 1;
            links.get(a).add(i + 1);
        }
        
        Result result = dfs(links, n, k, 0, 0);
        int ans = result.cuts;
        
        if (aaa[0] != 1) {
            ans++;
        }
        
        System.out.println(ans);
    }
}

