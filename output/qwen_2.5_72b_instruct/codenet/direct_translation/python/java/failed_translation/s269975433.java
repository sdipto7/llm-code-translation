import java.util.*;

public class s269975433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        List<int[]> Q_groups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int[] q = new int[4];
            for (int j = 0; j < 4; j++) {
                q[j] = sc.nextInt();
            }
            Q_groups.add(q);
        }

        int max_score = 0;
        int[] p = new int[N];
        int[] elements = new int[M];
        for (int i = 0; i < M; i++) {
            elements[i] = i + 1;
        }
        combinationsWithReplacement(elements, p, 0, 0, N, Q_groups, max_score);
    }

    static void combinationsWithReplacement(int[] elements, int[] p, int start, int index, int r, List<int[]> Q_groups, int max_score) {
        if (index == r) {
            int temp_score = 0;
            for (int[] q : Q_groups) {
                if (p[q[1] - 1] - p[q[0] - 1] == q[2]) {
                    temp_score += q[3];
                }
            }
            max_score = Math.max(max_score, temp_score);
            System.out.println(max_score);
            return;
        }

        for (int i = start; i < elements.length; i++) {
            p[index] = elements[i];
            combinationsWithReplacement(elements, p, i, index + 1, r, Q_groups, max_score);
        }
    }
}
