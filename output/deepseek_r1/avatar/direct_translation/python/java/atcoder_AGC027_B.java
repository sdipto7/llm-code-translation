
import java.util.Scanner;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int idx = 0;
        int N = Integer.parseInt(parts[idx++]);
        int X = Integer.parseInt(parts[idx++]);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(parts[idx++]);
        }
        long[] S = new long[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            int start = N - 2 * k - 1;
            long sumPart = 0;
            for (int j = start; j >= 0; j -= k) {
                sumPart += S[j];
            }
            long E = k * X + 2 * sumPart;
            if (E < ans) {
                ans = E;
            }
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}

