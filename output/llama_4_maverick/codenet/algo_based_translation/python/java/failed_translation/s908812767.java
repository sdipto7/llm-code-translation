
import java.util.*;

public class s908812767 {
    static int n;
    static Map<Integer, List<int[]>> V = new HashMap<>();
    static int[] color;

    public static boolean dfs(int i) {
        for (int[] edge : V.getOrDefault(i, new ArrayList<>())) {
            int v = edge[0];
            int w = edge[1];
            if (w % 2 == 0) {
                if (color[v] == -1) {
                    color[v] = color[i];
                } else if (color[v] != color[i]) {
                    return false;
                }
            } else {
                if (color[v] == -1) {
                    color[v] = 1 - color[i];
                } else if (color[v] == color[i]) {
                    return false;
                }
            }
            if (!dfs(v)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        color = new int[n + 1];
        Arrays.fill(color, -1);

        for (int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            V.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            V.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }

        while (true) {
            int i = 0;
            for (int j = 1; j <= n; j++) {
                if (color[j] == -1) {
                    i = j;
                    color[i] = 0;
                    break;
                }
            }
            if (i == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.println(color[j]);
                }
                break;
            } else {
                if (!dfs(i)) {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}

