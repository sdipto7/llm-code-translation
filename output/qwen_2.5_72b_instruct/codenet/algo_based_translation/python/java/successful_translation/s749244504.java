
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class s749244504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] C = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                C[i][j] = scanner.nextInt();
            }
        }
        int[][] A = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                continue;
            }
            d.put(i, dijkstra(C, i, 1));
        }
        int s = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = A[i][j];
                if (a == -1 || a == 1) {
                    continue;
                }
                s += d.get(a);
            }
        }
        System.out.println(s);
    }

    private static int dijkstra(int[][] C, int start, int end) {
        int[] dist = new int[10];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{start, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            if (u == end) {
                return dist[u];
            }
            for (int v = 0; v < 10; v++) {
                if (C[u][v] > 0) {
                    int alt = dist[u] + C[u][v];
                    if (alt < dist[v]) {
                        dist[v] = alt;
                        pq.add(new int[]{v, alt});
                    }
                }
            }
        }
        return -1;
    }
}

