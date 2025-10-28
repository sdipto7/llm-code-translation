
import java.util.Scanner;

public class s269975433 {
    static int N, M, Q;
    static int[][] Q_groups;
    static int max_score;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        Q = scanner.nextInt();
        Q_groups = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 4; j++) {
                Q_groups[i][j] = scanner.nextInt();
            }
        }
        max_score = 0;
        generate(1, new int[N]);
        System.out.println(max_score);
    }

    static void generate(int start, int[] current) {
        if (current.length == N) {
            int temp_score = 0;
            for (int[] q : Q_groups) {
                if (current[q[1] - 1] - current[q[0] - 1] == q[2]) {
                    temp_score += q[3];
                }
            }
            max_score = Math.max(max_score, temp_score);
        } else {
            for (int i = start; i <= M; i++) {
                current[current.length - N + current.length - (N - 1)] = i;
                generate(i, current);
            }
        }
    }
}

