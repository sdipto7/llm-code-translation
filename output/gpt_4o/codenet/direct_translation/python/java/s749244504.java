
import java.util.*;
import java.io.*;

public class s749244504 {
    public static void main(String[] args) throws IOException {
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
        int[] distance = new int[10];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[1] = 0;
        boolean[] visited = new boolean[10];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{1, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];
            if (visited[node]) continue;
            visited[node] = true;
            for (int i = 0; i < 10; i++) {
                if (!visited[i] && distance[i] > dist + C[i][node]) {
                    distance[i] = dist + C[i][node];
                    pq.add(new int[]{i, distance[i]});
                }
            }
        }
        int s = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = A[i][j];
                if (a != -1 && a != 1) {
                    s += distance[a];
                }
            }
        }
        System.out.println(s);
    }
}

