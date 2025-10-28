
import java.util.*;
import java.io.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Deque<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayDeque<>());
        }
        Map<String, Integer> E = new HashMap<>();
        
        for (int i = 0; i < N - 1; i++) {
            String[] tokens = br.readLine().split(" ");
            int a = Integer.parseInt(tokens[0]) - 1;
            int b = Integer.parseInt(tokens[1]) - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            String key = Math.min(a, b) + "," + Math.max(a, b);
            E.put(key, 0);
        }
        
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }
    
    public static int bfs(int v, int N, List<Deque<Integer>> G, Map<String, Integer> E) {
        int[] visited = new int[N];
        Deque<Integer> queue = new ArrayDeque<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        
        queue.add(v);
        visited[v] = 1;
        
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G.get(q)) {
                if (visited[nex] != 0) continue;
                visited[nex] = 1;
                color++;
                if (color == node2color[q]) color++;
                node2color[nex] = color;
                String key = Math.min(q, nex) + "," + Math.max(q, nex);
                E.put(key, color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}

