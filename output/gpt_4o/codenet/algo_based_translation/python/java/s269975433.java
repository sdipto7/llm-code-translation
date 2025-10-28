
import java.util.*;
import java.io.*;

public class s269975433 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = reader.readLine().trim().split("\\s+");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int Q = Integer.parseInt(line[2]);
        
        List<int[]> Q_groups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            line = reader.readLine().trim().split("\\s+");
            int[] query = new int[4];
            for (int j = 0; j < 4; j++) {
                query[j] = Integer.parseInt(line[j]);
            }
            Q_groups.add(query);
        }
        
        int max_score = 0;
        int[] combination = new int[N];
        combinationsWithReplacement(combination, 0, 1, N, M, Q_groups);
    }
    
    private static void combinationsWithReplacement(int[] combination, int index, int start, int N, int M, List<int[]> Q_groups) {
        if (index == N) {
            int temp_score = 0;
            for (int[] q : Q_groups) {
                if (combination[q[1] - 1] - combination[q[0] - 1] == q[2]) {
                    temp_score += q[3];
                }
            }
            max_score = Math.max(max_score, temp_score);
            return;
        }
        
        for (int i = start; i <= M; i++) {
            combination[index] = i;
            combinationsWithReplacement(combination, index + 1, i, N, M, Q_groups);
        }
    }

    private static int max_score = 0;
}

