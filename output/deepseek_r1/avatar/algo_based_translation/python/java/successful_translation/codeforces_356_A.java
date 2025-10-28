
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            queries.add(new int[]{l, r, x});
        }
        int[] result = processOperations(n, m, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static int[] processOperations(int n, int m, List<int[]> queries) {
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int x = query[2];
            int t = l;
            while (t <= r) {
                int nextVal = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                if (t >= x) {
                    comp[t - 1] = r + 1;
                } else {
                    comp[t - 1] = x;
                }
                t = nextVal;
            }
        }
        return out;
    }
}

