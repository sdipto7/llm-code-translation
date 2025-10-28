
import java.util.Scanner;

public class atcoder_AGC005_B {
    static int[] par;
    static int[] rank;
    static int[] size;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        par = new int[n];
        rank = new int[n];
        size = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        long c = 0;
        for (int idx = n - 1; idx >= 0; idx--) {
            int k = b[idx];
            int l = 1, r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += (long) l * r * a[k];
        }
        System.out.println(c);
    }
    
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
}

