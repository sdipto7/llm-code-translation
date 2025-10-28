
import java.util.*;
import java.io.*;

public class s749244504 {
    static class Node implements Comparable<Node> {
        int id;
        int cost;

        Node(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] hw = br.readLine().split(" ");
            int h = Integer.parseInt(hw[0]);
            int w = Integer.parseInt(hw[1]);
            int[][] C = new int[10][10];
            for (int i = 0; i < 10; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < 10; j++) {
                    C[i][j] = Integer.parseInt(line[j]);
                }
            }
            int[][] A = new int[h][w];
            for (int i = 0; i < h; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    A[i][j] = Integer.parseInt(line[j]);
                }
            }

            int[] d = new int[10];
            for (int i = 0; i < 10; i++) {
                if (i == 1) {
                    d[i] = 0;
                    continue;
                }
                d[i] = dijkstra(C, i, 1);
            }

            long s = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int a = A[i][j];
                    if (a == -1 || a == 1) {
                        continue;
                    }
                    s += d[a];
                }
            }
            System.out.println(s);
        }
    }

    static int dijkstra(int[][] graph, int start, int end) {
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (node.id == end) {
                return node.cost;
            }
            for (int i = 0; i < graph.length; i++) {
                if (graph[node.id][i] != 0 && node.cost + graph[node.id][i] < dist[i]) {
                    dist[i] = node.cost + graph[node.id][i];
                    pq.add(new Node(i, dist[i]));
                }
            }
        }
        return dist[end];
    }
}

