
import java.util.*;

public class atcoder_ABC165_C {
    static int res;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        scanner.close();
        solve(N, M, Q, a, b, c, d);
    }

    private static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        res = 0;
        rec(new ArrayList<>(), N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    private static void rec(List<Integer> A, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                int aIdx = a[i] - 1;
                int bIdx = b[i] - 1;
                if (A.get(bIdx) - A.get(aIdx) == c[i]) {
                    ans += d[i];
                }
            }
            if (ans > res) {
                res = ans;
            }
            return;
        }
        int lastMax = A.isEmpty() ? 1 : A.get(A.size() - 1);
        for (int i = lastMax; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            rec(newA, N, M, Q, a, b, c, d);
        }
    }
}

