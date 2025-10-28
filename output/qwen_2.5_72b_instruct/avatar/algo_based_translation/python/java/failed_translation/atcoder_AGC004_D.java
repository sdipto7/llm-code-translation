
import java.util.*;

public class atcoder_AGC004_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Set<Integer>> links = new ArrayList<>(Collections.nCopies(n, new HashSet<>()));
        List<Integer> aaa = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            aaa.add(a);
            a -= 1;
            links.get(a).add(i + 1);
        }
        
        int[] result = dfs(links, n, k, 0, 0);
        int ans = result[1];
        
        if (aaa.get(0) != 1) {
            ans += 1;
        }
        
        System.out.println(ans);
    }

    public static int[] dfs(List<Set<Integer>> links, int n, int k, int v, int p) {
        int height_from_leaf = 0;
        int cut_count = 0;
        
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int[] result = dfs(links, n, k, u, v);
            int hgt = result[0];
            int cut = result[1];
            height_from_leaf = Math.max(height_from_leaf, hgt);
            cut_count += cut;
        }
        
        height_from_leaf += 1;
        
        if (p != 0 && height_from_leaf == k) {
            height_from_leaf = 0;
            cut_count += 1;
        }
        
        return new int[]{height_from_leaf, cut_count};
    }
}

