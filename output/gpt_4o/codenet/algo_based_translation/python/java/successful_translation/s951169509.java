
import java.util.*;

public class s951169509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        List<String> G = new ArrayList<>();

        for (int i = 0; i < H + 2; i++) {
            if (i == 0 || i == H + 1) {
                G.add("#".repeat(W + 2));
            } else {
                G.add("#" + scanner.nextLine() + "#");
            }
        }

        int ans = 0;

        for (int sx = 0; sx < W + 2; sx++) {
            for (int sy = 0; sy < H + 2; sy++) {
                if (G.get(sy).charAt(sx) == '.') {
                    int[][] dist = new int[H + 2][W + 2];
                    for (int[] row : dist) {
                        Arrays.fill(row, Integer.MIN_VALUE);
                    }

                    int[][] visited = new int[H + 2][W + 2];
                    for (int[] row : visited) {
                        Arrays.fill(row, -1);
                    }

                    Deque<int[]> q = new ArrayDeque<>();
                    q.add(new int[]{sx, sy});
                    dist[sy][sx] = 0;
                    visited[sy][sx] = 1;

                    while (!q.isEmpty()) {
                        int[] current = q.pollFirst();
                        int x = current[0];
                        int y = current[1];

                        if (G.get(y).charAt(x + 1) == '.' && visited[y][x + 1] == -1) {
                            q.add(new int[]{x + 1, y});
                            dist[y][x + 1] = dist[y][x] + 1;
                            visited[y][x + 1] = 1;
                        }
                        if (G.get(y).charAt(x - 1) == '.' && visited[y][x - 1] == -1) {
                            q.add(new int[]{x - 1, y});
                            dist[y][x - 1] = dist[y][x] + 1;
                            visited[y][x - 1] = 1;
                        }
                        if (G.get(y + 1).charAt(x) == '.' && visited[y + 1][x] == -1) {
                            q.add(new int[]{x, y + 1});
                            dist[y + 1][x] = dist[y][x] + 1;
                            visited[y + 1][x] = 1;
                        }
                        if (G.get(y - 1).charAt(x) == '.' && visited[y - 1][x] == -1) {
                            q.add(new int[]{x, y - 1});
                            dist[y - 1][x] = dist[y][x] + 1;
                            visited[y - 1][x] = 1;
                        }
                    }

                    for (int i = 0; i < W + 2; i++) {
                        for (int j = 0; j < H + 2; j++) {
                            ans = Math.max(ans, dist[j][i]);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}

