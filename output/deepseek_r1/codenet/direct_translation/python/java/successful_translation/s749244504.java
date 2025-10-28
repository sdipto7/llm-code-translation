
import java.util.*;
import java.io.*;

public class s749244504 {
    static class Edge {
        int to, weight;
        Edge(int t, int w) { to = t; weight = w; }
    }

    static class Node implements Comparable<Node> {
        int id, dist;
        Node(int i, int d) { id = i; dist = d; }
        public int compareTo(Node other) { return Integer.compare(dist, other.dist); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] C = new int[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                C[i][j] = sc.nextInt();
        int[][] A = new int[h][w];
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                A[i][j] = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Edge> edges = new ArrayList<>();
            for (int j = 0; j < 10; j++)
                edges.add(new Edge(j, C[i][j]));
            graph.add(edges);
        }

        int[] d = new int[10];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[1] = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 1) continue;
            d[i] = dijkstra(graph, i, 1);
        }

        long sum = 0;
        for (int[] row : A)
            for (int a : row)
                if (a != -1 && a != 1)
                    sum += d[a];
        System.out.println(sum);
    }

    private static int dijkstra(List<List<Edge>> graph, int start, int end) {
        int[] dist = new int[10];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            if (current.id == end) return current.dist;
            if (current.dist > dist[current.id]) continue;
            for (Edge e : graph.get(current.id)) {
                int newDist = current.dist + e.weight;
                if (newDist < dist[e.to]) {
                    dist[e.to] = newDist;
                    pq.add(new Node(e.to, newDist));
                }
            }
        }
        return dist[end];
    }
}

