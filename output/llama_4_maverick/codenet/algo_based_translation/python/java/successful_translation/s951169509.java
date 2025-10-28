
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class s951169509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine();

        char[][] G = new char[H + 2][W + 2];
        for (int i = 0; i < H + 2; i++) {
            if (i == 0 || i == H + 1) {
                for (int j = 0; j < W + 2; j++) {
                    G[i][j] = '#';
                }
            } else {
                String line = scanner.nextLine();
                G[i][0] = '#';
                G[i][W + 1] = '#';
                for (int j = 1; j <= W; j++) {
                    G[i][j] = line.charAt(j - 1);
                }
            }
        }

        int ans = 0;
        for (int sx = 0; sx < W + 2; sx++) {
            for (int sy = 0; sy < H + 2; sy++) {
                if (G[sy][sx] == '.') {
                    int[][] dist = new int[H + 2][W + 2];
                    for (int i = 0; i < H + 2; i++) {
                        for (int j = 0; j < W + 2; j++) {
                            dist[i][j] = Integer.MIN_VALUE;
                        }
                    }
                    boolean[][] visited = new boolean[H + 2][W + 2];
                    Deque<int[]> q = new LinkedList<>();
                    q.add(new int[] { sx, sy });
                    dist[sy][sx] = 0;
                    visited[sy][sx] = true;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int x = cell[0];
                        int y = cell[1];

                        if (x + 1 < W + 2 && G[y][x + 1] == '.' && !visited[y][x + 1]) {
                            q.add(new int[] { x + 1, y });
                            dist[y][x + 1] = dist[y][x] + 1;
                            visited[y][x + 1] = true;
                        }

                        if (x - 1 >= 0 && G[y][x - 1] == '.' && !visited[y][x - 1]) {
                            q.add(new int[] { x - 1, y });
                            dist[y][x - 1] = dist[y][x] + 1;
                            visited[y][x - 1] = true;
                        }

                        if (y + 1 < H + 2 && G[y + 1][x] == '.' && !visited[y + 1][x]) {
                            q.add(new int[] { x, y + 1 });
                            dist[y + 1][x] = dist[y][x] + 1;
                            visited[y + 1][x] = true;
                        }

                        if (y - 1 >= 0 && G[y - 1][x] == '.' && !visited[y - 1][x]) {
                            q.add(new int[] { x, y - 1 });
                            dist[y - 1][x] = dist[y][x] + 1;
                            visited[y - 1][x] = true;
                        }
                    }

                    for (int i = 0; i < H + 2; i++) {
                        for (int j = 0; j < W + 2; j++) {
                            ans = Math.max(ans, dist[i][j]);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

