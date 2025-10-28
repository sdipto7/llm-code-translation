
import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static final int INF = (int)1e18;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int M = nextInt();
        List<Integer>[] edge = new ArrayList[N];
        for (int i = 0; i < N; i++)
            edge[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int X = nextInt() - 1;
            int Y = nextInt() - 1;
            int Z = nextInt() - 1;
            edge[X].add(Y);
            edge[Y].add(X);
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
                    for (int nextnode : edge[node]) {
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

