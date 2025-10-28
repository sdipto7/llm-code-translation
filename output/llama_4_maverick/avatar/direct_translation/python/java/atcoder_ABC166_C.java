
import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = i;
        }
        int[] heights = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            heights[i] = sc.nextInt();
        }
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hp.put(h[i], heights[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            int f = 0;
            for (int j : entry.getValue()) {
                if (hp.get(i) <= hp.get(j)) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

