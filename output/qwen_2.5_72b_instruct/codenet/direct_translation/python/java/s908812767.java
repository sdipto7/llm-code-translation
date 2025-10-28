
import java.util.*;

public class s908812767 {
    static int n;
    static Map<Integer, List<int[]>> V = new HashMap<>();
    static int[] color;

    public static boolean dfs(int i) {
        for (int[] pair : V.getOrDefault(i, Collections.emptyList())) {
            int v = pair[0], w = pair[1];
            if (w % 2 == 0) {
                if (color[v] == -1) {
                    color[v] = color[i];
                } else if (color[v] == color[i]) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (color[v] == -1) {
                    color[v] = color[i] == 0 ? 1 : 0;
                } else if (color[v] == color[i]) {
                    return false;
                } else {
                    continue;
                }
            }
            if (!dfs(v)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        color = new int[n + 1];
        Arrays.fill(color, -1);
        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt(), v = scanner.nextInt(), w = scanner.nextInt();
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

