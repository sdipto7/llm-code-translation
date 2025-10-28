
import java.util.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer>[] edge = new Set[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new HashSet<>();
        }
        int[] deg = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edge[a - 1].add(b - 1);
            edge[b - 1].add(a - 1);
            deg[a - 1]++;
            deg[b - 1]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            pq.add(new int[]{deg[i], i});
        }
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int u = top[1];
            if (flag[u]) continue;
            flag[u] = true;
            List<Integer> neighbors = new ArrayList<>(edge[u]);
            for (int i = 0; i < neighbors.size(); i++) {
                int v = neighbors.get(i);
                edge[v].remove(u);
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                deg[v]--;
                pq.add(new int[]{deg[v], v});
            }
        }
    }
}

