import java.util.*;
import java.io.*;

public class s749244504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int h = Integer.parseInt(firstLine[0]);
        int w = Integer.parseInt(firstLine[1]);
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

        int[][] dist = new int[10][10];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i == 1) continue;
            d.put(i, dist[i][1]);
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
}
