
import java.util.*;
import java.util.stream.IntStream;

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
        
        int[] pre = IntStream.range(0, n).toArray();
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        
        for (int i = 1; i <= n; i++) {
            combinations(pre, i).forEach(comb -> l.add(comb));
        }
        
        boolean breakFlag = false;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                List<Integer> k = l.get(j);
                int ca = 0;
                for (int ii : k) {
                    ca += c[ii][i];
                }
                if (ca < x) {
                    rem.add(0, j);
                }
            }
            if (!rem.isEmpty()) {
                for (int j : rem) {
                    l.remove(j);
                }
                rem.clear();
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                breakFlag = true;
                break;
            }
        }
        
        if (!breakFlag) {
            for (List<Integer> i : l) {
                int ca = 0;
                for (int j : i) {
                    ca += c[j][0];
                }
                if (ans == 0) {
                    ans = ca;
                } else {
                    ans = Math.min(ans, ca);
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
    
    private static List<List<Integer>> combinations(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(arr, k, 0, new ArrayList<>(), result);
        return result;
    }
    
    private static void combine(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            combine(arr, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

