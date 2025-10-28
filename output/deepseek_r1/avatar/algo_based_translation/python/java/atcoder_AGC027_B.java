
import java.util.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextLong());
        }
        long[] S = new long[N];
        S[0] = A.get(0);
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A.get(i);
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            int startJ = N - 2 * k - 1;
            long sumSj = 0;
            for (int j = startJ; j >= 0; j -= k) {
                sumSj += S[j];
            }
            long E = (long) k * X + 2 * sumSj;
            if (E < ans) {
                ans = E;
            }
        }
        long total = ans + (long) N * X + 5 * S[N - 1];
        System.out.println(total);
    }
}

