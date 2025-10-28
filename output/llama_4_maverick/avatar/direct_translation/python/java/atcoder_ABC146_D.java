
import java.util.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer>[] G = new List[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        Map<String, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            String key = Math.min(a, b) + "," + Math.max(a, b);
            E.put(key, 0);
        }
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (Map.Entry<String, Integer> entry : E.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static int bfs(int v, int N, List<Integer>[] G, Map<String, Integer> E) {
        boolean[] visited = new boolean[N];
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        int K = -1;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G[q]) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
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

