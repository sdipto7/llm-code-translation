
import java.util.*;

public class atcoder_ABC167_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        
        List<List<Integer>> combinations = new ArrayList<>();
        for (int k = 1; k <= n; k++) {
            combinations.addAll(generateCombinations(n, k));
        }
        
        for (int col = 1; col <= m; col++) {
            List<Integer> toRemove = new ArrayList<>();
            
            for (int idx = 0; idx < combinations.size(); idx++) {
                List<Integer> combination = combinations.get(idx);
                int sum = 0;
                for (int row : combination) {
                    sum += c[row][col];
                }
                if (sum < x) {
                    toRemove.add(idx);
                }
            }
            
            Collections.sort(toRemove, Collections.reverseOrder());
            for (int idx : toRemove) {
                combinations.remove(idx);
            }
            
            if (combinations.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        
        int minCost = Integer.MAX_VALUE;
        for (List<Integer> combination : combinations) {
            int cost = 0;
            for (int row : combination) {
                cost += c[row][0];
            }
            minCost = Math.min(minCost, cost);
        }
        
        System.out.println(minCost);
    }
    
    private static List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), n, k, result);
        return result;
    }
    
    private static void backtrack(int start, List<Integer> current, int n, int k, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < n; i++) {
            current.add(i);
            backtrack(i + 1, current, n, k, result);
            current.remove(current.size() - 1);
        }
    }
}

