
import java.util.*;

public class s908812767 {
    static Map<Integer, List<int[]>> V = new HashMap<>();
    static Map<Integer, Integer> color = new HashMap<>();

    public static boolean dfs(int i) {
        for (int[] vw : V.getOrDefault(i, new ArrayList<>())) {
            int v = vw[0], w = vw[1];
            if ((w % 2) == 0) {
                if (color.get(v) == -1) {
                    color.put(v, color.get(i));
                } else if (color.get(v).equals(color.get(i))) {
                    continue;
                } else if (!color.get(v).equals(color.get(i))) {
                    return false;
                }
            } else {
                if (color.get(v) == -1) {
                    color.put(v, color.get(i) == 0 ? 1 : 0);
                } else if (color.get(v).equals(color.get(i))) {
                    return false;
                } else if (!color.get(v).equals(color.get(i))) {
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
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            V.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            V.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }

        for (int i = 1; i <= n; i++) {
            color.put(i, -1);
        }

        while (true) {
            int i = 0;
            for (int j = 1; j <= n; j++) {
                if (color.get(j) == -1) {
                    i = j;
                    color.put(i, 0);
                    break;
                }
            }
            if (i == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.println(color.get(j));
                }
                break;
            } else {
                if (!dfs(i)) {
                    System.out.println("No");
                    break;
                }
            }
        }

        scanner.close();
    }
}

