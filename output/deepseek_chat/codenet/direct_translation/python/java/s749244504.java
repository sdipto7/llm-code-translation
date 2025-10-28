
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class s749244504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] C = new int[10][10];
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                C[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] A = new int[h][w];
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i == 1) continue;
            d.put(i, dijkstra(C, i, 1));
        }
        int sum = 0;
        for (int[] row : A) {
            for (int a : row) {
                if (a == -1 || a == 1) continue;
                sum += d.get(a);
            }
        }
        System.out.println(sum);
    }

    private static int dijkstra(int[][] graph, int start, int end) {
        int[] dist = new int[10];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int weight = current[1];
            if (node == end) return weight;
            if (weight > dist[node]) continue;
            for (int neighbor = 0; neighbor < 10; neighbor++) {
                if (graph[node][neighbor] == 0) continue;
                int newDist = weight + graph[node][neighbor];
                if (newDist < dist[neighbor]) {
                    dist[neighbor] = newDist;
                    pq.add(new int[]{neighbor, newDist});
                }
            }
        }
        return dist[end];
    }
}

