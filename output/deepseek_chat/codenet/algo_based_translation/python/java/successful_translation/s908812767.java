
import java.util.*;
import java.io.*;

public class s908812767 {
    static Map<Integer, List<int[]>> V;
    static int[] color;
    
    static boolean dfs(int i) {
        List<int[]> edges = V.get(i);
        if (edges != null) {
            for (int[] edge : edges) {
                int v = edge[0];
                int w = edge[1];
                if (w % 2 == 0) {
                    if (color[v] == -1) {
                        color[v] = color[i];
                    } else if (color[v] == color[i]) {
                        continue;
                    } else if (color[v] != color[i]) {
                        return false;
                    }
                } else {
                    if (color[v] == -1) {
                        color[v] = color[i] == 1 ? 0 : 1;
                    } else if (color[v] == color[i]) {
                        return false;
                    } else if (color[v] != color[i]) {
                        continue;
                    }
                }
                if (!dfs(v)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        V = new HashMap<>();
        color = new int[n + 1];
        
        for (int i = 1; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            int w = Integer.parseInt(parts[2]);
            
            V.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            V.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }
        
        Arrays.fill(color, -1);
        
        while (true) {
            int i = 0;
            for (int j = 1; j <= n; j++) {
                if (color[j] == -1) {
                    i = j;
                    color[i] = 0;
                    break;
                }
            }
            if (i == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.println(color[j]);
                }
                break;
            } else {
                if (!dfs(i)) {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}

