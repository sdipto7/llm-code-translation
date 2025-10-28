
import java.io.*;
import java.util.*;

public class atcoder_ABC126_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        ArrayList<ArrayList<Integer>> edge = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken()) - 1;
            int Y = Integer.parseInt(st.nextToken()) - 1;
            Integer.parseInt(st.nextToken()); // Z is ignored
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }
        
        boolean[] used = new boolean[N];
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Deque<Integer> queue = new ArrayDeque<>();
                queue.add(i);
                used[i] = true;
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int nextNode : edge.get(node)) {
                        if (!used[nextNode]) {
                            used[nextNode] = true;
                            queue.add(nextNode);
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}

