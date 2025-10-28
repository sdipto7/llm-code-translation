
import java.util.Scanner;

public class atcoder_ABC165_C {
    static int res;

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
        res = 0;
        rec(N, M, Q, a, b, c, d, new int[0]);
        System.out.println(res);
    }

    static void rec(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int[] A) {
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
        int last_max = A.length == 0 ? 1 : A[A.length - 1];
        for (int i = last_max; i <= M; i++) {
            int[] newA = new int[A.length + 1];
            System.arraycopy(A, 0, newA, 0, A.length);
            newA[A.length] = i;
            rec(N, M, Q, a, b, c, d, newA);
        }
    }
}

