
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC005_B {
    private static int[] par;
    private static int[] rank;
    private static int[] size;

    private static int root(int x) {
        if (par[x] == x) {
            return x;
        } else {
            par[x] = root(par[x]);
            return par[x];
        }
    }

    private static void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx != ry) {
            if (rank[rx] < rank[ry]) {
                par[rx] = ry;
                size[ry] += size[rx];
            } else {
                par[ry] = rx;
                size[rx] += size[ry];
                if (rank[rx] == rank[ry]) {
                    rank[rx]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        rank = new int[n];
        Arrays.fill(rank, 1);
        size = new int[n];
        Arrays.fill(size, 1);

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        long c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1, r = 1;

            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k < n - 1 && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }

            c += (long) l * r * a[k];
        }

        System.out.println(c);
        scanner.close();
    }
}

