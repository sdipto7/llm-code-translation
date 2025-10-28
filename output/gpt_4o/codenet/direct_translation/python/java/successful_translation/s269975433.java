
import java.util.*;

public class s269975433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        
        int[][] Q_groups = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 4; j++) {
                Q_groups[i][j] = scanner.nextInt();
            }
        }
        
        int max_score = 0;
        int[] p = new int[N];
        max_score = findMaxScore(p, 0, 1, N, M, Q_groups, max_score);
        
        System.out.println(max_score);
    }
    
    private static int findMaxScore(int[] p, int index, int start, int N, int M, int[][] Q_groups, int max_score) {
        if (index == N) {
            int temp_score = 0;
            for (int[] q : Q_groups) {
                if (p[q[1] - 1] - p[q[0] - 1] == q[2]) {
                    temp_score += q[3];
                }
            }
            return Math.max(max_score, temp_score);
        } else {
            for (int i = start; i <= M; i++) {
                p[index] = i;
                max_score = findMaxScore(p, index + 1, i, N, M, Q_groups, max_score);
            }
        }
        return max_score;
    }
}

