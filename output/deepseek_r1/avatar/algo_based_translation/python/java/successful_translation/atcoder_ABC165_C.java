
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC165_C {

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
        scanner.close();
    }

    private static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int[] maxScore = {0};
        List<Integer> current = new ArrayList<>();
        generateSequences(N, M, Q, a, b, c, d, current, maxScore);
        System.out.println(maxScore[0]);
    }

    private static void generateSequences(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d,
                                         List<Integer> current, int[] result) {
        if (current.size() == N) {
            int score = 0;
            for (int i = 0; i < Q; i++) {
                if (current.get(b[i] - 1) - current.get(a[i] - 1) == c[i]) {
                    score += d[i];
                }
            }
            result[0] = Math.max(result[0], score);
            return;
        }
        
        int start = current.isEmpty() ? 1 : current.get(current.size() - 1);
        for (int nextVal = start; nextVal <= M; nextVal++) {
            current.add(nextVal);
            generateSequences(N, M, Q, a, b, c, d, current, result);
            current.remove(current.size() - 1);
        }
    }
}

