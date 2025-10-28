
import java.util.*;
import java.io.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] adj = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
        Deque<Integer> que = new ArrayDeque<>();
        que.add(1);
        boolean[] seen = new boolean[N + 1];
        seen[1] = true;
        int[] par = new int[N + 1];
        int[] childNum = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.pollFirst();
            for (int u : adj[v]) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    childNum[v]++;
                    que.add(u);
                }
            }
        }
        Deque<Integer> seq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (childNum[i] == 0) {
                seq.add(i);
            }
        }
        while (!seq.isEmpty()) {
            int c = seq.pollLast();
            seen[c] = false;
            if (!seen[par[c]]) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = false;
            int grandparent = par[par[c]];
            childNum[grandparent]--;
            if (childNum[grandparent] == 0) {
                seq.add(grandparent);
            }
        }
        System.out.println("Second");
    }
}

