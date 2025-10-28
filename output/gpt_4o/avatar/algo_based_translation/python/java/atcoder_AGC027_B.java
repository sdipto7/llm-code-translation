
import java.util.*;
import java.util.stream.*;

public class atcoder_AGC027_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int result = calculateMinEnergy(N, X, A);
        System.out.println(result);
    }

    public static int calculateMinEnergy(int N, int X, int[] A) {
        int[] S = new int[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }

        double ans = Double.POSITIVE_INFINITY;

        for (int k = 1; k <= S.length; k++) {
            int sum = 0;
            for (int j = N - 2 * k - 1; j >= 0; j -= k) {
                sum += S[j];
            }
            int E = k * X + 2 * sum;
            ans = Math.min(ans, E);
        }

        return (int)(ans + N * X + 5 * S[N - 1]);
    }
}

