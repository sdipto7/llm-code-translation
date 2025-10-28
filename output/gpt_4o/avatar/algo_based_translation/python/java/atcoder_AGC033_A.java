
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        double[][] graph = new double[h][w];
        
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Double.POSITIVE_INFINITY;
                }
            }
        }
        
        // Iterate over columns from left to right
        for (int x = 0; x < w - 1; x++) {
            for (int y = 0; y < h; y++) {
                graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
            }
        }
        
        // Iterate over columns from right to left
        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
            }
        }
        
        // Iterate over rows from top to bottom
        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                graph[y + 1][x] = Math.min(graph[y][x] + 1, graph[y + 1][x]);
            }
        }
        
        // Iterate over rows from bottom to top
        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                graph[y - 1][x] = Math.min(graph[y][x] + 1, graph[y - 1][x]);
            }
        }
        
        double maxValue = Double.NEGATIVE_INFINITY;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (graph[y][x] > maxValue) {
                    maxValue = graph[y][x];
                }
            }
        }
        
        System.out.println((int) maxValue);
    }
}

