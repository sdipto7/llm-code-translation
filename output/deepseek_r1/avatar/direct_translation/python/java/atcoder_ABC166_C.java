
import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(scanner.nextInt());
        }
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hp.put(i, h.get(i - 1));
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int node = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            boolean allSmaller = true;
            for (int neighbor : neighbors) {
                if (hp.get(neighbor) >= hp.get(node)) {
                    allSmaller = false;
                    break;
                }
            }
            if (allSmaller) {
                count++;
            }
        }
        System.out.println(count);
    }
}

