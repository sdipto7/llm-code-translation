
import java.util.*;
import java.io.*;

public class s749244504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

        Graph g = new Graph(10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (C[i][j] != 0) {
                    g.addEdge(i, j, C[i][j]);
                }
            }
        }

        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                d[i] = 0;
            } else {
                d[i] = g.shortestPath(i, 1);
            }
        }

        int s = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = A[i][j];
                if (a != -1 && a != 1) {
                    s += d[a];
                }
            }
        }

        System.out.println(s);
    }
}

class Graph {
    private final List<List<Edge>> adj;
    private final int V;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Edge(v, weight));
    }

    public int shortestPath(int source, int target) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;
            int d = node.distance;

            if (d > dist[u]) {
                continue;
            }

            for (Edge edge : adj.get(u)) {
                int v = edge.destination;
                int weight = edge.weight;
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }

        return dist[target];
    }

    private static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}

