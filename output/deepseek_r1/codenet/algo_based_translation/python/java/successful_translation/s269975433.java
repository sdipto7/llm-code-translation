
import java.util.*;

public class s269975433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        
        List<int[]> QGroups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            QGroups.add(new int[]{a, b, c, d});
        }
        
        List<List<Integer>> sequences = new ArrayList<>();
        generateSequences(1, new ArrayList<>(), sequences, M, N);
        
        int maxScore = 0;
        for (List<Integer> p : sequences) {
            int tempScore = 0;
            for (int[] q : QGroups) {
                int aIndex = q[0] - 1;
                int bIndex = q[1] - 1;
                if (p.get(bIndex) - p.get(aIndex) == q[2]) {
                    tempScore += q[3];
                }
            }
            maxScore = Math.max(maxScore, tempScore);
        }
        
        System.out.println(maxScore);
    }
    
    private static void generateSequences(int start, List<Integer> current, List<List<Integer>> result, int M, int N) {
        if (current.size() == N) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= M; i++) {
            current.add(i);
            generateSequences(i, current, result, M, N);
            current.remove(current.size() - 1);
        }
    }
}

