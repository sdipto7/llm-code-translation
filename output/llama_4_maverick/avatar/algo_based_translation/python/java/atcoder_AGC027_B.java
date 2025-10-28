
import java.util.Scanner;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(input[i + 2]);
        }
        long[] S = new long[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            long sum = 0;
            for (int j = N - 2 * k - 1; j >= 0; j -= k) {
                sum += S[j];
            }
            long E = (long) k * X + 2 * sum;
            ans = Math.min(ans, E);
        }
        long result = ans + (long) N * X + 5 * S[N - 1];
        System.out.println(result);
    }
}

