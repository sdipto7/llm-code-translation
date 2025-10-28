
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();
        
        double[][] graphArray = new double[h][w];
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                char c = line.charAt(j);
                if (c == '#') {
                    graphArray[i][j] = 0.0;
                } else {
                    graphArray[i][j] = Double.POSITIVE_INFINITY;
                }
            }
        }
        
        for (int x = 0; x < w - 1; x++) {
            for (int y = 0; y < h; y++) {
                graphArray[y][x + 1] = Math.min(graphArray[y][x] + 1, graphArray[y][x + 1]);
            }
        }
        
        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                graphArray[y][x - 1] = Math.min(graphArray[y][x] + 1, graphArray[y][x - 1]);
            }
        }
        
        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                graphArray[y + 1][x] = Math.min(graphArray[y][x] + 1, graphArray[y + 1][x]);
            }
        }
        
        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                graphArray[y - 1][x] = Math.min(graphArray[y][x] + 1, graphArray[y - 1][x]);
            }
        }
        
        double maxValue = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graphArray[i][j] > maxValue) {
                    maxValue = graphArray[i][j];
                }
            }
        }
        
        System.out.println((int) maxValue);
    }
}

