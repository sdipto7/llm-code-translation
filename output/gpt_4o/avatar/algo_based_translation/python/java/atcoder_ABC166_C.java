
import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }
        
        List<int[]> connections = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            connections.add(new int[]{a, b});
        }
        
        int result = countUnobstructedPeaks(n, m, heights, connections);
        System.out.println(result);
        
        scanner.close();
    }

    public static int countUnobstructedPeaks(int n, int m, List<Integer> heights, List<int[]> connections) {
        List<Integer> p = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            p.add(i);
        }
        
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hp.put(p.get(i), heights.get(i));
        }
        
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        
        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];
            path.get(a).add(b);
            path.get(b).add(a);
        }
        
        int c = 0;
        
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            List<Integer> v = entry.getValue();
            int f = 0;
            for (int j : v) {
                if (hp.get(i) <= hp.get(j)) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                c++;
            }
        }
        
        return c;
    }
}

