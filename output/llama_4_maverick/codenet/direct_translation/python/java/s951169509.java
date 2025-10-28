
import java.util.*;

public class s951169509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] G = new char[H+2][W+2];
        for (int i = 0; i < H+2; i++) {
            if (i == 0 || i == H+1) {
                for (int j = 0; j < W+2; j++) {
                    G[i][j] = '#';
                }
            } else {
                String s = sc.next();
                G[i][0] = '#';
                for (int j = 0; j < s.length(); j++) {
                    G[i][j+1] = s.charAt(j);
                }
                G[i][W+1] = '#';
            }
        }

        int ans = 0;
        for (int sx = 0; sx < W+2; sx++) {
            for (int sy = 0; sy < H+2; sy++) {
                if (G[sy][sx] == '.') {
                    int[][] dist = new int[H+2][W+2];
                    boolean[][] visited = new boolean[H+2][W+2];
                    for (int i = 0; i < H+2; i++) {
                        for (int j = 0; j < W+2; j++) {
                            dist[i][j] = Integer.MIN_VALUE;
                            visited[i][j] = false;
                        }
                    }
                    Deque<int[]> q = new ArrayDeque<>();
                    q.add(new int[]{sx, sy});
                    dist[sy][sx] = 0;
                    visited[sy][sx] = true;
                    while (!q.isEmpty()) {
                        int[] p = q.poll();
                        int x = p[0];
                        int y = p[1];

                        if (G[y][x+1] == '.' && !visited[y][x+1]) {
                            q.add(new int[]{x+1, y});
                            dist[y][x+1] = dist[y][x] + 1;
                            visited[y][x+1] = true;
                        }

                        if (G[y][x-1] == '.' && !visited[y][x-1]) {
                            q.add(new int[]{x-1, y});
                            dist[y][x-1] = dist[y][x] + 1;
                            visited[y][x-1] = true;
                        }

                        if (G[y+1][x] == '.' && !visited[y+1][x]) {
                            q.add(new int[]{x, y+1});
                            dist[y+1][x] = dist[y][x] + 1;
                            visited[y+1][x] = true;
                        }

                        if (G[y-1][x] == '.' && !visited[y-1][x]) {
                            q.add(new int[]{x, y-1});
                            dist[y-1][x] = dist[y][x] + 1;
                            visited[y-1][x] = true;
                        }
                    }
                    for (int i = 0; i < H+2; i++) {
                        for (int j = 0; j < W+2; j++) {
                            ans = Math.max(ans, dist[i][j]);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

