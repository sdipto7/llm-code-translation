
import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        
        String[] hInput = scanner.nextLine().split(" ");
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(hInput[i]);
        }
        
        Map<Integer, Integer> heightMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            heightMap.put(i, h[i - 1]);
        }
        
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            String[] edge = scanner.nextLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            adjacencyList.get(a).add(b);
            adjacencyList.get(b).add(a);
        }
        
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int nodeId = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            boolean isGood = true;
            for (int neighbor : neighbors) {
                if (heightMap.get(nodeId) <= heightMap.get(neighbor)) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}

