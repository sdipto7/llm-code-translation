import java.util.*;
import java.io.*;

public class s269975433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        List<int[]> Q_groups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            Q_groups.add(new int[]{a, b, c, d});
        }
        
        int max_score = 0;
        List<List<Integer>> combinations = generateCombinationsWithReplacement(N, M);
        
        for (List<Integer> p : combinations) {
            int temp_score = 0;
            for (int[] q : Q_groups) {
                if (p.get(q[1] - 1) - p.get(q[0] - 1) == q[2]) {
                    temp_score += q[3];
                }
            }
            if (temp_score > max_score) {
                max_score = temp_score;
            }
        }
        
        System.out.println(max_score);
    }
    
    private static List<List<Integer>> generateCombinationsWithReplacement(int n, int m) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(n, m, 1, new ArrayList<>(), result);
        return result;
    }
    
    private static void generateCombinations(int n, int m, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i <= m; i++) {
            current.add(i);
            generateCombinations(n, m, i, current, result);
            current.remove(current.size() - 1);
        }
    }
}
