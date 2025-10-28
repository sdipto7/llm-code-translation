
import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static final long INF = 1000000000000000000L;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            tokens = br.readLine().split(" ");
            int X = Integer.parseInt(tokens[0]) - 1;
            int Y = Integer.parseInt(tokens[1]) - 1;
            int Z = Integer.parseInt(tokens[2]) - 1;
            
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }
        
        boolean[] used = new boolean[N];
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    used[node] = true;
                    
                    for (int nextnode : edge.get(node)) {
                        if (!used[nextnode]) {
                            queue.add(nextnode);
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}

