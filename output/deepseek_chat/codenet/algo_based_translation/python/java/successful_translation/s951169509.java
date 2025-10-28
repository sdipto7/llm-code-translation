
import java.util.*;
import java.io.*;

public class s951169509 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = br.readLine().split(" ");
        int H = Integer.parseInt(dimensions[0]);
        int W = Integer.parseInt(dimensions[1]);
        
        List<String> G = new ArrayList<>();
        for (int i = 0; i <= H + 1; i++) {
            if (i == 0 || i == H + 1) {
                G.add("#".repeat(W + 2));
            } else {
                G.add("#" + br.readLine() + "#");
            }
        }
        
        int ans = 0;
        for (int sx = 0; sx <= W + 1; sx++) {
            for (int sy = 0; sy <= H + 1; sy++) {
                if (G.get(sy).charAt(sx) == '.') {
                    double[][] dist = new double[H + 2][W + 2];
                    int[][] visited = new int[H + 2][W + 2];
                    for (int i = 0; i <= H + 1; i++) {
                        Arrays.fill(dist[i], Double.NEGATIVE_INFINITY);
                        Arrays.fill(visited[i], -1);
                    }
                    
                    Deque<int[]> q = new ArrayDeque<>();
                    q.add(new int[]{sx, sy});
                    dist[sy][sx] = 0;
                    visited[sy][sx] = 1;
                    
                    while (!q.isEmpty()) {
                        int[] current = q.poll();
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
                    
                    for (int i = 0; i <= W + 1; i++) {
                        for (int j = 0; j <= H + 1; j++) {
                            ans = Math.max(ans, (int) dist[j][i]);
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}

