
import java.util.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer>[] edges = new HashSet[N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new HashSet<>();
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degs[a]++;
            degs[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < N; i++) {
            Q.offer(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] arr = Q.poll();
            int u = arr[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            int i = 0;
            for (int v : edges[u]) {
                edges[v].remove(u);
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.offer(new int[]{degs[v], v});
                i++;
            }
        }
    }
}

