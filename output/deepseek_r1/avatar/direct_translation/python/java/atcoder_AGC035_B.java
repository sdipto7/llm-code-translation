
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
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p[0]));
        for (int i = 0; i < N; i++) {
            pq.add(new int[]{degs[i], i});
        }
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[1];
            if (flag[u]) continue;
            flag[u] = true;
            
            Iterator<Integer> iterator = edges.get(u).iterator();
            int i = 0;
            while (iterator.hasNext()) {
                int v = iterator.next();
                iterator.remove();
                edges.get(v).remove(u);
                degs[v]--;
                
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                
                pq.add(new int[]{degs[v], v});
                i++;
            }
        }
    }
}

