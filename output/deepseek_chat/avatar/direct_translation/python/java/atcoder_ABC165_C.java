
import java.util.*;

public class atcoder_ABC165_C {
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        solve(N, M, Q, a, b, c, d);
    }

    static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        rec(new ArrayList<>(), N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    static void rec(List<Integer> A, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
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

