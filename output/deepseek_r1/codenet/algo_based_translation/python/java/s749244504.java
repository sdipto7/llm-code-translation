
import java.util.*;

public class s749244504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();

        int[][] C = new int[10][10];
        for (int i = 0; i < 10; i++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            for (int j = 0; j < 10; j++) {
                C[i][j] = Integer.parseInt(parts[j]);
            }
        }

        int[][] A = new int[h][w];
        for (int i = 0; i < h; i++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            for (int j = 0; j < w; j++) {
                A[i][j] = Integer.parseInt(parts[j]);
            }
        }

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            graph.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                graph.get(i).add(new Edge(j, C[i][j]));
            }
        }

        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i == 1) continue;
            d.put(i, bellmanFord(graph, i, 1));
        }

        int s = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = A[i][j];
                if (a == -1 || a == 1) continue;
                s += d.get(a);
            }
        }

        System.out.println(s);
    }

    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    private static int bellmanFord(List<List<Edge>> graph, int start, int target) {
        int[] dist = new int[10];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < 9; i++) {
            for (int u = 0; u < 10; u++) {
                if (dist[u] == Integer.MAX_VALUE) continue;
                for (Edge e : graph.get(u)) {
                    if (dist[e.to] > dist[u] + e.weight) {
                        dist[e.to] = dist[u] + e.weight;
                    }
                }
            }
        }

        return dist[target];
    }
}

