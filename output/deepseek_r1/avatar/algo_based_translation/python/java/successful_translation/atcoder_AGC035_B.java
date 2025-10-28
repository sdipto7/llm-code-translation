
import java.util.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new HashSet<>());
        }
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degs[a]++;
            degs[b]++;
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            queue.add(new int[]{degs[i], i});
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int u = current[1];
            if (flag[u]) continue;
            flag[u] = true;

            List<Integer> neighbors = new ArrayList<>(edges.get(u));
            for (int i = 0; i < neighbors.size(); i++) {
                int v = neighbors.get(i);
                edges.get(v).remove(u);

                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }

                degs[v]--;
                queue.add(new int[]{degs[v], v});
            }
        }
    }
}

