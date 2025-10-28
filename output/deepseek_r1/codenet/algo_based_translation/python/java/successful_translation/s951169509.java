
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class s951169509 {
    private static class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[H+2][W+2];

        Arrays.fill(grid[0], '#');
        Arrays.fill(grid[H+1], '#');

        for (int i = 1; i <= H; i++) {
            String line = scanner.nextLine();
            grid[i][0] = '#';
            System.arraycopy(line.toCharArray(), 0, grid[i], 1, W);
            grid[i][W+1] = '#';
        }

        int ans = 0;

        for (int sx = 0; sx < W+2; sx++) {
            for (int sy = 0; sy < H+2; sy++) {
                if (grid[sy][sx] == '.') {
                    int[][] dist = new int[H+2][W+2];
                    boolean[][] visited = new boolean[H+2][W+2];
                    for (int[] row : dist) Arrays.fill(row, -1);
                    
                    Queue<Pair> queue = new LinkedList<>();
                    queue.add(new Pair(sx, sy));
                    dist[sy][sx] = 0;
                    visited[sy][sx] = true;

                    while (!queue.isEmpty()) {
                        Pair current = queue.poll();
                        int x = current.x;
                        int y = current.y;

                        if (x+1 < W+2 && grid[y][x+1] == '.' && !visited[y][x+1]) {
                            dist[y][x+1] = dist[y][x] + 1;
                            visited[y][x+1] = true;
                            queue.add(new Pair(x+1, y));
                        }
                        if (x-1 >= 0 && grid[y][x-1] == '.' && !visited[y][x-1]) {
                            dist[y][x-1] = dist[y][x] + 1;
                            visited[y][x-1] = true;
                            queue.add(new Pair(x-1, y));
                        }
                        if (y+1 < H+2 && grid[y+1][x] == '.' && !visited[y+1][x]) {
                            dist[y+1][x] = dist[y][x] + 1;
                            visited[y+1][x] = true;
                            queue.add(new Pair(x, y+1));
                        }
                        if (y-1 >= 0 && grid[y-1][x] == '.' && !visited[y-1][x]) {
                            dist[y-1][x] = dist[y][x] + 1;
                            visited[y-1][x] = true;
                            queue.add(new Pair(x, y-1));
                        }
                    }

                    for (int i = 0; i < W+2; i++) {
                        for (int j = 0; j < H+2; j++) {
                            ans = Math.max(ans, dist[j][i]);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

