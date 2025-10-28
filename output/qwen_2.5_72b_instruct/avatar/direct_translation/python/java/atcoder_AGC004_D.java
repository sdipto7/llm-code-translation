
import java.util.*;

public class atcoder_AGC004_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Set<Integer>> links = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            links.add(new HashSet<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            links.get(a).add(i);
        }
        int[] result = dfs(links, n, k, 0, 0);
        if (scanner.nextInt() != 1) {
            result[1]++;
        }
        System.out.println(result[1]);
    }

    public static int[] dfs(List<Set<Integer>> links, int n, int k, int v, int p) {
        int height_from_leaf = 0;
        int cut_count = 0;
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int[] result = dfs(links, n, k, u, v);
            height_from_leaf = Math.max(height_from_leaf, result[0]);
            cut_count += result[1];
        }
        height_from_leaf++;
        if (p != 0 && height_from_leaf == k) {
            height_from_leaf = 0;
            cut_count++;
        }
        return new int[]{height_from_leaf, cut_count};
    }
}

