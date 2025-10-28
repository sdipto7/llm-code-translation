
import java.util.Scanner;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                graph[i][j] = line.charAt(j) == '#' ? 0 : (int) 1e9;
            }
        }
        for (int x = 0; x < w - 1; x++) {
            for (int i = 0; i < h; i++) {
                if (graph[i][x + 1] > graph[i][x] + 1) {
                    graph[i][x + 1] = graph[i][x] + 1;
                }
            }
        }
        for (int x = w - 1; x > 0; x--) {
            for (int i = 0; i < h; i++) {
                if (graph[i][x - 1] > graph[i][x] + 1) {
                    graph[i][x - 1] = graph[i][x] + 1;
                }
            }
        }
        for (int y = 0; y < h - 1; y++) {
            for (int j = 0; j < w; j++) {
                if (graph[y + 1][j] > graph[y][j] + 1) {
                    graph[y + 1][j] = graph[y][j] + 1;
                }
            }
        }
        for (int y = h - 1; y > 0; y--) {
            for (int j = 0; j < w; j++) {
                if (graph[y - 1][j] > graph[y][j] + 1) {
                    graph[y - 1][j] = graph[y][j] + 1;
                }
            }
        }
        int max = 0;
        for (int[] row : graph) {
            for (int val : row) {
                max = Math.max(max, val);
            }
        }
        System.out.println(max);
    }
}

