
import java.util.*;

public class s951169509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        String[] G = new String[H + 2];
        char[] hashArr = new char[W + 2];
        Arrays.fill(hashArr, '#');
        String hashRow = new String(hashArr);
        G[0] = hashRow;
        for (int i = 1; i <= H; i++) {
            String line = sc.nextLine();
            G[i] = "#" + line + "#";
        }
        G[H + 1] = hashRow;

        int ans = 0;

        for (int sx = 0; sx < W + 2; sx++) {
            for (int sy = 0; sy < H + 2; sy++) {
                if (G[sy].charAt(sx) == '.') {
                    int[][] dist = new int[H + 2][W + 2];
                    for (int[] row : dist) Arrays.fill(row, Integer.MIN_VALUE);
                    int[][] visited = new int[H + 2][W + 2];
                    for (int[] row : visited) Arrays.fill(row, -1);
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{sx, sy});
                    dist[sy][sx] = 0;
                    visited[sy][sx] = 1;
                    while (!q.isEmpty()) {
                        int[] pos = q.poll();
                        int x = pos[0];
                        int y = pos[1];
                        if (x + 1 < W + 2 && G[y].charAt(x + 1) == '.' && visited[y][x + 1] == -1) {
                            dist[y][x + 1] = dist[y][x] + 1;
                            visited[y][x + 1] = 1;
                            q.add(new int[]{x + 1, y});
                        }
                        if (x - 1 >= 0 && G[y].charAt(x - 1) == '.' && visited[y][x - 1] == -1) {
                            dist[y][x - 1] = dist[y][x] + 1;
                            visited[y][x - 1] = 1;
                            q.add(new int[]{x - 1, y});
                        }
                        if (y + 1 < H + 2 && G[y + 1].charAt(x) == '.' && visited[y + 1][x] == -1) {
                            dist[y + 1][x] = dist[y][x] + 1;
                            visited[y + 1][x] = 1;
                            q.add(new int[]{x, y + 1});
                        }
                        if (y - 1 >= 0 && G[y - 1].charAt(x) == '.' && visited[y - 1][x] == -1) {
                            dist[y - 1][x] = dist[y][x] + 1;
                            visited[y - 1][x] = 1;
                            q.add(new int[]{x, y - 1});
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

