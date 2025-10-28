
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codeforces_356_A {
    public static List<Integer> processSequence(int n, int m, List<int[]> operations) {
        List<Integer> out = new ArrayList<>();
        List<Integer> comp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            out.add(0);
            comp.add(i + 2);
        }

        for (int[] operation : operations) {
            int l = operation[0];
            int r = operation[1];
            int x = operation[2];
            int t = l;

            while (t <= r) {
                int nextVal = comp.get(t - 1);

                if (out.get(t - 1) == 0 && t != x) {
                    out.set(t - 1, x);
                }

                if (t >= x) {
                    comp.set(t - 1, r + 1);
                } else {
                    comp.set(t - 1, x);
                }

                t = nextVal;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<int[]> operations = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            operations.add(new int[]{l, r, x});
        }

        List<Integer> result = processSequence(n, m, operations);

        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }
    }
}

