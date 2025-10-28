
import java.util.Scanner;

public class atcoder_ABC165_C {
    static int res = 0;

    public static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        rec(N, M, Q, a, b, c, d, new int[0]);
        System.out.println(res);
    }

    public static void rec(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int[] A) {
        if (A.length == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int lastMax = A.length == 0 ? 1 : A[A.length - 1];
        for (int i = lastMax; i <= M; i++) {
            int[] newA = new int[A.length + 1];
            System.arraycopy(A, 0, newA, 0, A.length);
            newA[A.length] = i;
            rec(N, M, Q, a, b, c, d, newA);
        }
    }

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
        solve(N, M, Q, a, b, c, d);
    }
}

