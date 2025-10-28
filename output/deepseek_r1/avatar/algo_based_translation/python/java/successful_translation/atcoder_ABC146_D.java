
import java.util.*;
import java.io.*;

public class atcoder_ABC146_D {

    static class Pair {
        private final int a;
        private final int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a && b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Deque<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayDeque<>());
        }
        Map<Pair, Integer> E = new LinkedHashMap<>();

        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            Pair pair = new Pair(Math.min(a, b), Math.max(a, b));
            E.put(pair, 0);
        }

        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }

    public static int bfs(int v, int N, List<Deque<Integer>> G, Map<Pair, Integer> E) {
        boolean[] visited = new boolean[N];
        Deque<Integer> queue = new ArrayDeque<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);

        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G.get(q)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
                node2color[nex] = color;
                Pair edge = new Pair(Math.min(q, nex), Math.max(q, nex));
                E.put(edge, color);
                queue.add(nex);
                K = Math.max(K, color);
            }
        }
        return K;
    }
}

