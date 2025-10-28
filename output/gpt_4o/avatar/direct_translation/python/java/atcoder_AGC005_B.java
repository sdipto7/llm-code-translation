
import java.util.*;
import java.io.*;

public class atcoder_AGC005_B {
    static int[] par, rank, size, b;
    
    static int root(int x) {
        return par[x] == x ? x : (par[x] = root(par[x]));
    }
    
    static boolean same(int x, int y) {
        return root(x) == root(y);
    }
    
    static void unite(int x, int y) {
        x = root(x);
        y = root(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            } else {
                par[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) rank[x]++;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i + 1]);
        }
        
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        b = new int[n];
        
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        
        long c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            long l = 1, r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * a[k];
        }
        
        System.out.println(c);
    }
}

