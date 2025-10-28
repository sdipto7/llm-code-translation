
import java.util.*;
import java.util.stream.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        Set<Integer>[] edges = new Set[N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            edges[i] = new HashSet<>();
        }
        
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges[a-1].add(b-1);
            edges[b-1].add(a-1);
            degs[a-1]++;
            degs[b-1]++;
        }
        
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        
        PriorityQueue<int[]> Q = new PriorityQueue<>((x, y) -> Integer.compare(x[0], y[0]));
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degs[i], i});
        }
        
        while (!Q.isEmpty()) {
            int[] pair = Q.poll();
            int u = pair[1];
            
            if (flag[u]) {
                continue;
            }
            
            flag[u] = true;
            
            List<Integer> neighbors = new ArrayList<>(edges[u]);
            for (int i = 0; i < neighbors.size(); i++) {
                int v = neighbors.get(i);
                
                edges[v].remove(u);
                
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u+1) + " " + (v+1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v+1) + " " + (u+1));
                    parity[v] = 1 - parity[v];
                }
                
                degs[v]--;
                Q.add(new int[]{degs[v], v});
            }
        }
    }
}

