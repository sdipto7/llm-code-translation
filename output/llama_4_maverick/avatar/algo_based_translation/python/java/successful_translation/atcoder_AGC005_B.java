
import java.util.Scanner;

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.useDelimiter("\\A").next().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i + 1]);
        }

        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        long c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(par, k - 1)];
                unite(par, rank, size, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(par, k + 1)];
                unite(par, rank, size, k + 1, k);
            }
            c += (long) l * r * a[k];
        }
        System.out.println(c);
    }

    public static int root(int[] par, int x) {
        if (par[x] == x) {
            return x;
        } else {
            return root(par, par[x]);
        }
    }

    public static void unite(int[] par, int[] rank, int[] size, int x, int y) {
        int xRoot = root(par, x);
        int yRoot = root(par, y);
        if (xRoot != yRoot) {
            if (rank[xRoot] < rank[yRoot]) {
                par[xRoot] = yRoot;
                size[yRoot] += size[xRoot];
            } else {
                par[yRoot] = xRoot;
                size[xRoot] += size[yRoot];
                if (rank[xRoot] == rank[yRoot]) {
                    rank[xRoot]++;
                }
            }
        }
    }
}

