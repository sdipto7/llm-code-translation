
import java.util.*;

public class s269975433 {
    static int maxScore = 0;
    static List<int[]> queries;
    static int Q;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Q = scanner.nextInt();
        queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            queries.add(new int[]{a, b, c, d});
        }
        int[] current = new int[N];
        generate(current, 0, 1, M);
        System.out.println(maxScore);
    }

    static void generate(int[] current, int position, int start, int M) {
        if (position == current.length) {
            int score = 0;
            for (int[] q : queries) {
                int aIdx = q[0] - 1;
                int bIdx = q[1] - 1;
                if (current[bIdx] - current[aIdx] == q[2]) {
                    score += q[3];
                }
            }
            maxScore = Math.max(maxScore, score);
            return;
        }
        for (int i = start; i <= M; i++) {
            current[position] = i;
            generate(current, position + 1, i, M);
        }
    }
}

