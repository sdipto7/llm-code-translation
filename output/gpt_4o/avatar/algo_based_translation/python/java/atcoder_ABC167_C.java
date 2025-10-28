
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class atcoder_ABC167_C {
    
    public static int computeMinimumCost(int n, int m, int x, int[][] c) {
        List<Integer> pre = IntStream.range(0, n).boxed().collect(Collectors.toList());
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (List<Integer> combination : combinations(pre, i)) {
                l.add(combination);
            }
        }

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
                return -1;
            }
        }

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

        return ans;
    }

    private static <T> List<List<T>> combinations(List<T> list, int k) {
        List<List<T>> result = new ArrayList<>();
        if (k == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            List<T> sublist = list.subList(i + 1, list.size());
            for (List<T> subcombination : combinations(sublist, k - 1)) {
                List<T> combination = new ArrayList<>();
                combination.add(current);
                combination.addAll(subcombination);
                result.add(combination);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);
        
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j <= m; j++) {
                c[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int result = computeMinimumCost(n, m, x, c);
        System.out.println(result);
    }
}

