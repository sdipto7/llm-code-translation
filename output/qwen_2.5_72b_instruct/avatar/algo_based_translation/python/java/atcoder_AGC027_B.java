import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        scanner.close();

        List<Integer> S = new ArrayList<>();
        int sum = 0;
        for (int a : A) {
            sum += a;
            S.add(sum);
        }

        double ans = Double.POSITIVE_INFINITY;
        for (int k = 1; k <= S.size(); k++) {
            int E = k * X + 2 * sum(S, N - 2 * k - 1, -1, -k);
            ans = Math.min(ans, E);
        }

        System.out.println(ans + N * X + 5 * S.get(S.size() - 1));
    }

    private static int sum(List<Integer> S, int start, int end, int step) {
        int result = 0;
        for (int i = start; i > end; i += step) {
            result += S.get(i);
        }
        return result;
    }
}
