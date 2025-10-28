import java.util.*;

public class atcoder_ABC146_D {
    static int bfs(int v, int N, List<List<Integer>> G, Map<String, Integer> E) {
        int[] visited = new int[N];
        Queue<Integer> queue = new LinkedList<>();
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) G.add(new ArrayList<>());
        Map<String, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = input.nextInt() - 1;
            int b = input.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            String key = a + "," + b;
            E.put(key, 0);
        }
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) System.out.println(value);
    }
}
