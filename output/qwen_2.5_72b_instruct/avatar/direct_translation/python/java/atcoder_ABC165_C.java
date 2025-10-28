
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC165_C {
    static int res = 0;

    static void solve(int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        rec(new ArrayList<>(), N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    static void rec(List<Integer> A, int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b.get(i) - 1) - A.get(a.get(i) - 1) == c.get(i)) {
                    ans += d.get(i);
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            c.add(scanner.nextInt());
            d.add(scanner.nextInt());
        }
        solve(N, M, Q, a, b, c, d);
        scanner.close();
    }
}

