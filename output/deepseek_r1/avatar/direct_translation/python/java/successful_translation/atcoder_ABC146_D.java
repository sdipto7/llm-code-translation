
import java.util.*;
import java.io.*;

public class atcoder_ABC146_D {
    static class EdgeKey {
        int u, v;
        EdgeKey(int u, int v) {
            this.u = Math.min(u, v);
            this.v = Math.max(u, v);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EdgeKey e = (EdgeKey) o;
            return u == e.u && v == e.v;
        }
        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) G.add(new ArrayList<>());
        List<EdgeKey> edges = new ArrayList<>();
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            G.get(a).add(b);
            G.get(b).add(a);
            edges.add(new EdgeKey(a, b));
        }
        Map<EdgeKey, Integer> edgeColor = new HashMap<>();
        int K = bfs(0, N, G, edgeColor);
        System.out.println(K);
        for (EdgeKey ek : edges) System.out.println(edgeColor.get(ek));
    }

    private static int bfs(int v, int N, List<List<Integer>> G, Map<EdgeKey, Integer> edgeColor) {
        boolean[] visited = new boolean[N];
        int[] nodeColor = new int[N];
        Arrays.fill(nodeColor, -1);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(v);
        visited[v] = true;
        int K = -1;
        while (!q.isEmpty()) {
            int u = q.poll();
            int c = 0;
            for (int nex : G.get(u)) {
                if (visited[nex]) continue;
                visited[nex] = true;
                c++;
                if (c == nodeColor[u]) c++;
                nodeColor[nex] = c;
                edgeColor.put(new EdgeKey(u, nex), c);
                q.add(nex);
                K = Math.max(K, c);
            }
        }
        return K;
    }
}

