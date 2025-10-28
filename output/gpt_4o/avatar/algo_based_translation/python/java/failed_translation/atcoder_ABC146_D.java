
import java.util.*;

public class atcoder_ABC146_D {
    
    public static int bfs(int v, int N, List<Deque<Integer>> G, Map<Pair, Integer> E) {
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
                if (visited[nex] == 1) {
                    continue;
                }
                visited[nex] = 1;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
                node2color[nex] = color;
                E.put(new Pair(Math.min(q, nex), Math.max(q, nex)), color);
                queue.add(nex);
            }

            K = Math.max(K, color);
        }

        return K;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Deque<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayDeque<>());
        }
        Map<Pair, Integer> E = new HashMap<>();

        for (int i = 0; i < N - 1; i++) {
            String[] input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(new Pair(a, b), 0);
        }

        int K = bfs(0, N, G, E);
        System.out.println(K);

        for (int value : E.values()) {
            System.out.println(value);
        }
        scanner.close();
    }
}

class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}

