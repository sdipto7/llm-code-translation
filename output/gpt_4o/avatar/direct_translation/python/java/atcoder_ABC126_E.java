
import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static final long INF = (long) 1e18;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] xyz = br.readLine().split(" ");
            int X = Integer.parseInt(xyz[0]) - 1;
            int Y = Integer.parseInt(xyz[1]) - 1;
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
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    used[node] = true;
                    for (int nextNode : edge.get(node)) {
                        if (!used[nextNode]) {
                            queue.add(nextNode);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

